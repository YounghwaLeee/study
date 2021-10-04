package com.bitcamp.myapp.board;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class BoardController {
	BoardDAO dao= new BoardDAO();
	@RequestMapping("/boardList")
	public ModelAndView boardList(PagingVO pVo) { //게시판에서 바로 클릭해서 들어온 상태이기 때문에nowpage1 이된다.
		ModelAndView mav= new ModelAndView();
		
		//총레코드수 dao.totalRecordCount(searchKey,searchWord);할수 있찌만vop에 담으면 쉽게할수있으니깐
		dao.totalRecordCount(pVo);//레코드스랑 총 페이지 가져감
		//addObject->  뷰로 보낼 데이터 값. setViewName-> 뷰의 이름
		//addObject : key와 value를 담아 보낼 수 있는 메서드
		
		mav.addObject("pVo",pVo); //컨트롤러에서view로 보냄.  //
		mav.addObject("list", dao.boardPageSelect(pVo)); //모델and view 넣었으니깐view 페이지에서 바로실행가능
		mav.setViewName("board/boardList");//현재페이지랑 현재패이즈 들어가는 레코드수
		return mav;
	}
	
	//글내용보기
	@RequestMapping("/boardView")				//현재 보고있는 페이지
	public ModelAndView boardView(BoardVO vo, PagingVO pVo) { //vo가 담겨져있다.
		ModelAndView mav = new ModelAndView();
		
		dao.boardSelect(vo);//레코드선택
		mav.addObject("vo",vo);
		mav.addObject("pVo",pVo);
		mav.setViewName("board/boardView");
		
		return mav;
	}
	
	/*@RequestMapping("/reply")
	@ResponseBody
	public List<ReplyVO> reply(ReplyVO vo){
		
	List<ReplyVO> list= new ArrayList<ReplyVO>();		
	list=dao.boardReply(vo);
	
	return list;
	
	
	
	}*/
	//댓글쓰기
	@RequestMapping(value="/replyWrite", method=RequestMethod.POST)
	@ResponseBody
	public int replyWrite(ReplyBoardVO replyVo, HttpSession ses) { //아이디의 값이 있어야 하기 떄문에.
		//댓글작성자를 session 에서 얻어오기 
		replyVo.setUserid((String)ses.getAttribute("logid"));
		return dao.replyInsert(replyVo);
		
		
	}
	
	//댓글목록선택
	@RequestMapping(value="/replyList")
	@ResponseBody
	public List<ReplyBoardVO> replyList(int no){
		return dao.replyListSelect(no);
	}
	
	//댓글 수정 실행
	@RequestMapping(value="/replyEditOk", method=RequestMethod.POST)
	@ResponseBody	
	public int replyEditOk(ReplyBoardVO replyVo, HttpSession ses) {
		replyVo.setUserid((String)ses.getAttribute("logid")); //세션에 저장되어 있는 아이디
		return dao.replyUpdate(replyVo);
	}	
	
	//댓글 삭제
	@RequestMapping("/replyDel")
	@ResponseBody	
	public int replyDel(int num, HttpSession ses) {
		return dao.replyDelete(num,(String)ses.getAttribute("logid"));
	}
	

}

	

