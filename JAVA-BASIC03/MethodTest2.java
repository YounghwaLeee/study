
public class MethodTest2 {

	//1.���� �Ѵ� ��� 
	boolean power= false; //true ��ħ, false: ����
	
	//ä�� ���õȰ� // �ּ� �ִ�� ���� now�� �Ź� �ٲ�'
	//���ȭ ��Ų��. �ѹ� ���ԵǸ� ����ɼ� ���Բ� ����°�.
	final int CHANNEL_MIN =1;  //�̽ý��۾ȿ��� �ּҹ�ȣ�� ������ 1���̾�!!
	//�������� ���ʿ� final Ű���带 ǥ�� , ���ȭ�� ������ ��� �������� �빮�ڷ� ǥ���Ѵ� 
	
	final int CHANNEL_MAX =20;
	int channerNow = 11;
	
	
	public MethodTest2() {
	//������ �޼���� new �ϰ� �ҋ� ��� �̰� ������ public MethodTest2() �޼����� �Ѵ�.
	}
	//power��ư�� ���� ��� 
	// �޼��� ������Ģ 1. ��ȯ�� �޼ҵ�� (�Ű�����,�Ű�����, ....�ʿ��Ѹ�ŭ){
	//	���๮ ; // ��ɱ��� 
	// }

	//�޼ҵ���� �ҹ��ڽ���,�ռ����� ��� �ι�° �ܾ���� �빮�ڷ� ()�� �ִ�.
	// void powerStart (�ռҹ����ε�) void PowerStart =�ϸ� �ȵȴ�
	//{����ȿ����� ���� ����Ҽ�����.}
	//
	void powerStart() {
		power = !power; //Ʈ�縦 �޽��� �޽��� Ʈ���
		//void ��ȯ���� ����.
		
//		if(power) {
//			power =false;
//		}else {
//			power =true;
//		}
		
		System.out.println("power="+power);
		
	}
	//���� �Է��ϸ� �������� ���Ͽ� ��ȯ�ϴ� �޼ҵ带 ���� or ��ȯ ���ϴ� �޼ҵ带 ����
	 //void �� ��ȯ���� ���� ������ �������� ����. ������ �տ� ���� �� ���� . 
		String gugudan(int dan){
			//���๮- ������ ����� ������ �������°�. ���๮1���� ��������.
			String result ="";
			for(int i=2;i<10;i++) {
				result += dan + "*"+i+"="+dan*i+"\n";
			}
			
			return result; 
			//� �����Ͱ� ������ �������� �˷���. �������� ��Ʈ���� ���ؼ� ���ڷ� ������.
	}
		//ä�� ��ȣ �ø��� 
		//1.ä�θ� �ٲٸ� �Ǵϱ� ��ȯ���� ����
		 void cahnnelUp() {
			if(channerNow==CHANNEL_MAX) {
				channerNow=CHANNEL_MIN;
			}else {
				channerNow++;
			}
			cahnnelPrint();//���� Ŭ������ �ٸ� �޼ҵ� ȣ��
		}
		
		//ä�� ��ȣ ������ 
		void cahnnelDown() {
			if(channerNow==CHANNEL_MIN) { //����ü���� ���� ���� ä���̸� 1���̸� 
				channerNow=CHANNEL_MAX;
			}else {
				channerNow--;	
			}
			
			cahnnelPrint();
		
	}
		//ä�ι�ȣ ����ϴ� �޼ҵ�
		void cahnnelPrint () {
			System.out.println("ä�ι�ȣ:"+channerNow);
		}

		//Ŭ������ ���ٴ� ���� ������ �ֵ��� ����̴�. 

		//static Ű���� - ��������sum�̶�� �޼��带 �����  ���
		static void sum(int max) {
			int tot=0;
			for(int i=1; i<=max; i++) {
				tot+=i;
			}
			System.out.println("1~" +max+"�� ����"+tot);
		}
}