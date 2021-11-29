import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //여기에서 에러나는건 이게오타
		}catch(ClassNotFoundException c) {
			System.out.println("드라이브 로딩에러...");
			
		}
	}
	Connection conn;
	PreparedStatement pstmt;   //insert into는 추가하는거지 가져오는게 아니니간 result set은 가져오는게 아니다.
	
	public InsertTest() {
		//사원번호, 사원명, 급여를 입력받아 레코드를 추가 ->3 개는 콘솔에서 입력받음inputStream 
		//입사일은 현재 날짜로 지정한다.(년,월,일 시 분 초) 
		
		//데이터 BufferedReader
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.print("사원번호=");
		int empno = Integer.parseInt(br.readLine()); //redaline 익셉션발생 문자받는거니깐 형변환.
		System.out.println("사원명=");
		String ename = br.readLine();
		System.out.println("급여");
		int sal =Integer.parseInt(br.readLine());
		
		
		
		//DB에 저장 (db연결)
		conn= DriverManager.getConnection("jdbc:oracle:thin:@172.30.1.18:1521:xe","c##scott","tiger");// 바로 선언해준거
		//쿼리문은 레코드를 추가하는거 
		String sql= "insert into emp(empno, ename, sal, hiredate) values(?,?,?,sysdate)"; //여긴 오라클정보이기 떄문에 오라클 정보확인
		//insert into   values(차례대로 입력 ) sysdate 오라클의 현재날짜 불러오는거 
		pstmt= conn.prepareStatement(sql);//이걸 저기 values 뒤에 세팅하는거 
		//?값 세팅 
		pstmt.setInt(1, empno);  //순서대대로 넣어준다 ?개수만큼 값을 세팅해줘야한다.
		pstmt.setString(2, ename);
		pstmt.setInt(3, sal);
		
		int cnt = pstmt.executeUpdate();//값을 추가하는거기때문에 int값으로 받아줌 int 변수선언
		
		if(cnt>0) {
			System.out.println("레코드가 추가 되었습니다");
		}else {
			System.out.println("레코드 추가 실패하였습니다.");
		}
		
	}catch(IOException ie) {
		System.out.println("데이터 입력에러 발생--->"+ie.getMessage());
	}catch(SQLException s) {
		System.out.println("데이터베이스 연결 에러 발생--->"+s.getMessage());
	}finally {
		try {
			if(pstmt!=null)pstmt.close();
			if(conn!=null)pstmt.close();
		}catch(Exception e) {
			System.out.println("닫기 에러...");
		}
	}
}
	public static void main(String[] args) {
		 new InsertTest();

	}

}

//EXecuteQuery
//select구문을 수행할떄 사용하는 함수이다.
//ResultSet 객체에 결과값을 담을 수 있습니다.

//ExecuteUpdate
// 수행결과로 Int 타입의 값을 반환합니다.
//SELECT 구문을 제외한 다른 구문을 수행할 때 사용되는 함수입니다.

//insert문은 레코드가 추가될거기 떄문에 executeUpte 는 int를 반환함 
//레코드를 추가하다가 쿼리문에 문제있다. 문제가 있다는거는 이름이 5글자였는데 insert 실행하때 에러가 생김 이럼insert를 못하니깐 0으로 돌아옴
//insert 1개만 가능하지만, update는 여러개 레코드가 추가 가능함 update 5개 레코드 추가되면 int5가 들어옴.