import java.util.Stack;

//�������°� ���� �������� Ȯ���ϸ� �ȴ�.
public class StackTest {

	public StackTest() {
			Stack<String> stack = new Stack(); 
			
			//stack�� ���� �Էµ� ������ ���߿� ��µȴ�. (FILO:first in last out) �ؿ������� ���� ȫ�浿~������ ������ ��.
																		//pop�� �ϸ� ������ ����.
			//queue : fifo �������¾ְ� ���� ���´�.
			//push : �Է� , pop(): ���
			stack.push("ȫ�浿");
			stack.push("�������");
			stack.push("�̼���");
			stack.push("������");
			
			//empty��� �޼ҵ�� stack�� ��ä�� ������ false�� ������, -> ����ִ��� ����°Ŵϱ�
			//��ü�� ���� �� true �ֳ� ������ �ƴϰ� ����ֳ� ��� ����°Ŵϱ� . 
			//while(!stack.empt ������ �ϸ� ��ü�� ������ ture ��� �´�.
			while(!stack.empty()) {
				String name=stack.pop();
				System.out.println(name);
			}

	}

	public static void main(String[] args) {

		 new StackTest();
	}

}
