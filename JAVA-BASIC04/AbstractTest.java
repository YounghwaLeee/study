//�߻�޼ҵ带 1���̻� �����ϴ� Ŭ������ �߻�Ŭ�����̴�
//�߻�Ŭ������ class Ű���� ���ʿ� abstract�� ǥ���ؾ� �Ѵ�
//�߻�Ŭ������ �ݵ�� ��ӹ޾� ��� �߻�޼ҵ带 �������̵� �Ͽ��� �Ѵ�. (�������̵�)��ӹ��� Ŭ�������� ������
public abstract class AbstractTest {
	int num =100;
	String name ="�̿�ȭ";
	public AbstractTest() {
	}
	public void numOutput() {
		System.out.println("num="+num);
	}
	//����ΰ� ���� �޼ҵ�� �߻�޼ҵ��̴�.
	//�߻�޼ҵ�� ��ȯ�� ���ʿ� abstract Ű���带 ǥ���Ͽ��� �Ѵ�.
	public abstract void print(); 
	public abstract void setData(int num,String name);
	
	//{}�߰�ȣ�� ������ ����ΰ� ���°��̴�.
	//�̿ϼ��� Ŭ���� ,�޼ҵ� ���д� �޾Ƴ��� ���ȿ� ���׸��� ���Ѵ�Ŵ 
}
