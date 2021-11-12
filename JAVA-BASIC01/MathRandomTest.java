
public class MathRandomTest {

	public static void main(String[] args) {
	//난수 : 컴퓨터가 실행되는 시점에0.0과 1.0 사이에 값이 생성된다.
		
		//100 ->0~99  50->0~49 
		//   ->  50~100 
		
		for(int i=1; i<=1000; i++) {
			double ran=Math.random();
			//(난수*(큰값-작은값+1))+작은값 한다음 정수화 시키고 +작은값
		
			int ranInt = (int)(ran*(100-50+1))    +  50;//큰값에서 작은값 빼고 정수1더함 
			
			
			
			System.out.print(ranInt+"\t");
			if(i%10==0)System.out.println();
		}

	}

}
