package com.accounts.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.accounts.models.*;

public class DisplayAccountServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, 
						HttpServletResponse response) 
						throws IOException, ServletException{
		//System.out.println("-------into Servlet----");							
		// 1. receive data from browser
		
		
		// 2. send data to model
		//System.out.println("-------Servlet----");
		System.out.println("aaaaaaaaaaaaaaa1");
		Account acc = new Account();
		ArrayList<Account> allAccounts = acc.returnAllInfo();
		
		// Session Space
		HttpSession session = request.getSession();
		
		session.setAttribute("allAccountInfo", allAccounts);
		System.out.println("aaaaaaaaaaaaaaa2");
		// 3. find a view	
		response.sendRedirect("../accounts/ztcx.jsp");
		}
							
							
	}
	
	
