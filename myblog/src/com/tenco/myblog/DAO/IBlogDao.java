package com.tenco.myblog.DAO;

import com.tenco.myblog.DTO.BlogDto;

public interface IBlogDao {
	
	void select(); // 전체 조회 
	BlogDto select(int id); // id 기반으로 조회
	int delete(int boardId);
}
