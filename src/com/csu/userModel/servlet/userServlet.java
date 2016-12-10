package com.csu.userModel.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.csu.userModel.service.serviceFactory;
import com.csu.userModel.service.userForm;
import com.csu.userModel.service.userService;



public class userServlet extends HttpServlet {
	
	private userService usi=serviceFactory.getUserService();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
              doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//请求为中文时不会乱码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;Charset=utf-8");
		String action = request.getParameter("action");
		System.out.println("action="+action);
		System.out.println("xiugai");
		if(action==null||"".equals(action))
		{
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}else if("login".equals(action))
		{  
			Login(request, response);//当action为login时，调用managerLogin()方法验证用户身份
	     }
	     }
	
	
		private void Login(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PrintWriter out = response.getWriter();
			userForm uf= new userForm();
			uf.setUserName(request.getParameter("username"));
			uf.setPassWord(request.getParameter("password"));
			
			boolean ret = usi.isExist(uf);
			if(ret)
			{
				/***将登陆到系统的用户名保存到session中***/
				HttpSession session = request.getSession();
			    session.setAttribute("user", uf.getUserName());
				/*******转到系统主界面******/
				request.getRequestDispatcher("shouye.jsp").forward(request, response);
			}else
			{
				/*******转到错误提示界面******/
				out.println("<script>alert('您输入的用户登录号，名称或密码错误！');</script>");
				response.setHeader("refresh","0;url=login.do");
				request.getRequestDispatcher("error1.jsp").forward(request, response);
			}
		}
}
