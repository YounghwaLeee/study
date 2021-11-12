class ForTest08
{
	public static void main(String[] args) 
	{
	int a=0;
		for(int i=1; i<=5; i++){ //Çà
			
			for(int j=1; j<=5; j++){ //¿­
				System.out.print (++a + "\t");
			
	}
			
			System.out.println();//ÁÙ¹Ù²Þ
		}		
	for(int i=1; i<=25; i++) {//1,2,3~~~~~25
		System.out.print(i+"\t");
		if(i%5==0) {
			System.out.println();
		}
		
	}
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print( "*");
		}
		System.out.println();
	}
	
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print( "*");
		}
		System.out.println();
	}
	for(int i=5; i>0; i--) {
		for(int j=1; j<=i; j++) {
			System.out.print( j);
	
}
		System.out.println( );
}

		for(int i=5; i>0; i--) {  
		
			for(int s=1; s<=5-i; s++){    //1,2,3,4  5-2 3
				System.out.print(" ");
			}
	
			for(int j=1; j<=i; j++) {
				System.out.print("@");
		}
				System.out.println();
			
}
		
		}
	
	
	
}
