import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public SelectTest() {
		try { //�긦 ��ü�θ��� ��Ŭ���� ��°� �˷��ִ°�
		//1.�ڹ�JVM �� jdbc����̺� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver"); //��ü���� �ڹٰ���ӽſ� �ˎ¤�
		}catch(ClassNotFoundException cnfe) {
			System.out.println("jdbc ����̺� �ε� ����--> "+ cnfe.getMessage());// ���ּҸ� �ε�����
		}
		try {
		
		//2. DB���� 						����ip,localhost port ��������
		String dbUrl ="jdbc:oracle:thin:@localhost:1521:xe"; //����Ŭ ����ϴ� ����<���¾��>
												//1.dbserver, ���� , ���:
		Connection conn=DriverManager.getConnection(dbUrl,"c##scott","tiger");// driverManager�� ��ü�������ִ°Ŷ� ������ �޼��� ����. get���� ������ 
													//getConnection �̶�� �޼����� ��ȯ���� Connection �̴�.  �Ű����������ɷ�db����
		
		
		//3. �������� �����."���ڿ�" ����Ŭ���� ����ϴ°Ÿ� �ϳ��� ���ڿ��� ����� 	.
		String sql ="select empno, ename, job, to_char(hiredate,'YYYY-DD-MM') hiredate, sal, comm, deptno"
				+ "  from emp where sal>=? or job=? order by ename"; //�̰� ��ϱ� ��Ʈ���� �����.
		//�������� ���� �ҷ��� (�̷��� �÷����� �ҷ��ðŴ�)
		//������ ������ " from ����ǥ�� ���� ���� ����߉�
	
			
		//4. �������� �̿��Ͽ� PrepareStatement ��ü���� ���ڿ��� �޾Ƽ� ������ó�� �����ؾ��� �װ� �������ְڱ� �ϴ� Ŭ������ ���� 
		PreparedStatement pstmt= conn.prepareStatement(sql);//Connection 
		
		// ?�� ����  ����ǥ���� / 
		pstmt.setInt(1, 3000); // 1��° ����ǥ�� 3000�� �̻�.
		//2��° ����ǥ job
		pstmt.setString(2,"���ϸ�");
	
		//5. �����ϱ� //control dpsxj
		ResultSet rs =pstmt.executeQuery(); // �÷��ǿ��� set�� ���ø��� resultSet �̶� �����.���پ� �ҷ��Ë� true,false
		while(rs.next()) {
			//������ ���ڵ带 ó���Ѵ�.
			int empno = rs.getInt(1); // rs.getInt("empno"); ���������� �ҷ����°Ŵϱ�
			String ename = rs.getString(2); 
			String job= rs.getString("job"); //rs.getString(3) �̷�������ǰ� �ʵ��job �����
			String hiredate= rs.getString(4);//��¥���忡���� �׳� ���ڿ��̴�;
			//double sal =rs.getDouble(5);
			int sal= rs.getInt(5);
			double comm= rs.getDouble(6);
			int depton= rs.getInt(7);
			
			System.out.println(empno+","+ ename+","+job+","+hiredate+","+sal+","+comm+","+depton);
		
		}
			//�ݱ�� �ݴ�� �ö󰡸鼭 �����Ѵ�. �������� ����Ѱ� ����closing �Ѵ�.
			rs.close();
			pstmt.close();
			conn.close();
			
		}catch(SQLException se) {
			System.out.println("DB���� ���� �߻�---->"+se.getMessage());
		}
	}

	public static void main(String[] args) {
		new SelectTest();

	}

}

//�̰� �����ϴ� ��� . ����ϸ� ���� �ѹ� �� ����. 
//getint�� �Ҽ����� �ٹ��� double �̿��� select�� ���� ���������°� �����ϴ�.
//to_char(hiredate,'YYYY-DD-MM') hiredate, ��¥���������ϰ� ������ ����������Ѵ�.