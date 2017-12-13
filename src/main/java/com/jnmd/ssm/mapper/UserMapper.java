package com.jnmd.ssm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jnmd.ssm.domain.User;

@Repository
public interface UserMapper {

	public List<User> getUsers();
	public User getUser(int uid);
	public void saveUser(User user);
	
}
