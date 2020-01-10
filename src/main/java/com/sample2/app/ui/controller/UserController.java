package com.sample2.app.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample2.app.service.UserService;
import com.sample2.app.shared.UserDto;
import com.sample2.app.ui.model.request.UserDetailsRequestModel;
import com.sample2.app.ui.model.response.UserRest;

@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails)
	{
		
		UserRest returnValue = new UserRest();
		
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userDetails, userDto);
		
		UserDto createdUser = userService.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);
		
		return returnValue;
	}
	
	@GetMapping(path="/{id}")
	public UserRest getUser(@PathVariable String id)
	{
		UserDto userDto = userService.getUserByUserId(id);
		
		UserRest returnValue = new UserRest();
		BeanUtils.copyProperties(userDto, returnValue);
		
		return returnValue;
	}
	
	@PutMapping
	public String updateUser()
	{
		return "updateUser was called";
	}
	
	@DeleteMapping
	public String deleteUser()
	{
		return "deleteUser was called";
	}
	
}
