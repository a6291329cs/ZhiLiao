package com.csu.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
	     private Connection conn;
	     public Connection getConn(){
	    	 try {
				Class.forName("com.mysql.jdbc.Driver");
				 String Url="jdbc:mysql://localhost/zh";
		    	 String username="root";
		    	 String password="root";
		    	 
		    	 conn=DriverManager.getConnection(Url,username,password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}
	    	return conn;
	     }
  }

