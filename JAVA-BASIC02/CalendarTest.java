import java.util.Calendar;
class CalendarTest 
{
	public static void main(String[] args) 
	{
		//��ǻ���� ��¥ �ð����� ������
		//Calendar(Ŭ������ ����Ϸ��� import�� �ؾ���),Date 

		Calendar now =Calendar.getInstance(); // getInstance ��ü�� �������ִ� �޼���
		//Ķ���� Ŭ������ �����ִ�. Ķ���� �ȿ� ������ �޼��尡 ���� �ִ�.

		//��¥ ����   :  set()   //�������������Ë� �� ���������ҋ��� �� //���� -1�� �Ǿ��ִ�.
		now.set(2021,5,8); //Ķ�������ִ� set�̶�� �޼��带 ������� 5���� �Է��ϸ� 6�� �޷��� ����� �ȴ� 
		//�⵵�� ���� ! ���Ѱ����� �ٲٰ� ������ �ð��� �ٲٰ� 
		now.set(Calendar.YEAR,2022); //�⵵���� �����ϰ� ���� �⵵�� �����ش�.
		now.set(Calendar.MONTH,10);

		// 2021�� 6�� 4�� (��)  15:21
		//now��� �޼��忡�� get() -->��¥ , �ð� ������ ���´�.
		//SET���� GET�������°�
		
		int year = now.get(Calendar.YEAR); //2021
		int month=  now.get(Calendar.MONTH)+1; //6
		int day = now.get(Calendar.DAY_OF_MONTH); //4
		int week = now.get(Calendar.DAY_OF_WEEK);//6 week 1~7 ���� 
		int hour = now. get(Calendar.HOUR_OF_DAY);//16
		int minute =now. get(Calendar.MINUTE);//44 //get�ؼ� �����ش�. �������� ����ƽ���� �Ǿ��ִ�.

		String weekStr ="";
		switch(week){
			case 1 : weekStr ="��"; break; //������ �̷��� ����� �ִ°��̴�.
			case 2 : weekStr ="��"; break;
			case 3 : weekStr ="ȭ"; break;
			case 4 : weekStr ="��"; break;
			case 5 : weekStr ="��"; break;
			case 6 : weekStr ="��"; break;
			case 7 : weekStr ="��"; break;
		}
		System.out.printf("%d�� %d�� %d�� (%s) %d:%d\n", year, month, day, week, hour, minute);

		
		System.out.println(now);//java.util.GregorianCalendar[time=1668413990724,areFieldsSet=true,areAllFieldsSet=true,lenien
								//�̷��� ����̉�.
		
	     int lastDay = now.getActualMaximum(Calendar.DAY_OF_MONTH);
	      System.out.println("��������=>"+lastDay);
	      int lastMonth = now.getActualMaximum(Calendar.MONTH);
	      System.out.println("�� �߿� ���� ū ��=>"+lastMonth); // 12���ε� ���ڷδ� 11 ����.
	      int lastYear = now.getActualMaximum(Calendar.YEAR);
	      System.out.println("���� �߿� ���� ū ��=>"+lastYear);







		//����ε� �������� �� �빮�ڷ� ����. �ܾ �����ϱ� �ϱ����� _ ����ٸ� ����Ѵ�
	}
}
