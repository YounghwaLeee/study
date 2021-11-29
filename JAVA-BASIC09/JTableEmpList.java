import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEmpList extends JFrame {
	
	
	JTable table;
	DefaultTableModel model;
	String title[]= {"사원명","급여","보너스","입사일"};
	JScrollPane sp;

	
	//1.드라이빙로딩 (예외처리해야함) -맴버영역에는 실행문 사용못함. 
	//실행문을 맴버영역에 실행하기 위해서 기술하는 방식 static ()열면 실행문을 표기할수있는 영역이됌
	//for문, 계산문 다 사용가능함 
	static {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(ClassNotFoundException cnfe) {
				System.out.println("JDBC드라이브 로딩에러 발생");
				cnfe.printStackTrace();
			}
	}
	
	String url ="jdbc:oracle:thin:@172.30.1.18:1521:xe";
	String username= "c##scott";
	String password= "tiger";
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	
	public JTableEmpList() {
		model = new DefaultTableModel(title,0);
		//1. 데이터작업(모델에다가 데이터를 넣는 작업) 먼저 해야함.  그 후엔 아무곳에서나 해도됌.
		
		table = new JTable();	//new JTable(model);
		table.setModel(model);
		//1.제이테이블을 객체생성해서 frame 에 넣어야함 
		//2.모델에 데이터에 담아서 담아야함. 모델은 데이터베이서 읽어오기전까진 데이터가 없는상태
		sp= new JScrollPane(table);
		
		add(sp);// 스크롤을 센터에다가 넣는다.
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		empAllSelect();//화면에 show 하고 나서 db 작업을 하겠다.
	}
	
	public void empAllSelect() {
		//1. 드라이브로딩 - 자바가상머신한테 JDVC 가 어딨다는걸 알려줌 알려만주면됌. (맴버구현)

		try {
		//2. DB연결
			conn= DriverManager.getConnection(url,username,password);
		//3. Statment 생성(SQL문)
			String sql="select ename, sal, comm, to_char(hiredate,'YYYY-MM-DD') hiredate from emp order by hiredate"; //입사일을 오름차순
			pstmt = conn.prepareStatement(sql);
			//4. 실행
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Object[] emp= {rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getNString(4)};
				model.addRow(emp); //레코드 수만큼 반복 모델에 레코드가 추가가됌 
			}
		//5. 닫기
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
			if(rs!=null)rs.close();//객체가 존재하면 close 해주고
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
			}catch(SQLException s) {
				System.out.println("닫기 예외 발생");
					
				}
			}
		}
	

	public static void main(String[] args) {
		new JTableEmpList();

	}

}
//예외처리라는건 데이터베이스 에러가 안나면 conn 이라는일단 객체는 만들어짐
//에러가 나면 pstmt catch 문으로감  
//예외가 발생 하던 안하던 실행하는거 final

