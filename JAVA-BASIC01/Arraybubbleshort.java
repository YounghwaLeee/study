
public class Arraybubbleshort {

	public static void main(String[] args) {
	//1.������ �غ� ���� 
		//1~100������ ������ 10�� �����Ͽ� �迭�� ������ �������� (������->������) �����Ͽ� ����϶�.
		//������ �����
		
		int [] num = new int[10];  //10���� ������ ����Ҽ� �ִ� ����
		
		//�迭�� ���̱��� 0~9���� ���ϴ°�
		for(int i=0; i<num.length;i++) {      //i=0,1,2,3,4,5,6,7,8,9
			int random=(int)(Math.random()*(100-1+1))+1;
			num[i]=random;   //����������
		}

		//1.������ ������ ���
		System.out.println("����������Ÿ==============");
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]+",");
			
		}
		System.out.println(); //������ 1���� ���� ��� �����̶� �ο��� �������� �ִ밪�� �����ϰ� �ȴ�.
		for(int j=0; j<num.length-1; j++) {
		//������ ������ ��� �ٲٴ°�? �Ʊ� ����ϱ� �μ��� ���ؼ� �ٲٰ� �ٲٰ� �ϴ°�
		//index8�̶�index9�� �ٲٴ°� .index9��10�� ���ٲ�
		//10-1���� ������ ���� 9�ƴ� 8���� ����
			for(int i=0; i<num.length-1-j;i++) {//0,1,2,3,4,5,6,7,8 //�迭�� i���� �ִ¼��� 1������ ���� �����ʿ��� ���ʿ��� �����Ǿ ���Ѱ��� �Ǵϱ�
				
				if(num[i] > num[i+1]) {
					//0��°�ִ°� 1��° ������ ���� Ŭ���� ��ȯ�Ѵ�. //num[i]�ڸ��� �ִ� ������ �����ش�.num[i+1]��i���ڸ��� �ִ¾� 
					
					//��ȯ�ϱ�
					int temp = num[i]; //= temp i ���� ��� ����
					num[i] =num[i+1];
					num[i+1]=temp;
				}
			}
			
		} //for
		
		System.out.println("������ ����Ÿ===== ");//Ÿ��Ʋ�̴ϱ� �ݺ����Ұ�,/,
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]+",");
		} //for
				
	} //main

} //class
