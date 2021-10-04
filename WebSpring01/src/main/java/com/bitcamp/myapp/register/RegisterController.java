package com.bitcamp.myapp.register;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

//현재 클래스가 컨트롤러가 되기 위해서는 클래스명 이전에 @Controller어노테이션을 기술한다.
//어노테이션은 @ 로 호출한다. 
//메소드를 만들어 준다. 클래스가 controller 객체가 됌. 상속받는느낌 
@Controller
public class RegisterController {
		RegisterDAO dao= new RegisterDAO();
	
	// /*do 랑 같은 느낌이다. 경로랑, 메서드랑 같이 써줌 
	//회원가입폼 매핑
	@RequestMapping
	("/registerForm")//뭘로 접속을 하는가. @RequestMapping("/registerForm")get 방식의 접속 메소드명이랑 매핑주소랑 일치시켜줘야 편하다.
	public String registerForm() {
		//뷰 파일명을 반환한다.
		return "register/form";//view파일명
		
	}
	/*/아이디 중복검사 1.첫번쨰방법
	@RequestMapping("/idCheck")
	public String idCheck(HttpServletRequest req) {
		String userid= req.getParameter("userid");
		System.out.println(userid);
		return"idCheck";
		
	}
	*/
	@RequestMapping("/idCheck") //뷰화일명이랑, 데이터랑 같이 담을수있는게 ModelAndView
	public ModelAndView idCheck(String userid) {

		int result= dao.idDoubleCheck(userid);
	
		
		ModelAndView mav= new ModelAndView();//보내주면 $ 로 사용가능함 
		mav.addObject("userid", userid); //addobject 변수명 , 값 
		mav.addObject("result",result);
		mav.setViewName("register/idCheck");
		return mav;
		
	}
	
	//우편번호 검색페이지로 이동하는controll러 만듬 /string으로 view 화일명 보냄 
	@RequestMapping("/zipSearch")
	public String zipSearch() {
		return "register/zipcodeSearch"; //view파일명
		
	}
	//우편번호 검색하는거  //vo가 필요한 이유 하나의 주소에 여러개가 있기 떄문이다. 
	//ajax 새로운 view가 필요가 없다. 자기 자신에서 실행되기 때문에 
	@RequestMapping("/zipFind")
	@ResponseBody //Responsebody 는 리턴해줄 필요 없다는뜻.
	public List<ZipCodeVO> zipFind(String doro){
		System.out.println(doro);
		//List<ZipcodeVO> list=dao.zipSearchRecord(doro); //도로명주소 넣어주면collction이 돌아옴
		return dao.zipSearchRecord(doro);
	}
	
	//회원등록 컨트롤러 추가			post방식의 접속일때는 반드시 명시해야 한다.
	//dao 작성후 컨트롤러에서 받음 회원 가입이 되었는가 안되었는가 . 
	//등록못하면 cnt 0 회원가입 폼으로 보냄 , history로 보냄 <jsp페이지에서 자바스크립트로 구현한다.>
	//등록하면cnt=1 되면 controller에서 로그인으로 보내기로 함. 
	@RequestMapping(value="/formOk", method=RequestMethod.POST)
	public String formOk(RegisterVO vo, Model model) {
		//회원등록 
		int result=dao.insertRecord(vo);
		
		//회원 등록여부, 뷰파일명 
		model.addAttribute("result", result);
		System.out.println(result);
		return "register/formResult";
		
	}
	
