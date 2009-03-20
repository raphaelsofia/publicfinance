package com.funds.controllers.zijinzhangluru.controllers;

import java.util.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.funds.models.zijinzhangluru.models.*;

public class AddServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		
				
		String yhmc = request.getParameter("yhmc");
		String dwmc = request.getParameter("dwmc");
		String jje = request.getParameter("jje");
		String dje = request.getParameter("dje");
		String zy = request.getParameter("zy");
		String zjlb = request.getParameter("zjlb");
		String jsfs = request.getParameter("jsfs");
		String djrq = request.getParameter("djrq");
		String pzzh = request.getParameter("pzzh");
		String pzfh = request.getParameter("pzfh");
		String pjh  = request.getParameter("pjh");
		String pjrq = request.getParameter("pjrq");
		
		System.out.println("yhmc:"+yhmc);
		System.out.println("dwmc:"+dwmc);
		System.out.println("jje:"+jje);
		System.out.println("dje:"+dje);
		System.out.println("zjlb:"+zjlb);
		System.out.println("jsfs:"+jsfs);
		System.out.println("djrq:"+djrq);
		System.out.println("pzzh:"+pzzh);
		System.out.println("pzfh:"+pzfh);
		System.out.println("pjh:"+pjh);
		System.out.println("pjrq:"+pjrq);
		Double double1 = new Double(0);

		ZiJinZhangLuRu dwhz1 = new ZiJinZhangLuRu(null,dwmc,double1.parseDouble(jje),double1.parseDouble(dje));
		ZiJinZhangLuRu yh1 = new ZiJinZhangLuRu(yhmc,null,0,0);
		ZiJinZhangLuRu zy1 = new ZiJinZhangLuRu(zy,null,null);
		ZiJinZhangLuRu zjlb1 = new ZiJinZhangLuRu(null,zjlb,null);
		ZiJinZhangLuRu jsfs1 = new ZiJinZhangLuRu(null,null,jsfs);
		ZiJinZhangLuRu pzmx1 = new ZiJinZhangLuRu(djrq,pzzh,pzfh,null,null);
		ZiJinZhangLuRu yhdzd1 = new ZiJinZhangLuRu(null,null,null,pjh,pjrq);
		
		boolean isAdd_dwhz_Success = dwhz1.add_dwhz();
		boolean isAdd_yh_Success = yh1.add_yh();
		boolean isAdd_zy_Success = zy1.add_zy();
		boolean isAdd_zjlb_Success = zjlb1.add_zjlb();
		boolean isAdd_jsfs_Success = jsfs1.add_jsfs();
		boolean isAdd_pzmx_Success = pzmx1.add_pzmx();
		boolean isAdd_yhdzd_Success = yhdzd1.add_yhdzd();
		
		if(isAdd_dwhz_Success & isAdd_zy_Success & isAdd_zjlb_Success & isAdd_jsfs_Success & isAdd_pzmx_Success & isAdd_yhdzd_Success){
			
		}else{
			
		}
		
		
		
	}
	
}