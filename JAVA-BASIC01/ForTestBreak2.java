class ForTestBreak2 
{
	public static void main(String[] args) 
	{	
		abc:
		for(int i=1; i<=10; i++){
			for(int j=1;  ;   j++){
				System.out.println("i="+i+",j="+j);
				if(j>5){
					break abc;
				}
			}
			//break여기로 넘어옴
			//if(i>3){
				//break;
			//}
		}//밖의for문
		System.out.println("============");	
	}
}
