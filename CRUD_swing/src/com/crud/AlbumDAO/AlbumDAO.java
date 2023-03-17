package com.crud.AlbumDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.crud.AlbumDTO.AlbumDTO;
import com.crud.utils.DBHelper;

public class AlbumDAO implements IAlbumDAO{

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	public AlbumDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	
	
	@Override
	public int save(AlbumDTO dto) {
		String qurey = " INSERT INTO user(userId, Id, title) "
				+ " VALUES (?,?,?) ";
		int resultRow = 0;
		try {
			pstmt = conn.prepareStatement(qurey);
			pstmt.setInt(1, dto.getUserId());
			pstmt.setInt(2, dto.getId());
			pstmt.setString(3, dto.getTitle());
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(">> saveUser함수에서 오류 발생 <<");

			e.printStackTrace();
		}
		return resultRow;
		
	}



	@Override
	public void delete(int  Id) {
		
		String query = " DELETE FROM user WHERE id = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(" >> delete 에러 발생 << ");

			e.printStackTrace();
		}
	}



	@Override
	public void select(int Id) {
		String query = " SELECT * FROM user WHERE id = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Id);
			pstmt.executeQuery();
		} catch (Exception e) {
			System.out.println(" >> select 에러 발생 << ");

			e.printStackTrace();
		}
	}

}
