import java.util.Arrays;

public class ArraysTest {

	public ArraysTest() {
		//Arrays�迭���� ó�� Ŭ���� 
	
		int [] data= {15,90,45,75,26,9,48,95,12,40};
		//Arrays.sort(data);
		Arrays.sort(data,2,5); //0123456789 ���� 2,5 �ϸ�2,3,4 �ε���������
		
		
		
		System.out.println(Arrays.toString(data));

	}

	public static void main(String[] args) {
		new ArraysTest();
	}

}
 