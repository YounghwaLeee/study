import java.util.Scanner;

class Ex04_if 
{
	public static void main(String[] args) 
	{
	

		Scanner scan= new Scanner(System.in);
		int  kor=0, eng=0, math=0;
		System.out.println("국어 점수를 입력하세요");
		kor=scan.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng=scan.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math=scan.nextInt();
		
		int total= kor+eng+math;
		double avg= total/3.;
		
		char grade ='F';        //안써도된다라는 뜻
		if(avg>=90) {
			grade ='A';
		} else if(avg>=80) {
			grade='B';
		} else if(avg>=70) {
			grade='C';
		} else if(avg>=60) {
			grade='D';
			}
		
		System.out.printf("총점=%d\n평균=%.2f\n학점=%c\n", total, avg, grade);
	}
}


/*
국어 영어 수학점수를 입력받아 총점, 평균, 학점을 구하여 출력하라.
각 과목의 점수 0~100점 사이의 값이다.
평균은 실수를 구한다.

학점{{
90~100 A
80~89 B
70~79 C
60~69 D
0~59 F

실행
국어=80
영어=80
수학=80
=====================
총점 240
평균 80.0
학점=B

*/