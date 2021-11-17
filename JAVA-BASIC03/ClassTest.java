//package
//필요한 클래스의 위치(패키지명과 클래스명을 정의한다.)
import java.util.Scanner;
import java.lang.String; //compiler가 컴파일과정에 자동으로import해준다.
import java.util.Random;
import java.util.*; //모든이란 뜻


public class ClassTest {
//맴버번수=전역변수
	int a=100;
	String name="홍길동";
	//맴버변수는 초기값이 자동으로 설정된다
	//정수 byte,short,int,long - 초기값이 0으로 되어있음
	//실수 (float, double) :0.0
	//논리(boolean): false)
	//문자(char) :초기값이 없음 
	//string , scanner, Random=null : null이 초기값
	int b; 
	double c;
	String nameStr;// null
	Scanner scan;	//null
	Random ran;//null

	//객체생성이 가능함
	Scanner scanner=new Scanner(System.in);
	//실행문은 멤버에서 사용불가
	//System.out.println("콘솔문자출력하기");

	int k=100+500; //선언하고 바로초기화 하기때문에 상관없음
	int dd[]= new int[10];
	//dd[3]=200; //배열 선언을 하고 값을 주는건 메소드 안에서만 실행가능.
	//
	
	//지역변수는 메소드 안에 선언된거 
	//생성자 메소드 : 객체를 생성할때 한번 실행되는 메서드
					// 메소드명이 반드시 클래스명과 같아야한다.
					//객체 생성시 객체의 데이터를 초기화 할수 있다.
	//생성자 메소드 만드는 규칙 / 메소드명이 반드시 클래스명과 같아야 한다.
	
	ClassTest(){
		b=1234;
		//실행문 
		System.out.println("생성자 메소드가 실행됨...");
	}
	ClassTest(int a){
		System.out.println(a+"메소드 실행~~~~~~~~~");
	}

	//메소드 : 하나의 실행단위 
	//클래스를 객체 생성후 메소드를 호출하여야 실행된다.
	
	//반환형 메소드명 (매개변수,매게변수){
	//}
	//메소드명 생성 규칙 :
	// 			소문자로 시작한다. 합성어 일때는 두번째 단어부터 시작
	void sum() {
		System.out.println("sum()메소드가 실행됨");
	}
	void total (int a, int b) {
		System.out.println("합은"+ (a+b));
	}
	
}
	
	

