class  Operator2
{
	public static void main(String[] args) 
	{
		//���۷���Ʈ 2�� ����Ǵ°�
		//2������ ����� �� �ִ� ������
		//�������� ��Ʈ������ &,|,^(XOR),~ -> 2���� �����͸� �̿��� ������ 
		//���׿����� ��Ʈ������~
		
		int a=12;
		int b=4;
		
		int result = a&b;// 1:true,0:false
		System.out.println("result"+result); //��4

		int result2 = a|b;// 1:true,0:false
		System.out.println("result2="+result2); //��12

		int result3 = a ^ b;// 1:true,0:false
		System.out.println("result3="+result3); //�� 8

		// ~ (����) �������߿��� ������ �������� Ȯ���ϴ� ���
		//���������͸� Ȯ���ϴ� ��� : 2���� -> 1�Ǻ��� +1
		//1�� ������ 0�� 1�� 1�� 0���� �ٲٴ� ���̴�.
		//1�� ������ �ٲ۴����� +1�� ���ָ� 2�� ������ �ȴ�
		//8+3+1=13 ���� -13�� ���´� 2�Ǻ���
		//2�� ������ �ٲپ ����ϱ�!!
		int result4 =~a;
		System.out.println("result4="+result4);


		//����Ʈ ������ : ��Ʈ�� �̵�
		// << : ��Ʈ�� �������� �̵��Ѵ�. ���ϱ��� *
		// << (��ȣ�� ä����),>>>(0���� ä����) : ��Ʈ�� ���������� �̵��Ѵ�./���
		
		int result5= a<< 2; //�������� 2bit �̵� �������� 0���� ä�� 
		System.out.println("result5="+result5); //���� 48
		
		int result6 =a>>2; //���������� 2bit �̵� ���ʿ� ���� �ڸ��� ��ȣ�� ä����
		int result7 = result4>>2;  //-4
		System.out.println("result6="+result6); //3
		System.out.println("result7="+result7); //-4
		
		int result8 = result4 >>>2;
		System.out.println("result8="+result8);
		
		//�̷� �����ڰ� �ڹٿ� �ִ� ! �̷� ��Ʈ �����ڴ� �� ������ �ʴ´� .


	}
}
