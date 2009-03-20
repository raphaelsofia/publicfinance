package com.accounts.models;

// 1. import package
import java.sql.*;

import java.util.*;
import java.util.ArrayList.*;
public class Acc{
	
	// 2. load JDBC driver
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	
	
	public ArrayList<Acc> returnAllInfo(){
		ArrayList<Acc> list = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet result = null; 
		try{
			System.out.println("signUp()->username:<-----"); 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:PUBLICFINANCE","system","123456");
			ps = conn.prepareStatement("SELECT * FROM Zw_kmhz WHERE dwdm=?");
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
				
				list.add(new Acc(result.getString("dwdm"), result.getString("kmdm"), result.getString("ncye"), result.getString("ye"), result.getString("jjl_c"), result.getString("dlj_c"), result.getString("jfs"), result.getString("dfs"), result.getString("jlj"), result.getString("dlj"), result.getString("yf")));
				
			}
				
		
			result.close();
			ps.close();
			conn.close();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	
	public boolean isDwdmExisted(){
		boolean isExisted = true;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.20:1521:PUBLICFINANCE","system","123456");
			ps = conn.prepareStatement("SELECT * FROM Zw_kmhz WHERE dwdm=?");
			ps.setString(1, dwdm);
			rs = ps.executeQuery();// SELECT
			System.out.println("dwdm to check->"+dwdm)			;
			
			isExisted = rs.next();
			System.out.println("dwdm to check result->"+ isExisted)			;
			rs.close();
			ps.close();
			conn.close();
			
					
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return isExisted;
	}
	
	
	public Acc(){}
	public Acc(String dwdm, String kmdm, String ncye, String ye, String jjl_c, String dlj_c, String jfs, String dfs, String jlj, String dlj, String yf){
		this.dwdm = dwdm;
		this.kmdm = kmdm;
		this.ncye = ncye;
		this.ye = ye;
		this.jjl_c = jjl_c;
		this.dlj_c = dlj_c; 
		this.jfs = jfs;
		this.dfs = dfs;
		this.jlj = jlj;
		this.dlj = dlj;
		this.yf = yf;
				
	}
		public Acc(String dwdm){
		this.dwdm = dwdm;	
	}
//1
	public void setDwdm(String dwdm){
		this.dwdm = dwdm;
	}
	
	public String getDwdm(){
		return dwdm;
	}
//2	
	public void setKmdm(String kmdm){
		this.kmdm = kmdm;
	}
	
	public String getKmdm(){
		return kmdm;
	}
//3
	public void setNcye(String ncye){
		this.ncye = ncye;
	}
	
	public String getNcye(){
		return ncye;
	}
//4	
	public void setYe(String ye){
		this.ye = ye;
	}
	
	public String getYe(){
		return ye;
	}
		
//5
	public void setJjl_c(String jjl_c){
		this.jjl_c = jjl_c;
	}
	
	public String getJjl_c(){
		return jjl_c;
	}
//6	
	public void setDlj_c(String dlj_c){
		this.dlj_c = dlj_c;
	}
	
	public String getDlj_c(){
		return dlj_c;
	}
		
//7
	public void setJfs(String jfs){
		this.jfs = jfs;
	}
	
	public String getJfs(){
		return jfs;
	}
//8	
	public void setDfs(String dfs){
		this.dfs = dfs;
	}
	
	public String getDfs(){
		return dfs;
	}
//9
	public void setJlj(String jlj){
		this.jlj = jlj;
	}
	
	public String getJlj(){
		return jlj;
	}
//10	
	public void setDlj(String dlj){
		this.dlj = dlj;
	}
	
	public String getDlj(){
		return dlj;
	}
					
//11	
	public void setYf(String yf){
		this.yf = yf;
	}
	
	public String getYf(){
		return yf;
	}	
	private String dwdm = "";
	private String kmdm = "";
	private String ncye = "";
	private String ye = "";
	private String jjl_c = "";
	private String dlj_c = "";
	private String jfs = "";
	private String dfs = "";
	private String jlj = "";
	private String dlj = "";
	private String yf = "";
}

