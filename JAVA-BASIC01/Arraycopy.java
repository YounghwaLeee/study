
public class Arraycopy {

	public static void main(String[] args) {
		
		//배열의복사
		
		int num[]= {26,67,15,95,36,48,23,14};
		
		 //            원본배열명    복사형시작index   복사할곳의 배열명       복사열시작지wjaindex     복사할데이터의개수
		//arraycopy(Object src,    int srcPos,     Object dest,   int destpos,int      length)
		//            num              2             target          5                  3
		//num배열에서 index 2에서 부터 3개만 복사를 하여 새로운 배열에 대입하겠다.
		
		int target[] =new int[10]; //기본초기값은 0으로 세팅되어 있는 상태이다.
		
		System.arraycopy(num, 2 ,target, 5, 3);
		
		for(int i=0; i< target.length; i++) {
			System.out.println("target["+i+"]=" + target[i]);
			
			
		}
	}

}
