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

//���� Ŭ������ ��Ʈ�ѷ��� �Ǳ� ���ؼ��� Ŭ������ ������ @Controller������̼��� ����Ѵ�.
//������̼��� @ �� ȣ���Ѵ�. 
//�޼ҵ带 ����� �ش�. Ŭ������ controller ��ü�� ��. ��ӹ޴´��� 
@Controller
public class RegisterController {
		RegisterDAO dao= new RegisterDAO();
	
	// /*do �� ���� �����̴�. ��ζ�, �޼���� ���� ���� 
	//ȸ�������� ����
	@RequestMapping
	("/registerForm")//���� ������ �ϴ°�. @RequestMapping("/registerForm")get ����� ���� �޼ҵ���̶� �����ּҶ� ��ġ������� ���ϴ�.
	public String registerForm() {
		//�� ���ϸ��� ��ȯ�Ѵ�.
		return "register/form";//view���ϸ�
		
	}
	/*/���̵� �ߺ��˻� 1.ù�������
	@RequestMapping("/idCheck")
	public String idCheck(HttpServletRequest req) {
		String userid= req.getParameter("userid");
		System.out.println(userid);
		return"idCheck";
		
	}
	*/
	@RequestMapping("/idCheck") //��ȭ�ϸ��̶�, �����Ͷ� ���� �������ִ°� ModelAndView
	public ModelAndView idCheck(String userid) {

		int result= dao.idDoubleCheck(userid);
	
		
		ModelAndView mav= new ModelAndView();//�����ָ� $ �� ��밡���� 
		mav.addObject("userid", userid); //addobject ������ , �� 
		mav.addObject("result",result);
		mav.setViewName("register/idCheck");
		return mav;
		
	}
	
	//�����ȣ �˻��������� �̵��ϴ�controll�� ���� /string���� view ȭ�ϸ� ���� 
	@RequestMapping("/zipSearch")
	public String zipSearch() {
		return "register/zipcodeSearch"; //view���ϸ�
		
	}
	//�����ȣ �˻��ϴ°�  //vo�� �ʿ��� ���� �ϳ��� �ּҿ� �������� �ֱ� �����̴�. 
	//ajax ���ο� view�� �ʿ䰡 ����. �ڱ� �ڽſ��� ����Ǳ� ������ 
	@RequestMapping("/zipFind")
	@ResponseBody //Responsebody �� �������� �ʿ� ���ٴ¶�.
	public List<ZipCodeVO> zipFind(String doro){
		System.out.println(doro);
		//List<ZipcodeVO> list=dao.zipSearchRecord(doro); //���θ��ּ� �־��ָ�collction�� ���ƿ�
		return dao.zipSearchRecord(doro);
	}
	
	//ȸ����� ��Ʈ�ѷ� �߰�			post����� �����϶��� �ݵ�� ����ؾ� �Ѵ�.
	//dao �ۼ��� ��Ʈ�ѷ����� ���� ȸ�� ������ �Ǿ��°� �ȵǾ��°� . 
	//��ϸ��ϸ� cnt 0 ȸ������ ������ ���� , history�� ���� <jsp���������� �ڹٽ�ũ��Ʈ�� �����Ѵ�.>
	//����ϸ�cnt=1 �Ǹ� controller���� �α������� ������� ��. 
	@RequestMapping(value="/formOk", method=RequestMethod.POST)
	public String formOk(RegisterVO vo, Model model) {
		//ȸ����� 
		int result=dao.insertRecord(vo);
		
		//ȸ�� ��Ͽ���, �����ϸ� 
		model.addAttribute("result", result);
		System.out.println(result);
		return "register/formResult";
		
	}
	
	//�α�����
	@RequestMapping("/login")
	public String loginForm() { //�̵��� ������ string���� ����
		return "register/login"; //view/register/login.jsp
	}
	//�α��� �ϴ� ��� �߰�
	   @RequestMapping(value="/loginOk", method=RequestMethod.POST)
	   public ModelAndView loginOk(RegisterVO vo, HttpServletRequest req) { //�����Ͷ� �̵��̶� �����ϴ°�.���̵�� ����Է��ϸ� ��Ȯ���ϰ� 
	      dao.loginSelect(vo);
	      
	      ModelAndView mav = new ModelAndView(); 
	      
	      if(vo.getLogStatus().equals("Y")) {//�α��� ����!!!!//requset�� getSession()�޼���� ������ ������ ������ �ִٸ� ������ ��ȯ�ϰ�, ���ٸ� �� ������ �����Ͽ� ��ȯ�Ѵ�.
	         HttpSession session = req.getSession();//�����͸� ���� ����������ϴϱ� session�� ����������.
	         //�̸�, �α��λ���f
	         session.setAttribute("logname", vo.getUsername()); //���ǿ� ���� �����ϴ°� session.setAttribute(�̸�, ��) /setAttribute(String name, Object value)
	         session.setAttribute("logid", vo.getUserid());
	         session.setAttribute("logStatus", vo.getLogStatus());
	         mav.setViewName("redirect:/"); //�̵� /home
	      }else {//�α��ν��� �ФФФФФФФФФФ�
	         mav.setViewName("redirect:login"); //no ! �⺻���� n���� �������ְ� . redirect -> controller �� ����. 
	      }
	      return mav;
	   }
	   @RequestMapping("/logout") //�����Ͷ� �̵��� ���� ���ٰŰ� ������back��  session�� �޾ƿ;���. 
	   public ModelAndView logout(HttpSession session) { //sessiong�� �Ű������� �ٷ� �־ ��밡���ϴ�. �ڵ�����request�� �Ǳ⶧����. 
		   session.invalidate();
		   ModelAndView mav = new ModelAndView();
		   mav.setViewName("redirect:/");//home���� �̵�
		   return mav;
		   
	   }//������
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
	     
	     //ȸ������ �����ϱ� ��������. 
	     @RequestMapping(value="/editOk", method=RequestMethod.POST)
	     public ModelAndView editOk(RegisterVO regVo, HttpSession session) {
	    	ModelAndView mav = new ModelAndView();
	    	regVo.setUserid((String)session.getAttribute("logid"));
	    	 int result=dao.updateRecord(regVo);
	    	 
	    	 //�������н� history(�ڹٽ�ũ��Ʈ), �������� : ���������� �̵�.
	    	 if(result>0) {//��������
	    		 mav.setViewName("redirect:registerEdit");
	    	 }else { //��������
	    		 mav.setViewName("register/editResult");
	    	 }
	    	
	    	 return mav;
	    	
	    	 
	     }
	     
	     //ȸ��Ż��
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
//->mvc �� ��Ʈ�ѷ� Ŀ�ǵ� �� �ߴµ�. 
//dfdl.do->homecontroller����-> sdjflscommand.java-> retrun.jsp
//spring controller java�� �޼��� 
//myapp/ ������ �ð͵� ������ ���� ���� ������ -> Controller.java ��Ʈ�ѷ��� Ŀ�ǵ带 ���ѰŴ� -> "register/form";


//MVC
//�� ---.do -> �� HomeController -> �� ---Command.java -> �� ---.jsp

//Spring
//�� /--- -> �� ---Controller.java�� �޼��� -> �� (/WEB-INF/views/) --- (.jsp)
//�� / (Ȥ�� ���� ����) -> �� HomeController.java (�޼��� home()) -> �� (/WEB-INF/views/) home(.jsp)
//�� /registerForm -> �� RegisterController.java (�޼��� registerForm()) -> �� register/form