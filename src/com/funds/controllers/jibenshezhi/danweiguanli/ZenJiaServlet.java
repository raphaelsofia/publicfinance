package com.funds.controllers.jibenshezhi.danweiguanli;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.funds.models.jibenshezhi.danweiguangli.*;

public class ZenJiaServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		
		
		String dwdm = request.getParameter("dwdm");
		String dwmc = request.getParameter("dwmc");
		String dwlb = request.getParameter("dwlx");
		String zgcsmc = request.getParameter("zgcsmc");
		String gzqyrq = request.getParameter("gzqyrq");
		String gdzcqyrq = request.getParameter("gdzcqyrq");
		
		
		DanWeiGuanLi dwhz = new DanWeiGuanLi(dwdm,dwmc,dwlb,null,null,null);
		DanWeiGuanLi zgcs = new DanWeiGuanLi(null,null,null,zgcsmc,null,null);
		DanWeiGuanLi qyrq = new DanWeiGuanLi(null,null,null,null,gzqyrq,gdzcqyrq);		
		
		boolean isAdd_dwhz_Success = dwhz.add_dwhz();
		boolean isAdd_zgcs_Success = zgcs.add_zgcs();
		boolean isAdd_qyrq_Success = qyrq.add_qyrq();
				
		if((isAdd_dwhz_Success || isAdd_zgcs_Success || isAdd_qyrq_Success) == false){
			response.sendRedirect("../funds/nook.html");
		}else{
			response.sendRedirect("../servlet/DisplayDanWeiInformationServlet");
		}
		
		
		
	}
}