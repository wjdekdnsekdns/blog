package User.UserController;

import User.UserDTO.UserDto;
import User.UserService.UserService;

public class UserController {

	UserService userService;
	
	public UserController() {
		userService = new UserService();
	}
	
	public String requestSignUp(UserDto dto) {
		String response = "아이디를 다시 입력하세요";
		if(dto.getId() != 0) {
			response = userService.signUp(dto);
		}
		return response;
		
	}
}
