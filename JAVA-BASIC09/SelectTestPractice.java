//�̿�ȭ
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SelectTestPractice extends JFrame{
		
		JTable table;
		JScrollPane sp;
		DefaultTableModel model;
		
		String title []= {"�����","�޿�","���ʽ�","�Ի���"};

	public SelectTestPractice() {
			
		
			setSize(500,400);
			setVisible(true);

			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(ClassNotFoundException cnfe) { //������ ������ �ʾҴ�.
				System.out.println("jdbc ����̺� �ε� ����-->"+cnfe.getMessage());
			}
			
			try{
			//2. db ����
			String dbUrl ="jdbc:oracle:thin:@172.30.1.18:1521:xe";
			
			Connection conn=DriverManager.getConnection(dbUrl,"c##scott","tiger");
			
			//3. �������� �����.
			String sql ="select ename, sal,comm,to_char(hiredate,'YYYY-MM-DD') hiredate from emp";
			//4. �������� �̿��� PrepareStatement ��ü���� ���ڿ�
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//Object [] sel= {ename,}
			
			//5.�����ϱ�
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {	
				String ename =rs.getString(1);
				int sal=rs.getInt(2);
				double comm=rs.getDouble(3);
				String hiredate =rs.getString(4);
				
				System.out.println(ename+","+sal+","+comm+","+hiredate);
				
			}
			rs.close();
			pstmt.close();
			conn.close();
					
		}catch(SQLException se) {
			System.out.println("DB���� �����߻�----"+se.getMessage());
		}
	}
	public static void main(String[] args) {
		new SelectTestPractice();

	}

}
