package com.yash.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.crud.Model.User;
import com.yash.crud.Service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	// http://localhost:9999/api/user

	@Autowired
	UserService us;

	@GetMapping(value = "/getusersdata")
	public List<User> getUser() {

		return us.getUser();
	}

	@GetMapping(value = "/getsingleuserdata/{uid}")
	public User getSingleUser(@PathVariable int uid) {
		return us.getSingleUser(uid);
	}

	@PostMapping("/insertuserdata")
	public User addUser(@RequestBody User u) {
		return us.addUser(u);
	}

	@DeleteMapping("/deleteuserdata/{uid}")
	public String deleteUser(@PathVariable int uid) {
		return us.deleteUser(uid);
	}

	@PutMapping("/updateuserdata/{uid}")
	public User updateUser(@RequestBody User u, @PathVariable int uid) {
		return us.updateUser(u, uid);
	}

}
