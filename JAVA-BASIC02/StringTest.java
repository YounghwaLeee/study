

//���ڿ������� ��������String 
public class StringTest {

	public StringTest() {
		
	}

	public void start() {
		
		//            01234567890
		String str1= "����� ������ �ż���";         //str 1 str2 �Ϲ� ������ ó�� �۾��ȰŴ� �Ϲ� �����ͷ� �񱳵ȴ�.
		String str2= "����� ������ �ż���";
		String str3= new String ("����� ������ �ż���");  //��ü�� �����ؼ� ����� 
		String data =str3;  //str3 data ���Թ��� ���ؼ� ������ ���� ��ü�� ���� 
		//str 3�� 4500 ������ ����Ǿ����� data�� �ִ°� 4000���� �����־ 
		
		//���θ���Ŷ� ������ �����͸� ���Խ�Ű�°Ŵ� �ٸ���. 
		
		byte[] byteData= {65,66,67,68}; //�ƽ�Ű�ڵ尪 -> ABCD�� �ٲ� 65�빮��A�� �ڵ尪
		String str4=new String(byteData);//��"ABCE"
		
		char[] charData = {'x','y','z'};// "xyz"�� �ٲ�߉� 
		String str5= new String(charData); //xyz ���ڿ��� �ٲ�
		
		int[] intData= {65,66,67,68,69,70}; //index 0 1 2 3 4 5 2~��������3���� ���ڷ� �ٲ�� �����ض�
		String str6 = new String(intData,2,3);
		
		System.out.println("byteData="+str4);
		System.out.println("charData="+str5);
		System.out.println("intData="+str6);
		
		
		if(str1==str2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		 if(str1==str3) {
			 System.out.println("����");
		 }else {
			 System.out.println("�ٸ���");
		 	}
		
		
		if (str1.equals(str3)) {
			System.out.println("����");
		}else {
			 System.out.println("�ٸ���");
		 	}
	
		if(str3==data) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		str3 ="����� ���α�";
		System.out.println(str3);
		System.out.println(data);
		//���⼭ �ٲ㵵 �ٲ��� �ʴ°Ŵ� str3�� data�� ���ԵǾ� �ֱ⶧���� ���� ����ȉ�.

	//index��ġ�� ���� 1���� ���´�.ȸ�������Ҷ� Ư������ �־�� �빮�ڰ� �ֳ� Ȯ���ؾ� �Ҷ�
		
		char c = str1.charAt(2);
		System.out.println("str1.charAt2"+c);
		
		String result =str1  + str2;
		String result2 =str1.concat(str2);
		System.out.println("result="+result);
		System.out.println("result2="+result2);
		//            0123456789
		String data2="Java String Test....";
		String data3="java String test...."; 
		
		if(data2.equals(data3)){
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}

		if(data2.equalsIgnoreCase(data3)) { //��ҹ��� �������� ������ ��
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		//byte �迭�� ���ڿ� ���� �� �ִ� �޼���  (���ڿ��� byte �迭�� ���Ѵ�)
		byte[] byteCode=data2.getBytes(); //Ȯ��� for���� ����� �迭�� ����Ʈ �����ϱ�
		for(byte b:byteCode) {
			System.out.println((char)b+"-->"+b);//�ڵ尡 ����� ���ؼ� ������.
		}
		
		//Ư�� ������ index ��ġ�� ���Ѵ�. data2�� ������
		int idx =data2.indexOf("t"); 
		System.out.println("indexOF->"+idx); //���� ���� t�� ���Ѱ�
		
		//	String data2="Java String Test...."; //���⼭ �빮��T�� ���ϰ� ������ ����ϴ� �޼���
		int idx2 = data2.indexOf("t",10);
		System.out.println("indexOF->"+idx2);
		
		int idx3=data2.lastIndexOf("t");//Ư�����ڸ� �ڿ��� �˻��Ͽ� index�� ���Ѵ�.
		System.out.println("lastIndexOf->"+idx3);
		
		//���̵� �Է��Ҷ� ����ڿ��� ����� ���̸� �Է��ϴ°� ���ڸ� ����� ���ؼ�int�� ����
		
		System.out.println("length"+data2.length() );
//		String data2="Java String Test....";
		//Ư�����ڸ� �ٸ����ڷ� �����Ѵ�. 
		
		data2=data2.replaceAll("a", "����"); //�������ٰ� ���Ծ��ϸ� ������ �ȉ�. 2���ٰ� �ٽó���
		System.out.println("replaceAll->"+data2);
		//data2���� ���� replaceAll->J����v���� String Test....�����Ͱ� ���� ����������ϱ�
		
		
		
		//ȸ�������Ҷ� ��ȭ��ȣ�Է½� ��-��-�� 010-4444-4444/��ȭ��ȣ�� �����ʹ� 3���̴�.
		//�����ͺ��̽��� �����Ҷ� 3���� �����ϴ°� �ƴ϶� ��� �Ѱ��� ������ ����DB�� ������.
		//���� �����Ҷ� ���� �Էµ� ���ߴµ� ��ȭ��ȣ�� �� ������ ����. ���� ���� �����͵��� �����ִ°�
		//�ɰ��±�� -split, +comcat
		
		String data4 ="010-1234-5678";  // 010----1234-5678 ���� ��ȣ�� �������ιٲ� 
		String []tel= data4.split("-");
		for(int i=0; i<tel.length;i++) {
			System.out.println("tel["+i+"]="+tel[i]);
		}
		
		//"010-1234-5678"; =substring Ư�����ڿ����� �Ϻι��ڿ��� ���´� ex 1234-5678������
		//substring(4) start 4 ��� �ϸ� 4-5678 ���� ��ȯ
		//substring(4,8) 1234-5678 �ε��� �ձ��� 
		
		String tel1 = data4.substring(4);// 1234-5678
		String tel2 = data4.substring(4, 8);//1234
		System.out.println(tel1+","+tel2);
		
		
		//���ڿ���char �迭�� �����ش�. 
		
		char[]charDate2=data2.toCharArray();
		for(char cc:charDate2) {
			System.out.println(cc);
		}
		//toLowerCase : �ҹ��ڷ�, toUpperCase :�빮�ڷ� 
		String toLower=data2.toLowerCase();
		String toUpper=data2.toUpperCase();
		System.out.println(toLower+","+ toUpper);
		
		String data6 ="    Spring      FrameWork     ";// ����̵��� �������� ����� ������
		//trim(): ���ڿ��� ���ʿ� ���鹮�ڸ� �����. 
		String dataTrim=data6.trim();
		System.out.println("AA"+dataTrim+"BB");
		
		int num=1234;
		String s1= num+"";//���ڷ� ���� ���Ѿ� �Ѵ�.
		String s2 = String.valueOf(num);
		System.out.println(s1+1234); //���ڶ�� ���������� ���ڶ�� �������� ����
		System.out.println(s2+5678); //�׳� ����ȰŴ� ���ѰԾƴϴ�. 
		
		
		char[] aa= {'S','T','U'}; //�긦 ���ڷ� ������ �ϸ�
		String sss= new String(aa);
		String sss2 =String.valueOf(aa); 
		
		System.out.println(sss);
		System.out.println(sss2);
		
		//String�� >,>=,<,<=,!= �񱳿����ڷ� ���ϸ�ȉ� 
		// - �� �ؼ� int ���� �������� - �� ������ ������ + ������ ������ ū�Ŵ�. 
		//������ ��� �ϴ��Ŀ� ���� ���갪�� �޶���. 
		String data7="Apple";   
		String data8="apple";
		int r1= data7.compareTo(data8); //65-97 =-32����ù��° ���ڰ����� ���� ����
		//����� ���ʰ�ü�� ũ��, ������ ������ ��ü�� ũ��. 
		//-���� ������ �����ų�?~
		int r2= data8.compareTo(data7); //97-65= 32��� /0�̳����� �ΰ�ü ũ�Ⱑ����.
		System.out.println(r1 +","+r2);
		int r3= data7.compareToIgnoreCase(data8); 
		int r4= data8.compareToIgnoreCase(data7); 
		System.out.println(r3 +","+r4);  //��ҹ��� ���� ���� ���ϱ⶧���� ����0
		//apple = APPLE ���ٰ� ���°Ŵ�.
		
			
	}
	
	public static void main(String[] args) {
		new StringTest().start(); //��ŸƮ�� �޼ҵ带 ������

	}	
	
}

 