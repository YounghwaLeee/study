import java.util.Random;
public class Arrayselectionshort {

	public static void main(String[] args) {
		Random ran= new Random();
		
		//1~100������ ������ 10�� �����Ͽ� �迭�� ������ ������������ �����Ͽ� ����϶�.
		
		int random[] = new int[10];
		
		for(int i=0; i<random.length;i++) {
			random[i]=ran.nextInt(100)+1; //0~99���� ���̳���
											//�׷��� ������ 1����߉�
		}
		
		//����
//		�츮�� ������ �ε��� 0~9���� �ִ�. 
//		8����ƾߵȴ� �ֳĸ� 9�� 8�̶� ���ؾ��ϴϱ�
//		�迭�� ���� -2 ���ָ�ȴ� �迭��100����98����
		for(int point=0; point<random.length-1; point++) {
			//10�̳��Դµ� -1�� �ϸ� 9�̴� 9���� �۴� �����ϱ� 8
			for(int i=point+1;i<random.length;i++) {
				
				if(random[point]>random[i]);
				int temp=random[point];
				random[point]=random[i];
				random[i]=temp;
					//0��°����1������ �� Ŀ! �׷� ���� �ٲ�ߵ� 
					//�ӽõ����ͺ����� ���� ������Ѿ߉�
				}
			}
	
	//��� Ȯ���for��
	for(int data:random) {
		System.out.print(data+"\t");
			}
		System.out.println();
		}
}	
	//����Ʈ�� 0�̸� 1���� 4�̸� 5�δ�


