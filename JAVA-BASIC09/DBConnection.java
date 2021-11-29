import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	//1.����̺� �ε� ȣ����ص� ������ ����
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
//2.����
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	String url ="jdbc:oracle:thin:@localhost";
	String username ="c##scott";
	String password ="tiger";
	String sql;
	
	public DBConnection() {}
	//������ �޼���
	
	//db ����( �޼ҵ� �����)
	public void dbConn() {
		try {
			con= DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	//db �ݱ�(�޼ҵ� �ݱ�)
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

//������ ��ȣ������ü 100,200,300,=..1,2,3..,10,20,30... �̷������� 
//��Ģ���ΰ� �����ϴ�.
//������ Create __������    [] ȣ�� �ʿ���� ��������
