package com.bitcamp.myapp.register;

import java.util.List;

;

public interface RegisterDAOImpl {

   
   //회원가입
   public int insertRecord(RegisterVO vo);
   
   //회원정보 수정 시 기존 정보 선택하는 메소드 로그인하면 세션에 값을 넣어둔다. 회원수정을 하니깐 아이디 값이 필요함(변수)
   public void selectRecord(RegisterVO vo); //매개변수를vo로 받음return 안해줘도됌. 생성했던곳에 똑같이 변수가 바뀌기 떄문에 return안해줘도됌. 
   //public RegisterVO selectRecord(String userid);//아이디 값을 가지고 리턴해줘야한다
   
   //회원정보 수정(반환형int 수정되었는지 안되었는지) update문
   public int updateRecord(RegisterVO vo);
   
   //로그인 확인하는거
   public void loginSelect(RegisterVO vo);
   
   //아이디 중복검사 (아이디는프라이머리키설정해놈)
   public int idDoubleCheck(String userid);
   
   
   
   //우편번호검색(도로명주소 넣으면 db조회후, 도로명의 해당하는 레코드 선택해서 나감. vo를list 담아서 return.
   public List<ZipCodeVO> zipSearchRecord(String doro);
   
   
}