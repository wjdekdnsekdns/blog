package User.UserService;

import User.UserDAO.UserDao;
import User.UserDTO.UserDto;

public class UserService {
	private UserDao userDao;

	public UserService() {
		userDao = new UserDao();
	}
	
	public String signUp(UserDto dto) {
		String msg = "";
		if(dto.getName().equals("")) {
			msg = "이름을 입력하세요";
		}else {
			int resultRow = userDao.userInsert(dto);
			return resultRow + "";
		}
		return msg;
		
	}

}
