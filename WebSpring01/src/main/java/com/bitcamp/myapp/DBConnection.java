package com.bitcamp.myapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnection {
	protected Connection con =null;
	protected PreparedStatement pstmt= null;
	protected ResultSet rs= null;
	protected String sql= "";
	
	//db연결
	public void dbConn() {
		try {
			Context ctx = new InitialContext();//context (환경)설정 해준다.
			Context envCtx = (Context)ctx.lookup("java:comp/env");
			
			DataSource ds=(DataSource)envCtx.lookup("jdbc/myoracle");//context에 있는 name을 가져옴 
			con =ds.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//db종료 전부 초기화작업
	public void dbClose() {
		
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null)con.close();
			sql="";
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
