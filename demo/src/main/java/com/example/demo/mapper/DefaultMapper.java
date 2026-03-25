package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.User;

@Mapper
public interface DefaultMapper {
	public List<User> SelectUserList();
}
