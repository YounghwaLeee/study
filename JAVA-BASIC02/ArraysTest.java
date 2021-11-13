import java.util.Arrays;

public class ArraysTest {

	public ArraysTest() {
		//Arrays배열관련 처리 클래스 
	
		int [] data= {15,90,45,75,26,9,48,95,12,40};
		//Arrays.sort(data);
		Arrays.sort(data,2,5); //0123456789 에서 2,5 하면2,3,4 인덱스값정렬
		
		
		
		System.out.println(Arrays.toString(data));

	}

	public static void main(String[] args) {
		new ArraysTest();
	}

}
 