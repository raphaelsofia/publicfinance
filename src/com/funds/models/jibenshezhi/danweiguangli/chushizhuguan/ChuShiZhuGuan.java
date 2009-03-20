package com.funds.models.jibenshezhi.danweiguangli.chushizhuguan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.funds.models.jibenshezhi.danweiguangli.DanWeiGuanLi;

public class ChuShiZhuGuan {
	private String zgcsdm = "";
	private String zgcsmc = "";
	
	
	public ChuShiZhuGuan(){	}
	
	public ChuShiZhuGuan(String zgcsdm, String zgcsmc) {
		this.zgcsdm = zgcsdm;
		this.zgcsmc = zgcsmc;
	}
	
	public String getZgcsdm() {
		return zgcsdm;
	}
	public void setZgcsdm(String zgcsdm) {
		this.zgcsdm = zgcsdm;
	}
	public String getZgcsmc() {
		return zgcsmc;
	}
	public void setZgcsmc(String zgcsmc) {
		this.zgcsmc = zgcsmc;
	}

	public ArrayList<ChuShiZhuGuan> returnAllInfo() {
		ArrayList<ChuShiZhuGuan> list = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null; 
		
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.194:1521:PUBLICFINANCE","user","123456");
			ps = conn.prepareStatement("SELECT zgcsdm,zgcsmc FROM zj_zgcs");
			rs = ps.executeQuery();// SELECT
			
			list = new ArrayList<ChuShiZhuGuan>();
			
			while(rs.next()){
				list.add(new ChuShiZhuGuan(rs.getString("zgcsdm"), rs.getString("zgcsmc")));
			}
			
			rs.close();
			ps.close();
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		System.out.println("--->"+list+"<---");
		
		return list;
	}
	
	
	
}
