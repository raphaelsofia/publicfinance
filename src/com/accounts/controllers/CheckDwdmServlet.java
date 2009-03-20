package com.accounts.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.accounts.models.*;

public class CheckDwdmServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, 
						HttpServletResponse response) 
						throws IOException, ServletException{
		System.out.println("111111111");	
							
		// 1. receive data from browser
		String dwdm = request.getParameter("dwdm");
		System.out.println("2222222"+dwdm);
		// 2. send data to model 

		Acc acc = new Acc(dwdm);
		
		ArrayList<Acc> allAccounts = acc.returnAllInfo();
		//变量数组
		// Session Space
		HttpSession session = request.getSession();
		
		
		session.setAttribute("allAccountInfo", allAccounts);
		
		System.out.println("aaaaaaaaaaaaaaa2");
		// 3. find a view	
		if(allAccounts == null){
			response.sendRedirect("../nook.html");
		}else{
			response.sendRedirect("../accounts/index4-1-1.jsp");
		}	
		
		
		String dwdm1 = request.getParameter("dwdm1");
		System.out.println("2222222"+dwdm1);
		// 2. send data to model 

		Co acc1 = new Co(dwdm1);
		
		ArrayList<Co> accounts = acc1.returnAllInfo();
		//变量数组
		// Session Space


			String chuan = null;
			for(Co a:accounts){
				 chuan=chuan+("<tr><th><a  href=\"../servlet/CheckDwdmServlet?dwdm="+a.getDwdm()+"\" >"+a.getDwdm()+"</a></th><th><a  href=\"../servlet/CheckDwdmServlet?dwdm="+a.getDwdm()+"\" >"+a.getDwmc()+"</a></th></tr><br>");
			}
			//chuan+="</user>";
			
			System.out.println("chuan->"+chuan);
			
			response.getWriter().println(chuan);
			
					
							
	}
	
	public void doGet(HttpServletRequest request, 
						HttpServletResponse response) 
						throws IOException, ServletException{
							
		doPost(request, response);
	}
	
	
	
	
}

