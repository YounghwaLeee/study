//package
//�ʿ��� Ŭ������ ��ġ(��Ű����� Ŭ�������� �����Ѵ�.)
import java.util.Scanner;
import java.lang.String; //compiler�� �����ϰ����� �ڵ�����import���ش�.
import java.util.Random;
import java.util.*; //����̶� ��


public class ClassTest {
//�ɹ�����=��������
	int a=100;
	String name="ȫ�浿";
	//�ɹ������� �ʱⰪ�� �ڵ����� �����ȴ�
	//���� byte,short,int,long - �ʱⰪ�� 0���� �Ǿ�����
	//�Ǽ� (float, double) :0.0
	//��(boolean): false)
	//����(char) :�ʱⰪ�� ���� 
	//string , scanner, Random=null : null�� �ʱⰪ
	int b; 
	double c;
	String nameStr;// null
	Scanner scan;	//null
	Random ran;//null

	//��ü������ ������
	Scanner scanner=new Scanner(System.in);
	//���๮�� ������� ���Ұ�
	//System.out.println("�ֹܼ�������ϱ�");

	int k=100+500; //�����ϰ� �ٷ��ʱ�ȭ �ϱ⶧���� �������
	int dd[]= new int[10];
	//dd[3]=200; //�迭 ������ �ϰ� ���� �ִ°� �޼ҵ� �ȿ����� ���డ��.
	//
	
	//���������� �޼ҵ� �ȿ� ����Ȱ� 
	//������ �޼ҵ� : ��ü�� �����Ҷ� �ѹ� ����Ǵ� �޼���
					// �޼ҵ���� �ݵ�� Ŭ������� ���ƾ��Ѵ�.
					//��ü ������ ��ü�� �����͸� �ʱ�ȭ �Ҽ� �ִ�.
	//������ �޼ҵ� ����� ��Ģ / �޼ҵ���� �ݵ�� Ŭ������� ���ƾ� �Ѵ�.
	
	ClassTest(){
		b=1234;
		//���๮ 
		System.out.println("������ �޼ҵ尡 �����...");
	}
	ClassTest(int a){
		System.out.println(a+"�޼ҵ� ����~~~~~~~~~");
	}

	//�޼ҵ� : �ϳ��� ������� 
	//Ŭ������ ��ü ������ �޼ҵ带 ȣ���Ͽ��� ����ȴ�.
	
	//��ȯ�� �޼ҵ�� (�Ű�����,�ŰԺ���){
	//}
	//�޼ҵ�� ���� ��Ģ :
	// 			�ҹ��ڷ� �����Ѵ�. �ռ��� �϶��� �ι�° �ܾ���� ����
	void sum() {
		System.out.println("sum()�޼ҵ尡 �����");
	}
	void total (int a, int b) {
		System.out.println("����"+ (a+b));
	}
	
}
	
	

