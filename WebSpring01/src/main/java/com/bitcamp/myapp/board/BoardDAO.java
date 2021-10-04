package com.bitcamp.myapp.board;

import java.util.ArrayList;
import java.util.List;

import com.bitcamp.myapp.DBConnection;

public class BoardDAO extends DBConnection implements BoardDAOImpl {
	//총 레코드 수 

	@Override
	public void totalRecordCount(PagingVO pVo) { //총레코드수구해서 vo에 담음
		
		try {
			System.out.println(pVo.getSearchKey());
			System.out.println(pVo.getSearchWord());
			dbConn();
			sql="select count(no) from board"; //원래있던 레코드수 구하는 방법 
			//검색어가 있을때 (총레코드수랑 총페이지수 찍히게)
			if(pVo.getSearchWord()!=null && !pVo.getSearchWord().equals("")) {
				sql+= " where "+pVo.getSearchKey()+" like '%"+pVo.getSearchWord()+"%'";
			}
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				pVo.setTotalRecord(rs.getInt(1));//총레코드수구해서 vo에 담음
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}			
	}

	@Override
	public List<BoardVO> boardPageSelect(PagingVO pVo) {
		List<BoardVO> list= new ArrayList<BoardVO>();
		try {
			dbConn();
			System.out.println("sdf");
			sql="select * from "
					+ "(select * from "
					+ "(select no, subject, userid, hit, to_char(writedate, 'MM-DD HH:MM') writedate from board ";
			
					//검색어가 있으면 (제목,글내용,글쓴이)
					if(pVo.getSearchWord()!=null && !pVo.getSearchWord().equals("")) {
						sql+= " where "+pVo.getSearchKey() +" like '%"+pVo.getSearchWord()+"%'";
					}
					
					sql += " order by no desc) "
					+ " where rownum<=? order by no asc) "
					+ " where rownum<=? order by no desc"; //레코드를 몇게 보여줄지?ㅎ
			pstmt = con.prepareStatement(sql);
			

			//한페이지당 레코드수 * 현재페이지 5*1=5/ 5*2=10 
			pstmt.setInt(1, pVo.getOnePageRecord()*pVo.getNowPage()); //5,10,15,20
			//한페이지당 레코드수 (두번째 물음표)
			//남은 레코드수
			int lastPageRecord= pVo.getTotalRecord() % pVo.getOnePageRecord(); //0
			if(pVo.getTotalPage()==pVo.getNowPage() && lastPageRecord!=0) {//마지막페이지 지금 이게 마지막 페이지이다 알아낼수 있는 방법은? 총페이지수랑=현재페이지수 같을때 5의배수일때 나머지가 있을때 0으로 떨어지면 됐다~
				pstmt.setInt(2, lastPageRecord);//1,2,3,4 중에 하나의 레코드가 표시된다. 
				
			}else {//얘는 0으로 떨어지기 때문에 5개의 레코드가 표시된다.즉 마지막 페이지가 아니라는 뜻. 
				pstmt.setInt(2, pVo.getOnePageRecord());//5
				
			}
		
			rs = pstmt.executeQuery();
			
			while(rs.next()) { //5개씩담김
				BoardVO vo= new BoardVO();
				vo.setNo(rs.getInt(1));
				vo.setSubject(rs.getString(2));
				vo.setUserid(rs.getString(3));
				vo.setHit(rs.getInt(4));
				vo.setWritedate(rs.getString(5));
			
				list.add(vo);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			dbClose();
		}
		
		return list;
	}

	@Override
	public void boardSelect(BoardVO vo) {
		
		//return 없으니 변수선언 안해줘도 된다.
		// 글내용보기 하나의 아이디로 내용보는거니깐. 
		try {
			dbConn();
			sql="select no, userid, subject, content, hit, writedate from board where no=?";
			pstmt =con.prepareStatement(sql);
			pstmt.setInt(1, vo.getNo());
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				vo.setNo(rs.getInt(1));
				vo.setUserid(rs.getString(2));
				vo.setSubject(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setHit(rs.getInt(5));
				vo.setWritedate(rs.getString(6));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
	}

	@Override
	public int replyInsert(ReplyBoardVO replyVo) {
		
		int cnt=0;
		try {
			dbConn();
			sql="insert into replyboard(num, userid, coment, no) "
					+ " values(replySq.nextval, ?,?,?)";
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1, replyVo.getUserid());
			pstmt.setString(2, replyVo.getComent());
			pstmt.setInt(3, replyVo.getNo());
			
			cnt=pstmt.executeUpdate();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return cnt;
	}

	@Override //댓글목록 선택
	public List<ReplyBoardVO> replyListSelect(int no) {
		List<ReplyBoardVO> lst = new ArrayList<ReplyBoardVO>();
		
		try {
			dbConn();
			sql="select num, userid, coment, writedate from replyboard "
					+ " where no=?";
			pstmt =con.prepareStatement(sql);
			pstmt.setInt(1,no);	
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				ReplyBoardVO vo= new ReplyBoardVO();
				vo.setNum(rs.getInt(1));
				vo.setUserid(rs.getString(2));
				vo.setComent(rs.getString(3));
				vo.setWritedate(rs.getString(4));
				
				lst.add(vo);
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
		return lst;
	}

	@Override //댓글 수정dao
	public int replyUpdate(ReplyBoardVO replyVo) {
		int cnt=0;
		System.out.println(replyVo.getComent());
		System.out.println(replyVo.getNum());
		System.out.println(replyVo.getUserid());
		try {
			dbConn();
			sql="update replyboard set coment=? where num=? and userid=?";
			
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1, replyVo.getComent());
			pstmt.setInt(2, replyVo.getNum() );
			pstmt.setString(3, replyVo.getUserid());//작성 아이디랑 같은지
			
			cnt=pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			dbClose();
		}
		
		return cnt;
	}

	@Override
	public int replyDelete(int num, String userid) {
		int cnt=0;
		try {
			dbConn();
			sql="delete from replyboard where num=? and userid=?";
			pstmt =con.prepareStatement(sql);
			pstmt.setInt(1,num);	
			pstmt.setString(2,userid);
			
			cnt=pstmt.executeUpdate();
				
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	
		
		return cnt;
	}
}	








	/*public List<ReplyVO> boardReply(ReplyVO vo) {
		
		List<ReplyVO> list= new ArrayList<ReplyVO>();
		try {
			
			dbConn();
			sql="select num, userid, coment, writedate from replyboard where no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, vo.getNo());
			
			rs=pstmt.executeQuery();
			while(rs.next()) {
				vo.setNum(rs.getInt(1));
				vo.setUserid(rs.getString(2));
				vo.setComent(rs.getString(3));
				vo.setWritedate(rs.getString(4));
				
				list.add(vo);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
			return list;
		
	}*/

