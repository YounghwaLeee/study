import java.util.Scanner;

public class EmailCheckEx_Ans {

	public EmailCheckEx_Ans() {
	
	}
	public void start() {
		do {
			String email = inputEmail();
			if (emailCheck(email)) {//제대로된 이메일
				//아이디와, 도메인을 분리출력
			emailPrint(email); //이메일체크한게 트루이면 이걸실행 
								// 그래서 이메일 프린트로가서 .
			}else {//잘못된 메일 false가 리턴되면 오는자리
				errorMailMessage(email);
			}
		}while(true);
		//String email 전역변수로 설정할수 있었음
		//매개변수로 설정할때는 String email 스트링값 인트값 
	}
	//아이디, 도메인 분리출력
	public void emailPrint(String email) {
		//@를 기준으로 자르는거 split 으로 한다
		//메소드 쓰는 위치 알려고 split을 안쓰고 사용
		/*
		String emailSplit[]=email.split ("@");
		System.out.println("아이디="+emailSplit[0]);
		System.out.println("아이디="+emailSplit[1]);
		*/
		int atMark = email.indexOf("@");
		String id= email.substring(0,atMark); //종료문자 앞문자까지 구해줌
		String domain = email.substring(atMark+1);
		System.out.println("아이디="+id);
		System.out.println("도메인="+domain);
		
		
	}
	//이메일입력
		public String inputEmail() {
		Scanner scan =new Scanner(System.in);
		System.out.println("이메일입력=");
		return scan.nextLine();
	}
	
	//이메일 정상, 잘못된 이메일인지 확인하는 메서드 
	public boolean emailCheck (String email) {
		//정상이면true 잘못된거 false를 리턴
		//@ :atmark
		int atMark=email.indexOf("@"); // @없으면 -1 있으면 걔까있는 index
		int point = email.indexOf(".");
		if(atMark==1 || point==-1 || atMark>point||point-atMark<=2 ) {//잘못된 메일주소일때 
			return false;
		}else {//정상메일주소일때 
			return true;
		}
		
	}
	//잘못된 메일 메세지
	public void errorMailMessage(String email) {
		System.out.println(email+"은 잘못된 이메일 주소입니다.");
	}
	public static void main(String[] args) {
		new EmailCheckEx_Ans ().start();
		
	
	}

}
//지금부터 과제는 객체지향으로 만들어라         
/*이메일을 입력 =goguma@nate
이메일을 잘못입력하였습니다.

/*이메일을 입력 =goguma@nate@com
이메일을 잘못입력하였습니다.

/*이메일을 입력 =goguma@nate.com			
아이디 = goguma777
도메인 =nate.com

//아이디와 도메인 따로 출력 
1.이메일입력=
2.이메일확인
3.정상 -아이디, 도메인 확인
4.잘못된 메세지 


*/
	
	/*
	do while문을 반복해서 문장이 참이면 계속 실행하고 아님 나오게 된다.
	if 아이디의 값을 잘못입력하면 잘못입력했따.
 	삼항연산자로 비교해서 이게조건이면 이 길이만 선언해라 
 	substring을 사용
 	if else 문을 쓰는건 알겠고 
 	만약 아이디와 도메인 값이 일치하면 아이디 도메인을 출력하고
 	
 		Scanner scan =new Scanner(System.in);
		System.out.println("이메일입력=");
		String email=scan.nextLine();
		
		String id= "goguma;";
		String domein ="@nate.com";
	
		String id2= "goguma@nate ";
		//String domein =nate.com;
		
		if(id==domein) {
			id.substring(4,8);
			System.out.println(id);
		}else {
			System.out.println("이메일을 잘못 입력하였습니다.");
			}
	
	}

}
	
	*/