	//로그인폼
	@RequestMapping("/login")
	public String loginForm() { //이동만 시켜줌 string으로 보냄
		return "register/login"; //view/register/login.jsp
	}
	//로그인 하는 기능 추가
	   @RequestMapping(value="/loginOk", method=RequestMethod.POST)
	   public ModelAndView loginOk(RegisterVO vo, HttpServletRequest req) { //데이터랑 이동이랑 같이하는거.아이디랑 비번입력하면 값확인하고 
	      dao.loginSelect(vo);
	      
	      ModelAndView mav = new ModelAndView(); 
	      
	      if(vo.getLogStatus().equals("Y")) {//로그인 성공!!!!//requset의 getSession()메서드는 서버에 생성된 세션이 있다면 세션을 반환하고, 없다면 세 세션을 생성하여 반환한다.
	         HttpSession session = req.getSession();//데이터를 따로 관리해줘야하니깐 session을 만들어줘야함.
	         //이름, 로그인상태f
	         session.setAttribute("logname", vo.getUsername()); //세션에 값을 저장하는거 session.setAttribute(이름, 값) /setAttribute(String name, Object value)
	         session.setAttribute("logid", vo.getUserid());
	         session.setAttribute("logStatus", vo.getLogStatus());
	         mav.setViewName("redirect:/"); //이동 /home
	      }else {//로그인실패 ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ
	         mav.setViewName("redirect:login"); //no ! 기본값을 n으로 설정해주고 . redirect -> controller 로 간다. 
	      }
	      return mav;
	   }
	   @RequestMapping("/logout") //데이터랑 이동을 같이 해줄거고 무조건back은  session을 받아와야함. 
	   public ModelAndView logout(HttpSession session) { //sessiong을 매개변수를 바로 넣어서 사용가능하다. 자동으로request가 되기때문에. 
		   session.invalidate();
		   ModelAndView mav = new ModelAndView();
		   mav.setViewName("redirect:/");//home으로 이동
		   return mav;
		   
	   }//수정폼
	     @RequestMapping("/registerEdit")
	     public ModelAndView registerEdit(HttpSession session) {
	        
	        RegisterVO vo = new RegisterVO();
	        vo.setUserid((String)session.getAttribute("logid"));
	        dao.selectRecord(vo);
	        
	        
	        ModelAndView mav = new ModelAndView();
	        mav.addObject("vo",vo);
	        mav.setViewName("register/edit");
	        return mav;
	     }
	     
	     //회원정보 수정하기 눌렀을때. 
	     @RequestMapping(value="/editOk", method=RequestMethod.POST)
	     public ModelAndView editOk(RegisterVO regVo, HttpSession session) {
	    	ModelAndView mav = new ModelAndView();
	    	regVo.setUserid((String)session.getAttribute("logid"));
	    	 int result=dao.updateRecord(regVo);
	    	 
	    	 //수정실패시 history(자바스크립트), 수정성공 : 수정폼으로 이동.
	    	 if(result>0) {//수정성공
	    		 mav.setViewName("redirect:registerEdit");
	    	 }else { //수정실패
	    		 mav.setViewName("register/editResult");
	    	 }
	    	
	    	 return mav;
	    	
	    	 
	     }
	     
	     //회원탈퇴
	     @RequestMapping("/delete")
	     public ModelAndView delete(HttpSession session) {
	    	 String userid=(String)session.getAttribute("logid");
	    	 session.invalidate();
	    	 
	    	 int result=dao.deleteOk(userid);
	    	 
	     	 ModelAndView mav = new ModelAndView();
	    	 mav.addObject("result",result);
	    	 mav.setViewName("register/deleteResult");
	    	 return mav;
	    	
	    	 
	     }
	     
	     @RequestMapping("/deleteOk")
	     public String deleteOk() {
	 
	    	
	    	 return "register/deleteOk";
	     
	}
}
//->mvc 모델 컨트롤러 커맨드 다 했는데. 
//dfdl.do->homecontroller지남-> sdjflscommand.java-> retrun.jsp
//spring controller java의 메서드 
//myapp/ 다음에 올것들 슬레쉬 포함 값이 있으면 -> Controller.java 컨트롤러랑 커맨드를 합한거다 -> "register/form";


//MVC
//① ---.do -> ② HomeController -> ③ ---Command.java -> ④ ---.jsp

//Spring
//① /--- -> ② ---Controller.java의 메서드 -> ③ (/WEB-INF/views/) --- (.jsp)
//① / (혹은 값이 없음) -> ② HomeController.java (메서드 home()) -> ③ (/WEB-INF/views/) home(.jsp)
//① /registerForm -> ② RegisterController.java (메서드 registerForm()) -> ③ register/form