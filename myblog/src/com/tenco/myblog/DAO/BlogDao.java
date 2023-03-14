package com.tenco.myblog.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.myblog.DTO.BlogDto;
import com.tenco.myblog.utils.DBHelper;


public class BlogDao implements IBlogDao{

	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Connection conn;
	
	public BlogDao() {
		conn = DBHelper.getInstance().getConnection();
	}
	@Override
	public void select() {

	}

	@Override
	public BlogDto select(int id) {
		BlogDto blogDto = null;
		String query = " SELECT * FROM board "
				+ " WHERE id = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				blogDto = new BlogDto();
				
				blogDto.setId(rs.getInt("id"));
				blogDto.setTitle(rs.getString("title"));
				blogDto.setContent(rs.getString("content"));
				blogDto.setReadCount(rs.getInt("readCount"));
				blogDto.setUserId(rs.getInt("userId"));
			}
			
			
		} catch (SQLException e) {
			System.out.println(" >> BlogDao select (int Id) 에러 발생 <<");
			e.printStackTrace();
		}
		return blogDto;
		
	}

	@Override
	public int delete(int boardId) {
		int resultRow = 0;
		String sql = " DELETE FROM board "
				+ " WhERE id = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardId);
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(" >> delete 에러 발생 << ");
			e.printStackTrace();
		}
		return resultRow;
	}

}
