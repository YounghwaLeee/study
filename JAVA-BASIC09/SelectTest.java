import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public SelectTest() {
		try { //얘를 객체로만들어서 이클립스 라는걸 알려주는거
		//1.자바JVM 에 jdbc드라이브 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver"); //객체만들어서 자바가상머신에 알렺ㅁ
		}catch(ClassNotFoundException cnfe) {
			System.out.println("jdbc 드라이브 로딩 실패--> "+ cnfe.getMessage());// 이주소를 로딩해줌
		}
		try {
		
		//2. DB연결 						서버ip,localhost port 전역변수
		String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe"; //오라클 사용하는 문자<쓰는양식>
												//1.dbserver, 계정 , 비번:
		Connection conn=DriverManager.getConnection(dbUrl,"c##scott","tiger");// driverManager을 객체생성해주는거랑 생성자 메서드 없이. get으로 가져옴 
													//getConnection 이라는 메서드의 반환형이 Connection 이다.  매개변수넣은걸로db연결
		
		
		//3. 쿼리문을 만든다."문자열" 오라클에서 사용하는거를 하나의 문자열로 만든다 	.
		String sql ="select empno, ename, job, to_char(hiredate,'YYYY-DD-MM') hiredate, sal, comm, deptno"
				+ "  from emp where sal>=? or job=? order by ename"; //이게 기니깐 스트링에 담아줌.
		//쿼리문을 먼저 불러옴 (이러한 컬럼명을 불러올거다)
		//밑으로 내릴떈 " from 따음표랑 프롬 사이 띄워야됌
	
			
		//4. 쿼리문을 이용하여 PrepareStatement 객체생성 문자열을 받아서 쿼리문처럼 실행해야함 그걸 실행해주겠금 하는 클래스가 있음 
		PreparedStatement pstmt= conn.prepareStatement(sql);//Connection 
		
		// ?를 세팅  물음표순서 / 
		pstmt.setInt(1, 3000); // 1번째 물음표를 3000불 이상.
		//2번째 물음표 job
		pstmt.setString(2,"세일맨");
	
		//5. 실행하기 //control dpsxj
		ResultSet rs =pstmt.executeQuery(); // 컬렉션에서 set을 떠올리면 resultSet 이랑 비슷함.한줄씩 불러올떄 true,false
		while(rs.next()) {
			//한줄의 레코드를 처리한다.
			int empno = rs.getInt(1); // rs.getInt("empno"); 정수형으로 불러오는거니깐
			String ename = rs.getString(2); 
			String job= rs.getString("job"); //rs.getString(3) 이렇게적어도되고 필드명job 적어도됌
			String hiredate= rs.getString(4);//날짜입장에서는 그냥 문자열이다;
			//double sal =rs.getDouble(5);
			int sal= rs.getInt(5);
			double comm= rs.getDouble(6);
			int depton= rs.getInt(7);
			
			System.out.println(empno+","+ ename+","+job+","+hiredate+","+sal+","+comm+","+depton);
		
		}
			//닫기는 반대로 올라가면서 종료한다. 마지막에 사용한거 부터closing 한다.
			rs.close();
			pstmt.close();
			conn.close();
			
		}catch(SQLException se) {
			System.out.println("DB연결 에러 발생---->"+se.getMessage());
		}
	}

	public static void main(String[] args) {
		new SelectTest();

	}

}

//이건 연결하는 방법 . 대면하면 가서 한번 더 보고. 
//getint는 소수이하 다버림 double 이여도 select의 값을 가져나오는게 가능하다.
//to_char(hiredate,'YYYY-DD-MM') hiredate, 날짜형식으로하고 별명을 설정해줘야한다.