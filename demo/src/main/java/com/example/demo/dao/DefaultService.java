package com.example.demo.dao;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Autowired
public class DefaultService {
	
	public HashMap<String,Object>getUserList(){
		
		defaultMapper.selectUsserList();
		return null;
	}
	
}
