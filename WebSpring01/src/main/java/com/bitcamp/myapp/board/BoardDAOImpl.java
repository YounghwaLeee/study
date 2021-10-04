package com.bitcamp.myapp.board;

import java.util.List;

public interface BoardDAOImpl {
	
	//�ѷ��ڵ�� (�˻�� �ִٴ� �����Ͽ� ..)
	
	public void totalRecordCount(PagingVO pVo);
	
	//�ش� ������ ���ڵ� ����
	public List<BoardVO> boardPageSelect(PagingVO pVo); 
	
	//�۳��뺸��
	//public BoardVO boardSelect(int no);
	//public BoardVO boardSelect(BoardVO vo);
	public void boardSelect(BoardVO vo);
	
	//��۾��� (�� �������� �Ƚ�������
	public int replyInsert(ReplyBoardVO replyVo);
	
	//��۸��									���� ���ڵ� ��ȣ
	public List<ReplyBoardVO> replyListSelect(int no);
	
	//��� ���� ����
	public int replyUpdate(ReplyBoardVO replyVo);
	
	//��ۻ���
	
	public int replyDelete(int num, String userid);
}
