package com.csu.userModel.dao;

public interface userDB {
	public boolean isExist(userBean user);
	public boolean add(userBean user);
	public boolean update(userBean user);
	public userBean QueryById(userBean userId);
}
