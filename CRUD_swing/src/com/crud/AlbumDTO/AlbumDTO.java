package com.crud.AlbumDTO;

public class AlbumDTO {
	private int userId;
	private int id;
	private String title;
	

	public AlbumDTO() {
		// TODO Auto-generated constructor stub
	}
	

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "AlbumDTO [userId=" + userId + ", id=" + id + ", title=" + title + "]";
	}


	public AlbumDTO(int userId, int id, String title) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
	}
	

	
}
