//��ӹް��� �ٷ� Ŭ������ ������ �׾��� ����
public class AbstractMain extends AbstractTest {

	public AbstractMain() {
	
	}

	//��ӹ��� �߻�Ŭ�������� ��� �߻�޼ҵ带 �������̵� 
	//d�������̵� �Ҷ��� Abstract �Ⱦ�
	public void print() {
		System.out.println("num="+num+",name="+name);
	}
	//��ӹ��� Ŭ�������� ��ɱ����� �Ѱ��̴�
	//�������� �޶� ������, ��������, ������ ���ƾ���
	public void setData(int num,String name) {
		this.num= num; //super.num= num
		this.name= name;	//super.name =name (����Ŭ������ �ѹ����Ӿ����ϱ��۰���)
		
		
	}
	public void start() {
		numOutput();
		setData(5000,"�̼���");
		print();
		
	}
	public static void main(String[] args) {

		AbstractMain am = new AbstractMain();
		am.start();
		
	}

}
