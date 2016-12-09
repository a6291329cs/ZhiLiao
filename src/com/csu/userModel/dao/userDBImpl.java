package com.csu.userModel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.csu.util.DBUtil;

public class userDBImpl implements userDB{
	private Connection conn;
	private PreparedStatement ps;  
	private ResultSet rs;
	DBUtil db=new DBUtil();
	public boolean isExist(userBean ub) {
		String username = ub.getUserName();
		String pwd = ub.getPassWord();
		boolean b = false;
		String sql="select * from user WHERE userId=? or userName=? and passWord=?";
		try {
			conn = new DBUtil().getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);//1代表你sql语句中的第一个问号，name是你要传得参数比如你要删除 id为1的信息ps.setString(1, “1”);
			ps.setString(2, pwd);
			rs = ps.executeQuery();
			while(rs.next()){
				b=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//查询,需调用者关闭连接
			db.close(conn, ps, rs);
		}
		return b;
	}

	@Override
	public boolean add(userBean user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(userBean user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public userBean QueryById(userBean userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
