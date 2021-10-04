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
	public ModelAndView boardList(PagingVO pVo) { //�Խ��ǿ��� �ٷ� Ŭ���ؼ� ���� �����̱� ������nowpage1 �̵ȴ�.
		ModelAndView mav= new ModelAndView();
		
		//�ѷ��ڵ�� dao.totalRecordCount(searchKey,searchWord);�Ҽ� ���vop�� ������ �����Ҽ������ϱ�
		dao.totalRecordCount(pVo);//���ڵ彺�� �� ������ ������
		//addObject->  ��� ���� ������ ��. setViewName-> ���� �̸�
		//addObject : key�� value�� ��� ���� �� �ִ� �޼���
		
		mav.addObject("pVo",pVo); //��Ʈ�ѷ�����view�� ����.  //
		mav.addObject("list", dao.boardPageSelect(pVo)); //��and view �־����ϱ�view ���������� �ٷν��డ��
		mav.setViewName("board/boardList");//������������ ���������� ���� ���ڵ��
		return mav;
	}
	
	//�۳��뺸��
	@RequestMapping("/boardView")				//���� �����ִ� ������
	public ModelAndView boardView(BoardVO vo, PagingVO pVo) { //vo�� ������ִ�.
		ModelAndView mav = new ModelAndView();
		
		dao.boardSelect(vo);//���ڵ弱��
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
	//��۾���
	@RequestMapping(value="/replyWrite", method=RequestMethod.POST)
	@ResponseBody
	public int replyWrite(ReplyBoardVO replyVo, HttpSession ses) { //���̵��� ���� �־�� �ϱ� ������.
		//����ۼ��ڸ� session ���� ������ 
		replyVo.setUserid((String)ses.getAttribute("logid"));
		return dao.replyInsert(replyVo);
		
		
	}
	
	//��۸�ϼ���
	@RequestMapping(value="/replyList")
	@ResponseBody
	public List<ReplyBoardVO> replyList(int no){
		return dao.replyListSelect(no);
	}
	
	//��� ���� ����
	@RequestMapping(value="/replyEditOk", method=RequestMethod.POST)
	@ResponseBody	
	public int replyEditOk(ReplyBoardVO replyVo, HttpSession ses) {
		replyVo.setUserid((String)ses.getAttribute("logid")); //���ǿ� ����Ǿ� �ִ� ���̵�
		return dao.replyUpdate(replyVo);
	}	
	
	//��� ����
	@RequestMapping("/replyDel")
	@ResponseBody	
	public int replyDel(int num, HttpSession ses) {
		return dao.replyDelete(num,(String)ses.getAttribute("logid"));
	}
	

}

	

