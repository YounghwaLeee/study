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
	
	//db����
	public void dbConn() {
		try {
			Context ctx = new InitialContext();//context (ȯ��)���� ���ش�.
			Context envCtx = (Context)ctx.lookup("java:comp/env");
			
			DataSource ds=(DataSource)envCtx.lookup("jdbc/myoracle");//context�� �ִ� name�� ������ 
			con =ds.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//db���� ���� �ʱ�ȭ�۾�
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
