package com.sap.spring.mongo.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.sap.spring.mongo.model.User;

public interface UserService {

	void remove(int id);

	void insert(User user);

	void insertAll(List<User> list);

	List<User> findAll();

	List<User> findByPage(User user, Pageable pageable);

	void update(User user);

	User getUser(Integer id);

}
