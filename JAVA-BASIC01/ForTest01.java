class ForTest01 
{
	public static void main(String[] args) 
	{
		
		String username="�̿�ȭ";
	
		for(int i=1; i<=100; i++) {
		System.out.print(username+"\t");
		//\t ���� ��ĭ ���°�
	}
		
      //1~10���� ����϶�.
	for(int a=1; a<=10; a++) {
		System.out.println(a);
	}
	
	//10~100���� 10������
	for(int b=10; b<=100; b+=10) {
		System.out.println(b);
	}
		
		//�����ϴ½� 5���� 1���� ����  c--, --c ,c=c-1 ,c-=1
	for(int c=5; c>=1; --c) {
		System.out.println(c);
	}
		//3 6 9......18
	for(int d=3; d<=20; d+=3) {
		System.out.println(d);
	}
	
	//100 95 90 ...50
	for(int e=100; e>=50; e-=5) {
		System.out.println(e);
	}

	}
	
}