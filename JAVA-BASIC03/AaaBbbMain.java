
public class AaaBbbMain {

	public AaaBbbMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BBB b =new BBB();
		b.output();
		//���� Ŭ������ ��ü�� �����ϸ� ����Ŭ������ ������ �ȴ�.
		AAA a = new BBB();//�θ𿡼� �ڽ�����ü���� �ڽĿ��� �θ� ��ü �����ϴ°� ����� �ȉ� �ƿ����� ����ȉ�.
		a.output();
		
		System.out.println("b.tel="+b.tel);//
		//System.out.println("a.tel="+a.tel);
		System.out.println("a.name=" +a.name);//������ ���� aaa�� ����
		System.out.println("a.num="+a.num);//������ �ڱⲾ ����� �ȴ�. �޼���� �Ѵ� �ֵ��� �ڽİԳ��´�.
		
		BBB c= (BBB)a;
		c.output();
		
		Object obj = new BBB();
		BBB d = (BBB)obj;
		d.output();

	}

}
//������ �޼���� ������ ������ ������ �ȉ�
