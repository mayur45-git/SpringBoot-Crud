package com.yash.crud.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.yash.crud.Model.User;
import com.yash.crud.Repository.Repository;
import com.yash.crud.Service.UserService;

@Service
public class UserServicempl implements UserService{
	
	@Autowired
	Repository ur;

	@Override
	public List<User> getUser() {
		
		return ur.findAll();
		
	}

	@Override
	public User addUser(User u) {
		
		return ur.save(u);
		
	}

	@Override
	public String deleteUser(int uid) {
		
		 ur.deleteById(uid);
		 return "Deletion Succesfull";
		
	}

	@Override
	public User updateUser(User u, int uid) {
		
		u.setUid(uid);
		return ur.save(u) ;
		
	}

	@Override
	public User getSingleUser(int uid) {
		
		Optional<User> op=ur.findById(uid);
		if(op.isPresent())
		{
			User u=op.get();
			return u;
		}
		else
		{
			throw new ArithmeticException("Recordd not found...");
		}
	}
	
	

}
