class Gugudan
{
	public static void main(String[] args) 
	{
			System.out.println("\t������");
		for(int dan=1; dan<=9; dan+=3) {//dan 1,4,7
			//�� Ÿ��Ʋ
			for(int i=dan; i<dan+3; i++) {//dan=1 123 dan=4 456 dan=7 789
				System.out.print("=="+i+"��==\t");
			}
			System.out.println();
			
			//3�� ������ ���
			
			for(int k=2;k<=9;k++) {//23456789
				for(int z=dan; z<dan+3; z++) {//dan=1 123 dan=4 456 dan=7 789 //z��
					int result=z*k;
					System.out.print(z+"*"+k+"="+result+"\t");
				}
					System.out.println();
			}
				
		}
		

	}

}


	
