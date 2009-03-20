package com.accounts.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.accounts.models.*;

public class DisplayAccServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, 
						HttpServletResponse response) 
						throws IOException, ServletException{
		//System.out.println("-------into Servlet----");							
		// 1. receive data from browser
		//没有特定的数据需要接收所以不用发送
		
		// 2. send data to model
		//System.out.println("-------Servlet----");
		System.out.println("aaaaaaaaaaaaaaa1");
		Acc acc = new Acc();
		ArrayList<Acc> allAccounts = acc.returnAllInfo();
		//变量数组
		// Session Space
		HttpSession session = request.getSession();
		
		session.setAttribute("allAccountInfo", allAccounts);
		System.out.println("aaaaaaaaaaaaaaa2");
		// 3. find a view	
		if(allAccounts == null){
			response.sendRedirect("../accounts/nook.html");
		}else{
			response.sendRedirect("../accounts/index4-1-1.jsp");
		}
							
							
	}
	
	
}