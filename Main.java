
public class Main {
	
	//메인 클래스에서 한명의 학생에 대한 정보가 담긴 클래스를 만듬.
	//기본적으로 변수 4개 존재 GET/ SET
	
	
	private String studentID;
	private String studentName;
	private String studentGender;
	private double studentCredit;
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public double getStudentCredit() {
		return studentCredit;
	}
	public void setStudentCredit(double studentCredit) {
		this.studentCredit = studentCredit;
	}
	
	//생성자를 이용해 변수를 초기화 할 수 있도록 작성하였다. 
	public Main(String studentID, String studentName,
			String studentGender, double studentCredit) {
		this.studentID =studentID;
		this.studentName = studentName;
		this.studentGender = studentGender;
		this.studentCredit = studentCredit;
	}
	//특정한 한생의 정보를 출력하는 show() 함수 정의
	public void show() {
		System.out.println("학생번호"+ getStudentID());
		System.out.println("학생이름"+ getStudentName());
		System.out.println("학생 성별"+ getStudentGender());
		System.out.println("학생학점"+ getStudentCredit());
		
	}
	
	

}
