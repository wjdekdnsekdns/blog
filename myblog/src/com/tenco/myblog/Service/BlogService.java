package com.tenco.myblog.Service;

import com.tenco.myblog.DAO.BlogDao;
import com.tenco.myblog.DTO.BlogDto;

public class BlogService {
	private BlogDao blogDao;

	public BlogService() {
		blogDao = new BlogDao();
	}

	// 하나의 계시글 찾는 로직 만들기
	public BlogDto selectByBoardId(int id) {
		BlogDto resultDto = blogDao.select(id);

		return resultDto;

	}

	public int deleteBoardById(int boardId, int userId) {

		int resultRow = 0;
		// 검증 userId 값과
		// board 테이블에 있는 작성자에 userId 값이 같은지 확인
		BlogDto blogDto = selectByBoardId(boardId);
		if (blogDto != null) {
			int blogWriteId = blogDto.getUserId();
			if (blogWriteId == userId) {
				// 삭제 요청 처리
				resultRow = blogDao.delete(boardId);
			}
		}
		return resultRow;
	}
}
