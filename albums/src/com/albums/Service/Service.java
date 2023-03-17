package com.albums.Service;

import com.albums.AlbumDAO.AlbumDAO;
import com.albums.AlbumDTO.AlbumDTO;

public class Service {
	private AlbumDAO dao;
	
	public Service() {
		dao = new AlbumDAO();
	}
	public String signUp(AlbumDTO dto) {
		String msg = "";
		if(dto.getUserId() == 0 ) {
			msg = "userId를 확인 하세요";	
		}else {
			 int resultRow = dao.save(dto);
				return resultRow + ""; 
		}
		return msg;
	}
}
