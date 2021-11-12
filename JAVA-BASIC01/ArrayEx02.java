
public class ArrayEx02 {

	public static void main(String[] args) {
		//난수 1~10000사이의 값을 100개 만들어 배열에 저장하고 
		//난수중 생성된 난수중 제일 큰값과 제일 작은값 , 평균을 구하여 출력하라.
		
		//1. 100개의 저장할수 있는 배열
		//2. 난수만들기
		
		int data[] = new int[100] ;
		
		//2. 난수만들기
		
		for(int i=0; i<data.length; i++) {
			data[i] =(int)(Math.random()*1000)+1;
		//3.출력
			
			System.out.println(data[i]);
			
		}
		//ex  500 700 300 하나씩 비교해서 최대값넣고, 또 하나하나비교해서 넣는다 
		//최대값 최소값이 계쏙 달라진다
		//큰값, 작은값,평균 max min
		//1.큰값 ,작은갑 저장할 변수를 각각 만든다. 
		//2.배열의 젤앞에 있는 값을 큰값.2번째를 작은값에넣음
		//3.첫번쨰값이 500 두번재값이 700
		
		int sum=0;
		int max=data[0];//배열중에 제일 앞에 있는 데이터를 초기값으로 넣음 index0번째의값을 초기값넣음
		int min=data[0];
		for(int i=0; i<data.length;i++) {
			sum+=data[i];
				if(max<data[i]) {
					max=data[i];
				}
				if(min>data[i]) {
					min=data[i];
				}
		}
			int ave=sum/data.length;
			System.out.println("합="+sum);
			System.out.println("평균="+ave);
			System.out.println("최대값="+max);
			System.out.println("최소값="+min);
			
	
	}

}
