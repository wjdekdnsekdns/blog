package com.tenco.myblog.controller;

import com.tenco.myblog.DTO.BlogDto;
import com.tenco.myblog.Service.BlogService;

public class BlogController {

	private BlogService blogService;
	public BlogController() {
		blogService = new BlogService();
	}
	// 외부에서 오는 요청을 담당 하는 녀석
	public BlogDto requestBoardContentById(int id) {
		BlogDto responsDto =  blogService.selectByBoardId(id);
		return responsDto;
	}
	
	// 하나의 게시글 삭제하기
	public int requestDeleteBoardBuId(int boarId, int userId) {
		int responseRow = blogService.deleteBoardById(boarId, userId);
		return responseRow;
	}
}
