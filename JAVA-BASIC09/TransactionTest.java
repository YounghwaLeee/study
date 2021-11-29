import java.sql.SQLException;

public class TransactionTest extends DBConnection {

	public TransactionTest() {

		//1.A BANK :5000���� ����� ������ B_BANK:  5000�� �Ա�
		
		dbConn();//1.DB���� 
		
		//�ڵ� Commit �����ϱ� 
		try {
		con.setAutoCommit(false);//true �� �ڵ�Commit. false:�ڵ�Commit ���� 
		
		int abank=-5000, bbank=5000;
		
		//���
		sql ="insert into a_bank(num,money) values(a_number.nextval,?)";
											//��ȣ�߿� ������ ���� �չ�ȣ����!!
		pstmt= con.prepareStatement(sql);
		pstmt.setInt(1, abank);
		int cnt = pstmt.executeUpdate();
		if(cnt>0) {
			System.out.println( Math.abs(abank)+"���� ��ݵǾ����ϴ�.");  //���밪�� �������� -5000���� ��ݵǾ����ϴ� �̷��� �����ϸ� �ȵǴϱ�.
		}else {
			System.out.println( Math.abs(abank)+"�� ����� �����Ͽ����ϴ�.");
		}
		

		//�Ա�(�����߱� ������ ���� ���� sql �״�� ����ص���)+5000 
		//������ ���� ���� throws
		if(cnt>0) throw new Exception(); //����� -5000���� ��µ� �� ���� �Աݿ� ���� �ϴµ� �Ա��� �ȵ��� ��츦 ��� -5000�����ͼս��̉�
											//����� �Ǹ� �ȵǴϱ� ������ �߻���Ų�Ŵ�. 
	
		sql ="insert into b_bank(num,money) values (b_number.nextval,?)";
		pstmt= con.prepareStatement(sql);//������ ���θ����
		pstmt.setInt(1, bbank);//����ǥ�� �ϳ� ������ �����ϰ�
		int cnt2= pstmt.executeUpdate();
		if(cnt2>0) {
			System.out.println(bbank+"���� �ԱݵǾ����ϴ�.");
		}else {
			System.out.println(bbank +"�� �Ա� �����Ͽ����ϴ�");
		}
		
		con.commit();
		}catch(Exception e) {
			e.printStackTrace(); 
			try {
			con.rollback(); //������ �ս��� ���� �ȵǴϱ� �ѹ��� ��Ű�°Ŵ�. ���� ���α׷����� �׷����� -5000���� ��� ���Ѱɷε��ư��ڱ�. 
			}catch(Exception ee) {}
		}finally {
			dbClose();
		}
	}
	//�����ϸ� ���ܸ� ������ �߻����Ѽ� ĳġ�����οͼ� �ѹ��� ���Ѽ� ����ϴ°Ŵ�.
	public static void main(String[] args) {
		new TransactionTest();

	}

}
//1.ù���� ���� DB���� 
//2.Ŀ���� �����ָ� ����� �ȵȴ�.
//3.Ŀ���� �� ���´�.