import java.util.Scanner;

public class ArrayScore {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//데이터 저장할 공간 확보가됌
		
		System.out.print("학생수=");
		int cnt= Integer.parseInt(scan.nextLine());
		//1.학생수 cnt입력받기
		//nextLine 을 숫자로 바꿔야함
		String[] name =new String[cnt];
		int jumsu[][]= new int [cnt+2][6];//학생점수를 고정할 배열//2.학생수만큼 학생이름의수가된다
		
		//이름과 점수를 입력받아 배열에 저장
		String[] title= {"국어","영어","수학"};
		for(int i=0; i<cnt; i++) {//0,1,2 얘는 행번호로 사용
			System.out.print("이름=");
			name[i]=scan.nextLine();    //3퀴돌면 3번이름의 입력받겠다 이말임
			for(int j=0; j<title.length;j++) {//0,1,2 0일때 0번째에 일단 값을 넣었고 여기 0,1,2는 열번호
				System.out.print(title[j]+"=");
				jumsu[i][j]= Integer.parseInt(scan.nextLine());
			}
		}
		//개인별 총점,평균
		//과목별 총점
		 	for(int i=0; i<cnt;i++) {//0,1,2
		 		for(int j=0; j<3;j++) {//0,1,2 0=국어1=수학2=영어
		 			jumsu[i][3]+=jumsu[i][j];//개인별총점
		 			jumsu[cnt][j] += jumsu[i][j];//과목별총점
		 		
		 	}
		 		//개인별 평균
		 		jumsu[i][4] = jumsu[i][3]/3;
	}
		 		//과목별 평균
		 	for(int i=0; i<3; i++) {
		 		jumsu[cnt+1][i] =jumsu[cnt][i]/cnt;
		 	}
		
		 	//석차구하기 
		 	for(int i=0; i<cnt; i++) {//0,1,2,3
		 		
		 		//i가 본인점수 위치
		 		for(int j=0; j<cnt; j++) {
		 			//내점수			//상대방점수
		 			if(jumsu[i][3] < jumsu[j][3]) {
		 				jumsu[i][5]++;
		 				
		 			}
		 		}
		 		jumsu[i][5]++;
		 	}
		 	
		 	//석차순으로 정렬 
		 	for(int i=0; i<cnt-1; i++) {//3명->0,1,
		 		//				3-1-0
		 		for(int j=0; j<cnt-1-i; j++) {// 0,1
		 			if(jumsu[j][5]	> jumsu[j+1][5] ) {
		 				//교환
		 				//이름바꾸기
		 				String nameTemp=name[j];
		 				name[j]=name[j+1];
		 				name[j+1]=nameTemp;
		 				for(int k=0; k<jumsu[j].length;k++) {
		 					int temp =jumsu[j][k];
		 					jumsu[j][k]=jumsu[j+1][k];
		 					jumsu[j+1][k]= temp;
		 					
		 					//0,1,2,3,4,5
		 				}
		 				
		 			}
		 			
		 		}
		 		
		 	}
		
			System.out.println("===============================================================");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
			System.out.println("===============================================================");
		
			for(int i=0;i<cnt; i++) {
				//이름출력-name이란 곳에 넣어둠
				System.out.println(name[i]+"\t");
				//점수출력=국어,영어,수학,총점,평균
				for(int j=0; j<jumsu[i].length; j++) {
					System.out.print(jumsu[i][j]+"\t");
				}
				
				System.out.println();
			}
			
			//과목별 총점 과목이3과목이니깐 3을잡음
			System.out.println("총점\t");
			for(int i=0; i<3; i++) {
				System.out.print(jumsu[cnt][i]+"\t");
					
				}
					System.out.println();
					//과목별평균
					System.out.println("평균\t");
					for(int i=0; i<3; i++) {
						System.out.print(jumsu[cnt+1][i]+"\t");
						
					}
					
					System.out.println();
				}
			
			
}

			
			
	
	
	///과목별 평균을 구하면 된다
	//}	
		



//1.학생수 2.과목 3. 점수를 입력 받아야 한다 . 
//그러고 총점 = 평균,석차,과목별총점,평균을 구해야 한다
// 총점의 변수선언 해주고 , 과목/3을 하고 
//정렬까지 다해줘야한다. 응 모르겠다 ~