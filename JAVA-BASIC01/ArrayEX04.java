
public class ArrayEX04 {

	public static void main(String[] args) {
	      
	      int arr[][] = new int[10][10]; // 0~9까지
	      
	      for(int r=0; r<arr.length-1; r++) {   // 행번호 //0~8까지만 반복
	         for(int c=0; c<arr[r].length-1; c++) { // 열번호 0~8
	               arr[r][c] = (r+1) * (c+1);		//1씩적으니까 어떤 걔를 가지고 어떤 규칙을 만들수 있을 까?
	               
	               arr[r][9] = arr[r][9] + arr[r][c]; // 행의 합 // arr[r][9]의 초기값은 0
	               //arr[r][9] += arr[r][c];
	               arr[9][c] = arr[9][c] + arr[r][c]; // 열의 합 // arr[9][c]의 초기값은 0
	         }
	      }
	      
	      // arr[9][9] = 0;
	         //확장형for문 출력해줄때 이중for문 써서 값을 먹여줬으니까 다 불려줬으니까 쓰는 방식이 변수명int    arr 배열변수만 대괄호 없이 이렇게 씀. 이차원배열이니까. 
	      for(int[] data : arr) {
	         for(int a : data) {//  for(int a : data) int a변수를 써주명 1.이걸 기본으로 써줌 배열의 변수명만 딱 써줌 data 라는 변수를 쓸수 있다. 2차원배열이여서 1차원배열에서도 사용가능함 
	            System.out.print(a+"\t");//피른티할떄는a 만 사용한다.
	         }
	         System.out.println();
	      }
	   }
	
	}
////출력 2차원 포문
//오른쪽에 이차원배열 왼쪽에 한행의 첫번째줄을 옮겨준다 
//데이터에있는 첫번째 배열전체를 디에넘ㄱ준다
//다시 콜론해서 일차원 배열을 출력 