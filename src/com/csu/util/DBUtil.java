package com.csu.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	     
	     public  void close(Connection conn,PreparedStatement pstat,ResultSet rs){
	 		try {
	 			if(conn!=null) conn.close();
	 			if(pstat!=null) pstat.close();
	 			if(rs!=null) rs.close();
	 		} catch (SQLException e) {
	 		}
	     }
}

