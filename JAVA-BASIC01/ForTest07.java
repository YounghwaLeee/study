class ForTest07 
{
	public static void main(String[] args) 
	{
					int a=0;
		for(int i=1; i<=5; i++){ //행
			
			for(int j=1; j<=5; j++){ //열
				System.out.print (++a + "\t");
			
	}
			
			System.out.println();//줄바꿈
		}		
	for(int i=1; i<=25; i++) {//1,2,3~~~~~25
		System.out.print(i+"\t");
		if(i%5==0) {
			System.out.println();
		}
		
	}
	}
	
}
	
//중첩for문은 엄청나게 많이 나옴. 그리고 달력을 만들어서 찍을건데 