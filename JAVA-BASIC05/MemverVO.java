

public class MemverVO {
	//VO 클래스는 1개의 레코드 보관할 변수를 선언 (기준이 뭐냐 따라 종류가 달라짐)\사원 한명이면 한명의 정보, 
	//맴버변수 선언, 캡슐화(Private) 한다. 외부에서 맘대로 못쓰게 하겠다. 객체를 통해서 접근할 수 없음
	private String name;
	private String depart;
	private String hire;
	private int sal;
	//값을 저장할 변수를 생성 
	//1.처음 MemverVO 클래스 작성
	
	public MemverVO() {//초기값이 없으니null~~~0
	}

	public MemverVO(String name, String depart,String hire, int sal) {
		this.name =name;
		this.depart=depart;
		this.hire=hire;
		this.sal=sal;
		
		
	}

		//캡슐화된 맴버변수를 접근할 수 있는 메소드를 생서한다. private접근하기위해선 메소드로접근
		//규칙이 있음 
		//1.set 하고 맴버변수명을 사용 첫번째글자 대문자로 바꿈nameㅡ>setName
		//2.클래서 안에 맴버의 대입한 후  set 하고 맴버변수= setter
		//3. 내보냄 get 하고 맴버변수 =값이 클래스외부로 나가는걸 getter
		//
		public void setName(String name) {
			this.name=name; //값이 들어오면 클래스 안에맴버에 대입
			//set 값을 변경 해줄수 있음
		}//이제 밖으로 내보내는거 메서드로 통해서 프라이빗접근
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


		//너 관리자 아닌데 왜 들어와 . 주민번호 입력해서 

/////////////출력하는 메서드 맨마지막에 입력. 어레이테스트에서출력.
		public void memverPrint() {
			System.out.println("이름="+name);
			System.out.println("부서명="+depart);
			System.out.println("입사일="+hire);
			System.out.println("급여="+sal);
		}
		
		//상위클래스은object의 toString() 메소드를 오버라이딩.
		public String toString() {
			String mamverData=name+","+depart+","+hire+","+sal;
			return mamverData;
		} //오버라이딩 된 메소드 저기 위에있는거를 하나로 묶어준거.//필요하면 쓰고 필요없음 안쓰면되니








}
