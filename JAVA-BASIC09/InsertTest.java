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
			Class.forName("oracle.jdbc.driver.OracleDriver"); //���⿡�� �������°� �̰Կ�Ÿ
		}catch(ClassNotFoundException c) {
			System.out.println("����̺� �ε�����...");
			
		}
	}
	Connection conn;
	PreparedStatement pstmt;   //insert into�� �߰��ϴ°��� �������°� �ƴϴϰ� result set�� �������°� �ƴϴ�.
	
	public InsertTest() {
		//�����ȣ, �����, �޿��� �Է¹޾� ���ڵ带 �߰� ->3 ���� �ֿܼ��� �Է¹���inputStream 
		//�Ի����� ���� ��¥�� �����Ѵ�.(��,��,�� �� �� ��) 
		
		//������ BufferedReader
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.print("�����ȣ=");
		int empno = Integer.parseInt(br.readLine()); //redaline �ͼ��ǹ߻� ���ڹ޴°Ŵϱ� ����ȯ.
		System.out.println("�����=");
		String ename = br.readLine();
		System.out.println("�޿�");
		int sal =Integer.parseInt(br.readLine());
		
		
		
		//DB�� ���� (db����)
		conn= DriverManager.getConnection("jdbc:oracle:thin:@172.30.1.18:1521:xe","c##scott","tiger");// �ٷ� �������ذ�
		//�������� ���ڵ带 �߰��ϴ°� 
		String sql= "insert into emp(empno, ename, sal, hiredate) values(?,?,?,sysdate)"; //���� ����Ŭ�����̱� ������ ����Ŭ ����Ȯ��
		//insert into   values(���ʴ�� �Է� ) sysdate ����Ŭ�� ���糯¥ �ҷ����°� 
		pstmt= conn.prepareStatement(sql);//�̰� ���� values �ڿ� �����ϴ°� 
		//?�� ���� 
		pstmt.setInt(1, empno);  //�������� �־��ش� ?������ŭ ���� ����������Ѵ�.
		pstmt.setString(2, ename);
		pstmt.setInt(3, sal);
		
		int cnt = pstmt.executeUpdate();//���� �߰��ϴ°ű⶧���� int������ �޾��� int ��������
		
		if(cnt>0) {
			System.out.println("���ڵ尡 �߰� �Ǿ����ϴ�");
		}else {
			System.out.println("���ڵ� �߰� �����Ͽ����ϴ�.");
		}
		
	}catch(IOException ie) {
		System.out.println("������ �Է¿��� �߻�--->"+ie.getMessage());
	}catch(SQLException s) {
		System.out.println("�����ͺ��̽� ���� ���� �߻�--->"+s.getMessage());
	}finally {
		try {
			if(pstmt!=null)pstmt.close();
			if(conn!=null)pstmt.close();
		}catch(Exception e) {
			System.out.println("�ݱ� ����...");
		}
	}
}
	public static void main(String[] args) {
		 new InsertTest();

	}

}

//EXecuteQuery
//select������ �����ҋ� ����ϴ� �Լ��̴�.
//ResultSet ��ü�� ������� ���� �� �ֽ��ϴ�.

//ExecuteUpdate
// �������� Int Ÿ���� ���� ��ȯ�մϴ�.
//SELECT ������ ������ �ٸ� ������ ������ �� ���Ǵ� �Լ��Դϴ�.

//insert���� ���ڵ尡 �߰��ɰű� ������ executeUpte �� int�� ��ȯ�� 
//���ڵ带 �߰��ϴٰ� �������� �����ִ�. ������ �ִٴ°Ŵ� �̸��� 5���ڿ��µ� insert �����϶� ������ ���� �̷�insert�� ���ϴϱ� 0���� ���ƿ�
//insert 1���� ����������, update�� ������ ���ڵ尡 �߰� ������ update 5�� ���ڵ� �߰��Ǹ� int5�� ����.