package com.bitcamp.myapp.register;

public class RegisterVO {
	
	private String userid;
	private String userpwd;
	private String username;
	//연락처 따로 입력 하는경우 vo는 따로 저장할수 있는 변수 3개 따로 만들어준다.
	private String tel1;
	private String tel2;
	private String tel3;
	
	private String tel; //3개의 번호를 묶어주는 변수 
	//이메일
	private String emailid;
	private String domain;
	
	private String email; // abcd@nate.com
	
	private String zipcode;
	private String addr;
	private String addrdetail;
	
	private String[] hobby;
	private String hobbyStr;
	
	//로그인 여부 
	private String logStatus="N"; //기본값을n으로 설정해주고 
	

	public String getLogStatus() {
		return logStatus;
	}

	public void setLogStatus(String logStatus) {
		this.logStatus = logStatus;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getTel3() {
		return tel3;
	}

	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}

	public String getTel() {
		tel=tel1+"-"+tel2+"-"+tel3;
		return tel;
	}

	public void setTel(String tel) {//010-1234-5678
		this.tel = tel;
		//전화번호를 -로 분리하여 tel1, tel2, tel3에 대입한다.
		String t[]=tel.split("-");
		tel1=t[0];
		tel2=t[1];
		tel3=t[2];
		
		
		
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getEmail() {
		email=emailid+"@"+domain;
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email!=null) {
		String mail[]=email.split("@");
		emailid= mail[0];
		domain = mail[1];
	}
}
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAddrdetail() {
		return addrdetail;
	}

	public void setAddrdetail(String addrdetail) {
		this.addrdetail = addrdetail;
	}

	public String[] getHobby() {
		return hobby; //배열 requst로 하면 여기에 담김
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
		
		// 배열의 대이터를 문자열로 저장하기
		hobbyStr = "";
		for(String h:hobby) {
			hobbyStr += h+"/"; 
		}
	}

	public String getHobbyStr() {
		return hobbyStr;
	}

	public void setHobbyStr(String hobbyStr) {
		this.hobbyStr = hobbyStr;
		if(hobbyStr!=null) {
		
		//문자열을 배열로 저장
		hobby= hobbyStr.split("/");
		}
	}
	
	

}
