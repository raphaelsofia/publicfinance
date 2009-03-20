CREATE TABLE TadaRegAccounts(
       id int PRIMARY KEY,
       username VARCHAR2(50),
       password VARCHAR2(50)
);

CREATE SEQUENCE TRAccID_seq;

INSERT INTO TadaRegAccounts VALUES(1, 'xq', '123');

SELECT * FROM TadaRegAccounts;

DELETE FROM TadaRegAccounts;

--16科目表
CREATE TABLE Zw_kmb(
     id INTEGER PRIMARY KEY,
     dwdm VARCHAR (10) NULL,  
     kmdm VARCHAR (16) NULL, 
     kmmc VARCHAR (60) NULL,  
     zjm  VARCHAR (6) NULL,  
     kmtz CHAR (2) NULL,
     yefx CHAR (1) NULL,
     sldw VARCHAR(10) NULL,
     gg   VARCHAR(40) NULL,
     bmhs CHAR (1) NULL,
     xmhs CHAR (1) NULL   
);
CREATE SEQUENCE Zw_kmbID_seq;

--17科目汇总表
CREATE TABLE Zw_kmhz(
       id INTEGER PRIMARY KEY,
       dwdm VARCHAR (10) NULL,
       kmdm VARCHAR (16) NULL,
       ncye DECIMAL (16,2) NULL,
       ye DECIMAL (16,2) NULL,
       jjl_c DECIMAL (16,2) NULL,
       dlj_c DECIMAL (16,2) NULL,
       jfs DECIMAL (16,2) NULL,
       dfs DECIMAL (16,2) NULL,
       jlj DECIMAL (16,2) NULL,
       dlj DECIMAL (16,2) NULL,
       yf CHAR (2)
);

CREATE SEQUENCE Zw_kmhzID_seq;

INSERT INTO Zw_kmhz VALUES(2, 'xq1', '123',null,null,null,null,null,null,null,null,null);

SELECT * FROM Zw_kmhz;

DELETE FROM Zw_kmhz;


--18凭证明细
CREATE TABLE Zw_pzmx(
       id INTEGER  PRIMARY KEY,
       pzzh VARCHAR (12) NULL,
       dwdm VARCHAR (10) NULL,
       pzfh CHAR (4) NULL,
       hh INTEGER NULL,
       sjhh INTEGER NULL,
       zy VARCHAR (80) NULL,
       kmdm VARCHAR (16) NULL,
       fj VARCHAR (120) NULL,
       bmdm VARCHAR (10) NULL,
       fgdw VARCHAR(10) NULL,
       jje DECIMAL (16,2) NULL,
       dje DECIMAL (16,2) NULL,
       xmbh CHAR (2) NULL,
       wldw CHAR (4) NULL,
       wlgr CHAR (3) NULL,
       djs DECIMAL (30) NULL,
       jzrq TIMESTAMP NULL,
       shf CHAR (1) NULL,
       jzf CHAR (1) NULL,
       jzr VARCHAR (10) NULL,
       shr VARCHAR (10) NULL,
       cwzg VARCHAR (10) NULL,
       zdr VARCHAR (10) NULL,
       jhr VARCHAR (10) NULL,
       cnr VARCHAR (10) NULL,
       ldr VARCHAR (10) NULL,
       cnbh CHAR (4) NULL,
       zdbh CHAR (4) NULL,
       dzf CHAR (1) NULL,
       bkbh VARCHAR(10) NULL,
       zkbz CHAR(1) 

);

CREATE SEQUENCE Zw_pzmxID_seq;

--19凭证明细历史表
CREATE TABLE Zw_pzmxls(
       id INTEGER PRIMARY KEY,
       pzzh VARCHAR (12),
       dwdm VARCHAR (10),
       pzfh CHAR (4),
       yf CHAR(2),
       hh INTEGER,
       sjhh INTEGER NULL,
       zy VARCHAR (80) NULL,
       kmdm VARCHAR (16),
       fj VARCHAR (120) NULL,
       bmdm VARCHAR (10) NULL,
       fgdw VARCHAR(10) NULL,
       jje DECIMAL (16,2) NULL,
       dje DECIMAL (16,2) NULL,
       xmbh VARCHAR (2) NULL,
       wldw VARCHAR (4) NULL,
       wlgr VARCHAR (3) NULL,
       djs DECIMAL (30) NULL,
       jzrq TIMESTAMP  NULL,
       shf CHAR (1) NULL,
       jzf CHAR (1) NULL,
       jzr VARCHAR (10) NULL,
       shr VARCHAR (10) NULL,
       cCwzg VARCHAR (10) NULL,	
       zdr VARCHAR (10) NULL,	
       jhr VARCHAR (10) NULL,	
       cnr VARCHAR (10) NULL,	
       ldr VARCHAR (10) NULL,	
       cnbh CHAR (4) NULL,
       zdbh CHAR (4) NULL,
       dzf CHAR (1) NULL,
       bkbh VARCHAR(10) NULL,
       zkbz CHAR(1) NULL

);
CREATE SEQUENCE Zw_pzmxlsID_seq;

