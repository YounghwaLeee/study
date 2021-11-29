import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	//1.드라이브 로딩 호출안해도 무조건 실행
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
//2.변수
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	String url ="jdbc:oracle:thin:@localhost";
	String username ="c##scott";
	String password ="tiger";
	String sql;
	
	public DBConnection() {}
	//생성자 메서드
	
	//db 연결( 메소드 만들기)
	public void dbConn() {
		try {
			con= DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	//db 닫기(메소드 닫기)
	public void dbClose() {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(con!=null) con.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
}

//시퀀스 번호생성객체 100,200,300,=..1,2,3..,10,20,30... 이런식으로 
//규칙적인건 가능하다.
//시퀀스 Create __시퀀스    [] 호는 필요없음 생략가능
