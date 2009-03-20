package com.accounts.models;

// 1. import package
import java.sql.*;

import java.util.*;
import java.util.ArrayList.*;
public class Account{
	
	// 2. load JDBC driver
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	
	
	public ArrayList<Account> returnAllInfo(){
		ArrayList<Account> list = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet result = null; 
		try{
			System.out.println("signUp()->ztcx:<-----"); 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.197:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("SELECT * FROM Zw_ztcx ");
			result = ps.executeQuery();
			
			list = new ArrayList();
			
			while(result.next()){
				
				
				
				list.add(new Account(result.getString("dwdm"), result.getString("dwmc"), result.getString("lxdm"), result.getString("cwzg"), result.getString("jhr"), result.getString("dw"))); 
				
			}
				
				
			


			
			result.close();
			ps.close();
			conn.close();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	public Account(){}
	public Account(String dwdm, String dwmc, String lxdm, String cwzg, String jhr, String dw){
		this.dwdm = dwdm;
		this.dwmc = dwmc;
		this.lxdm = lxdm;
		this.cwzg = cwzg;
		this.jhr = jhr;
		this.dw = dw; 
		
				
	}
	
//1
	public void setDwdm(String dwdm){
		this.dwdm = dwdm;
	}
	
	public String getDwdm(){
		return dwdm;
	}
//2	
	public void setDwmc(String dwmc){
		this.dwmc = dwmc;
	}
	
	public String getDwmc(){
		return dwmc;
	}
//3
	public void setLxdm(String lxdm){
		this.lxdm = lxdm;
	}
	
	public String getLxdm(){
		return lxdm;
	}
//4	
	public void setCwzg(String cwzg){
		this.cwzg = cwzg;
	}
	
	public String getCwzg(){
		return cwzg;
	}
		
//5
	public void setJhr(String jhr){
		this.jhr = jhr;
	}
	
	public String getJhr(){
		return jhr;
	}
//6	
	public void setDw(String dw){
		this.dw = dw;
	}
	
	public String getDw(){
		return dw;
	}
		
	
	private String dwdm = "";
	private String dwmc = "";
	private String lxdm = "";
	private String cwzg = "";
	private String jhr = "";
	private String dw = "";
	
}