--20快速凭证
CREATE TABLE zw_kspz(
      id INTEGER PRIMARY KEY,
      xh INTEGER NULL,
      dwdm VARCHAR (10) NULL,
      kspzh CHAR (2) NULL,
      zy VARCHAR (80) NULL,
      kmdm VARCHAR (16) NULL,
      jje DECIMAL (16,2) NULL,
      dje DECIMAL (16,2) NULL

);
CREATE SEQUENCE Zw_kspzID_seq;

--21单位往来明细
CREATE TABLE Zw_dwwlmx(
      id INTEGER PRIMARY KEY,
      dwdm VARCHAR (10) NULL,
      wldw VARCHAR (4) NULL,
      pzfh CHAR (4) NULL,
      pzxh INTEGER NULL,
      kmdm VARCHAR (16) NULL,
      zy VARCHAR (80) NULL,
      yf CHAR (2) NULL,
      pzrq TIMESTAMP NULL,
      fprq TIMESTAMP NULL,
      fph VARCHAR (10) NULL,
      hth VARCHAR (10) NULL,
      jsfs CHAR (2) NULL,
      ywym VARCHAR (10) NULL,
      lxr VARCHAR (10) NULL,
      pjrq TIMESTAMP,
      jje DECIMAL (16,2) NULL,
      dje DECIMAL (16,2) NULL,
      ye DECIMAL (16,2) NULL,
      hxf CHAR (1) NULL,
      xgh VARCHAR (10) NULL,
      jzf CHAR (1) NULL

);
CREATE SEQUENCE Zw_dwwlmxID_seq;


--22个人往来明细表

CREATE TABLE Zw_grwlmx(
       id INTEGER PRIMARY KEY,
       dwdm VARCHAR (10) NULL,
       wlgr VARCHAR (3) NULL,
       yf CHAR (2) NULL,
       pzfh CHAR (4) NULL,
       pzxh INTEGER NULL,
       zy VARCHAR (80) NULL,
       kmdm VARCHAR (16) NULL,
       jje DECIMAL (16,2) NULL,
       dje DECIMAL (16,2) NULL,
       ye DECIMAL (16,2) NULL,
       hxf CHAR (1) NULL,
       xgh VARCHAR (10) NULL,
       djh VARCHAR (10) NULL,
       rq TIMESTAMP NULL,
       jzf CHAR (1) NULL
);
CREATE SEQUENCE Zw_grwlmxID_seq;

23
CREATE TABLE Zw_bmmx(
       id INTEGER NOT NULL PRIMARY KEY,
       dwdm VarChAR(10) NULL,
       bmdm VARCHAR(10) NULL,
       xmdm VARCHAR(2) NULL,
       fgdw VARCHAR(10) NULL,
       pzfh CHAR(4) NULL,
       pzxh INTEGER NULL,
       kmdm VARCHAR(16) NULL,
       y CHAR(2) NULL,
       zy VARCHAR(80)NULL,
       jje DECIMAL(16,2)NULL,
       dje DECIMAL(16,2)NULL,
       ncye DECIMAL(16,2)NULL,
       rq TIMESTAMP NULL,
       jzf Char(1) NULL

);
CREATE SEQUENCE Zw_bmmxID_seq;
24
CREATE TABLE Zw_zysjbb(
      id INTEGER NOT NULL PRIMARY KEY,
      fkdm VARCHAR(10)NULL,
      fkmc VARCHAR(40)NULL,
      fkzh VARCHAR(30)NULL,
      yhbh VARCHAR(10)NULL,
      yhmc VARCHAR(80)NULL,
      zdbh VARCHAR(10)NULL
);

CREATE SEQUENCE Zw_zysjbbID_seq;
25


