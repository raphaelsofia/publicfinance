<%@ page language="java" pageEncoding="UTF-8" import="java.util.ArrayList" %>
<%@ page import="com.funds.models.jibenshezhi.danweiguangli.DanWeiGuanLi" %>
<%@ page import="com.funds.models.jibenshezhi.danweiguangli.chushizhuguan.ChuShiZhuGuan" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
	"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<title>公共财政资金管理</title> 
		<style>
        .black_overlay{
            display: none;
            position: absolute;
            top: 0%;
            left: 0%;
            width: 100%;
            height: 100%;
            background-color: black;
            z-index:1001;
            -moz-opacity: 0.8;
            opacity:.80;
            filter: alpha(opacity=80);
        }
        .white_content {
            display: none;
            position: absolute;
            top: 15%;
            left: 15%;
            width: 50%;
            height: 70%;
            padding: 16px;
            border: 1px solid orange;
            background-image:url(../pic/images/bg.gif) ;
            z-index:1002;
            overflow: auto;
        }
    </style>
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
		<link href="../css/funds/jibenshezhi/jibenshezhi.css" media="screen" rel="Stylesheet" type="text/css" />
		<style type="text/css">
			<!--
				.over {color:yellow; background: navy}
				.down {color:yellow; background: navy; font-style: italic}
			-->
		</style>
		<script src="js/prototype-1.6.0.3.js" type="text/javascript" charset="utf-8" >
		</script>
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
					<div id="workspacecolor"><br><br>
				
				 <table border="0" width = "650">
                <tr><td width = "400">			
			          
					
                </td><td align = "center">
                     <fieldset style="width:100" align="center"> <legend> <b>功能 </b></legend>
                       
                        <a href = "javascript:void(0)" onclick = "document.getElementById('light1').style.display='block';document.getElementById('fade').style.display='block'">
                        <input 	type="Button" style="width:80"
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="主管处室" 
										onClick=" " name="Button"></a><br><br>
						<div id="light1" class="white_content"><This is the lightbox content><form action="../servlet/ZenJiaServlet" method="post" accept-charset="utf-8">
							
							<table border="1" width="350" height="300">
				                <tr><td width="250" align="center">
				                		<span id="zgcs"> </span>
				                    </td>
				                    <td align="center">
				                        <input type="button" name=" " value="插入"><br><br>
				                        <input type="button" name=" " value="删除"><br><br>
				                        <input type="button" name=" " value="保存"><br><br>
				                        <a href="../servlet/ShuaXinServlet" >
				                        <input type="button" value="刷新" /></a><br><br><br>
				                        <a href = "javascript:void(0)" onclick = "document.getElementById('light1').style.display='none';document.getElementById('fade').style.display='none'"><input type="button"value="退出"></a>
				                   </td></tr>
				        	</table></form> </div>
        				<div id="fade" class="black_overlay"></div>
										
										
								<input 	type="Button" style="width:80"
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="宽度设置" 
										onClick=" " name="Button" disabled> <br><br>
								
								 <a href = "javascript:void(0)" onclick = "document.getElementById('light2').style.display='block';document.getElementById('fade').style.display='block'">		
								<input 	type="Button" style="width:80"
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="代码调整" 
										onClick=" " name="Button"></a> <br><br>
								<div id="light2" class="white_content"><This is the lightbox content><form action="../servlet/ZenJiaServlet" method="post" accept-charset="utf-8">
			
			<table border="0" width="350" height="300">
                <tr><td height="20" align="center">调整前</td><td align="center">调整后</td><td align="center">单位名称</td></tr>
                
                 <tr><td height="250"align="center" valign="top">
                         <select name="  " id="  " size="1" >
                             <option value=" ">option1</option>
                                                 
                         </select>
                     </td><td align="center" valign="top">
                         <input type="text" size="10"></td>
                         <td align="center" valign="top">   </td></tr>
                         
                <tr><td align="right" colspan="3">
                        <input type="button"value="代码检验">
                        <input type="button"value="确定">
                        <a href = "javascript:void(0)" onclick = "document.getElementById('light2').style.display='none';document.getElementById('fade').style.display='none'"><input type="button"value="退出"></a>
                   </td></tr>
        </table></form> </div>
        <div id="fade" class="black_overlay"></div>
										
								
								 <a href = "javascript:void(0)" onclick = "document.getElementById('light3').style.display='block';document.getElementById('fade').style.display='block'">
    								<input 	type="Button" 
    										onMouseOver="this.className='over';" 
    										onMouseOut="this.className='';" 
    										onMouseDown="this.className='down';" 
    										onMouseUp="this.className='over';" 
    										value="  增  加  " 
    										onClick=" " name="Button"></a> <br><br>
								
						        <div id="light3" class="white_content"><This is the lightbox content><form action="../servlet/ZenJiaServlet" method="post" accept-charset="utf-8">
			
			<table border="0" width="350" height="300">
            <tr><td align="left">单位代码:&nbsp&nbsp&nbsp&nbsp<input type="text" name="dwdm"size="15"><font size="4" color="red">&nbsp*</font></td></tr>
            <tr><td align="left">单位名称:&nbsp&nbsp&nbsp&nbsp<input type="text" name="dwmc"size="25"><font size="4" color="red">&nbsp*</font></td></tr>
            <tr><td align="left" >单位类型:&nbsp&nbsp&nbsp&nbsp<select name="dwlx" size="1" style="width:120px">
                <option value="xzdw">行政单位</option>
                <option value="sydw">事业单位</option>
                <option value="zxxx">中小学校</option>
                <option value="sydw-kss">事业单位-看守所</option>
                <option value="jjdw">基建单位</option>
                <option value="mzsydw">民政事业单位</option>
            </select><font size="4" color="red">&nbsp*</font></td></tr>
            <tr><td align="left">主管处室:&nbsp&nbsp&nbsp&nbsp<select name="zgcsmc" size="1" style="width:120px">
                <option value="ysc">预算处</option>
                <option value="zhc">综合处</option>
                <option value="qyc">企业处</option>
                <option value="kjc">教科处</option>
                <option value="fgc">法规处</option>                
            </select></td></tr>
            <tr><td align="left" >工资启用日期:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text"  name="gzqyrq" size="10"></td></tr>
            <tr><td align="left">固定资产启用日期:&nbsp<input type="text"  name="gdzcqyrq" size="10"></td></tr>
            <tr><td><input type="submit" value="确定">
            	<a href = "javascript:void(0)" onclick = "document.getElementById('light3').style.display='none';document.getElementById('fade').style.display='none'"><input type="button"value="退出"></a>
                   </td></tr>
        </table></form> </div>
        <div id="fade" class="black_overlay"></div>
										
								
                         <a href = "javascript:void(0)" onclick = "document.getElementById('light4').style.display='block';document.getElementById('fade').style.display='block'">
						
								<input 	type="submit" style="width:80"
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="  修  改  " 
										onClick="" name="Button"></a><br><br>
										
						<div id="light4" class="white_content"><This is the lightbox content><form action="../servlet/ZenJiaServlet" method="post" accept-charset="utf-8">
			
			<table border="0" width="350" height="300">
            <tr><td align="left">单位代码:&nbsp&nbsp&nbsp&nbsp<input type="text" name="dwdm"size="15" readonly><font size="4" color="red">&nbsp*</font></td></tr>
            <tr><td align="left">单位名称:&nbsp&nbsp&nbsp&nbsp<input type="text" name="dwmc"size="25"><font size="4" color="red">&nbsp*</font></td></tr>
            <tr><td align="left" >单位类型:&nbsp&nbsp&nbsp&nbsp<select name="dwlx" size="1" style="width:120px">
                <option value="xzdw">行政单位</option>
                <option value="sydw">事业单位</option>
                <option value="zxxx">中小学校</option>
                <option value="shdw_kss">事业单位-看守所</option>
                <option value="jjdw">基建单位</option>
                <option value="mzsydw">民政事业单位</option>
            </select><font size="4" color="red">&nbsp*</font></td></tr>
            <tr><td align="left">主管处室:&nbsp&nbsp&nbsp&nbsp<select name="zgcsmc" size="1" style="width:120px">
                <option value="ysc">预算处</option>
                <option value="zhc">综合处</option>
                <option value="qyc">企业处</option>
                <option value="jkc">教科处</option>
                <option value="fgc">法规处</option>                
            </select></td></tr>
            <tr><td align="left" >工资启用日期:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text"  name="gzqyrq" size="10" readonly></td></tr>
            <tr><td align="left">固定资产启用日期:&nbsp<input type="text"  name="gdzcqyrq" size="10" readonly></td></tr>
            <tr><td><input type="button"value="确定"><a href = "javascript:void(0)" onclick = "document.getElementById('light4').style.display='none';document.getElementById('fade').style.display='none'"><input type="button"value="退出"></a>
                   </td></tr>
        </table></form> </div>
        <div id="fade" class="black_overlay"></div>
										
								<input 	type="Button" style="width:80"
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="  删  除  " 
										onClick=" " name="Button" disabled>  <br><br>
												
								<input 	type="Button" style="width:80"
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="  打 印   " 
										onClick=" " name="Button" disabled> <br><br>
							<a href="funds.html">		
								<input 	type="Button" style="width:80"
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="  退  出  "  
										onClick=" " name="Button"></a>  <br><br>
                     </fieldset>
                </td></tr>
            </table>
            <form action=" " method="get">
            	<div id="select">
            		
		                 <select name="dwxx" id="dwxx" multiple size="20" style="width:300px">
									<option><tr><td> &nbsp&nbsp&nbsp&nbsp 单位代码 &nbsp&nbsp&nbsp&nbsp </td><td> &nbsp&nbsp&nbsp&nbsp 单位名称</td></tr></option>
									
									 <%
											ArrayList<DanWeiGuanLi> danweiguanli = (ArrayList<DanWeiGuanLi>)session.getAttribute("allUnitInfo");
											for(DanWeiGuanLi danweiguanli1 : danweiguanli){
												out.println("<option value=\"dwdm\"><tr><td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp "+danweiguanli1.getDwdm()+"</td><td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp "+danweiguanli1.getDwmc()+"</td></tr></option>");				
											}
									%>
						
						</select><br><br> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 
						<input type="submit" style="width:80"
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="提交" /> &nbsp&nbsp&nbsp&nbsp
										  
						<input type="button" style="width:80"
										onMouseOver="this.className='over';" 
										onMouseOut="this.className='';" 
										onMouseDown="this.className='down';" 
										onMouseUp="this.className='over';" 
										value="撤销" /> 
						</div></form>
			<br><br>
				
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