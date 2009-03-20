<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.funds.models.jibenshezhi.danweiguangli.chushizhuguan.ChuShiZhuGuan" %>
	
	<span id="zgcs"> <table border="1" width="250" height="300">
				                			<tr><td width="125" align="center" height="20">处室代码</td><td width="125" align="center" height="20">处室名称</td></tr>
				                			<tr><td width="125" align="center" height="20"></td><td width="125" align="center" height="20"></td></tr>
				                			
				                		</table>
	
	<%
		ArrayList<ChuShiZhuGuan> chushizhuguan = (ArrayList<ChuShiZhuGuan>)session.getAttribute("allChuShisInfo");
		for(ChuShiZhuGuan chushizhuguan1 : chushizhuguan){
			out.println("<tr><td width=\"125\" align=\"center\" height=\"20\">"+chushizhuguan1.getZgcsdm()+"</td><td <td width=\"125\" align=\"center\" height=\"20\">"+chushizhuguan1.getZgcsmc()+"</td></tr>");				
		}
	%>
	</span>