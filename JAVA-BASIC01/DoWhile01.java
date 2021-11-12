class DoWhile01 
{
	public static void main(String[] args) 
	{
	
		
		int num=0;
		int rNum1=0;
		int  rSum=0;
		int rNum2=0;
		int rTnum=0;
		
		int result=0;
		//for(int a=0; a<=10; a++)
        //while(true)//==/무한루프 for(;;;)
        do
        {
            rSum+= num;

            if(num%2==0)
            {
                rNum1+=num;
                System.out.println("uikui");
            } 
            else if(num%2==1)
            {
                rNum2+=num;
            }
            if(num%3==0)
            {
                rTnum+=num;
            }
            num++;result++;
        }while(num<=result);
	}
}
