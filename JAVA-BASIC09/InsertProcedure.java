import java.sql.CallableStatement;
import java.sql.Types;

public class InsertProcedure extends DBConnection {

	public InsertProcedure() {
		
		try {
			//1. db연결  CallableStatement -> sql프로시저 불러오는거
			
			dbConn();
									//username, tel, return(out) 처리하는 방법을 알아야함
			sql= "{call mem_insert(?,?,?)}";// 이름,전화번호, 결과값을 리턴받는 number 매개변수 개수만큼 물음표 in 2개 out 1개
			CallableStatement cstmt= con.prepareCall(sql);
			
			cstmt.setString(1, "윤봉길");      //in 데이터
			cstmt.setString(2, "010-1212-1212");	//in 데이터
			cstmt.registerOutParameter(3, Types.INTEGER); //숫자니깐 integer 
			
			cstmt.executeUpdate(); //고치는거니깐
			
			if(cstmt.getInt(3)==1) {
				System.out.println("레코드가 추가되었습니다.");
			}else {
				System.out.println("레코드 추가 실패...");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			dbClose();
		}
	}

	public static void main(String[] args) {
		new  InsertProcedure();
	}

}
/* 어떤걸 매개변수르 넣을지 이런거 잘 봐야함.(
create or replace procedure mem_insert(p_username in member.username%type, p_tel in member.tel%type,p_result out number)
is
begin

    --1.추가, 0:추가실패
    p_result :=1;
    insert into member(mem_no, username, tel, write_date) 
    values (memSq.nextVal, p_username, p_tel, sysdate);
    
    --레코드 추가시 에러가 발생하면..
    exception
            when others then
                p_result:=0;
    
end;

*/