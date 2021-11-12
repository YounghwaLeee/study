class Gugudan
{
	public static void main(String[] args) 
	{
			System.out.println("\t구구단");
		for(int dan=1; dan<=9; dan+=3) {//dan 1,4,7
			//단 타이틀
			for(int i=dan; i<dan+3; i++) {//dan=1 123 dan=4 456 dan=7 789
				System.out.print("=="+i+"단==\t");
			}
			System.out.println();
			
			//3단 구구단 출력
			
			for(int k=2;k<=9;k++) {//23456789
				for(int z=dan; z<dan+3; z++) {//dan=1 123 dan=4 456 dan=7 789 //z단
					int result=z*k;
					System.out.print(z+"*"+k+"="+result+"\t");
				}
					System.out.println();
			}
				
		}
		

	}

}


	
