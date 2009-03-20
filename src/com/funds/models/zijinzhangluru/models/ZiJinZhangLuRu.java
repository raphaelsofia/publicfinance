package com.funds.models.zijinzhangluru.models;

import java.sql.*;

public class ZiJinZhangLuRu {
	
	private String yhmc = "";
	private String dwmc = "";
	private String zy = "";
	private double jje = 0;
	private String zjlb = "";
	private String jsfs = "";
	private String djrq = "";
	private String pzzh = "";
	private String pzfh = "";
	private double dje = 0;
	private String pjh = "";
	private String pjrq = "";
	
	
	public ZiJinZhangLuRu(){}
	
	public ZiJinZhangLuRu(String yhmc, String dwmc,double jje, double dje){
		this.yhmc = yhmc;
		this.dwmc = dwmc;
		this.jje = jje;
		this.dje = dje;
	}
	
	public ZiJinZhangLuRu(String zy, String zjlb,String jsfs){
		this.zy = zy;
		this.zjlb = zjlb;
		this.jsfs = jsfs;
	}
	
	public ZiJinZhangLuRu(String djrq, String pzzh, String pzfh,String pjh, String pjrq){
		this.djrq = djrq;
		this.pzzh = pzzh;
		this.pzfh = pzfh;
		this.pjh = pjh;
		this.pjrq = pjrq;
	}	
	
		
	public void setYhmc(String yhmc){
		this.yhmc = yhmc;
	}
	
	public String getYhmc(){
		return yhmc;
	}
	
	public void setDwmc(String dwmc){
		this.dwmc = dwmc;
	}
	
	public String getDwmc(){
		return dwmc;
	}
	
	public void setZy(String zy){
		this.zy = zy;
	}
	
	public String getZy(){
		return zy;
	}
	
	public void setJje(double jje){
		this.jje = jje;
	}
	
	public double getJje(){
		return jje;
	}
	
	public void setZjlb(String zjlb){
		this.zjlb = zjlb;
	}
	
	public String getZjlb(){
		return zjlb;
	}
	
	public void setJsfs(String jsfs){
		this.jsfs = jsfs;
	}
	
	public String getJsfs(){
		return jsfs;
	}
	
	public void setDjrq(String djrq){
		this.djrq = djrq;
	}
	
	public String getDjrq(){
		return djrq;
	}
	
	public void setPzzh(String pzzh){
		this.pzzh = pzzh;
	}
	
	public String getPzzh(){
		return pzzh;
	}
	
	public void setPzfh(String pzfh){
		this.pzfh = pzfh;
	}
	
	public String getPzfh(){
		return pzfh;
	}
	
	public void setDje(double dje){
		this.dje = dje;
	}
	
	public double getDje(){
		return dje;
	}
	
	public void setPjh(String pjh){
		this.pjh = pjh;
	}
	
	public String getPjh(){
		return pjh;
	}
	
	
	public void setPjrq(String pjrq){
		this.pjrq = pjrq;
	}
	
	public String getPjrq(){
		return pjrq;
	}
	
	
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	
	public boolean add_dwhz(){
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		System.out.println("Add_dwhz_Success!!!!");
		
		// 3. Connection
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.199:1521:PUBLICFINANCE","user","123456");	
			ps = conn.prepareStatement("INSERT INTO zj_dwhz (jje,dje) VALUES(?,?)");
			ps.setDouble(1,jje);
			ps.setDouble(2,dje);
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
	
	public boolean add_yh(){
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		// 3. Connection
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.199:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("INSERT INTO zj_yh (yhmc) VALUES(?)");
			ps.setString(1, yhmc);
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
	
	
	public boolean add_zy(){
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		// 3. Connection
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.199:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("INSERT INTO zj_zy (zy) VALUES(?)");
			ps.setString(1, zy);
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
	
	
	
	public boolean add_zjlb(){
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		// 3. Connection
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.199:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("INSERT INTO zj_zjlb (zjlb) VALUES(?)");
			ps.setString(1, zjlb);
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
		
	public boolean add_jsfs(){
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		// 3. Connection
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.199:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("INSERT INTO zj_jsfs (jsfs) VALUES(?)");
			ps.setString(1, jsfs);
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
	
	public boolean add_pzmx(){
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		// 3. Connection
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.199:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("INSERT INTO zj_pzmx (djrq,pzzh,pzfh) VALUES(?,?,?)");
			ps.setDate(1,java.sql.Date.valueOf(djrq.replace('/','-'))); 
			ps.setString(2, pzzh);
			ps.setString(3, pzfh);
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
	
	public boolean add_yhdzd(){
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		
		// 3. Connection
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.199:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("INSERT INTO zj_zjmx (pjh,pjrq) VALUES(?,?)");
			ps.setString(1, pjh);
			ps.setDate(2,java.sql.Date.valueOf(pjrq.replace('/','-'))); 
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
	

	
}