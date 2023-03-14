package com.jung.blog.Service;

import com.jung.blog.DAO.UserDAO;
import com.jung.blog.DTO.UserDTO;

public class UserService {
	private UserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}

	public String signUp(UserDTO user) {
		String msg = "";
		if (user.getUsername() == ("")) {
			msg = "사용자의 이름을 확인하세요";
			System.out.println(msg);
		}
		user.setUserRole("USER");
		int resultRow = userDAO.saveUser(user);
		return resultRow + "";
	}
	public UserDTO chekUser(String username, String password) {
		boolean isValid = true;
		if(username.equals("")){
			isValid = false;
		}else if(password.equals("")) {
			isValid = false;
		}
		UserDTO userDTO = null;
		if(isValid) {
			userDTO = userDAO.selectUserByUsernameAndPassword(username, password);
			
		}
		return userDTO;
		
	} 
}
