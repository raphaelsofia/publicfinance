package com.accounts.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.accounts.models.*;

public class CheckDwdmAccountServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, 
						HttpServletResponse response) 
						throws IOException, ServletException{

		String dwdm1 = request.getParameter("dwdm1");
		System.out.println("2222222"+dwdm1);
		// 2. send data to model 

		Co acc1 = new Co(dwdm1);
		
		ArrayList<Co> accounts = acc1.returnAllInfo();
		//变量数组
		// Session Space


			String chuan = "";
			for(Co a:accounts){
				 chuan=chuan+("<tr><th><a  href=\"../servlet/CheckDwdmServlet?dwdm="+a.getDwdm()+"\" >"+a.getDwdm()+"</a></th>----<th><a  href=\"../servlet/CheckDwdmServlet?dwdm="+a.getDwdm()+"\" >"+a.getDwmc()+"</a></th></tr><br>");
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

