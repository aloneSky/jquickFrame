package com.quickwork.main.sys.user.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
	
	public List<Map<String,Object>> find();
}
