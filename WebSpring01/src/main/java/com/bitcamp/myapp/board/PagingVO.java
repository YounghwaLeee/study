package com.bitcamp.myapp.board;

public class PagingVO {
	
	private int totalRecord;//�ѷ��ڵ�� 
	private int nowPage=1;// ���������� ���� ������ ������ �־��ָ� ������ 1page
	private int totalPage; //����������
	private int OnePageRecord=5;//���������� ���ڵ�� (���߿� �긦 10���� �ٲ��ָ� ���������� 10���� ������)
	
	
	//�˻��� ���õȰ� ���� �ʿ��� �˻���� �˻�Ű �����Ұ�
	private String searchKey;
	private String searchWord;
	
	//������
	private int onePageNumCount=5; //�ѹ��� 5�������� ���̰� �ϰڴ�. 
	private int startPage=1;
	
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		//(�ѷ��ڵ���� �������� �� ���������� ���ϰڱ� �ϰڴ�)
		this.totalRecord = totalRecord;
		
		//���������� ����ҋ��� ���߿� �ϳ� �Ǽ��� ���� ����ؾ��Ѵ� . 
		totalPage=(int)Math.ceil(totalRecord/(double)OnePageRecord);
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
		if(nowPage!=0) {
			//			����������     �ѹ��� ǥ���� ������ �� 
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
	
	//�˻���
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