CREATE TABLE Zw_bkpz(
      id INTEGER NOT NULL PRIMARY KEY,
      dwdm VARCHAR(10) NULL,
      bkbh VARCHAR(10) NULL,
      bkrq TIMESTAMP NULL,
      fkdm VARCHAR(10) NULL,
      fkmc VARCHAR(40) NULL,
      fkzh VARCHAR(30) NULL,
      yhbh VARCHAR(10) NULL,
      yhmc VARCHAR(80) NULL,
      bmdm VARCHAR(10) NULL,
      bmmc VARCHAR(80) NULL,
      dw VARCHAR(10) NULL,
      dwmc VARCHAR(40) NULL,
      zh VARCHAR(30) NULL,
      khhbh VARCHAR(10) NULL,
      khh VARCHAR(80)NULL,
      bkje DECIMAL(16,2) NULL,
      jedx VARCHAR(50) NULL,
      yt VARCHAR(60) NULL,
      kmdm VARCHAR(16) NULL,
      lry VARCHAR(10) NULL,
      shy VARCHAR(5) NULL,
      zzy VARCHAR(5) NULL,
      shf CHAR(1) NULL,
      zzf CHAR(1) NULL
);

CREATE SEQUENCE Zw_bkpzID_seq;
26 
CREATE TABLE Zw_slmx(
      id INTEGER NOT NULL PRIMARY KEY,
      dwdm VARCHAR(10) NULL,
      pzzh VARCHAR(12) NULL,
      pzfh VARCHAR(4) NULL,
      hh INTEGER NULL,
      kmdm VARCHAR(16) NULL,
      jzrq TIMESTAMP NULL,
      yf CHAR(2) NULL,
      zy VARCHAR(80) NULL,
      jje DECIMAL(16,2) NULL,
      dje DECIMAL(16,2) NULL,
      ye DECIMAL(16,2) NULL,
      ssl INTEGER NULL,
      fsl INTEGER NULL,
      dj DECIMAL(16,2) NULL,
      jc INTEGER NULL,
      jzf CHAR(1) NULL
};
CREATE SEQUENCE Zw_slmxID_seq;
27
CREATE TABLE Zw_slhz(
      id INTEGER NOT NULL PRIMARY KEY,
      dwdm VARCHAR(10) NULL,
      kmdm VARCHAR(16) NULL,
      ncjc INTEGER NULL,
      yf CHAR(2) NULL,
      sr INTEGER NULL,
      fc INTEGER NULL,
      srlj INTEGER NULL,
      fclj INTEGER NULL,
      jc INTEGER NULL
      
};
CREATE SEQUENCE Zw_slhzID_seq;
28
CREATE TABLE Zw_yskm(
      id INTEGER NOT NULL PRIMARY KEY,
      dwdm VARCHAR(10) NULL,
      yskm VARCHAR(16) NULL,
      kmdm VARCHAR(16) NULL,
      kmlx VARCHAR(2) NULL

};
CREATE SEQUENCE Zw_yskmID_seq;
29
CREATE TABLE Zw_zzpz(
      id INTEGER NOT NULL PRIMARY KEY,
      lxdm VARCHAR(2) NULL,
      dwdm VARCHAR(10) NULL,
      flh INTEGER NULL,
      zy  VARCHAR(80) NULL,
      pzjf VARCHAR(1) NULL,
      jzgs VARCHAR(80) NULL,
      kmdm VARCHAR(16) NULL,
      kmmc VARCHAR(80) NULL,
      hh INTEGER NULL,
      fxbz VARCHAR(1) NULL,
      zcbz VARCHAR(1) NULL,
      lxbz VARCHAR(1) NULL,
      bmdm VARCHAR(10) NULL,
      xmdm VARCHAR(10) NULL,
      wldw VARCHAR(4) NULL,
      wlgr VARCHAR(3) NULL,
      beiz VARCHAR(40) NULL
};
CREATE SEQUENCE Zw_zzpzID_seq;

--2.4.9.1.	单位信息表 Pub_dw


CREATE TABLE Pub_dw(
      id INTEGER NOT NULL PRIMARY KEY,
      bmdm VARCHAR(10) NULL,
      dwdm VARCHAR(10) NULL,
      dwmc  VARCHAR(40) NULL,
      lxdm CHAR(2) NULL,
      zwrq TIMESTAMP NULL,
      gzrq TIMESTAMP NULL,
      zcrq TIMESTAMP NULL,
      zwcsh CHAR(1) NULL,
      zccsh CHAR(1) NULL,
      zh VARCHAR(30) NULL,
      khh VARCHAR(80) NULL,
      zwnd CHAR(4) NULL,
      gznd CHAR(4) NULL,
      zcnd CHAR(4) NULL

);

CREATE SEQUENCE Pub_dwID_seq;

INSERT INTO Pub_dw VALUES(2, '321', 'xq','小卖部',null,null,null,null,null,null,null,null,null,null,null);

SELECT * FROM Pub_dw;

DELETE FROM Pub_dw;

DROP TABLE Pub_dw;
