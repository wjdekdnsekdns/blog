package com.crud.AlbumDAO;

import com.crud.AlbumDTO.AlbumDTO;

public interface IAlbumDAO {

	int save(AlbumDTO dto);
	void delete(int Id);
	void select(int Id);
}
