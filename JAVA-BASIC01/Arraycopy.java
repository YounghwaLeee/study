
public class Arraycopy {

	public static void main(String[] args) {
		
		//�迭�Ǻ���
		
		int num[]= {26,67,15,95,36,48,23,14};
		
		 //            �����迭��    ����������index   �����Ұ��� �迭��       ���翭������wjaindex     �����ҵ������ǰ���
		//arraycopy(Object src,    int srcPos,     Object dest,   int destpos,int      length)
		//            num              2             target          5                  3
		//num�迭���� index 2���� ���� 3���� ���縦 �Ͽ� ���ο� �迭�� �����ϰڴ�.
		
		int target[] =new int[10]; //�⺻�ʱⰪ�� 0���� ���õǾ� �ִ� �����̴�.
		
		System.arraycopy(num, 2 ,target, 5, 3);
		
		for(int i=0; i< target.length; i++) {
			System.out.println("target["+i+"]=" + target[i]);
			
			
		}
	}

}
