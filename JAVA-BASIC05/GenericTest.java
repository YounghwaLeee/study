 
//E(element),K(key),V(value) 3���߿� �ϳ� ����ȴ�.
public class GenericTest<E> { //���ʸ� ��ü �����ϴ°�.���ʸ� ���� �����ұ�? �Ѱ���
//�ɹ����� 
	private E username;
	//private Object username;
	public GenericTest() {
	}
	public GenericTest(E username) {
		this.username= username;

		//�����ڰ� 2���̴ϱ� ����ϴ� ����� 2�� 
	}
	//���� ������ �������°�getter
	public E getUsername() {
		return username;
	}
	//�����͸� �ٲٴ°� �����ϴ°Ŵϱ� ��ȯ�� ����
	public void setusername(E username) {
		this.username=username;
	}
	
}

/*
//private String username; -> ���⿡�� g1.setUserName(1234)->������ ���Ծȵ�
	private Object username;->���⿡�� g1.setUserName(1234)->������ ���ԉ�. ������Ʈ�� ���;�ڽ�?�ڽ�?�ؼ��־���.

*/