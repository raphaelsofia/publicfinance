package com.budget.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Zbtz {
	
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Zbtz> getAll() {
		ArrayList<Zbtz> zbtz = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.162:1521:PUBLICFINANCE", "user", "123456");
			ps = conn.prepareStatement("SELECT kmdm,kmmc,jhyf,zymc,dje FROM Ys_zbtz");
			rs = ps.executeQuery();
			zbtz = new ArrayList();
			while (rs.next()) {
				zbtz.add(new Zbtz("",rs.getString("kmdm"), rs.getString("kmmc"),"","","",
						"","",rs.getString("jhyf"),"",rs.getString("zymc"),"",
						rs.getString("dje"),"","","",""));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null){
					rs.close();
					rs = null;
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}finally{
				try {
					if(ps!=null){
						ps.close();
						ps = null;
					}
				} catch (SQLException e2) {
					e2.printStackTrace();
				}finally{
					try {
						if(conn!=null){
							conn.close();
							conn = null;
						}
					} catch (SQLException e2) {
						e2.printStackTrace();
					}
				}
			}
			
		}
		return zbtz;
	}
	
	
	
	
	
	
	
	
	public Zbtz(){}
	public Zbtz(String jlbh, String kmdm, String kmmc, String dwdm,
			String kmlx, String xtdm, String jhlx, String jhjd, String jhyf,
			String zybh, String zymc, String jje, String dje, String ye,
			String zdr, String shr, String shbz) {
		super();
		this.jlbh = jlbh;
		this.kmdm = kmdm;
		this.kmmc = kmmc;
		this.dwdm = dwdm;
		this.kmlx = kmlx;
		this.xtdm = xtdm;
		this.jhlx = jhlx;
		this.jhjd = jhjd;
		this.jhyf = jhyf;
		this.zybh = zybh;
		this.zymc = zymc;
		this.jje = jje;
		this.dje = dje;
		this.ye = ye;
		this.zdr = zdr;
		this.shr = shr;
		this.shbz = shbz;
	}
	
	public String getJlbh() {
		return jlbh;
	}
	public void setJlbh(String jlbh) {
		this.jlbh = jlbh;
	}
	public String getKmdm() {
		return kmdm;
	}
	public void setKmdm(String kmdm) {
		this.kmdm = kmdm;
	}
	public String getKmmc() {
		return kmmc;
	}
	public void setKmmc(String kmmc) {
		this.kmmc = kmmc;
	}
	public String getDwdm() {
		return dwdm;
	}
	public void setDwdm(String dwdm) {
		this.dwdm = dwdm;
	}
	public String getKmlx() {
		return kmlx;
	}
	public void setKmlx(String kmlx) {
		this.kmlx = kmlx;
	}
	public String getXtdm() {
		return xtdm;
	}
	public void setXtdm(String xtdm) {
		this.xtdm = xtdm;
	}
	public String getJhlx() {
		return jhlx;
	}
	public void setJhlx(String jhlx) {
		this.jhlx = jhlx;
	}
	public String getJhjd() {
		return jhjd;
	}
	public void setJhjd(String jhjd) {
		this.jhjd = jhjd;
	}
	public String getJhyf() {
		return jhyf;
	}
	public void setJhyf(String jhyf) {
		this.jhyf = jhyf;
	}
	public String getZybh() {
		return zybh;
	}
	public void setZybh(String zybh) {
		this.zybh = zybh;
	}
	public String getZymc() {
		return zymc;
	}
	public void setZymc(String zymc) {
		this.zymc = zymc;
	}
	public String getJje() {
		return jje;
	}
	public void setJje(String jje) {
		this.jje = jje;
	}
	public String getDje() {
		return dje;
	}
	public void setDje(String dje) {
		this.dje = dje;
	}
	public String getYe() {
		return ye;
	}
	public void setYe(String ye) {
		this.ye = ye;
	}
	public String getZdr() {
		return zdr;
	}
	public void setZdr(String zdr) {
		this.zdr = zdr;
	}
	public String getShr() {
		return shr;
	}
	public void setShr(String shr) {
		this.shr = shr;
	}
	public String getShbz() {
		return shbz;
	}
	public void setShbz(String shbz) {
		this.shbz = shbz;
	}
	private String jlbh;
	private String kmdm;
	private String kmmc;
	private String dwdm;
	private String kmlx;
	private String xtdm;
	private String jhlx;
	private String jhjd;
	private String jhyf;
	private String zybh;
	private String zymc;
	private String jje;
	private String dje;
	private String ye;
	private String zdr;
	private String shr;
	private String shbz;
}
