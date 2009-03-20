package com.funds.controllers.jibenshezhi.danweiguanli;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.funds.models.jibenshezhi.danweiguangli.DanWeiGuanLi;

public class DisplayDanWeiInformationServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, 
						HttpServletResponse response) 
						throws IOException, ServletException{
		
		DanWeiGuanLi danWeiGuanLi = new DanWeiGuanLi();
		ArrayList<DanWeiGuanLi> allUnits= danWeiGuanLi.returnAllInfo();
		
		HttpSession session = request.getSession();
		
		session.setAttribute("allUnitInfo", allUnits);
			
		if(allUnits == null){
			response.sendRedirect("../funds/nook.html");
		}else{
			response.sendRedirect("../funds/danweiguanli.jsp");
		}
							
							
	}
	
	
}







