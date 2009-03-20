<%@ page language="java" pageEncoding="UTF-8" import = "java.util.ArrayList" %>
<%@ page import = "com.accounts.models.Co"%>

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
		<script type="text/javascript" src="../js/jquery-1.2.6.js"></script>

		<script type="text/javascript">
		var Mysubmenu=null;
		$(function(){
		Mysubmenu=$("#my_menu").submenu({oneSmOnly:true,speed:500,expandNum:5,savestatus:true});	
		})
		</script>
		
		<script type="text/javascript">
		 							$(document).ready(function() {
            						$("#chaxun").click(function() {
               						$.ajax({
               			     		type: "POST",
               			     		url: "../servlet/CheckDwdmAccountServlet",
               			     		data: "dwdm1="+document.getElementById("inputID").value,
               			     		success: function(result) {
               
               			          	$('#list').append(result);

               			     		 //document.getElementById("list").innerHTML=result;
												}
											});
										});
        							});
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
								<caption  class="geshicolor">输入要查询的单位代码：</caption><br />							
						    <table>
								    <input type="text" id="inputID" value="" /><input id="chaxun" type="button" value="anniu" /><br />
		 							

								
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
							<div id="sanbiao">
							此处出报表<br />
								<table >
								<tr>
								<th>单位代码</th><th>单位名称</th>
								</tr>

								<span id = "list"></span>
								<%  
										ArrayList<Co> list = (ArrayList<Co>)session.getAttribute("allAccountCo");
										
										System.out.println("aaaaaaaaaa4");
			 							for(Co a : list){
										out.println("<tr><th><a  href=\"../servlet/CheckDwdmServlet?dwdm="+a.getDwdm()+"\" >"+a.getDwdm()+"</a></th><th><a  href=\"../servlet/CheckDwdmServlet?dwdm="+a.getDwdm()+"\" >"+a.getDwmc()+"</a></th></tr><br>");	
										}		
								%>	
								
							<!--"<tr><th><a  onclick = &ldquo;new Ajax.Updater('dwdmErr','../servlet/CheckDwdmServlet',{parameters:{ dwdm: $F('dwdm') }})&ldquo; type=&ldquo;text&ldquo; name=&ldquo;dwdm&ldquo; />"-->
								</table>
							
							
							<!--<a href="../servlet/DisplayAccountServlet">Display all account-information!</a>-->
							<% 
									System.out.println("aaaaaaaaaaaaaaa0");
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