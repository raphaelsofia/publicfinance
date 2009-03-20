package com.funds.controllers.jibenshezhi.danweiguanli.zhuguanchushi;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.funds.models.jibenshezhi.danweiguangli.chushizhuguan.ChuShiZhuGuan;

public class ShuaXinServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, 
						HttpServletResponse response) 
						throws IOException, ServletException{

		System.out.println("---->Servlet<----");
		ChuShiZhuGuan chushizhuguan = new ChuShiZhuGuan();
		ArrayList<ChuShiZhuGuan> allChuShis= chushizhuguan.returnAllInfo();
		
		HttpSession session = request.getSession();
		
		session.setAttribute("allChuShisInfo", allChuShis);
		
		if(allChuShis == null){
		response.sendRedirect("../funds/nook.html");
		}else{
		response.sendRedirect("../funds/_shuaxin.jsp");
		}
						
						
		}
}
