import java.util.Scanner;

public class StandardWeightOOP {
	Scanner scan = new Scanner (System.in);
	//�������Է� 1. �ɹ������� 
	
	//������ �Է°� ����
	int age, gender;	//�ʱⰪ�� 0
	double height, weight;	//0.0	
	double sWeight;//ǥ��ü�� (������������� return�� ���ϰڵ�.)
	double sWeightIndex;//ǥ��ü������
	String sWeightMsg; //����
	
	
	StandardWeightOOP(){}//������ �޼���
	
	//�Ǽ� �Ǽ� ���ڿ�. (���������� ���)
	//������ �Է� �޼���
	double getConData(String msg) {
		System.out.println(msg+"=");
		return scan.nextDouble();
	}
	
	//���� �Է¹޾Ƽ� ������ ������ ����
	void setdata() {
		age = (int)getConData("����");
		gender =(int) getConData("����");
		height= getConData("Ű");
		weight =getConData("������");
		
		//4���� �����Ϳ� �� �Է��� �����ش�.
		
	}
	
	//ǥ��ü�� index���ϱ�
	void setStandardWeight() {
		double index =0.90;
		if(age<=35&&gender==2) {
			index=0.85;
		} else if(age>=36 && gender==1) {
			index=0.95;
			
		}
		sWeight=(height-100)*index;
	}
	//ü��
	void setStandardWeightMsg() {
		sWeightIndex = (weight/sWeight)*100;
		if(sWeightIndex<=85) sWeightMsg = "������";
		else if(sWeightIndex<=95) sWeightMsg = "���ݸ�����";
		else if(sWeightIndex<=115) sWeightMsg = "ǥ����";
		else if(sWeightIndex<=125) sWeightMsg = "���ݺ���";
		else sWeightMsg = "����";
		
		
	}
	//���
	void standartWeightOutput() {
		System.out.println("ǥ��ü��="+sWeight);
		System.out.println("����� ǥ��ü�� ������"+sWeightIndex+"����,"+sWeightMsg+"�Դϴ�.");
		
	}
	
	void startStandard() {
		setdata();
		setStandardWeight();
		setStandardWeightMsg();
		standartWeightOutput();
	}
		public static void main(String a[] ) {
			 StandardWeightOOP oop =  new   StandardWeightOOP();
			 oop.startStandard();
		}

		
	
}
