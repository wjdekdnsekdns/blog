package User.UserDAO;

import java.util.ArrayList;

import User.UserDTO.UserDto;

public interface IUserDao {

	int userInsert(UserDto dto);
	int userDelete(UserDto dto);
	ArrayList<UserDto> userResive( );
}
