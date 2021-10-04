<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- jstl코드 -->
<style>
#menu, #bottom{display:none;}
#zipList>li{cursor:pointer; border-bottom:1px solid #ddd;}
</style>
<script>

	$(()=>{
		$("#zip").click(function(){
			if($("#doro").val()==''){
				alert("도로명을 입력후 우편번호 찾기를 하세요.");
			}else{
					var url ="/myapp/zipFind";
					var params = "doro="+$("#doro").val();//doro=이어도로
					$.ajax({
						type:"GET",
						url: url,
						data: params,
						success:function(result){ //List<zipCodevo>
							//result에 list가 들어가있다. list에는 vo가 담김
							//vo가 들어가있는건 $ 묶어 줘야함 변수명에 $ 를 적어줘도됌. 
							var $result= $(result); //컬렉션에 대한 반복문 돌려서vo풀어줌
							var tag ="";
							$result.each(function(idx, vo){
								tag += "<li>"+ vo.zipcodeFull +"</li>";	
							});
							console.log(tag);
							$("#zipList").html(tag);
							
						},error:function(){
							console.log("우편번호 가져오기 실패..");
						}
					}); //ajax
				
			}//if
		});//click
		
		//
		$(document).on('click','#zipList>li',function(){
			var address =$(this).text();//63563 제주특별자치도 서귀포시 이어도로 554-3
			var zipcode = address.substring(0,5);
			var addr= address.substring(6); //6부터 끝까지
			
			opener.document.getElementById("zipcode").value=zipcode;
			opener.document.getElementById("addr").value=addr;
			
			window.close();
			
		});
	});//jquery

</script>
<div>

	<h3>도로명을 입력후 우편번호찾기를 선택하세요.</h3>
	도로명
	<input type="text" name="doro" id="doro"/>
	<input type="button" id="zip" value="우편번호찾기"/>
	
	<hr/>
	<ul id="zipList">
	</ul>
</div>