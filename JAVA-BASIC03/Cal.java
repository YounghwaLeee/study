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
		year = getConData("�⵵");
		month = getConData("��");
		week = getConData("����");
		lastDay = getConData("��������");
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
	            if((d+week-1)%7==0){//����� ���ڰ� 7�� ������̸� �ٹٲٱ�
	                System.out.println();
	            }
		 	}
	 }
	
	void output() {
		 System.out.printf("\t\t%d�� %d��\n", year, month);
	     System.out.println("��\t��\tȭ\t��\t��\t��\t��");

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
