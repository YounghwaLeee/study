import java.util.Calendar;
import java.util.Vector;

public class VectorMain {

	public VectorMain() {
		//VectorTestŬ������ start()�޼ҵ带 ȣ���ϸ� Vector�� ���ϵȴ�.
		//���Ͼȿ��� ��ü�� 4������ �ִ�. ȫ�浿 ī���� �ɹ� ~~����
		
		VectorTest vt = new VectorTest(); // 1. ��ü����
		Vector vvv=vt.start();
		
		String aaa = (String)vvv.elementAt(0); //String�� �� ���� 0��°�� �����ߴµ� �갡 ��Ʈ���̾ƴϳ�? object
		System.out.println("aaa="+aaa);
		Calendar ccc =(Calendar)vvv.get(1);
		System.out.println("ccc="+ccc);
		Integer iii =(Integer)vvv.elementAt(2);
		System.out.println("iii="+iii);
		MemverVO vo=(MemverVO)vvv.elementAt(3);//"�������","��ȹ��","2021-06-10",1000
		vo.memverPrint();
		
		System.out.println(vvv.toString());
		
	}

	public static void main(String[] args) {
		new VectorMain();

	}

}
