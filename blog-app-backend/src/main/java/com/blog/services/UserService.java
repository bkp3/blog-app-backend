package com.blog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.payloads.UserDto;


public interface UserService {

	UserDto createUser(UserDto user);

	UserDto updateUser(UserDto user, int id);

	UserDto getUserById(int id);

	List<UserDto> getAllUsers();

	void deleteUser(int id);

}
