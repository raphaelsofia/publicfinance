package com.funds.models.jibenshezhi.danweiguangli;

import java.sql.*;
import java.util.ArrayList;

public class DanWeiGuanLi {
    private String dwdm = "";
    private String dwmc = "";
    private String dwlb = "";
    private String zgcsmc = "";
    private String gzqyrq = "";
    private String gdzcqyrq = "";
    
    public DanWeiGuanLi(){}
    
    public DanWeiGuanLi(String dwdm, String dwmc){
    	this.dwdm = dwdm;
        this.dwmc = dwmc;
    }
    
    public DanWeiGuanLi(String dwdm, String dwmc, String dwlb, String zgcsmc, String gzqyrq, String gdzcqyrq){
        this.dwdm = dwdm;
        this.dwmc = dwmc;
        this.dwlb = dwlb;
        this.zgcsmc = zgcsmc;
        this.gzqyrq = gzqyrq;
        this.gdzcqyrq = gdzcqyrq;
    }
    
    public void setDwdm(String dwdm){
        this.dwdm = dwdm;
    }
    
    public String getDwdm(){
        return dwdm;
    }
    
    public void setDwmc(String dwmc){
        this.dwmc = dwmc;
    }
    
    public String getDwmc(){
        return dwmc;
    }
    
    public void setDwlb(String dwlb){
        this.dwlb = dwlb;
    }
    
    public String getDwlb(){
        return dwlb;
    }
    
    public void setZgcsmc(String zgcsmc){
        this.zgcsmc = zgcsmc;
    }
    
    public String getZgcsmc(){
        return zgcsmc;
    }
    
    public void setGzqyrq(String gzqyrq){
        this.gzqyrq = gzqyrq;
    }
    
    public String getGzqyrq(){
        return gzqyrq;
    }
    
    public void setGdzcqyrq(String gdzcqyrq){
        this.gdzcqyrq = gdzcqyrq;
    }
    
    public String getGdzcqyrq(){
        return gdzcqyrq;
    }
    
    static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	
	//显示已有信息
	
		public ArrayList<DanWeiGuanLi> returnAllInfo(){
		
		ArrayList<DanWeiGuanLi> list = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null; 
		
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.194:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("SELECT dwdm,dwmc FROM zj_dwhz");
			rs = ps.executeQuery();// SELECT
			
			list = new ArrayList();
			
			while(rs.next()){
				list.add(new DanWeiGuanLi(rs.getString("dwdm"), rs.getString("dwmc")));
			}
			
			rs.close();
			ps.close();
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
				
		return list;
		
	}
	
	
	//增加
	public boolean add_dwhz(){
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		// 3. Connection
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.194:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("INSERT INTO zj_dwhz(dwdm,dwmc,dwlx) VALUES(?,?,?)");
			ps.setString(1, dwdm);
			ps.setString(2, dwmc);
			ps.setString(3, dwlb);
			result = ps.executeUpdate(); // INSERT DELETE UPDATE	
					
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(result != 0){ps.close();ps = null;}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
					if(result != 0){conn.close();conn = null;}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
			
	}
		
		return result==1;
	}
  
    public boolean add_zgcs(){
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		// 3. Connection
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.194:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("INSERT INTO zj_zgcs(zgcsmc) VALUES(?)");
			ps.setString(1, zgcsmc);
			result = ps.executeUpdate(); // INSERT DELETE UPDATE	
					
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(result != 0){ps.close();ps = null;}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
					if(result != 0){conn.close();conn = null;}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
			
	}
		
		return result==1;
	}
    
    public boolean add_qyrq(){
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		// 3. Connection
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.194:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("INSERT INTO zj_qyrq(gzqyrq) VALUES(?)");
			ps.setString(1, gzqyrq);
			result = ps.executeUpdate(); // INSERT DELETE UPDATE	
					
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(result != 0){ps.close();ps = null;}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
					if(result != 0){conn.close();conn = null;}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
			
	}
		
		return result==1;
	}
	
	
	public static void main( String []args){
		DanWeiGuanLi dl = new DanWeiGuanLi();
		ArrayList al = dl.returnAllInfo();
		
		for( int i = 0;i < al.size();i ++ ){
			System.out.println(i);
		}

		
		
	}
 
}