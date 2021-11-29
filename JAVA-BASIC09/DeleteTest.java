import java.util.Scanner;

public class DeleteTest extends DBConnection {

	public DeleteTest() {
		try {
		//콘솔에서 사원명을 입력받아 입력받은 사원을 삭제한다.
		//스트링 버퍼 말고 스캐너로
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 사원명=");
		String name= scan.nextLine();
		
		dbConn();
		
		sql="delete from emp where ename=?"; //물음표가 들어간얘기는 쿼리문을 프리페얼드로 만들고 세팅할 데이터가 있다.
		
		pstmt= con.prepareStatement(sql);//예외발생
		pstmt.setString(1, name);
		
		int result=pstmt.executeUpdate(); //int=pstmt.executeUpdate로 돌아옴 삭제 추가는
		System.out.println(result+"개의 레코드가 삭제되었습니다");
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			dbClose();
			
		}
	}
	public static void main(String[] args) {
		new DeleteTest();

	}

}
//1. 드라이브 연결
//데이터 베이스에 사용하는 클래스를 만들거다 (거기는 드라이브연결, 변수들, colsing하는걸 만들거다.) 메소드 만들어서 그것을 상속받아서 사용하도록 구현할 것이다.
//공통모듈 삭제하는건 상속받아서 