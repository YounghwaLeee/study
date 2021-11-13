import java.util.Calendar;
class CalendarTest 
{
	public static void main(String[] args) 
	{
		//컴퓨터의 날짜 시간정보 얻어오기
		//Calendar(클래스를 사용하려면 import를 해야함),Date 

		Calendar now =Calendar.getInstance(); // getInstance 객체를 생성해주는 메서드
		//캘린더 클래스가 따로있다. 캘린더 안에 변수랑 메서드가 따로 있다.

		//날짜 변경   :  set()   //객제정보가져올떈 겟 정보변경할떄는 셋 //월은 -1이 되어있다.
		now.set(2021,5,8); //캘린더에있는 set이라는 메서드를 사용해줌 5월을 입력하면 6월 달력이 출력이 된다 
		//년도만 변경 ! 뭐한가지만 바꾸고 싶을때 시간만 바꾸게 
		now.set(Calendar.YEAR,2022); //년도적고 변경하고 싶은 년도를 적어준다.
		now.set(Calendar.MONTH,10);

		// 2021년 6월 4일 (금)  15:21
		//now라는 메서드에는 get() -->날짜 , 시간 정보를 얻어온다.
		//SET설정 GET가져오는거
		
		int year = now.get(Calendar.YEAR); //2021
		int month=  now.get(Calendar.MONTH)+1; //6
		int day = now.get(Calendar.DAY_OF_MONTH); //4
		int week = now.get(Calendar.DAY_OF_WEEK);//6 week 1~7 까지 
		int hour = now. get(Calendar.HOUR_OF_DAY);//16
		int minute =now. get(Calendar.MINUTE);//44 //get해서 꺼내준다. 변스둘이 스테틱으로 되어있다.

		String weekStr ="";
		switch(week){
			case 1 : weekStr ="일"; break; //실제로 이렇게 담겨져 있는것이다.
			case 2 : weekStr ="월"; break;
			case 3 : weekStr ="화"; break;
			case 4 : weekStr ="수"; break;
			case 5 : weekStr ="목"; break;
			case 6 : weekStr ="금"; break;
			case 7 : weekStr ="토"; break;
		}
		System.out.printf("%d년 %d월 %d일 (%s) %d:%d\n", year, month, day, week, hour, minute);

		
		System.out.println(now);//java.util.GregorianCalendar[time=1668413990724,areFieldsSet=true,areAllFieldsSet=true,lenien
								//이렇게 출력이됌.
		
	     int lastDay = now.getActualMaximum(Calendar.DAY_OF_MONTH);
	      System.out.println("마지막날=>"+lastDay);
	      int lastMonth = now.getActualMaximum(Calendar.MONTH);
	      System.out.println("월 중에 제일 큰 값=>"+lastMonth); // 12월인데 숫자로는 11 나옴.
	      int lastYear = now.getActualMaximum(Calendar.YEAR);
	      System.out.println("연도 중에 제일 큰 값=>"+lastYear);







		//상수로된 변수들은 다 대문자로 쓴다. 단어를 구분하기 하기위해 _ 언더바를 사용한다
	}
}
