//Ŭ������� �޼ҵ���� �Ȱ���. �ŰԺ����� ���� �����ڸ� ��Ŭ�������� ������
public class MethodTest2Main {

	public MethodTest2Main() {

	}

	public static void main(String[] args) {
		
		//���� �ʿ�� �ϴ� �޼ҵ� 2�� ������.
		 MethodTest2 mt = new  MethodTest2();
		 
		 String gugu=mt.gugudan(8);  //�޼ҵ�ȣ��
		 System.out.println(gugu);
		 
		 //��ȯ���� ���� �޼ҵ� ȣ��
		 mt.powerStart();
		 //��� ���ʿ� ���� ������ �� ���� . ��ȯ�ϴ� �����Ͱ� ���� ������
		 
		//��ä��.
		 mt.cahnnelUp();
		 mt.cahnnelUp();
		 mt.cahnnelDown();
		// static Ű���� - static  ���� �޼ҵ�� �ݵ�� ��ü�� �����޼ҵ带 ȣ�⤩�ؾ� �Ѵ�.
		 mt.sum(20);
		// sum�̶�� �޼ҵ带 �����ϰ� �ִ� Ŭ������ MethodTest2 ��ü�� ����� 
		// ��ä��.sum �̶�� �ϸ�ȴ�
		//static�� �޼ҵ��� ��ȯ�� ���ʿ� �ִ� ���� �޼ҵ带 ��ü�������� �ʰ� ȣ���Ҽ� �ֵ�,.
		 MethodTest2.sum(50);    //��ü�� ���� ���Ծƴ϶� Ŭ����.�� ������
	}

}
