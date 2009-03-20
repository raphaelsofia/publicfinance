package com.accounts.controllers.danweishezhi.zengjiadanwei;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import javax.servlet.*;
import javax.servlet.http.*;

import com.accounts.models.danweishezhi.zengjiadanwei.DanWeiSheZhi;

public class AddUnitServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		
		
		String dwdm = request.getParameter("dwdm");
		String dwmc = request.getParameter("dwmc");
		String dwlb = request.getParameter("dwlx");
		String zgcs = request.getParameter("zgcs");
		String gzqy = request.getParameter("gzqy");
		String zjqy = request.getParameter("zjqy");
		
		
		DanWeiSheZhi dwxx = new DanWeiSheZhi(dwdm,dwmc);
				
		
		boolean isAdd_dwxx_Success = dwxx.add_dwxx();
		
				
		if((isAdd_dwxx_Success) == false){
			response.sendRedirect("../accounts/nook.html");
		}else{
			response.sendRedirect("../accounts/zjdw.html");
		}
		
		
		
	
		
			
	}
}