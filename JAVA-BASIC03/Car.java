//car�� ��ӹ����� ������ ������Ʈ�� ������ 
public class Car extends Object {
	int speed=0;
	final int SPEED_MAX=180;
	final int SPEED_MIN=0;
	String carName = "�׷���";
	
	public Car() { 
		System.out.println("Car()�����ڸ޼ҵ� ����");
		//�갡 ������
		//��� �����ϋ��� ����Ŭ������ �Ű� ���� ���� �����ڰ� �־�� �Ѵ� �̸���.
		//�Ű����� ���°� ������ �긻�� �Ű����� �ִ°� ����Ǿ�� �ȴٰ� �Ҷ�
	}
	
	public Car(String carName) {
		this.carName =carName;
		System.out.println("Car(string)�����ڸ޼ҵ� ����");
	
	}
	public void speedUp (){
		speed++;//���� ��� �ö󰡸� �����ϱ� �Ѱ輳�� final int SPEED_MAX=108;�����
		if(speed>=SPEED_MAX )speed=SPEED_MAX; //���ǵ尡 ����ӵ����� �ö󰡸� �ְ�ӵ��� �ȿö󰡰� �����ض���
		System.out.println("car.speedUp->speed="+speed);
	}//�޼��� ����
	public void SpeedDown() {
		speed--;
		if(speed<=SPEED_MIN) {
			speed=SPEED_MIN; //���ǵ尡 0���� ������ ���Ǵ��� �ּ� �����ʹ�
		System.out.println("speedDown-speed"+speed);
		}
	}

}
 //ī Ŭ������ ��ӹ��� Ʈ���� Ŭ������ ������̴�.