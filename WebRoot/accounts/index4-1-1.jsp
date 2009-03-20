<%@ page language="java" pageEncoding="UTF-8" import = "java.util.ArrayList" %>
<%@ page import = "com.accounts.models.Acc"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
	"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<title>公共财账务算管理</title>
		<link rel="stylesheet" type="text/css" href="../css/subMenu.css" />
		<link href="../css/yusuan.css" media="screen" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="../js/jquery-1.2.2.js"></script>
		<script type="text/javascript" src="../js/jquery.subMenu.js"></script>
		<script type="text/javascript" src="../js/jquery.cookie.js"></script>
		<script type="text/javascript">
		var Mysubmenu=null;
		$(function(){
		Mysubmenu=$("#my_menu").submenu({oneSmOnly:true,speed:500,expandNum:5,savestatus:true});	
		})
		</script>
		
		
	</head>
	<body id="dispalyallaccount" onload="">
        <!--主标题-->
		
			<%@ include file="mp-head.jsp" %>

		
		<!--内容-->
		<div id="zhukuai" >
			<!-- 菜单 -->
			
						   
			<%@ include file="mp-menu.jsp" %>
			
			<!-- 主要内容 -->
			<div id="neirong" class="pingpu">
				<div id="neirongbiaoti">
					<h2>指标明细帐查询——单位指标帐</h2><hr />
				</div>
				<div class="zhuti" scroll= 400px >					
					<div class="biaofenkuai"id="zhubiao">
						<div id="yibiao">
								
							<table id="dwdmErr">
								<tr>
								<th>单位代码</th><th>科目代码</th><th>年初余额</th><th>当前余额</th><th>借方初始累计</th><th>贷方初始累计</th><th>贷方初始累计</th><th>借方本期发生额</th>
								<th>贷方本期发生额</th><th>借方累计金额</th><th>贷方累计金额</th><th>月份</th>
								</tr>
		 						<%
		 							ArrayList<Acc> list = (ArrayList<Acc>)session.getAttribute("allAccountInfo");
		 													
		 													System.out.println("aaaaaaaaaa4");
		 								 							for(Acc a : list){
		 													out.println("<tr><td>"+a.getDwdm()+"</td><td>"+a.getKmdm()+"</td><td>"+a.getNcye()+"</td><td>"+a.getYe()+"</td><td>"+a.getJjl_c()+"</td><td>"+a.getDlj_c()+"</td><td>"+a.getJfs()+"</td><td>"+a.getDfs()+"</td><td>"+a.getJlj()+"</td><td>"+a.getDlj()+"</td><td>"+a.getYf()+"</td></tr>");	
		 													}
		 						%>			
			
							 </table>
							
					</div>
				</div>
			</div>
		</div>
		<!--页脚-->
		<%@ include file="mp-bottom.jsp" %>
	</body>
</html>