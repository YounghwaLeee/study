

public class MemverVO {
	//VO Ŭ������ 1���� ���ڵ� ������ ������ ���� (������ ���� ���� ������ �޶���)\��� �Ѹ��̸� �Ѹ��� ����, 
	//�ɹ����� ����, ĸ��ȭ(Private) �Ѵ�. �ܺο��� ����� ������ �ϰڴ�. ��ü�� ���ؼ� ������ �� ����
	private String name;
	private String depart;
	private String hire;
	private int sal;
	//���� ������ ������ ���� 
	//1.ó�� MemverVO Ŭ���� �ۼ�
	
	public MemverVO() {//�ʱⰪ�� ������null~~~0
	}

	public MemverVO(String name, String depart,String hire, int sal) {
		this.name =name;
		this.depart=depart;
		this.hire=hire;
		this.sal=sal;
		
		
	}

		//ĸ��ȭ�� �ɹ������� ������ �� �ִ� �޼ҵ带 �����Ѵ�. private�����ϱ����ؼ� �޼ҵ������
		//��Ģ�� ���� 
		//1.set �ϰ� �ɹ��������� ��� ù��°���� �빮�ڷ� �ٲ�name��>setName
		//2.Ŭ���� �ȿ� �ɹ��� ������ ��  set �ϰ� �ɹ�����= setter
		//3. ������ get �ϰ� �ɹ����� =���� Ŭ�����ܺη� �����°� getter
		//
		public void setName(String name) {
			this.name=name; //���� ������ Ŭ���� �ȿ��ɹ��� ����
			//set ���� ���� ���ټ� ����
		}//���� ������ �������°� �޼���� ���ؼ� �����̺�����
		public String getName() {
			return name;
		}
		
		public void setDepart(String depart) {
			this.depart= depart;
		}
		public String getDepart() {
			return depart;
		}

		public void setHire (String hire) {
			this.hire = hire;
		}
		public String getHire() {
			return hire;
		}
		public void setSal (int sal) {
			this.sal=sal;
		}
		public int getSal() {
			return sal;
		}


		//�� ������ �ƴѵ� �� ���� . �ֹι�ȣ �Է��ؼ� 

/////////////����ϴ� �޼��� �Ǹ������� �Է�. ����׽�Ʈ�������.
		public void memverPrint() {
			System.out.println("�̸�="+name);
			System.out.println("�μ���="+depart);
			System.out.println("�Ի���="+hire);
			System.out.println("�޿�="+sal);
		}
		
		//����Ŭ������object�� toString() �޼ҵ带 �������̵�.
		public String toString() {
			String mamverData=name+","+depart+","+hire+","+sal;
			return mamverData;
		} //�������̵� �� �޼ҵ� ���� �����ִ°Ÿ� �ϳ��� �����ذ�.//�ʿ��ϸ� ���� �ʿ���� �Ⱦ���Ǵ�








}
