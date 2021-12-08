import java.util.Arrays;
import java.util.Random;

public class Student {

	public static void main(String[] args) {
		//1차원 객체 만들기
		Main [] main= new Main[5];
		
		for(int i=0; i< main.length; i++) {
			main[i]= new Main("00"+i,"홍길동"+i,"남자",
			(double)((int) (new Random().nextDouble()*4.5*100))/100);
			
		}
		
		for(int i=0; i<main.length;i++) {
			main[i].show();
			System.out.println("========");
			
		}
		
		

	}

}
