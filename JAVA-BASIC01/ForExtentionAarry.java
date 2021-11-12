
public class ForExtentionAarry {

	public static void main(String[] args) {
	
		int arr[]= {85,6,92,65,12,74,3}; //->배열의 초기화 
		//확장된for문
		//배열의 데이터형변수를 선언: 배열명
		//처음값넣고 올라가서 두번째 값 나오고 이런식
		for(int data: arr) {
			System.out.print(data+"\t");{
				}
			System.out.println();
			
			//2차원배열//3향4열짜리
			int arr2[][]= {
					{60,80,40,60},
					{50,40,30,10},
					{36,58,78,95}
								};
		
			//1차원배열변수:2차원배열명							};
			for(int[] data2:arr2) {
				//배열의 데이터형변수: 1차원 배열명
				for(int z:data2) {
					System.out.print(z+"\t");
								}
				System.out.println();
			}
				
			}
			
			
			
			
			}
	}

