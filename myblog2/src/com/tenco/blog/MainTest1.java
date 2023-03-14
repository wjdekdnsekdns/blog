package com.tenco.blog;

import com.tenco.blog.controller.AController;
import com.tenco.blog.controller.UserController;
import com.tenco.blog.dto.UserDto;

public class MainTest1 {

	public static void main(String[] args) {
		
		//
		//main -> AC -> AS -> AD
		// 결과 받아보기
		//  " [[ >> " + msg + " << ]]"
//		AController aController = new AController();
//		String msg = aController.select("준내 어려움");
//		System.out.println(msg);
		
		UserController userController = new UserController();
		UserDto response = userController.select(1);
		System.out.println(response);
	}
	
}
