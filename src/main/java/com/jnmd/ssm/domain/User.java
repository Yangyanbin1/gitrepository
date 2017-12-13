package com.jnmd.ssm.domain;

public class User {

	private int uid;
	private String userName;
	private String password;
	private int age;

	public User() {
		super();
	}

	public User(String userName, String password, int age) {
		super();
		this.userName = userName;
		this.password = password;
		this.age = age;
	}

	public User(int uid, String userName, String password, int age) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.password = password;
		this.age = age;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", password=" + password + ", age=" + age + "]";
	}

}
