<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.budget.models.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'zxzxx.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="tableStyle.css" />
	<script type="text/javascript" src="../../js/jquery-1.2.6.js"></script>
  </head>
  
  <body>
  	<script type="text/javascript">
  		$(document).ready(function(){
  			$('tr:odd').addClass('odd');
  		});
  	</script>
  	 <%
    	ArrayList<Zbtz> zbtz = (ArrayList<Zbtz>)session.getAttribute("zbtz");
     %>
    <table id="xinxibiao">
    	<tr id="biaoti"><td>科目代码</td><td>科目名称</td><td>执行月份</td><td>摘要</td><td>执行金额</td></tr>
    	<%
	 		for(Zbtz p:zbtz){
	 	%>
	 		<tr class="putong"><td><%=p.getKmdm()%></td><td><%=p.getKmmc()%></td><td><%=p.getJhyf()%></td>
	 		<td><%=p.getZymc()%></td><td><%=p.getDje()%></td></tr>	
	 	<%	 					
	 		}	 			
	 	%>
    </table>
  </body>
</html>
