public class ArrayTest01 {

	public static void main(String[] args) {
		// 1.�迭�� ���� ���������� ������ ������ �����Ҷ� �ʿ��ϴ�.
		// 2.�迭�� �ѹ� �����Ǹ� ũ�⸦ ������ �� ����.
		
		//�迭�� ���� (11������ �迭) Ÿ���� ������ ���� �ʴ´�
		int num[]= new int [50];//������ �����ϴ� ���ȣ �����ϴ¼��� �ʱⰪ0
		// �ʱⰪ ����:0, �Ǽ�:0.0, ���� false  
		
		String name[] = new String[5]; //null -�������� �ʴ� ����
		
		num[2] =100;
		name[1] = "ȫ�浿";
		
		System.out.println("num[1]=>" +num[1]);
		System.out.println("name[1]=>" +name[1]);
		
		//num �迭�� ��� ���� ����϶�.
		//index�� 0~4�� 1������ �ݺ���
		// num[0], num[1] num[2] num[3] num[4]
		
		//�迭��.length (������ ���Ͽ� �ִ°�)�迭�� ������ ���Ͽ� �ش�.
		
		for(int idx=0; idx<num.length; idx++) {
			System.out.println("num["+idx+"]="+ num[idx]);
		}
		
		
		//�迭 ������ �ʱⰪ �����ϴ� ��� ���ϴ� �����ͷ� �����ȴ�
		int[] data2= new int[]{20,65,74,5,87,2};//0 1 2 3 4 5 ������Γl
		for(int i=0; i<data2.length;i++) {
			System.out.println("data2["+i+"]="+data2[i]);
		}
		
		//�迭 ������ �ʱⰪ �����ϴ� ���2
		int[] data3= {8,7,5,37,75};
		for(int i=0; i<data3.length;i++) {
			System.out.println("data3["+i+"]="+ data3[i]);
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
