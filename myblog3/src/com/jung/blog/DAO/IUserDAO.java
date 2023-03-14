package com.jung.blog.DAO;

import com.jung.blog.DTO.UserDTO;

public interface IUserDAO {
	int saveUser(UserDTO user);
	UserDTO selectUserByUsernameAndPassword(String username, String password);
}
