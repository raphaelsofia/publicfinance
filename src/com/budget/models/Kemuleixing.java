package com.budget.models;
import java.sql.*;
import java.util.ArrayList;

public class Kemuleixing{
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	public ArrayList<Kemuleixing> returnKmlxInf(){
		ArrayList<Kemuleixing> list=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.162:1521:PUBLICFINANCE","user","123456");
			ps=conn.prepareStatement("SELECT * FROM Ys_kmlx");
			rs=ps.executeQuery();
			list=new ArrayList();
			while(rs.next()){
				list.add(new Kemuleixing(rs.getString("lxbh"),rs.getString("lxmc"),rs.getString("bz")));
			}
			rs.close();
			ps.close();
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
	
	
	
	public Kemuleixing(){}
	public Kemuleixing(String lxbh,String lxmc,String bz){
		this.lxbh=lxbh;
		this.lxmc=lxmc;
		this.bz=bz;
	}	
	public void setLxbh(String lxbh){
		this.lxbh=lxbh;
	}
	public String getLxbh(){
		return lxbh;
	}
	public void setLxmc(String lxmc){
		this.lxmc=lxmc;
	}
	public String getLxmc(){
		return lxmc;
	}
	public void setBz(String bz){
		this.bz=bz;
	}
	public String getBz(){
		return bz;
	}
		
	private String lxbh = null;
	private String lxmc = null;
	private String bz = null;	
}