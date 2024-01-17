package com.fulara.blogApp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import com.fulara.blogApp.payloads.UserDto;
import com.fulara.blogApp.repositories.UserRepo;
import com.fulara.blogApp.services.UserService;

public class UserServiceimpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto createUser(UserDto user) {
		User user = this.dtoToUser(userDto);
		
//		this.userRepo = 
		return null;
	}

	@Override
	public UserDto upaUser(UserDto userDto, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}
	
	private User dtoToUser(UserDto user) {
		User user = new User();
		Object userDto;
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());
		return user;
	}
	public UserDto userDto(User user) {
		UserDto userDto= new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAbout(user.getAbout());
	}

}
