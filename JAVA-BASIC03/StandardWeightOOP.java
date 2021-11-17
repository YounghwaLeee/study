import java.util.Scanner;

public class StandardWeightOOP {
	Scanner scan = new Scanner (System.in);
	//데이터입력 1. 맴버변수로 
	
	//데이터 입력값 저장
	int age, gender;	//초기값이 0
	double height, weight;	//0.0	
	double sWeight;//표준체중 (계산결과담을변수 return을 안하겠따.)
	double sWeightIndex;//표준체중지수
	String sWeightMsg; //유형
	
	
	StandardWeightOOP(){}//생성자 메서드
	
	//실수 실수 문자열. (지역변수로 사용)
	//데이터 입력 메서도
	double getConData(String msg) {
		System.out.println(msg+"=");
		return scan.nextDouble();
	}
	
	//값을 입력받아서 각각의 데이터 세팅
	void setdata() {
		age = (int)getConData("나이");
		gender =(int) getConData("성별");
		height= getConData("키");
		weight =getConData("몸무게");
		
		//4개에 데이터에 값 입력을 시켜준다.
		
	}
	
	//표준체중 index구하기
	void setStandardWeight() {
		double index =0.90;
		if(age<=35&&gender==2) {
			index=0.85;
		} else if(age>=36 && gender==1) {
			index=0.95;
			
		}
		sWeight=(height-100)*index;
	}
	//체형
	void setStandardWeightMsg() {
		sWeightIndex = (weight/sWeight)*100;
		if(sWeightIndex<=85) sWeightMsg = "마른형";
		else if(sWeightIndex<=95) sWeightMsg = "조금마른형";
		else if(sWeightIndex<=115) sWeightMsg = "표준형";
		else if(sWeightIndex<=125) sWeightMsg = "조금비만형";
		else sWeightMsg = "비만형";
		
		
	}
	//출력
	void standartWeightOutput() {
		System.out.println("표준체중="+sWeight);
		System.out.println("당신의 표준체중 지수는"+sWeightIndex+"으로,"+sWeightMsg+"입니다.");
		
	}
	
	void startStandard() {
		setdata();
		setStandardWeight();
		setStandardWeightMsg();
		standartWeightOutput();
	}
		public static void main(String a[] ) {
			 StandardWeightOOP oop =  new   StandardWeightOOP();
			 oop.startStandard();
		}

		
	
}
