package com.csu.userModel.service;

public class serviceFactory {
      public static userService getUserService(){
    	  return new userServiceImpl();
      }
}
