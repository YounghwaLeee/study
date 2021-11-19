
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public PropertiesTest() {
		//key, value ��� String �� collection�̴�.
		
		Properties prop = new Properties(); //�ٸ��͵���� �޸� ���ʸ��� ����. 
		// �÷��ǿ� ��ü �߰� setProperty ��¸޼���
		prop.setProperty("���̹�", "https//www.naver.com");
		prop.setProperty("����Ʈ", "http://www.nate.com");
		prop.setProperty("����", "http://www.daum.net");
		prop.setProperty("����", "http://www.google.com");
		
		//getProperty():Ű�� �̿��Ͽ� ��ü ������
		
		System.out.println(prop.getProperty("����")); //���ʿ� �ִ°� key �ϱ� �����ּ� ������
		
		//Ű ��ü��� ���ϱ�
		Enumeration e  = prop.propertyNames(); //���ʸ��� ���� ���ϱ� object�� ������ִ�.
		
		while(e.hasMoreElements()) { //��ü�� �������� ���true,������ false //�������� ������ �ٽ� �־���ϴϱ� ����ȯ�� ������Ѵ�.
			//Object boj =e.nextElement(); �̷��� �ϸ� �ٷ� ��
			
			String str=(String) e.nextElement();
			System.out.println("key="+str+",vlaue="+prop.getProperty(str));
		}

	
	}

	
	
	public static void main(String[] args) {
		 new PropertiesTest();
	}

}
