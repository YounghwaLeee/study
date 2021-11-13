

//문자열가지고 변수보관String 
public class StringTest {

	public StringTest() {
		
	}

	public void start() {
		
		//            01234567890
		String str1= "서울시 마포구 신수동";         //str 1 str2 일반 데이터 처럼 작업된거는 일반 데이터로 비교된다.
		String str2= "서울시 마포구 신수동";
		String str3= new String ("서울시 마포구 신수동");  //객체로 생성해서 만든거 
		String data =str3;  //str3 data 대입문에 의해서 넣으면 같은 객체로 가짐 
		//str 3은 4500 값으로 변경되었지만 data에 있는건 4000으로 남아있어서 
		
		//새로만든거랑 그전에 데이터를 대입시키는거는 다르다. 
		
		byte[] byteData= {65,66,67,68}; //아스키코드값 -> ABCD로 바꿈 65대문자A의 코드값
		String str4=new String(byteData);//값"ABCE"
		
		char[] charData = {'x','y','z'};// "xyz"로 바꿔야됌 
		String str5= new String(charData); //xyz 문자열로 바뀜
		
		int[] intData= {65,66,67,68,69,70}; //index 0 1 2 3 4 5 2~번쨰부터3개를 문자로 바꿔라 생성해라
		String str6 = new String(intData,2,3);
		
		System.out.println("byteData="+str4);
		System.out.println("charData="+str5);
		System.out.println("intData="+str6);
		
		
		if(str1==str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		 if(str1==str3) {
			 System.out.println("같다");
		 }else {
			 System.out.println("다르다");
		 	}
		
		
		if (str1.equals(str3)) {
			System.out.println("같다");
		}else {
			 System.out.println("다르다");
		 	}
	
		if(str3==data) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		str3 ="서울시 종로구";
		System.out.println(str3);
		System.out.println(data);
		//여기서 바꿔도 바뀌지 않는거다 str3가 data에 대입되어 있기때문에 값은 변경안됌.

	//index위치의 문자 1개를 얻어온다.회원가입할때 특수문자 넣어라 대문자가 있나 확인해야 할때
		
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
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}

		if(data2.equalsIgnoreCase(data3)) { //대소문자 구별없이 같은지 비교
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//byte 배열로 문자열 구할 수 있는 메서드  (문자열을 byte 배열로 구한다)
		byte[] byteCode=data2.getBytes(); //확장된 for문을 사용함 배열이 바이트 변수니까
		for(byte b:byteCode) {
			System.out.println((char)b+"-->"+b);//코드가 통신을 통해서 나간다.
		}
		
		//특정 문자의 index 위치를 구한다. data2를 가지고
		int idx =data2.indexOf("t"); 
		System.out.println("indexOF->"+idx); //먼저 나온 t를 구한거
		
		//	String data2="Java String Test...."; //여기서 대문자T를 구하고 싶을때 사용하는 메서드
		int idx2 = data2.indexOf("t",10);
		System.out.println("indexOF->"+idx2);
		
		int idx3=data2.lastIndexOf("t");//특정문자를 뒤에서 검색하여 index를 구한다.
		System.out.println("lastIndexOf->"+idx3);
		
		//아이디 입력할때 몇글자에서 몇글자 사이를 입력하는거 문자를 몇개인지 구해서int로 리턴
		
		System.out.println("length"+data2.length() );
//		String data2="Java String Test....";
		//특정문자를 다른문자로 변경한다. 
		
		data2=data2.replaceAll("a", "에이"); //변수에다가 대입안하면 보관이 안됌. 2에다가 다시넣음
		System.out.println("replaceAll->"+data2);
		//data2에는 이제 replaceAll->J에이v에이 String Test....데이터가 있음 변경시켰으니깐
		
		
		
		//회원가입할때 전화번호입력시 ㅁ-ㅁ-ㅁ 010-4444-4444/전화번호의 데이터는 3개이다.
		//데이터베이스로 보관할때 3개로 보관하는게 아니라 묶어서 한개의 값으로 보관DB로 넣을때.
		//만약 수정할때 내가 입력도 안했는데 전화번호가 딱 찍혀서 나옴. 전에 썻던 데이터들이 남아있는거
		//쪼개는기능 -split, +comcat
		
		String data4 ="010-1234-5678";  // 010----1234-5678 구분 기호가 연속으로바뀔때 
		String []tel= data4.split("-");
		for(int i=0; i<tel.length;i++) {
			System.out.println("tel["+i+"]="+tel[i]);
		}
		
		//"010-1234-5678"; =substring 특정문자열에서 일부문자열을 얻어온다 ex 1234-5678끝까지
		//substring(4) start 4 라고 하면 4-5678 값을 반환
		//substring(4,8) 1234-5678 인덱스 앞까지 
		
		String tel1 = data4.substring(4);// 1234-5678
		String tel2 = data4.substring(4, 8);//1234
		System.out.println(tel1+","+tel2);
		
		
		//문자열을char 배열로 구해준다. 
		
		char[]charDate2=data2.toCharArray();
		for(char cc:charDate2) {
			System.out.println(cc);
		}
		//toLowerCase : 소문자로, toUpperCase :대문자로 
		String toLower=data2.toLowerCase();
		String toUpper=data2.toUpperCase();
		System.out.println(toLower+","+ toUpper);
		
		String data6 ="    Spring      FrameWork     ";// 양사이드의 공백제거 가운데는 안지움
		//trim(): 문자열의 양쪽에 공백문자를 지운다. 
		String dataTrim=data6.trim();
		System.out.println("AA"+dataTrim+"BB");
		
		int num=1234;
		String s1= num+"";//문자로 변경 시켜야 한다.
		String s2 = String.valueOf(num);
		System.out.println(s1+1234); //숫자라면 더해지지만 문자라면 더해지지 않음
		System.out.println(s2+5678); //그냥 연결된거는 더한게아니다. 
		
		
		char[] aa= {'S','T','U'}; //얘를 문자로 만들어야 하면
		String sss= new String(aa);
		String sss2 =String.valueOf(aa); 
		
		System.out.println(sss);
		System.out.println(sss2);
		
		//String은 >,>=,<,<=,!= 비교연산자로 비교하면안됌 
		// - 를 해서 int 값을 리턴해줌 - 가 나오면 오른쪽 + 나오면 왼쪽이 큰거다. 
		//연산을 어디 하느냐에 따라서 연산값이 달라짐. 
		String data7="Apple";   
		String data8="apple";
		int r1= data7.compareTo(data8); //65-97 =-32음수첫번째 문자값들을 서로 뺴줌
		//양수는 왼쪽객체가 크고, 음수는 오른쪽 객체가 크다. 
		//-오면 왼쪽이 작은거넹?~
		int r2= data8.compareTo(data7); //97-65= 32양수 /0이나오면 두객체 크기가같다.
		System.out.println(r1 +","+r2);
		int r3= data7.compareToIgnoreCase(data8); 
		int r4= data8.compareToIgnoreCase(data7); 
		System.out.println(r3 +","+r4);  //대소문자 구별 없이 비교하기때문에 값은0
		//apple = APPLE 같다고 보는거다.
		
			
	}
	
	public static void main(String[] args) {
		new StringTest().start(); //스타트의 메소드를 실행해

	}	
	
}

 