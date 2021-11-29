import java.sql.CallableStatement;
import java.sql.Types;

public class DeleteProcudure extends DBConnection {

	public DeleteProcudure() {
		
		try {
			
			dbConn();
			
			sql="{call mem_del(?,?)}";
			
			CallableStatement cstmt = con.prepareCall(sql);
			cstmt.setString(1, "홍길동");
			cstmt.registerOutParameter(2, Types.INTEGER);
			
			cstmt.executeUpdate();//하고나면? 두번쨰에 값이 담겨져 있음
			if(cstmt.getInt(2)==1) {
				System.out.println("삭제성공");
			}else {
				System.out.println("삭제실패");
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			dbClose();
		}
	}

	public static void main(String[] args) {
		new DeleteProcudure();

	}

}
