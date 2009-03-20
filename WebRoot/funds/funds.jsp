<%@ page language="java" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
	"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<title>公共财政资金管理</title>
		<link rel="stylesheet" type="text/css" href="../css/subMenu.css" />
		<script type="text/javascript" src="../js/jquery-1.2.2.js"></script>
		<script type="text/javascript" src="../js/jquery.subMenu.js"></script>
		<script type="text/javascript" src="../js/jquery.cookie.js"></script>
		<script type="text/javascript">
		var Mysubmenu=null;
		$(function(){
		Mysubmenu=$("#my_menu").submenu({oneSmOnly:false,speed:500,expandNum:5,savestatus:true});	
		})
		</script>
		<link href="../css/yusuan.css" media="screen" rel="Stylesheet" type="text/css" />
		<link href="../css/funds/richangchuli/link.css" media="screen" rel="Stylesheet" type="text/css" />
		<style type="text/css">
			<!--
				.over {color:yellow; background: navy}
				.down {color:yellow; background: navy; font-style: italic}
			-->
		</style>
	</head>
	<body>
        <!--主标题-->
		<div id="maintitle">
			<div class="zuobiaoti" id="tupian">
				<img src="../pic/images/yusuan.gif" />
			</div>
			<div class="zuobiaoti" id="dabiaoti">
				<p>公共财政</p>
			</div>
			<div class="zuobiaoti" id="fubiaoti">
				<!-- 输入自己子系统的名称-->
				<p>—资金管理系统</p>
			</div>
			<div id="system"><a>退出 |</a><a>重新登陆|</a><a>关于</a></div>
		</div>
		
		<!--内容-->
		<div id="zhukuai">
			<!-- 菜单 -->
			<div class="pingpu" id="caidan">		
				<table class="zhuti" style="width: 100%">
					<tr>
						<div style="float: left" id="my_menu">
						      <div>
						        <span>日常处理</span>
							        <a href="zijinzhangluru.jsp">资金帐录入</a>
							        <a href="">资金帐审核</a>
							        <a href="">内部转账录入</a>
							        <a href="">内部转账审核</a>
							        <a href="">银行间转账登记</a>
							        <a href="">银行间转账审核</a>
						      </div>
						      <div>
						        <span>对账处理</span>
									<a href="">银行对账单录入</a>
							        <a href="">数据格式</a>
							        <a href="">与银行对账-勾销</a>
							        <a href="">与银行对账-反勾销</a>
							        <a href="">与帐务系统对账-勾销</a>
							        <a href="">与帐务系统对账-反勾销</a>
							        <a href="">余额调节表</a>
						      </div>
						      <div>
						        <span>基本设置</span>
						        	<a href="../servlet/DisplayDanWeiInformationServlet">单位管理</a>
						        	<a href="">用户管理</a>
						        	<a href="">透支与审核设置</a>
						        	<a href="">银行帐号设置</a>
						        	<a href="">结算方式设置</a>
						        	<a href="">资金类别设置</a>
						        	<a href="">摘要设置</a>
						      </div>
						      <div>
						        <span>系统操作</span>
									<a href="">日结</a>
							        <a href="">月结</a>
							        <a href="">资金单位启用</a>
						      </div>
						      <div>
						        <span>系统工具</span>
							        <a href="">重新登陆</a>
							        <a href="">会计年度切换</a>
							        <a href="">帮助</a>
							        <a href="">计算器</a>
							        <a href="">关于</a>
							        <a href="">退出</a>
						      </div>		      
							</div>
						</td>
					</tr>
				</table>
			</div>	
			<!-- 主要内容 -->
			<div id="neirong" class="pingpu">
				<div id="neirongbiaoti">
					<h2>基本设置——单位管理</h2><hr />
				</div>
				<div class="zhuti">	
					<div id="workspacecolor">
					   <table border="0" width = "650" height="400">
					       <tr><th></th></tr>
					       </table> 
					    
					    
					    
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