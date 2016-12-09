package com.csu.userModel.dao;

public class daoFactory {
     public static userDB getUserDB(){
    	 userDB us=new userDBImpl();
    	 return us;
     }
}
