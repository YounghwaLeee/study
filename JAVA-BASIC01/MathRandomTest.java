
public class MathRandomTest {

	public static void main(String[] args) {
	//���� : ��ǻ�Ͱ� ����Ǵ� ������0.0�� 1.0 ���̿� ���� �����ȴ�.
		
		//100 ->0~99  50->0~49 
		//   ->  50~100 
		
		for(int i=1; i<=1000; i++) {
			double ran=Math.random();
			//(����*(ū��-������+1))+������ �Ѵ��� ����ȭ ��Ű�� +������
		
			int ranInt = (int)(ran*(100-50+1))    +  50;//ū������ ������ ���� ����1���� 
			
			
			
			System.out.print(ranInt+"\t");
			if(i%10==0)System.out.println();
		}

	}

}
