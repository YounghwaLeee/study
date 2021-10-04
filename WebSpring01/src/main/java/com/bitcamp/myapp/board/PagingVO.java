package com.bitcamp.myapp.board;

public class PagingVO {
	
	private int totalRecord;//총레코드수 
	private int nowPage=1;// 현재페이지 현재 페이지 정보를 넣어주면 무조건 1page
	private int totalPage; //총페이지수
	private int OnePageRecord=5;//한페이지당 레코드수 (나중에 얘를 10으로 바꿔주면 한페이지에 10개가 찍힌다)
	
	
	//검색어 관련된거 많이 필요함 검색어랑 검색키 저장할곳
	private String searchKey;
	private String searchWord;
	
	//페이지
	private int onePageNumCount=5; //한번에 5페이지씩 보이게 하겠다. 
	private int startPage=1;
	
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		//(총레코드수가 구해지면 총 페이지수를 구하겠금 하겠다)
		this.totalRecord = totalRecord;
		
		//총페이지수 계산할떄는 둘중에 하나 실수로 만들어서 계산해야한다 . 
		totalPage=(int)Math.ceil(totalRecord/(double)OnePageRecord);
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
		if(nowPage!=0) {
			//			현재페이지     한번에 표시할 페이지 수 
			startPage = (nowPage-1)/onePageNumCount*onePageNumCount+1;
			
			//if(nowPage>2){
			// startPage=(nowPage-2);}
		}
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getOnePageRecord() {
		return OnePageRecord;
	}
	public void setOnePageRecord(int onePageRecord) {
		OnePageRecord = onePageRecord;
	}
	
	//검색어
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	public int getOnePageNumCount() {
		return onePageNumCount;
	}
	public void setOnePageNumCount(int onePageNumCount) {
		this.onePageNumCount = onePageNumCount;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	
	
}
