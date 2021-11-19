import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//

public class ObjectCompareTest {

	public ObjectCompareTest() {
		//List �� �÷����� �ִ°Ŵ�.
		//arraylist ���ϰ� ���� �ִ� �迭 index ������ 
		//�迭�� Ȯ���for���� ��밡���� (������Ÿ��: �迭)
		//���ⵥ���ʹ� key �� ���� ������ ���ڷ� �����Ѵ�.
		List<MemverVO> mem= new ArrayList<MemverVO> ();
		mem.add(new MemverVO("ȫ�浿","��ȹ��","2020-10-10",5000)); //�߰� add v1���� ����
		mem.add(new MemverVO("�̼���","�Ѱ���","2020-01-01",6000));//v2 ��
		mem.add(new MemverVO("�念��","�ѹ���","2020-07-08",3000));
		mem.add(new MemverVO("�������","�λ��","2020-02-01",7000));
		mem.add(new MemverVO("���·�","��ȹ��","2020-03-05",6000));
		mem.add(new MemverVO("���","������","2021-02-10",5000));
		
		System.out.println("==������ ������=====================");
		//���ʸ���ü �� �������� / �÷��ǰ�ü for(MemverVO vo:mem) Ȯ��� for�� ����
		for(MemverVO vo:mem) {//arraylist ������ ������ get�� ���µ� Ȯ���for������ ��� ��밡��
			System.out.println(vo.toString());
			
		}
		
		System.out.println("==== �޿��� ������������ ���� ====");
		//��ü�� ��ü �ִ� �÷��� ,������ �����̵Ǵ� ����� �ִ� comparator ��ü�� �־��ָ� �ȴ�.
		Collections.sort(mem, new CompareAscSal());
		for(MemverVO vo:mem) {
			System.out.println(vo.toString());
		}
		System.out.println("==�޿��� ������������ ����===");
		Collections.sort( mem, new CompareDescSal());
		for(MemverVO vo:mem) {
			System.out.println(vo.toString());
		}
		System.out.println("=======�̸��� ������������ ����======");		
		Collections.sort(mem, new CompareAscName());
		for(MemverVO vo: mem) {
			System.out.println(vo.toString());
		}
		System.out.println("====�̸��� ������������ ����====");{
		Collections.sort(mem, new compareDescName());
		for(MemverVO vo:mem) {
			System.out.println(vo.toString());
		}
			
		System.out.println("====�Ի����� ������������ ����====");
		Collections.sort(mem, new compareAscHire());
		for(MemverVO vo:mem) {
			System.out.println(vo.toString());
		}
		System.out.println("====�Ի����� ������������ ����====");
		Collections.sort(mem, new compareDescHire());
		for(MemverVO vo:mem) {
			System.out.println(vo.toString());
		}
		}
		
	}
	//�����ϴ� Ŭ������ Comparator �������̽��� ��ӹ޾� �����.
	//���ڸ� �̿��� �������� �����ϴ� Ŭ���� 
	//����Ŭ���� (�츮�� �������)
	class CompareAscSal implements Comparator <MemverVO>{ //���� �����Ͱ� �ɹ����̿��� ���
		public int compare(MemverVO v1, MemverVO v2) { //v1 5000, v2 6000
			//    ���ǽ� 
			//���� ��ü�� ���� ������ -, ���� ��ü�� ���� ũ�� + �� ������ 0�� ���� 
			return(v1.getSal()< v2.getSal())?-1  :  (v1.getSal()>v2.getSal())? 1:0;
			
		}
		
	}
	//���ڸ� �̿��� �������� �����ϴ� Ŭ����
	class CompareDescSal implements Comparator<MemverVO>{
		public int compare(MemverVO v1, MemverVO v2) {
			return (v1.getSal() < v2.getSal())? 1: (v1.getSal()> v2.getSal())?-1:0;
			
		}
	}
	//�̸��� ������������ �����ϴ� Ŭ����
	class CompareAscName implements Comparator<MemverVO>{
		public int compare(MemverVO v1, MemverVO v2) {
			//������ ������ ���� , ������ ũ�� ��� , ������ 0
			//"A"  "a" ->"A"-"a"  ->65-97=-32 

			return v1.getName().compareToIgnoreCase(v2.getName());//
			}
	}
	//�̸��� ������������ �����ϴ� Ŭ���� 
	class compareDescName implements Comparator<MemverVO>{
		public int compare(MemverVO v1, MemverVO v2) {
			//"A"                            "a" -> "A"-"a" -> 65-97 =+32 -�� ��ȯ
			//'a'                            "A" -> "a"-"A" -> 97-65=32 
			
			
			return v2.getName().compareTo(v1.getName()); //==>-���¾��� ���ʿ� �ִ°� ũ�� �������� ũ�ٴ� ��
					
		}
	}
	
	//�Ի��� �������� �������� �����ϴ� Ŭ����            �̰� �����Ͱ� ����Ǿ� �ִ� �޼ҵ��
	class compareAscHire implements Comparator<MemverVO>{
		public int compare(MemverVO obj1, MemverVO obj2) {
			
			return obj1.getHire().compareTo(obj2.getHire());
		}
	}
	//�Ի����� �������� �������� �����ϴ� Ŭ���� 
	class compareDescHire implements Comparator<MemverVO>{
		public int compare(MemverVO v1, MemverVO v2) {
			return v2.getHire().compareTo(v1.getHire());
		}
	}
	public static void main(String[] args) {
				new ObjectCompareTest();

	}

}
