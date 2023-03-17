package com.albums.AlbumDAO;

import com.albums.AlbumDTO.AlbumDTO;

public interface IAlbumDAO {

	int save(AlbumDTO dto);
	void delete(int Id);
	void select(int Id);
}
