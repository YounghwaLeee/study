
public class ArrayEx02 {

	public static void main(String[] args) {
		//���� 1~10000������ ���� 100�� ����� �迭�� �����ϰ� 
		//������ ������ ������ ���� ū���� ���� ������ , ����� ���Ͽ� ����϶�.
		
		//1. 100���� �����Ҽ� �ִ� �迭
		//2. ���������
		
		int data[] = new int[100] ;
		
		//2. ���������
		
		for(int i=0; i<data.length; i++) {
			data[i] =(int)(Math.random()*1000)+1;
		//3.���
			
			System.out.println(data[i]);
			
		}
		//ex  500 700 300 �ϳ��� ���ؼ� �ִ밪�ְ�, �� �ϳ��ϳ����ؼ� �ִ´� 
		//�ִ밪 �ּҰ��� ��� �޶�����
		//ū��, ������,��� max min
		//1.ū�� ,������ ������ ������ ���� �����. 
		//2.�迭�� ���տ� �ִ� ���� ū��.2��°�� ������������
		//3.ù�������� 500 �ι��簪�� 700
		
		int sum=0;
		int max=data[0];//�迭�߿� ���� �տ� �ִ� �����͸� �ʱⰪ���� ���� index0��°�ǰ��� �ʱⰪ����
		int min=data[0];
		for(int i=0; i<data.length;i++) {
			sum+=data[i];
				if(max<data[i]) {
					max=data[i];
				}
				if(min>data[i]) {
					min=data[i];
				}
		}
			int ave=sum/data.length;
			System.out.println("��="+sum);
			System.out.println("���="+ave);
			System.out.println("�ִ밪="+max);
			System.out.println("�ּҰ�="+min);
			
	
	}

}
