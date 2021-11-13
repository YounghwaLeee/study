import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DecimalDateFormat {
	
	public DecimalDateFormat() {
		try {
		//�����͸� ���ϴ� ����������� ���� �� �ִ� Ŭ���� 
		//���ڸ� ȭ����� �����
		int data = 52123542;
		DecimalFormat format = new DecimalFormat("#,###��");// ��ü����
		
		String dataFormat=format.format(data); //����ȭ�� ������
		System.out.println("dataFormat="+dataFormat);
		
		//�������� ��ȯ�� �����͸� ������� �ٲٱ�.
		//52,123,542���String �̴�. -> 52123542 ��� ���ڴ�.

		NumberFormat nf = NumberFormat.getInstance(); //��ü�������
		Number num=nf.parse(dataFormat);
		
		int dataParse = num.intValue();
		System.out.println("dataParse"+ dataParse);
	
		//��¥ ����
		//2021�� 6�� 4��(��) 15:21
		Calendar now= Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� (E) hh:mm:ss a");
		String dateStr = dateFormat.format(now.getTime());
		System.out.println("dateStr--->"+dateStr);
		
	}catch(Exception e) {}
		
	}

	public static void main(String[] args) {
		 new DecimalDateFormat();

	}

}