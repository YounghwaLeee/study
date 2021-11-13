import java.util.Scanner;

public class Email_practice {

	public Email_practice() {
		
	}
	
		public void start() {
			do {
				String email=inputEmail();
				if(emailCheck(email)) {
					emailPrint(email);
				}else {
					errorMainMessage(email);
				}
				
			}while(true);
		}
	
		public void emailPrint(String email) {
			int atMark =email.indexOf("@");
			String id=email.substring(0,atMark);
			String domain = email.substring(atMark+1);
			System.out.println("아이디="+id);
			System.out.println("도메인"+domain);
		}
		
	//이메일 주소 입력 1.
	public String inputEmail() {
	Scanner scan=new Scanner(System.in);
	System.out.println("이메일입력");
	return scan.nextLine();
	}

	public boolean emailCheck (String email) {
		//@ atMark라고 함
		int atMark=email.indexOf("@");
		int point = email.indexOf(".");
		if(atMark==1 || point==-1|| atMark>point||point-atMark<2) {
			return false;
		}else {
			return true;
		}
	}
	public void errorMainMessage(String email) {
		System.out.println(email+"은 잘못된 이메일 주소입니다");
	}
	
	
	public static void main(String[] args) {
	new Email_practice ().start();

	}

}

/*이메일 입력 - 
이메일 정상, 잘못 확인
- 잘못된 메일 메세지 
- 아이디, 도메인 분리하여 출력하기 -
start메서드

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