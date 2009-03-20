<%@ page language="java" pageEncoding="UTF-8" import="java.util.ArrayList"  %>
<%@ page import="com.budget.models.Kemuleixing"  %>
<%@ page import="com.budget.models.Kemu"  %>
<%@ page import="com.budget.models.Zhaiyao"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
	"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<title>单位三栏执行账</title>
		<link rel="stylesheet" type="text/css" href="../../css/subMenu.css" />
		<link href="../../css/yusuan.css" media="screen" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" type="text/css" href="tableStyle.css" />
		<script type="text/javascript" src="../../js/jquery-1.2.6.js"></script>
		<script type="text/javascript" src="../../js/jquery.subMenu.js"></script>
		<script type="text/javascript" src="../../js/jquery.cookie.js"></script>
		<script type="text/javascript">
		var Mysubmenu=null;
		$(function(){
		Mysubmenu=$("#my_menu").submenu({oneSmOnly:true,speed:500,expandNum:5,savestatus:true});	
		})
		</script>
	</head>
	<body>
        <!--主标题-->
		<div id="maintitle">
			<div class="zuobiaoti" id="tupian">
				<img src="../../pic/images/yusuan.gif" />
			</div>
			<div class="zuobiaoti" id="dabiaoti">
				<p>公共财政</p>
			</div>
			<div class="zuobiaoti" id="fubiaoti">
				<!-- 输入自己子系统的名称-->
				<p>—预算管理系统</p>
			</div>
			<div id="system"><a>退出 |</a><a>重新登陆|</a><a>关于</a></div>
		</div>
		
		<!--内容-->
		<div id="zhukuai">
			<!-- 菜单 -->
			<%@ include file="../mp-head.jsp" %>
			<!-- 主要内容 -->
			<div id="neirong" class="pingpu">
				<div id="neirongbiaoti">
					<h2>执行明细帐查询——单位三栏执行账</h2><hr />
				</div>
				<div class="zhuti">					
					<div class="biaofenkuai"id="zhubiao">
						<div id="yibiao">
							<form method="get" action="">	
								<caption  class="geshicolor">指标期</caption><br />							
							    <caption>年度指标</caption><br />
							    <caption>季度指标</caption><br />
							    <select name="jiduzhibiao" id="jidu">
							    	<option>1</option>
							    	<option>2</option>
							    </select><br />
							    <caption>月度指标<br /></caption><br />
							    <select name="yueduzhibiao">
							    	<option>1</option>
							    	<option>2</option>
							    </select>
							<br />
							
								<caption>科目类型</caption><br />
								<select name="lxbh" id="kmlx" size="6">
									<%  
										ArrayList<Kemuleixing> list1 = (ArrayList<Kemuleixing>)session.getAttribute("allKmlxInf");
										for(Kemuleixing a : list1){
											out.println("<option value="+a.getLxbh()+"><tr><td>"+a.getLxbh()+"</td><td>"+a.getLxmc()+"</td></tr></option>");	
										}		
									%>
								</select><br />
								<caption>科目</caption><br />
								<select name="kmdm" id="km" size="8">	
									<%  
										ArrayList<Kemu> list2 = (ArrayList<Kemu>)session.getAttribute("allKmInf");
										for(Kemu a : list2){
											out.println("<option value="+a.getKmdm()+"><tr><td>"+a.getKmdm()+"</td><td>"+a.getKmmc()+"</td></tr></option>");	
										}		
									%>
								</select><br />
								<caption>摘要</caption><br />
								<select name="zybh" id="zy" size="4">	
									<%  
										ArrayList<Zhaiyao> list3 = (ArrayList<Zhaiyao>)session.getAttribute("allZyInf");
										for(Zhaiyao a : list3){
											out.println("<option value="+a.getZybh()+"><tr><td>"+a.getZybh()+"</td><td>"+a.getZymc()+"</td></tr></option>");	
										}		
									%>
								</select><br />
								<input value="确认" type="button" id="chaxun">&nbsp;
								<input value="退出" type="button">
							</form>	
							<script type="text/javascript">
						 		$(document).ready(function() {
						 			
				            		$("#chaxun").click(function() {
				               			$.ajax({
				               				type: "get",
				               			    url: "../../executeselect/danweisanlan/select",
				               			    data:"{name:}",
				               			    success: function(data) {
				               			    	$('#erbiao').empty();
				               			    	$('#erbiao').hide();
				               			    	$('#erbiao').append(data);
				               			    	$('#erbiao').show('slow');
				               			    	
				               			    		
											}
										});
									});
				        		});
		 					</script>
						</div>
					</div>
					<div class="biaofenkuai "id="fubiao">
						<div id="erbiao">
							此处出报表
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--页脚-->
		<div id="end">
			2009 crosscloud 
		</div>
	</body>
</html>