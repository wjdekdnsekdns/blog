package User.UserDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import User.DBHelper.DBHelper;
import User.UserDTO.UserDto;

public class UserDao implements IUserDao{

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet rs;
	public UserDao() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	
	@Override
	public int userInsert(UserDto dto) {
		String qurey = " INSERT INTO user(id, name, age) "
				+ " VALUES (?,?,?) ";
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(qurey);
			pstmt.setInt(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getAge());
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(">> saveUser함수에서 오류 발생 <<");
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public int userDelete(UserDto dto) {
		String qurey =" DELETE "
				+ " FROM user "
				+ " WHERE id = ? AND name = ? ";
		int resultRow = 0;
		try {
			pstmt = conn.prepareStatement(qurey);
			pstmt.setInt(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultRow;
		
	}

	@Override
	public ArrayList<UserDto> userResive( ) {
		ArrayList<UserDto> list = new ArrayList<UserDto>();
		
		System.out.println(list);
		try {
			stmt = conn.createStatement();
			String qurey =" SELECT * FROM user ";
			rs = stmt.executeQuery(qurey);
			while(rs.next()) {
				list.add(new UserDto(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

	
}
