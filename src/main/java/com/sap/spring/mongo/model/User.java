package com.sap.spring.mongo.model;

import org.springframework.data.annotation.Id;

public class User {
	private static final long serialVersionUID = 1L;

	// id mapping for _id in mongo
	@Id
	private String _id;
	private int id;
	private String name;
	private int age;

	public User(String _id, int id, String name, int age) {
		this._id = _id;
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public User(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString() {
		return "User [_id=" + _id + ", id=" + id + ", name=" + name + ", age=" + age + "]";
	}


}
