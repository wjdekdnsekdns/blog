package com.tenco.blog.controller;

import com.tenco.blog.service.AService;

public class AController {
	private AService aService;
	public AController() {
		aService = new AService();
	}
	public String select(String msg) {
		String amsg =  aService.select(msg);
		return amsg;
		
	}
}
