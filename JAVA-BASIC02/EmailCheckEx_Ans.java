import java.util.Scanner;

public class EmailCheckEx_Ans {

	public EmailCheckEx_Ans() {
	
	}
	public void start() {
		do {
			String email = inputEmail();
			if (emailCheck(email)) {//����ε� �̸���
				//���̵��, �������� �и����
			emailPrint(email); //�̸���üũ�Ѱ� Ʈ���̸� �̰ɽ��� 
								// �׷��� �̸��� ����Ʈ�ΰ��� .
			}else {//�߸��� ���� false�� ���ϵǸ� �����ڸ�
				errorMailMessage(email);
			}
		}while(true);
		//String email ���������� �����Ҽ� �־���
		//�Ű������� �����Ҷ��� String email ��Ʈ���� ��Ʈ�� 
	}
	//���̵�, ������ �и����
	public void emailPrint(String email) {
		//@�� �������� �ڸ��°� split ���� �Ѵ�
		//�޼ҵ� ���� ��ġ �˷��� split�� �Ⱦ��� ���
		/*
		String emailSplit[]=email.split ("@");
		System.out.println("���̵�="+emailSplit[0]);
		System.out.println("���̵�="+emailSplit[1]);
		*/
		int atMark = email.indexOf("@");
		String id= email.substring(0,atMark); //���Ṯ�� �չ��ڱ��� ������
		String domain = email.substring(atMark+1);
		System.out.println("���̵�="+id);
		System.out.println("������="+domain);
		
		
	}
	//�̸����Է�
		public String inputEmail() {
		Scanner scan =new Scanner(System.in);
		System.out.println("�̸����Է�=");
		return scan.nextLine();
	}
	
	//�̸��� ����, �߸��� �̸������� Ȯ���ϴ� �޼��� 
	public boolean emailCheck (String email) {
		//�����̸�true �߸��Ȱ� false�� ����
		//@ :atmark
		int atMark=email.indexOf("@"); // @������ -1 ������ �±��ִ� index
		int point = email.indexOf(".");
		if(atMark==1 || point==-1 || atMark>point||point-atMark<=2 ) {//�߸��� �����ּ��϶� 
			return false;
		}else {//��������ּ��϶� 
			return true;
		}
		
	}
	//�߸��� ���� �޼���
	public void errorMailMessage(String email) {
		System.out.println(email+"�� �߸��� �̸��� �ּ��Դϴ�.");
	}
	public static void main(String[] args) {
		new EmailCheckEx_Ans ().start();
		
	
	}

}
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
	
	/*
	do while���� �ݺ��ؼ� ������ ���̸� ��� �����ϰ� �ƴ� ������ �ȴ�.
	if ���̵��� ���� �߸��Է��ϸ� �߸��Է��ߵ�.
 	���׿����ڷ� ���ؼ� �̰������̸� �� ���̸� �����ض� 
 	substring�� ���
 	if else ���� ���°� �˰ڰ� 
 	���� ���̵�� ������ ���� ��ġ�ϸ� ���̵� �������� ����ϰ�
 	
 		Scanner scan =new Scanner(System.in);
		System.out.println("�̸����Է�=");
		String email=scan.nextLine();
		
		String id= "goguma;";
		String domein ="@nate.com";
	
		String id2= "goguma@nate ";
		//String domein =nate.com;
		
		if(id==domein) {
			id.substring(4,8);
			System.out.println(id);
		}else {
			System.out.println("�̸����� �߸� �Է��Ͽ����ϴ�.");
			}
	
	}

}
	
	*/