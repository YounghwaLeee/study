<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <style>
    	#regDiv{width:1000px; margin:0 auto; overflow:auto;}
    	#regForm>ul>li{float: left; height:50px;  line-height:50px; width:80%; }
    	#regForm>ul>li:nth-child(2n+1){width:20%;}
    	
    	#addr{width:90%;}
    
    </style>
    
    <script>
    	$(function(){
    		$("#idChk").click(function(){
    			window.open("/myapp/idCheck?userid="+$("#userid").val(),"id","width=500,height=400");//값을 담아서 가져가라. 
    			
    		});
    	
    		$("#userid").keyup(function(){
    			$("#idChkStatus").val("N");
    			
    		});
    		//우편번호 찾기버튼 선택시 
    		$("#zipSearch").click(()=>{
    			window.open("/myapp/zipSearch","zip","width=600,height=800"); //이동할곳.이동할이름.
    		});
    		
    		//회원 등록시 유효성 검사 아이디 중복검사 여부 체크 
    		$("regForm").submit(function(){
    			if($("idChkStatus").val=="N"){
    				alert("아이디를 중복검사 하세요..");
    				return false; //페이지 안넘어가는거
    			}
    			return true;
    		});
    		
    	});
    	
    	
    </script>
<div id="regDiv">
	
	<h1>회원가입폼</h1>
	<form method="post" id="regForm" action="/myapp/formOk">
		<ul>
			<li>아이디</li>
			<li><input type="text" name="userid" id="userid" />
				<input type="button" id="idChk" value="아이디중복검사"/>
				<input type="hidden" id="idChkStatus" value="N"/><!-- N:중복검사안됨, Y: 중복검사됨 -->
			</li>
				
			<li>비밀번호</li>
			<li><input type="password" name="userpwd" id="userpwd"/></li>
			<li>비밀번호확인</li><!-- 비밀번호일치확인 하는거여서 db랑 안똑같아도된다 .  -->
			<li><input type="password" name="userpwdchk" id="userpwdchk"/></li>	
			<li>이름</li>	
			<li><input type="text" name="username" id="username"/></li>
			<li>연락처</li>			
			<li>
				<select name="tel1" id="tel1">
					<script>
					   let telNum = ['010', '02', '031', '032','043', '042', '053', '052'];
		                  for(var i=0; i<telNum.length; i++){
		                     document.write("<option value='"+telNum[i]+"'>"+telNum[i]+"</option>");
		                  }
					</script>
				</select> -
				<input type="text" name="tel2" id="tel2"/>-
				<input type="text" name="tel3" id="tel3"/></li>
			<li>이메일</li><!-- 입력하는거만 한다. -->
			<li><input type="text" name="emailid"/>@
				<input type="text" name="domain"></li>
			<li>우편번호</li>
			<li><input type="text" name="zipcode" id="zipcode"/>
				<input type="button" id="zipSearch" value="우편번호찾기"/>
			</li>
			<li>주소</li>
			<li><input type="text" name="addr" id="addr"/></li>
			<li>상세주소</li>
			<li><input type="text" name="addrdetail" id="addrdetail"/></li>
			<li>취미</li>
			<li>
				<script>
	               var hobby = ['운동','쇼핑','게임','웹툰','요리','독서','영화관람'];
	               for(var i=0; i<hobby.length; i++){
	                  document.write("<input type='checkbox' name='hobby' id='hobby" + i + "' value='" + hobby[i] + "'/>" + hobby[i]);
	               }
				</script>
			</li>
			<li><input type="submit" value="회원가입하기"/></li>
		
		</ul>
		</form>
</div>