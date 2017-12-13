package com.jnmd.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.omg.CORBA.UserException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.ssm.domain.User;
import com.jnmd.ssm.mapper.UserMapper;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class UserService {
	
	@Resource
	private UserMapper userMapper;

	@Transactional(propagation=Propagation.SUPPORTS)
	public List<User> getUsers() {

		return userMapper.getUsers();
	}
	
	@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
	public User getUser(int uid) {
		
		return userMapper.getUser(uid);
	}

	@Transactional(rollbackFor=UserException.class)
	public void saveUser(User user) {
		userMapper.saveUser(user);
		System.out.println("Service user = " + user);
	}

}
