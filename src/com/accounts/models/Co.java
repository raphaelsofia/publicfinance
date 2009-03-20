package com.accounts.models;

// 1. import package
import java.sql.*;

import java.util.*;
import java.util.ArrayList.*;
public class Co{
	
	// 2. load JDBC driver
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	

	
	public ArrayList<Co> returnAllCo(){
		ArrayList<Co> list = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet result = null; 
		try{
			System.out.println("signUp()->username:<-----"); 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:PUBLICFINANCE","system","123456");
			ps = conn.prepareStatement("SELECT * FROM Pub_dw ");
			result = ps.executeQuery();
			
			list = new ArrayList();
			
			while(result.next()){
				//读姓名 读密码
				/*String uaername = result.getString("username");//列名PUBLICFI
				String password = resule.getString("paaaword");
				Account acc = new Account(username, paaaword);
				
				//session Space
				session.setAttribute("allAccountInfo",allAccounts);
				list.add(acc);//向数组添加对象*/
				
				list.add(new Co(result.getString("bmdm"), result.getString("dwdm"), result.getString("dwmc"), result.getString("lxdm"), result.getString("zwrq"), result.getString("gzrq"), result.getString("zcrq"), result.getString("zwcsh"), result.getString("zccsh"), result.getString("zh"), result.getString("khh"), result.getString("zwnd"), result.getString("gznd"), result.getString("zcnd")));
				
			}
		
			result.close();
			ps.close();
			conn.close();
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	public ArrayList<Co> returnAllInfo(){
		ArrayList<Co> list = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet result = null; 
		try{
			System.out.println("signUp()->username:<-----"); 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:PUBLICFINANCE","system","123456");
			ps = conn.prepareStatement("SELECT * FROM Pub_dw WHERE dwdm=? ");
			ps.setString(1, dwdm);
			result = ps.executeQuery();
			
			list = new ArrayList();
			
			while(result.next()){
				//读姓名 读密码
				/*String uaername = result.getString("username");//列名PUBLICFI
				String password = resule.getString("paaaword");
				Account acc = new Account(username, paaaword);
				
				//session Space
				session.setAttribute("allAccountInfo",allAccounts);
				list.add(acc);//向数组添加对象*/
				
				list.add(new Co(result.getString("bmdm"), result.getString("dwdm"), result.getString("dwmc"), result.getString("lxdm"), result.getString("zwrq"), result.getString("gzrq"), result.getString("zcrq"), result.getString("zwcsh"), result.getString("zccsh"), result.getString("zh"), result.getString("khh"), result.getString("zwnd"), result.getString("gznd"), result.getString("zcnd")));
				
			}
		
			result.close();
			ps.close();
			conn.close();
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	
	
	
	public Co(){}
	public Co(String dwdm){
		this.dwdm = dwdm;	
	}
	public Co(String bmdm,
	 String dwdm, 
     String dwmc,
     String lxdm, 
     String zwrq,      
     String gzrq, 
     String zcrq, 
     String zwcsh, 
     String zccsh, 
     String zh, 
     String khh, 
     String zwnd, 
     String gznd, String zcnd){
     	
     	this.bmdm = bmdm;
		this.dwdm = dwdm;
		this.dwmc = dwmc;
		this.lxdm = lxdm;
		this.zwrq = zwrq;
		this.gzrq = gzrq;
		this.zcrq = zcrq; 
		this.zwcsh = zwcsh;
		this.zccsh = zccsh;
		this.zh = zh;
		this.khh =khh;
		this.zwnd = zwnd;
		this.gznd = gznd;
		this.zcnd = zcnd;	
	}
	
	  
       
       
       
    
	
	
	
//1
	public void setBmdm(String bmdm ){
		this.bmdm  = bmdm;
	}
	
	public String getBmdm(){
		return bmdm;
	}
//2	
	public void setDwdm(String dwdm){
		this.dwdm = dwdm;
	}
	
	public String getDwdm(){
		return dwdm;
	}
//3
	public void setDwmc(String dwmc){
		this.dwmc = dwmc;
	}
	
	public String getDwmc(){
		return dwmc;
	}
//4	
	public void setLxdm(String lxdm){
		this.lxdm = lxdm;
	}
	
	public String getLxdm(){
		return lxdm;
	}
		
	    
      
       
       
     
//5
	public void setZwrq(String zwrq){
		this.zwrq = zwrq;
	}
	
	public String getZwrq(){
		return zwrq;
	}
//6	
	public void setGzrq(String gzrq){
		this.gzrq = gzrq;
	}
	
	public String getGzrq(){
		return gzrq;
	}
		
//7
	public void setZcrq(String zcrq){
		this.zcrq = zcrq;
	}
	
	public String getZcrq(){
		return zcrq;
	}
//8	
	public void setZwcsh(String zwcsh){
		this.zwcsh = zwcsh;
	}
	
	public String getZwcsh(){
		return zwcsh;
	}
	

//9
	public void setZccsh(String zccsh){
		this.zccsh = zccsh;
	}
	
	public String getZccsh(){
		return zccsh;
	}
//10	
	public void setZh(String zh){
		this.zh = zh;
	}
	
	public String getZh(){
		return zh;
	}
					
//11	
	public void setKhh(String khh){
		this.khh = khh;
	}
	
	public String getKhh(){
		return khh;
	}	
	
//12
	public void setZwnd(String zwnd){
		this.zwnd = zwnd;
	}
	
	public String getZwnd(){
		return zwnd;
	}
//13	
	public void setGznd(String gznd){
		this.gznd = gznd;
	}
	
	public String getGznd(){
		return gznd;
	}
					
//14	
	public void setZcnd(String zcnd){
		this.zcnd = zcnd;
	}
	
	public String getZcnd(){
		return zcnd;
	}	
	

	  
     
	private String bmdm = "";
	private String dwdm = "";
	private String dwmc = "";
	private String lxdm = "";
	private String zwrq = "";
	private String gzrq = "";
	private String zcrq = "";
	private String zwcsh = "";
	private String zccsh = "";
	private String zh = "";
	private String khh = "";
	private String zwnd = "";
	private String gznd = "";
	private String zcnd = "";
}

