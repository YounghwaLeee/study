import java.util.StringTokenizer;

public class StringTokenizerTest {

	public StringTokenizerTest() {
		String txt = "�����, ������,,,,,,,,,, �ż���, �ű�����, 3��, ��Ʈķ��, ��������";
		
		StringTokenizer st = new StringTokenizer(txt,",.");
		int tokencount = st.countTokens();
		System.out.println("��ū��"+ tokencount);
		
		while(st.hasMoreElements()) {//true :���� ��ū�� ������ ,false :������ū�̾�����
			String token = st.nextToken();
			System.out.println(token);
		
			}
		}
		
		//��Ʈ�����۳� ��Ʈ�� ������ ����ϴ°� ȿ���̴�.
	//��Ʈ���̶� ��Ʈ�� ������ ������ 
	//��Ʈ���� �ּ� �Űܴٴ� ��Ʈ�����۴� �ּҰ� ���ܵ� �Űܴٴ��� ����

	public static void main(String[] args) {
		new StringTokenizerTest();

	}

}
