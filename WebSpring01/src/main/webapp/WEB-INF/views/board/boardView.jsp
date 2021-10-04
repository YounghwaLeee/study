<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<script>

	$(function(){
		//해당게시물의 댓글목록 구하기.
		function replyList(){ //프로그램이 실행되고 나면 
			let rParam="no=${vo.no}";
			let rUrl="/myapp/replyList";
			
			$.ajax({
				url: rUrl,
				data: rParam,
				success: function(result){
					let $result = $(result);
					let tag="";
					//index담을거 idx 
					$result.each(function(idx, vo){
						tag+= "<li><div>"+vo.userid+"("+vo.writedate+")";
						//$session은 view에서 사용가능하다. '${logid}'->session  '{vo.logid}'-vo에서 사용가능한거.
						if(vo.userid=='${logid}'){//본인이 쓴 댓글일때  login한 아이디랑, 선택한userid 같은지 다른지 확인 하면 된다.
						//수정 삭제 <br/>";
							tag += "<input type='button' value='수정'/>";
							tag += "<input type='button' value='삭제' title='"+vo.num+"'/><br/>"
							tag += vo.coment+"</div>";
						
						//수정폼 (본인이 쓴 글에만 나와야 한다.)	
							tag += "<div style='display:none'>";
							tag += "<form method='post'>";
							tag += "<textarea name='coment'>"+vo.coment+"</textarea>";
							tag += "<input type='submit' value='Edit'/>";
							tag += "<input type='hidden' name='num' value='"+vo.num+"'/'>";//댓글의 일련번호 수정,삭제할떄 필요하니깐.
							tag +="</form></div></li>";
						
						}else{//내가 안쓴 댓글일때 
							tag+="<br/>"+vo.coment+"</div></li>";
						}
						
					});
					console.log(tag);
					$("#replyList").html(tag);
				},error:function(){
					console.log("댓글목록선택에러..");
				}
				
			});
			
		}
		//댓글쓰기-- 댓글을 입력하지 않은 경우
			$("#reply").click(()=>{
			//$('#reply').click(function(){
				//댓글을 입력하지 않은 경우
				if($("#coment").val()==""){
					alert("댓글을 입력후 등록하세요 ");
					
			}else{//서버에 댓글을 등록하는 ajax호출
				//폼의 데이터를 전송데이터로 변환해주는 함수 //action은 이동하는거여서 ajax에서 사용해야함.
				let params= $('#replyFrm').serialize(); //coment= 변수&no=34; 이런식으로 만들어짐
				$.ajax({
					url:"/myapp/replyWrite",
					type:"POST", //"POST" ,"GET"
					data:params,      //coment= 변수&no=34 이런식으로 해야함 
					success:function(result){
						//댓글을 썻을수도 있고, 못썻을 수도 있음.
						if(result==0){
							arler('댓글등록실패..');
						}else{
							//목록을 다시 보여준다.(함수를 만들어서 사용 많이 사용하니깐?~)
							
							replyList();
							//이전 댓글 지우기 //댓글창 val을 지우기. 							$('#coment').val("");
							
						}
						console.log("결과->",result);
					},error:function(){
						console.log("댓글쓰기 에러 ");
						
					}
				});
			};
				
		});
		
		//댓글 수정 버튼을 선택하면 종류,선택 함수
		$(document).on('click','#replyList input[value=수정]',function(){
			//댓글정보숨기고
			$(this).parent().css("display","none");
			//댓글수정폼은 보이고
			$(this).parent().next().css("display","block");
			
		});
		//Edit 버튼 선택시 댓글 수정실행.
		
		$(document).on('submit','#replyList form', function(){
			let url ="/myapp/replyEditOk";
			let params =$(this).serialize(); //coment=문자&num=888
			
			$.ajax({
				url : url,
				data : params,
				type : "POST",
				success :function(result){
					replyList();
				}
			});
			
			return false;
		});
		
		//댓글삭제
		$(document).on('click','#replyList input[value=삭제]',function(){
			if(confirm('댓글을 삭제하시겠습니까?')){
				let params ="num="+$(this).attr("title");
				$.ajax({
					url : "/myapp/replyDel",
					data : params,
					success:function(){
						replyList();
					}
				});
			}
			
		});
		//댓글 목록을 처리하는 함수를 호출한다.
			replyList();
	});

	
	/*$(()=>{
		$('#str').click(function(){

		$.ajax({
			url:"/myapp/reply",
			data:"no=${vo.no}&userid=${vo.userid}",
			success:function(result){
				//갖고와서 보여주는거
				
				let r=$(result);
				
				r.each(function(idx, vo){
					$('#replycl').append("<hr/>댓글번호:"+vo.num+"아이디"+vo.userid+"댓글내용"+vo.coment+"작성일"+vo.writedate);
				});
			},error:function(){
				
			}
			
			
		});
		
	});
});	
	
	*/
	
</script>    
<h1>글내용보기</h1>
<ul>
	<li>번호 : ${vo.no}</li>
	<li>작성자 :${vo.userid }</li>
	<li>작성일 :${vo.writedate}, 조회수 :${vo.hit}</li>
	<li>제목 : ${vo.subject}</li>
	<li>${vo.content}</li>
	<li>
	수정
	삭제
	<a href ="/myapp/boardList?nowPage=${pVo.nowPage}">목록</a>
	</li>

</ul>
<hr/>
<!-- 로그인이 된 경우 댓글 쓰기 폼을 보여준다 / 로그인이 안되어있으면 안보인다 -->
<c:if test="${logStatus=='Y'}">
	<form method="post" id="replyFrm"><!-- coment number 두개의 데이터를 가지고 간다. -->
		<textarea name="coment" id="coment" cols="50"></textarea>
		<input type="button" id="reply" value="댓글쓰기"/>
		<input type="hidden" name="no" value="${vo.no}"/>,<!-- 쓴글에만 댓글을 달아야하니깐 -->
	</form>

</c:if>`
<hr/>
<style>

#replyList>li{border-bottom: 1px solid blue;}
</style>
<ul id="replyList">
	<li>goguma (2021-10-10) 수정 삭제<br/>
		댓글내용
	</li>

</ul>

<!-- <ul id="replycl">
	<input type="button" id="str" value="댓글보기"/>
	<li>작성일 </li>
	<li>댓글내용</li>
	<li>작성자</li>
	
</ul>-->

