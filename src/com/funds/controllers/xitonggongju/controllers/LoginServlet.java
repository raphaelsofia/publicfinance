package com.funds.controllers.xitonggongju.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.funds.models.xitonggongju.*;

public class LoginServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, 
						HttpServletResponse response) 
						throws IOException, ServletException{
								

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		

		Account acc = new Account(username, password);
		boolean isLoginSuccess = acc.signIn();
		
		System.out.println("-->acc.signIn()="+acc.signIn()+"<---");

		if(isLoginSuccess){
			response.sendRedirect("../zijinzhangluru.html");
		}else{
			response.sendRedirect("../nook.html");
		}
							
							
	}
	
	
}

