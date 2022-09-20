package com.yash.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.crud.Model.User;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, Integer>
{
	
}
