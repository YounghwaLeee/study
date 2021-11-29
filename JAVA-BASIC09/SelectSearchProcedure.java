import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;

public class SelectSearchProcedure extends DBConnection {
	
	Scanner scan= new Scanner(System.in);

	public SelectSearchProcedure() {
		
		try {
			dbConn();
				
			System.out.println("검색어입력=");
			String searchWord = scan.nextLine();
			
			sql="call mem_search( ?, ?)"; //첫번쨰물음표 out, 두번째in
			CallableStatement cstmt= con.prepareCall(sql);
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			cstmt.setString(2, searchWord);
			
			cstmt.executeLargeUpdate();
			
			rs= (ResultSet)cstmt.getObject(1);// 얘를 resultset으로 바꿔준다
			
			while(rs.next()) {
				System.out.printf("%d,%s,%s\n", rs.getInt("mem_no"), rs.getString(2), rs.getString(3));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();		
			}finally {
				dbClose();
			}		
	}

	public static void main(String[] args) {
		new SelectSearchProcedure();

	}

}
/*
create or replace procedure mem_search(p_result out sys_refcursor,p_name in member.username%type) --아웃이 먼저오고 in이 먼저온 구조로 함
is
begin

    open p_result for select mem_no,username,tel from member where username 
    like '%'||p_name||'%' order by username asc;    --p_name에 포함되어 있으면 
end;

*/