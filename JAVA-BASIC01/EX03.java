import java.util.Scanner;
class  EX03 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		for(;;){
		System.out.print ("�޴�����[1.�簢������2.�簢���ѷ�3.����]");//1��2����ӵ���
		int menu = sc.nextInt();
		
		if(menu==3){
			System.exit(0);}
			else{

		System.out.print("����(�غ�)=");
		int width =sc.nextInt();
		System.out.print("����(����)=");
		int heihgt =sc.nextInt();

		int result=(menu==1)? width*heihgt : (width+heihgt)*2 ;
		
		String msg = (menu==1)? "����" :"�ѷ�";
		System.out.println("�簢����"+msg+"="+result);


			}
		}
			


		/*num=sc.nextInt();
		System.out.println("1.�簢���� ����")
		double low=a
		double hieghit=b
		System.out.println("����")
		double low=a.nextdouble();
		System.out.println("����")
		double hieght=b.nextdouble();
			System.out.println("����"+(a*b));*/
			
	}
}

/*
�簢���� ����=�غ�*����
�簢���� �ѷ� =(����+����)*2

����
�����ϸ� �޴��� ���� �޴�����.
(1.�簢���� ����, 2. �簢���� �ѷ�)? 1
/*����(�غ�)=
����(����)=
�簢���� ����=

(1.�簢���� ����, 2. �簢���� �ѷ�)? 2
/*����(�غ�)=
����(����)=
�簢���� �ѷ�=



*/