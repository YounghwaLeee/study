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
		
		//���Ӽ��Է�
		public int inputNumber(int lotto) {
		Scanner scan =new Scanner(System.in);
		System.out.println("���Ӽ�");
		return scan.nextInt();
	}
	

	
public static void main(String[] args) {
	Lotto_Arrays lo	=new Lotto_Arrays();
	

}

}


	//1. ���Ӽ� �Է¹ޱ� 
	//2. �ζ� ��ȣ �����ϱ�
	//-�ζ� ��ȣ�� ������ ����
	//- ����(��ü�迭�� �ؼ� )����� 
	//�� �ƴϿ� ������ �ǰ�//�ο���
	
//import java.util.Scanner;

/*public class Lotto {

	public static void main(String[] args) {
	//�ζ� ��ȣ ������ 
		Scanner scan=new Scanner(System.in);
		
		do {
			
			System.out.println("���Ӽ�");
			int cnt= scan.nextInt();
		
			�Է¹��� ���Ӽ� ��ŭ ���� �����
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
				System.out.print(game+"����=");
				for(int i=0; i<lotoo.length;i++) {
					System.out.print(lotoo[i]+",");
				}
				System.out.println("bonus="+lotoo[6]);
						
			}
			
			
			int check=scan.nextInt();
			if(check==2) break; 
		
			System.out.println("��� �Ͻðڽ��ϱ�?[1.��,2.�ƴϿ�]");
		}while(true);
		
	}
}
*/