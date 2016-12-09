package com.csu.userModel.service;

public interface userService {
     public boolean  isExist(userForm user);
     public boolean  add(userForm user);
     public boolean  updata(userForm user);
     public userForm QueryById(String userId);
}
