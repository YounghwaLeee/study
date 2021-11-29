import java.sql.CallableStatement;
import java.sql.Types;

public class InsertProcedure extends DBConnection {

	public InsertProcedure() {
		
		try {
			//1. db����  CallableStatement -> sql���ν��� �ҷ����°�
			
			dbConn();
									//username, tel, return(out) ó���ϴ� ����� �˾ƾ���
			sql= "{call mem_insert(?,?,?)}";// �̸�,��ȭ��ȣ, ������� ���Ϲ޴� number �Ű����� ������ŭ ����ǥ in 2�� out 1��
			CallableStatement cstmt= con.prepareCall(sql);
			
			cstmt.setString(1, "������");      //in ������
			cstmt.setString(2, "010-1212-1212");	//in ������
			cstmt.registerOutParameter(3, Types.INTEGER); //���ڴϱ� integer 
			
			cstmt.executeUpdate(); //��ġ�°Ŵϱ�
			
			if(cstmt.getInt(3)==1) {
				System.out.println("���ڵ尡 �߰��Ǿ����ϴ�.");
			}else {
				System.out.println("���ڵ� �߰� ����...");
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
/* ��� �Ű������� ������ �̷��� �� ������.(
create or replace procedure mem_insert(p_username in member.username%type, p_tel in member.tel%type,p_result out number)
is
begin

    --1.�߰�, 0:�߰�����
    p_result :=1;
    insert into member(mem_no, username, tel, write_date) 
    values (memSq.nextVal, p_username, p_tel, sysdate);
    
    --���ڵ� �߰��� ������ �߻��ϸ�..
    exception
            when others then
                p_result:=0;
    
end;

*/