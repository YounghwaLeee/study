import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTest {
   static {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      }catch(Exception e) {
         e.printStackTrace(); //근원지를 찾아서 단계별로 에러발생
      }
   }
   Connection conn;
   PreparedStatement pstmt;
   String url = "jdbc:oracle:thin:@172.30.1.18:1521:xe";
   String userid = "c##scott";
   String pwd = "tiger";
   
   public UpdateTest() {
      try {
         //부서코드가 30인 부서의 급여를 10% 인상한 금액으로 업데이트 
    	// conn= DriverManager.getConnection("jdbc:oracle:thin:@172.30.1.18:1521:xe","c##scott","tiger");
         conn = DriverManager.getConnection(url,userid,pwd);
         
       //부서코드가 30인 부서의 급여를 10% 인상한 금액으로 업데이트 
         String sql = "update emp set sal = sal*1.1 where deptno=30";
         pstmt = conn.prepareStatement(sql);//쿼리문을 이용해 객체생성한걸 집어넣어줌
         
         int cnt = pstmt.executeUpdate();
         if(cnt>0) {
            System.out.println(cnt+"개의 레코드가 수정되었습니다.");
         }else {
            System.out.println("수정한 데이터가 없습니다.");
         }
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         try {
            if(pstmt!=null) pstmt.close();
            if(conn!=null) conn.close();
         }catch(Exception ee) {
            ee.printStackTrace();
         }
      }
   }

   public static void main(String[] args) {
      new UpdateTest();

   }

}