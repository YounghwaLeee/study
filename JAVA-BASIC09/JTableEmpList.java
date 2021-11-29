import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEmpList extends JFrame {
	
	
	JTable table;
	DefaultTableModel model;
	String title[]= {"�����","�޿�","���ʽ�","�Ի���"};
	JScrollPane sp;

	
	//1.����̺��ε� (����ó���ؾ���) -�ɹ��������� ���๮ ������. 
	//���๮�� �ɹ������� �����ϱ� ���ؼ� ����ϴ� ��� static ()���� ���๮�� ǥ���Ҽ��ִ� �����̉�
	//for��, ��깮 �� ��밡���� 
	static {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(ClassNotFoundException cnfe) {
				System.out.println("JDBC����̺� �ε����� �߻�");
				cnfe.printStackTrace();
			}
	}
	
	String url ="jdbc:oracle:thin:@172.30.1.18:1521:xe";
	String username= "c##scott";
	String password= "tiger";
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	
	public JTableEmpList() {
		model = new DefaultTableModel(title,0);
		//1. �������۾�(�𵨿��ٰ� �����͸� �ִ� �۾�) ���� �ؾ���.  �� �Ŀ� �ƹ��������� �ص���.
		
		table = new JTable();	//new JTable(model);
		table.setModel(model);
		//1.�������̺��� ��ü�����ؼ� frame �� �־���� 
		//2.�𵨿� �����Ϳ� ��Ƽ� ��ƾ���. ���� �����ͺ��̼� �о���������� �����Ͱ� ���»���
		sp= new JScrollPane(table);
		
		add(sp);// ��ũ���� ���Ϳ��ٰ� �ִ´�.
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		empAllSelect();//ȭ�鿡 show �ϰ� ���� db �۾��� �ϰڴ�.
	}
	
	public void empAllSelect() {
		//1. ����̺�ε� - �ڹٰ���ӽ����� JDVC �� ����ٴ°� �˷��� �˷����ָ��. (�ɹ�����)

		try {
		//2. DB����
			conn= DriverManager.getConnection(url,username,password);
		//3. Statment ����(SQL��)
			String sql="select ename, sal, comm, to_char(hiredate,'YYYY-MM-DD') hiredate from emp order by hiredate"; //�Ի����� ��������
			pstmt = conn.prepareStatement(sql);
			//4. ����
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Object[] emp= {rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getNString(4)};
				model.addRow(emp); //���ڵ� ����ŭ �ݺ� �𵨿� ���ڵ尡 �߰����� 
			}
		//5. �ݱ�
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
			if(rs!=null)rs.close();//��ü�� �����ϸ� close ���ְ�
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
			}catch(SQLException s) {
				System.out.println("�ݱ� ���� �߻�");
					
				}
			}
		}
	

	public static void main(String[] args) {
		new JTableEmpList();

	}

}
//����ó����°� �����ͺ��̽� ������ �ȳ��� conn �̶���ϴ� ��ü�� �������
//������ ���� pstmt catch �����ΰ�  
//���ܰ� �߻� �ϴ� ���ϴ� �����ϴ°� final

