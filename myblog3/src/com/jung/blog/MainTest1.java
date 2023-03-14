package com.jung.blog;

import com.jung.blog.DTO.UserDTO;
import com.jung.blog.controller.UserController;

public class MainTest1 {
	public static void main(String[] args) {

		UserDTO userDTO = new UserDTO("김덕배", "3698", "ABC@naver.com", "부산");

		UserController userController = new UserController();
		String result = userController.requestSignUp(userDTO, "localhost");
		System.out.println(result);

		
		UserDTO responseUser = userController.requestsingIn(userDTO.getUsername(), userDTO.getPassword());
		if(responseUser == null) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
		}
			
		
	}
}
