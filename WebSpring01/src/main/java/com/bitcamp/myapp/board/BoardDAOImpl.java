package com.bitcamp.myapp.board;

import java.util.List;

public interface BoardDAOImpl {
	
	//총레코드수 (검색어가 있다는 가정하에 ..)
	
	public void totalRecordCount(PagingVO pVo);
	
	//해당 페이지 레코드 선택
	public List<BoardVO> boardPageSelect(PagingVO pVo); 
	
	//글내용보기
	//public BoardVO boardSelect(int no);
	//public BoardVO boardSelect(BoardVO vo);
	public void boardSelect(BoardVO vo);
	
	//댓글쓰기 (글 써졌는지 안써졌는지
	public int replyInsert(ReplyBoardVO replyVo);
	
	//댓글목록									원글 레코드 번호
	public List<ReplyBoardVO> replyListSelect(int no);
	
	//댓글 수정 실행
	public int replyUpdate(ReplyBoardVO replyVo);
	
	//댓글삭제
	
	public int replyDelete(int num, String userid);
}
