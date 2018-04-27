package com.sap.spring.mongo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sap.spring.mongo.dao.UserDao;
import com.sap.spring.mongo.model.User;
import com.sap.spring.mongo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override

	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void insert(User user) {
		userDao.insert(user);
	}

	@Override
	public void insertAll(List<User> users) {
		userDao.insertAll(users);
	}


	@Override
	public void remove(int id) {
		userDao.remove(id);
	}


	@Override
	public List<User> findByPage(User user, Pageable pageable) {
		return userDao.findByPage(user, pageable);
	}


	@Override
	public User getUser(Integer id) {
		return userDao.getUser(id);
	}

}
