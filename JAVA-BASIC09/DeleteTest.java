import java.util.Scanner;

public class DeleteTest extends DBConnection {

	public DeleteTest() {
		try {
		//�ֿܼ��� ������� �Է¹޾� �Է¹��� ����� �����Ѵ�.
		//��Ʈ�� ���� ���� ��ĳ�ʷ�
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �����=");
		String name= scan.nextLine();
		
		dbConn();
		
		sql="delete from emp where ename=?"; //����ǥ�� ������ �������� ��������� ����� ������ �����Ͱ� �ִ�.
		
		pstmt= con.prepareStatement(sql);//���ܹ߻�
		pstmt.setString(1, name);
		
		int result=pstmt.executeUpdate(); //int=pstmt.executeUpdate�� ���ƿ� ���� �߰���
		System.out.println(result+"���� ���ڵ尡 �����Ǿ����ϴ�");
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
//1. ����̺� ����
//������ ���̽��� ����ϴ� Ŭ������ ����Ŵ� (�ű�� ����̺꿬��, ������, colsing�ϴ°� ����Ŵ�.) �޼ҵ� ���� �װ��� ��ӹ޾Ƽ� ����ϵ��� ������ ���̴�.
//������ �����ϴ°� ��ӹ޾Ƽ� 