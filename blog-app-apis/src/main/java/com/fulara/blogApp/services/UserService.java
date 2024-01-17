package com.fulara.blogApp.services;

import java.util.List;

import com.fulara.blogApp.payloads.UserDto;

public interface UserService {

	
	UserDto createUser(UserDto user);
	
	UserDto upaUser(UserDto userDto,Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);


}
