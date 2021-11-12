import java.util.Scanner;

public class ArrayEX01 {

	public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
		// 배열을 이용하는 예제
		// 국어,영어,수학,과학,물리,한국사,도덕) 7과목의 점수를 입력받아 총점과 평균을 구하라.
		
		//과목의 제목으로 나올 데이터를 배열에 보관
		String[] title={"국어","영어","수학","과학","물리","한국사","도덕"};
		//각 과목의 점수를 저장(보관)할 배열
		int jumsu[]=new int[7];//0,1,2,3,4,5,6 여기에 점수가 다들어가있음
		
		//점수입력
		for(int idx=0; idx<title.length; idx++){//1. idx=0 
			System.out.print(title[idx]+"=");
			jumsu[idx]=scan.nextInt();
			
		}
		//총점 배열변수 사용안하고 별도로 변수 사용가능하다.
		int tot=0;
		for(int i=0; i<title.length;i++) {
			tot=tot+jumsu[i];
		}
		
		//평균
		int ave = tot/7;
		System.out.println("총점="+tot);
		System.out.println("평균="+ave);
				
		for(int idx=0; idx<title.length; idx++){
			System.out.println(jumsu[idx]);
			
			
			
		}
			

	}

}
