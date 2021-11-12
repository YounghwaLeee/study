import java.util.Random;
import java.util.Scanner;

public class Lotto_Arrays {

	private int gamesu;



	public Lotto_Arrays() {}
	
	  void getrandom() {
	         Random rand = new Random();
	         for(int game =1;game<=gamesu;game++) {
	         for(int i = 1; i <= 6; i++){
	         int ranNum = rand.nextInt(45)+1;
	         System.out.println(ranNum);      
	         }
	      }
	   }
		
		//게임수입력
		public int inputNumber(int lotto) {
		Scanner scan =new Scanner(System.in);
		System.out.println("게임수");
		return scan.nextInt();
	}
	

	
public static void main(String[] args) {
	Lotto_Arrays lo	=new Lotto_Arrays();
	

}

}


	//1. 게임수 입력받기 
	//2. 로또 번호 생성하기
	//-로또 번호는 난수로 생성
	//- 정렬(객체배열로 해서 )만들기 
	//예 아니오 만들어야 되공//두와일
	
//import java.util.Scanner;

/*public class Lotto {

	public static void main(String[] args) {
	//로또 번호 생성기 
		Scanner scan=new Scanner(System.in);
		
		do {
			
			System.out.println("게임수");
			int cnt= scan.nextInt();
		
			입력받은 게임수 만큼 게임 만들기
			for(int game=1; game<=cnt;game++) {
					
				int []lotoo= new int[7]   ;  
				for(int i=0; i< lotoo.length;i++) {
					lotoo[i]=(int)(Math.random()*45)  +1;     
					
					for(int c=0; c<i;c++) {
						if(lotoo[i] == lotoo[c]) {
							i--;
						}
						
					}
				
		
				}
				
				
				i=5-0;  
				for(int i=0; i<lotoo.length-2;i++) { 
					for(int j=0; j<lotoo.length-2-i;j++) {
						if(lotoo[j]>lotoo[j+1]) {
							int temp=lotoo[j];
							lotoo[j]=lotoo[j+1];
							lotoo[j+1]=temp;
						}
					}
				}
				System.out.print(game+"게임=");
				for(int i=0; i<lotoo.length;i++) {
					System.out.print(lotoo[i]+",");
				}
				System.out.println("bonus="+lotoo[6]);
						
			}
			
			
			int check=scan.nextInt();
			if(check==2) break; 
		
			System.out.println("계속 하시겠습니까?[1.예,2.아니오]");
		}while(true);
		
	}
}
*/