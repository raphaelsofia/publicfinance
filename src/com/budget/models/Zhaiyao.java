package com.budget.models;
import java.sql.*;
import java.util.ArrayList;

public class Zhaiyao{
	static{
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}	
	public ArrayList<Zhaiyao> returnZyInf(){
		ArrayList<Zhaiyao> list=null;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.162:1521:PUBLICFINANCE","user","123456");
			ps=conn.prepareStatement("SELECT * FROM Ys_zy");
			rs=ps.executeQuery();
			list=new ArrayList();
			while(rs.next()){
				list.add(new Zhaiyao(rs.getString("zybh"),rs.getString("zymc"),rs.getString("zylx")));
			}
			rs.close();
			ps.close();
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Zhaiyao(){}
	public Zhaiyao(String zybh,String zymc,String zylx){
		this.zybh=zybh;
		this.zymc=zymc;
		this.zylx=zylx;
	} 	
	public void setZybh(String zybh){
		this.zybh=zybh;
	}
	public String getZybh(){
		return zybh;
	}
	public void setZymc(String zymc){
		this.zymc=zymc;
	}
	public String getZymc(){
		return zymc;
	}
	public void setZylx(String zylx){
		this.zylx=zylx;
	}
	public String getZylx(){
		return zylx;
	}
	
	





	
	private String zybh = null;
	private String zymc = null;
	private String zylx = null;	
}