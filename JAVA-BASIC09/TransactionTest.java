import java.sql.SQLException;

public class TransactionTest extends DBConnection {

	public TransactionTest() {

		//1.A BANK :5000원을 출금한 다음에 B_BANK:  5000원 입금
		
		dbConn();//1.DB연결 
		
		//자동 Commit 해제하기 
		try {
		con.setAutoCommit(false);//true 면 자동Commit. false:자동Commit 해제 
		
		int abank=-5000, bbank=5000;
		
		//출금
		sql ="insert into a_bank(num,money) values(a_number.nextval,?)";
											//번호중에 사용안한 제일 앞번호내놔!!
		pstmt= con.prepareStatement(sql);
		pstmt.setInt(1, abank);
		int cnt = pstmt.executeUpdate();
		if(cnt>0) {
			System.out.println( Math.abs(abank)+"원이 출금되었습니다.");  //절대값을 넣은이유 -5000원이 출금되었습니다 이렇게 세팅하면 안되니깐.
		}else {
			System.out.println( Math.abs(abank)+"원 출금이 실패하였습니다.");
		}
		

		//입금(실행했기 때문에 위에 변수 sql 그대로 사용해도됌)+5000 
		//강제로 에러 내기 throws
		if(cnt>0) throw new Exception(); //출금이 -5000원이 됬는데 그 값이 입금에 들어가야 하는데 입금이 안됐을 경우를 출금 -5000데이터손실이됌
											//구롷게 되면 안되니깐 강제를 발생시킨거다. 
	
		sql ="insert into b_bank(num,money) values (b_number.nextval,?)";
		pstmt= con.prepareStatement(sql);//쿼리문 새로만들고
		pstmt.setInt(1, bbank);//물음표가 하나 있으니 세팅하고
		int cnt2= pstmt.executeUpdate();
		if(cnt2>0) {
			System.out.println(bbank+"원이 입금되었습니다.");
		}else {
			System.out.println(bbank +"원 입금 실패하였습니다");
		}
		
		con.commit();
		}catch(Exception e) {
			e.printStackTrace(); 
			try {
			con.rollback(); //데이터 손실이 나면 안되니깐 롤백을 시키는거다. 은행 프로그램에선 그런개념 -5000값이 출금 안한걸로돌아가겠금. 
			}catch(Exception ee) {}
		}finally {
			dbClose();
		}
	}
	//실패하면 예외를 강제로 발생시켜서 캐치문으로와서 롤백을 시켜서 취소하는거다.
	public static void main(String[] args) {
		new TransactionTest();

	}

}
//1.첫번쨰 할일 DB연결 
//2.커밋을 안해주면 기록이 안된다.
//3.커밋이 된 상태다.