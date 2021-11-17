import java.util.Calendar;
import java.util.Scanner;
public class Cal {
	
	Scanner scan = new Scanner (System.in);
	  Calendar date = Calendar.getInstance();
	int year,month,week,lastDay;
	
	
	Cal(){}

	int getConData(String msg) {
		System.out.println(msg+"=");
		return scan.nextInt();
	}
	
	void setdata() {
		year = getConData("년도");
		month = getConData("월");
		week = getConData("요일");
		lastDay = getConData("마지막날");
	}
	
	void setnow() {
		date.set(year, month-1, 1);
		int week = date.get(Calendar.DAY_OF_WEEK);
		date.getActualMaximum(Calendar.DATE);
	}
	
	void setresult() {
		 for(int s=1; s<week; s++){
	            System.out.print("\t");
	        }
		 for(int d=1; d<=lastDay; d++){
	            System.out.print(d+"\t");
	            if((d+week-1)%7==0){//출력한 문자가 7의 배수개이면 줄바꾸기
	                System.out.println();
	            }
		 	}
	 }
	
	void output() {
		 System.out.printf("\t\t%d년 %d월\n", year, month);
	     System.out.println("일\t월\t화\t수\t목\t금\t토");

	}
	
	void start () {
		setdata();
		setnow();
		setresult();
		 output() ;
	}
	

	
	
	public static void main(String a[]) {
			Cal cal= new Cal();
			cal.start();
			

	}

}
