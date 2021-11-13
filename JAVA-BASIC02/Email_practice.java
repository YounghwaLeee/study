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
			System.out.println("���̵�="+id);
			System.out.println("������"+domain);
		}
		
	//�̸��� �ּ� �Է� 1.
	public String inputEmail() {
	Scanner scan=new Scanner(System.in);
	System.out.println("�̸����Է�");
	return scan.nextLine();
	}

	public boolean emailCheck (String email) {
		//@ atMark��� ��
		int atMark=email.indexOf("@");
		int point = email.indexOf(".");
		if(atMark==1 || point==-1|| atMark>point||point-atMark<2) {
			return false;
		}else {
			return true;
		}
	}
	public void errorMainMessage(String email) {
		System.out.println(email+"�� �߸��� �̸��� �ּ��Դϴ�");
	}
	
	
	public static void main(String[] args) {
	new Email_practice ().start();

	}

}

/*�̸��� �Է� - 
�̸��� ����, �߸� Ȯ��
- �߸��� ���� �޼��� 
- ���̵�, ������ �и��Ͽ� ����ϱ� -
start�޼���

//���ݺ��� ������ ��ü�������� ������         
/*�̸����� �Է� =goguma@nate
�̸����� �߸��Է��Ͽ����ϴ�.

/*�̸����� �Է� =goguma@nate@com
�̸����� �߸��Է��Ͽ����ϴ�.

/*�̸����� �Է� =goguma@nate.com			
���̵� = goguma777
������ =nate.com

//���̵�� ������ ���� ��� 
1.�̸����Է�=
2.�̸���Ȯ��
3.���� -���̵�, ������ Ȯ��
4.�߸��� �޼��� 
*/