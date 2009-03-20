package com.funds.models.xitonggongju;


import java.sql.*;


public class Account{
	

	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public boolean signIn(){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet result = null;  ////////////
		boolean isUserValid = false;
		
		// 3. Connection
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORCL","scott","tiger");
			ps = conn.prepareStatement("SELECT * FROM ZiJinAccounts WHERE username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			result = ps.executeQuery();// SELECT
			
			isUserValid = result.next();
			
			result.close();
			ps.close();
			conn.close();
			
					
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return isUserValid;
	
		
	}
	

	
	
	public Account(){}
	public Account(String username, String password){
		this.username = username;
		this.password = password;		
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	private String username = "";
	private String password = "";
}

