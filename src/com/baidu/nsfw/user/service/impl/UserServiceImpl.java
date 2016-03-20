package com.baidu.nsfw.user.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.baidu.nsfw.user.dao.UserDao;
import com.baidu.nsfw.user.entity.User;
import com.baidu.nsfw.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	@Override
	public void save(User user) {
		userDao.save(user);	
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(Serializable id) {
		userDao.delete(id);
	}

	@Override
	public User findObjectById(Serializable id) {
		return userDao.findObjectById(id);
	}

	@Override
	public List<User> findObjects() {
		return userDao.findObjects();
	}

	
	
}
