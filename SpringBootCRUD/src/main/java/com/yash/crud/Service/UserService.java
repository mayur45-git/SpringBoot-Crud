package com.yash.crud.Service;

import java.util.List;

import com.yash.crud.Model.User;

public interface UserService {

	public	List<User> getUser();

	public User addUser(User u);

	public String deleteUser(int uid);

	public User updateUser(User u, int uid);

	public User getSingleUser(int uid);

}
