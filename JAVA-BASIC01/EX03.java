import java.util.Scanner;
class  EX03 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		for(;;){
		System.out.print ("메뉴선택[1.사각형넓이2.사각형둘레3.종료]");//1번2번계속따로
		int menu = sc.nextInt();
		
		if(menu==3){
			System.exit(0);}
			else{

		System.out.print("가로(밑변)=");
		int width =sc.nextInt();
		System.out.print("세로(높이)=");
		int heihgt =sc.nextInt();

		int result=(menu==1)? width*heihgt : (width+heihgt)*2 ;
		
		String msg = (menu==1)? "넓이" :"둘레";
		System.out.println("사각형의"+msg+"="+result);


			}
		}
			


		/*num=sc.nextInt();
		System.out.println("1.사각형의 넓이")
		double low=a
		double hieghit=b
		System.out.println("가로")
		double low=a.nextdouble();
		System.out.println("세로")
		double hieght=b.nextdouble();
			System.out.println("넓이"+(a*b));*/
			
	}
}

/*
사각형의 넓이=밑변*높이
사각형의 둘레 =(가로+세로)*2

실행
실행하면 메뉴가 찍힘 메뉴선택.
(1.사각형의 넓이, 2. 사각형의 둘레)? 1
/*가로(밑변)=
세로(높이)=
사각형의 넓이=

(1.사각형의 넓이, 2. 사각형의 둘레)? 2
/*가로(밑변)=
세로(높이)=
사각형에 둘레=



*/