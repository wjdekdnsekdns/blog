package com.jung.blog.controller;

import com.jung.blog.DTO.UserDTO;
import com.jung.blog.Service.UserService;

public class UserController {
	UserService userService;

	public UserController() {
		userService = new UserService();
	}

	public String requestSignUp(UserDTO user, String host) {
		String response = "외부에서는 회원 가입이 안됩니다";
		if (host.equals("localhost")) {
			response = userService.signUp(user);
		}
		return response;

	}

	public UserDTO requestsingIn(String username, String password) {
		UserDTO responseUserDto = userService.chekUser(username, password);
		return responseUserDto;
	}
}
