class ForTest02
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=1; i<=100; i++){//1,2,3,4,5...100
			sum += i;
			if(i%10==0){
			System.out.println("1~"+ i+"������ ����"+ sum);
			}
		}
			//System.out.println("1~100��������" + sum);
			//i�� 10�� ���.
			//if(i%10==0) 
	}
}
