
public class MetthodMain {

	public static void main(String[] args) {
	//         mt�� ��ü�̸鼭 �ν��Ͻ� �̴�. (�ᱹ�� �����̸�) 	instancd=reference����
						//�����ڸ޼ҵ� ��ü����Ҷ� Ŭ������ ������ �޼ҵ�
		MethodTest mt=	new MethodTest(); 
		MethodTest mt2= new MethodTest("010-1234-5555");
		
		//��ü���� �ɹ������� ������ �ٸ������ͷ� �����ϱ�
		//��ü��.�ɹ����� 
		mt.name ="�̼���";
		System.out.println("mt.name"+mt.name);
		System.out.println("mt2.name"+ mt2.name);
		
		//
		MethodTest mt3 = new MethodTest(100,"�������");
		     //MethodTest mt3 = new MethodTest("�������",100);
		
		System.out.println("mt3.num="+mt3.num); //100
		System.out.println("mt3.name="+mt3.name); //�������
		System.out.println("mt3.tel="+mt3.tel); //02-1234-1234
	 	
		MethodTest mt4= new MethodTest("�念��",200);
		 //���� Ŭ�������� ��ü���� �����Ͱ� �ٴٸ�
		System.out.println("mt4.num="+mt4.num);//200
		System.out.println("mt4.name="+mt4.name);//�念��
		System.out.println("mt4.tel="+mt4.tel);
	}

}
