//이영화
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SelectTestPractice extends JFrame{
		
		JTable table;
		JScrollPane sp;
		DefaultTableModel model;
		
		String title []= {"사원명","급여","보너스","입사일"};

	public SelectTestPractice() {
			
		
			setSize(500,400);
			setVisible(true);

			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(ClassNotFoundException cnfe) { //서버가 켜지지 않았다.
				System.out.println("jdbc 드라이브 로딩 실패-->"+cnfe.getMessage());
			}
			
			try{
			//2. db 연결
			String dbUrl ="jdbc:oracle:thin:@172.30.1.18:1521:xe";
			
			Connection conn=DriverManager.getConnection(dbUrl,"c##scott","tiger");
			
			//3. 쿼리문을 만든다.
			String sql ="select ename, sal,comm,to_char(hiredate,'YYYY-MM-DD') hiredate from emp";
			//4. 쿼리문을 이용해 PrepareStatement 객체생성 문자열
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//Object [] sel= {ename,}
			
			//5.시행하기
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {	
				String ename =rs.getString(1);
				int sal=rs.getInt(2);
				double comm=rs.getDouble(3);
				String hiredate =rs.getString(4);
				
				System.out.println(ename+","+sal+","+comm+","+hiredate);
				
			}
			rs.close();
			pstmt.close();
			conn.close();
					
		}catch(SQLException se) {
			System.out.println("DB연결 에러발생----"+se.getMessage());
		}
	}
	public static void main(String[] args) {
		new SelectTestPractice();

	}

}
