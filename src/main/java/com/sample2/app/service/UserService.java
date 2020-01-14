package com.sample2.app.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sample2.app.shared.UserDto;

public interface UserService extends UserDetailsService{
	UserDto createUser(UserDto user);
	UserDto getUser(String email);
	UserDto getUserByUserId(String userId);
	UserDto updateUser(String userId, UserDto userDto);
	void deleteUser(String userId);
	List<UserDto> getUsers(int page, int limit);
}
