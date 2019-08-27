package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {

	//根据用户id获取用户数据
	User getUser(Integer id);
	//
	void addScore(Integer id,Integer score);
}
