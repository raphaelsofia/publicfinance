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
					<h2>日常处理——资金账录入</h2><hr />
				</div>
					<div class="zhuti">	
					<div id="workspacecolor">
					<br><br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								<input 	type="Button" 
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="单位定位" 
										onClick=" " name="Button"> 
										
								<input 	type="Button" 
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="摘要" 
										onClick=" " name="Button">
								
								<input 	type="submit" 
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="增加" 
										onClick="" name="submit">  

								
								<input 	type="Button" 
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="删除" 
										onClick=" " name="Button"> 
										
								<input 	type="Button" 
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="保存" 
										onClick=" " name="Button"> 
										
								<input 	type="Button" 
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="支票打印" 
										onClick=" " name="Button"> 
							<a href="funds.html">		
								<input 	type="Button" 
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="退出" 
										onClick=" " name="Button"></a>
							
					<div id = "table1">
					<table border = "0" width = "710">
						<tr><th width = "140" height= "20" align = "left" valign="bottom">
						银行：<select style="width:100px">
									<option name = "工商银行" >工商银行
									<option name = "农业银行" >农业银行
							  </select></th><th rowspan=3> 
							  	<table border="0" width="555" height="370" align="left" valign="top">
							  		<tr><th width="150" align="center" valign="top" height="150" rowspan="7">
							  			凭证总号&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp摘要	<br>
							  			<form action="funds_submit" method="get" accept-charset="utf-8">
							  				<textarea name="ziyao" rows="8" cols="16" style="overflow-x:hidden">
							  		
							  				</textarea>
							  			</form>
						  		</th></tr>
						  		<form action = "../servlet/AddServlet" method = "post">
						  			
						  				
						  		
						  			<tr><td height="10" align="right">
						  				
						  					银行：<input type="text" value="" size="15px" name = "yhmc">
						  				
						  				
						  			</td><td align="right">
					  					
						  					登记日期：<input type="text" value="" size="15px" name = "djrq">
						  				</td></tr>
							  		<tr><td height="10" align="right">
							  			
						  					单位：<input type="text" value="" size="15px" name = "dwmc">
						  				
						  				
					  				</td><td align="right">
						  				
						  					凭证总号：<input type="text" value="" size="15px" name = "pzzh">
						  				
						  				
					  				</td></tr>
							  		<tr><td height="10" align="right">
							  			
						  					摘要：<input type="text" value="" size="15px" name = "zy">
						  				
							  			
							  		</td><td align="right">
							  			
						  					凭证分号：<input type="text" value="" size="15px" name = "pzfh">
						  				
							  			
							  		</td></tr>
							  		<tr><td height="10" align="right">
							  			
						  					借方金额：<input type="text" value="" size="15px" name = "jje">
						  				
							  			
							  		</td><td align="right">
							  			
						  					贷方金额：<input type="text" value="" size="15px" name = "dje">
						  				
							  			
							  		</td></tr>
							  		<tr><td height="10" align="right">
							  			
						  					资金类别：<input type="text" value="" size="15px" name = "zjlb">
						  				
							  			
							  		</td><td align="right">
							  			
						  					票据号：<input type="text" value="" size="15px" name = "pjh">
						  				
							  			
							  		</td></tr>
							  		<tr><td height="10" align="right">
							  		
						  					结算方式：<input type="text" value="" size="15px" name = "jsfs">
						  				
							  			
							  		</td><td align="right">
							  			
						  					票据日期：<input type="text" value="" size="15px" name = "pjrq">
						  				
							  			
							  		</td></tr>	</form>					  		
							  		<tr><td height="22" colspan="3"><br>
							  			登记日期&nbsp&nbsp资金号&nbsp&nbsp单位名称&nbsp&nbsp摘要&nbsp&nbsp借方金额&nbsp&nbsp贷方金额&nbsp&nbsp票据号&nbsp&nbsp凭证总号&nbsp&nbsp录入人&nbsp&nbsp银行
							  		</td></tr>
							  		<tr><td colspan="3">
							  			<form action="funds_submit" method="get" accept-charset="utf-8">
							  				<textarea name="yinhang" rows="9" cols="64" style="overflow-x:hidden">
							  		
							  				</textarea>
							  			</form>
							
							  		</td></tr>
							  	</table>
							  </th</tr>
						<tr><td height="350" align="left" valign="top">
							<form action="funds_submit" method="get" accept-charset="utf-8">
							  				<textarea name="yinhang" rows="20" cols="14" style="overflow-x:hidden">
							  		
							  				</textarea>
							  			</form>
							
						</td></tr>
					 </table>
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