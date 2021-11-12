import java.util.Random;
public class RandomTest {

	public static void main(String[] args) {
		// Random : 난수 생성클래스 
		Random ran= new Random();
		
		for(int i=1; i<=1000; i++) {
			
			//정수를 한개씩 구해주는 난수 (int) 
			//정수int를 구한다.
			
			//int ranInt = ran.nextInt(); //-21~ 21억 
			//int random = ran.nextInt(100); //0~99
			//int random = ran.nextInt(50); //0~49
			//boolean random=ran.nextBoolean(); //true false
			
			//문제는? 범위가 0~99 0~49 항상 0부터 시작된다 
			// 50~100을 구하는거 0부터 시작하는게 아니라
			
			int random=ran.nextInt(51)+50; //0~50까지 만드는거
			System.out.printf(random+"\t");
				
			if(i%10==0) {
				System.out.println();
			}
			
			
		}
	}

}
