package com.budget.models;
import java.sql.*;
import java.util.ArrayList;

public class Kemu{
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	public ArrayList<Kemu> returnKmInf(){
		ArrayList<Kemu> list=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.162:1521:PUBLICFINANCE","user","123456");
			ps=conn.prepareStatement("SELECT * FROM Ys_cskm");
			rs=ps.executeQuery();
			list=new ArrayList();
			while(rs.next()){
				list.add(new Kemu(rs.getString("kmdm"),rs.getString("kmmc"),"","",""));
			}
			rs.close();
			ps.close();
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	public Kemu(){}
	public Kemu(String kmdm,String kmmc,String zjm,String kmlx,String bz){
		this.kmdm=kmdm;
		this.kmmc=kmmc;
		this.zjm=zjm;
		this.kmlx=kmlx;
		this.bz=bz;
	}
	public void setKmdm(String kmdm){
		this.kmdm=kmdm;
	}
	public String getKmdm(){
		return kmdm;
	}
	public void setKmmc(String kmmc){
		this.kmmc=kmmc;
	}
	public String getKmmc(){
		return kmmc;
	}
	public void setZjm(String zjm){
		this.zjm=zjm;
	}
	public String getZjm(){
		return zjm;
	}
	public void setKmlx(String kmlx){
		this.kmlx=kmlx;
	}
	public String getKmlx(){
		return kmlx;
	}
	public void setBz(String bz){
		this.bz=bz;
	}
	public String getBz(){
		return bz;
	}
	
	private String kmdm = null;
	private String kmmc = null;
	private String zjm = null;
	private String kmlx = null;
	private String bz = null;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}