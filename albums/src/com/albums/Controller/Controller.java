package com.albums.Controller;

import com.albums.AlbumDTO.AlbumDTO;
import com.albums.Service.Service;

public class Controller {
	
	Service service;
	
	public Controller() {
		service = new Service();
	}
	
	public String requestSignUp(AlbumDTO dto) {
		String response = "제목이 너무 깁니다";
		if(dto.getTitle().length() < 10000000) {
			response = service.signUp(dto);
		}
		return response;
	}
}
