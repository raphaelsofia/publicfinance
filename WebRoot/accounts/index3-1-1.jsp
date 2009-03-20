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
		Mysubmenu=$("#my_menu").submenu({oneSmOnly:false,speed:500,expandNum:5,savestatus:true});	
		})
		</script>
		
		
	</head>
	<body id="dispalyallaccount" onload="">
        <!--主标题-->
		
			<%@ include file="mp-head.jsp" %>

		
		<!--内容-->
		<div id="zhukuai">
			<!-- 菜单 -->
			
						   
			<%@ include file="mp-menu.jsp" %>
			
			<!-- 主要内容 -->
			<div id="neirong" class="pingpu">
				<div id="neirongbiaoti">
					<h2>指标明细帐查询——单位指标帐</h2><hr />
				</div>
				<div class="zhuti">					
					<div class="biaofenkuai"id="zhubiao">
						<div id="yibiao">
								<caption  class="geshicolor">指标期</caption><br />							
						    <table>
								    <input type="radio" name="zhibiaoqi" id="" />年度指标<br />
								    <input type="radio" name="zhibiaoqi" id="" />季度指标<br />
								    <input type=text  /><br />
								    <input type="radio" name="zhibiaoqi" id="" />月度指标<br />
								    <input type=text  /><br />
						    </table>
							<table>
								<caption>主管处室</caption>
								<tr>
									<td class="geshicolor">处室代码</td>
									<td class="geshicolor">处室名称</td>
								</tr>
								<tr>
									<td>01</td>
									<td>预算处</td>
								</tr>
								<tr>
									<td>02</td>
									<td></td>
								</tr>
							</table>
							<table>
								<caption>预算单位</caption>
								<tr>
									<td class="geshicolor">单位编号</td>
									<td class="geshicolor">单位名称</td>
								</tr>
								<tr>
									<td>101</td>
									<td>县委办</td>
								</tr>
								<tr>
									<td>116</td>
									<td>卫生所</td>
								</tr>
							</table>
						</div>
					</div>
					<div class="biaofenkuai "id="fubiao">
						<div id="erbiao">
							<table>
								<caption>科目类型</caption>
								<tr>
									 <td class="geshi">科目类型</td>
								</tr>
								<tr>
									 <td>科目1</td>
								</tr>
							</table>
							
							
							
							<table>
								<caption>科目</caption>
								<tr>
									<td class="geshicolor">科目代码</td><td class="geshi">科目名称</td>
								</tr>
								<tr>
									<td>&nbsp;</td><td>&nbsp;</td>
								</tr>
								</table>
							<table>
								<caption>摘要</caption>
								<tr>
									<td class="geshicolor">摘要代码</td><td class="geshi">摘要名称</td>
								</tr>
								<tr>
									<td>&nbsp;</td><td>&nbsp;</td>
								</tr>
							</table>
						</div>
						<div id="anniu">
							<input value="确认" type="button">&nbsp;
							<input value="退出" type="button">
						</div>
						<div id="sanbiao">
							此处出报表

							<table>
								<tr><th>Username</th><th>Password</th></tr>
		 						
		 						<%
		 								 							ArrayList<Acc> list = (ArrayList<Acc>)session.getAttribute("allAccountInfo");
		 								 													
		 								 													System.out.println("aaaaaaaaaa4");
		 								 								 							for(Acc a : list){
		 								 													out.println("<tr><td>"+a.getDwdm()+"</td><td>"+a.getKmdm()+"</td></tr>");	
		 								 													}
		 								 						%>			
			
							 </table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--页脚-->
		<%@ include file="mp-bottom.jsp" %>
	</body>
</html>