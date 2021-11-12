import java.util.Random;
public class Arrayselectionshort {

	public static void main(String[] args) {
		Random ran= new Random();
		
		//1~100사이의 난수를 10개 생성하여 배열에 대입후 오름차순으로 정렬하여 출력하라.
		
		int random[] = new int[10];
		
		for(int i=0; i<random.length;i++) {
			random[i]=ran.nextInt(100)+1; //0~99까지 값이나옴
											//그래서 무조건 1해줘야됌
		}
		
		//정렬
//		우리가 잡은건 인덱스 0~9까지 있다. 
//		8로잡아야된다 왜냐면 9랑 8이랑 비교해야하니깐
//		배열의 길이 -2 해주면된다 배열이100개면98까지
		for(int point=0; point<random.length-1; point++) {
			//10이나왔는데 -1을 하면 9이다 9보다 작다 했으니깐 8
			for(int i=point+1;i<random.length;i++) {
				
				if(random[point]>random[i]);
				int temp=random[point];
				random[point]=random[i];
				random[i]=temp;
					//0번째보다1번쨰꼐 더 커! 그럼 둘이 바꿔야돼 
					//임시데이터변수를 만들어서 저장시켜야됌
				}
			}
	
	//출력 확장된for문
	for(int data:random) {
		System.out.print(data+"\t");
			}
		System.out.println();
		}
}	
	//포인트가 0이면 1부터 4이면 5부다


