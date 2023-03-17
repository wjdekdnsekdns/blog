package User;

import User.UserController.UserController;
import User.UserDTO.UserDto;

public class MainTest {

	public static void main(String[] args) {
		UserDto userDto = new UserDto(1, "정다운", 26);
		UserController userController = new UserController();
		String result = userController.requestSignUp(userDto);
		System.out.println(result);

	}

}
