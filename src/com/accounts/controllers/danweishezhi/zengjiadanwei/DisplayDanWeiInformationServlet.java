package com.accounts.controllers.danweishezhi.zengjiadanwei;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.accounts.models.danweishezhi.zengjiadanwei.DanWeiSheZhi;

public class DisplayDanWeiInformationServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, 
						HttpServletResponse response) 
						throws IOException, ServletException{
		
		System.out.println("--->Servlet<---");
		
		DanWeiSheZhi danWeiShezhi = new DanWeiSheZhi();
		ArrayList<DanWeiSheZhi> allUnits= danWeiShezhi.returnAllInfo();
		
		System.out.println(allUnits.size() + "----------------------");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("allUnitInfo", allUnits);
			
		if(allUnits == null){
			response.sendRedirect("../accounts/nook.html");
		}else{
			response.sendRedirect("../accounts/zjdw.jsp");
		}
							
							
	}
	
	
}







