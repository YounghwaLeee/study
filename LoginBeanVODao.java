import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginBeanVODao extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws 
	ServletException, IOException{
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html:cahrset=EUC_KR");
		PrintWriter out= res.getWriter();
		
		String id=req.getParameter("id");
		String pwd=req.getParameter("pwd");
		
		//userVO instance 생성 및 clien form data전달 (Binding)
		UserVO userVO= new UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);
		
		//db접근 data검색 비교 uservo.active true/false 변경
		UserDao userDao=new UserDao();
		userDao.getUser(userVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		
		out.println("<h2>Login화면</h2>");
		
		if(userVO.isActive()){
			out.println(id+"님환영합니다");
		}else {
			out.println("로그인실패");
		}
		out.println("<p><p><a href='/edu/jw04/loginBeanVODao.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		
		out.println("<h2>Login화면</h2>");		
		
	}//end of class

}
