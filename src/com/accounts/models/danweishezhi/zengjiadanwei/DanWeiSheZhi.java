package com.accounts.models.danweishezhi.zengjiadanwei;

import java.sql.*;
import java.util.ArrayList;

public class DanWeiSheZhi {
	
	
	 static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	
	//显示已有信息
	
		public ArrayList<DanWeiSheZhi> returnAllInfo(){
		
		System.out.println("--->returnAllnfo<---");
		ArrayList<DanWeiSheZhi> list = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null; 
		
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.197:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("SELECT dwdm,dwmc FROM Zw_dwxx");
			rs = ps.executeQuery();// SELECT
			
			list = new ArrayList();
			
			while(rs.next()){
				list.add(new DanWeiSheZhi(rs.getString("dwdm"), rs.getString("dwmc")));
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
	public boolean add_dwxx(){
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		// 3. Connection
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@123.115.191.91:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("INSERT INTO Zw_dwxx(dwdm,dwmc,dwlx,zgcs,gzqy,zjqy) VALUES(?,?,?,?,?,?)");
			ps.setString(1, dwdm);
			ps.setString(2, dwmc);
			ps.setString(3, dwlx);
			ps.setString(4, zgcs);
			ps.setString(5, gzqy);
			ps.setString(6, zjqy);
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
		DanWeiSheZhi dl = new DanWeiSheZhi();
		ArrayList al = dl.returnAllInfo();
		
		for( int i = 0;i < al.size();i ++ ){
			System.out.println(i);
		}

		
		
	}
	
	

	
    
    
    public DanWeiSheZhi(){}
    
    public DanWeiSheZhi(String dwdm, String dwmc){
    	this.dwdm = dwdm;
        this.dwmc = dwmc;
    }
    
    public DanWeiSheZhi(String dwdm, String dwmc, String dwlx, String zgcs, String gzqy, String zjqy){
        this.dwdm = dwdm;
        this.dwmc = dwmc;
        this.dwlx = dwlx;
        this.zgcs = zgcs;
        this.gzqy = gzqy;
        this.zjqy = zjqy;
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
    
    public void setDwlx(String dwlx){
        this.dwlx = dwlx;
    }
    
    public String getDwlx(){
        return dwlx;
    }
    
    public void setZgcs(String zgcs){
        this.zgcs = zgcs;
    }
    
    public String getZgcs(){
        return zgcs;
    }
    
    public void setGzqy(String gzqy){
        this.gzqy = gzqy;
    }
    
    public String getGzqy(){
        return gzqy;
    }
    
    public void setZjqy(String zjqy){
        this.zjqy = zjqy;
    }
    
    public String getZjqy(){
        return zjqy;
    }

    
    private String dwdm = "";
    private String dwmc = "";
    private String dwlx = "";
    private String zgcs = "";
    private String gzqy = "";
    private String zjqy = "";
    
    
    
   
 
}