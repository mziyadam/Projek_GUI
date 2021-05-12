
create database projek

use projek

CREATE TABLE DEPARTEMEN 
    (
     ID_Departemen varchar (25) primary key NOT NULL , 
     Nama_Departemen VARCHAR (50) NOT NULL , 
     Nomor_Telepon VARCHAR (15) NOT NULL , 
     Alamat VARCHAR (50) NOT NULL , 
     Manager_ID varchar(25) not null
	 )
GO 


CREATE TABLE KARYAWAN 
    (
     ID_Karyawan varchar (25) primary key NOT NULL , 
     Nama_Karyawan VARCHAR (30) NOT NULL , 
     Gaji VARCHAR (30) NOT NULL , 
	 ID_Departemen varchar(25)
     
	 )
GO 


CREATE TABLE MANAGER 
    (
     ID_Manager varchar (25) primary key NOT NULL , 
     Nama_Manager VARCHAR (30) NOT NULL , 
     ID_Departemen varchar(25)
	 )
GO 


CREATE TABLE PEMBELI 
    (
     ID_Pembeli varchar (25) primary key NOT NULL , 
     Nama_Pembeli VARCHAR (30) NOT NULL , 
     Nomor_Pembeli VARCHAR (15) NOT NULL , 
     Alamat_Pembeli VARCHAR (50) NOT NULL , 
     
	 )
GO 


CREATE TABLE PENGIRIM 
    (
     ID_Pengirim varchar (25)primary key NOT NULL , 
     Nama_Pengirim VARCHAR (30) NOT NULL , 
     Nomor_Pengirim VARCHAR (15) NOT NULL , 
     
	 )
GO 



CREATE TABLE PRODUK 
    (
     ID_Produk VARCHAR (25)primary key NOT NULL , 
     Nama_Produk VARCHAR (30) NOT NULL , 
     Harga_Produk VARCHAR (30) NOT NULL , 
     Jumlah_Produk varchar (25) NOT NULL , 
     
	 )
GO


CREATE TABLE TRANSAKSI 
    (
     ID_Transaksi varchar (25)primary key NOT NULL , 
     Tanggal DATE NOT NULL , 
     Jumlah_Transaksi VARCHAR (30) NOT NULL , 
     ID_Pembeli varchar(25),
	 ID_Produk varchar(25)
	 )
GO 




INSERT INTO PEMBELI 
VALUES ('1100', 'Hafidz', '081234770000', 'Jl. Wahid Hasyim, No.05, Jaksel')

INSERT INTO PENGIRIM 
VALUES ('1999', 'Antoni', '08777631111')

INSERT INTO PRODUK 
VALUES ('P1_salmon', 'Ikan Salmon', '270000', '100')

INSERT INTO PRODUK 
VALUES ('P2_tenggiri', 'Ikan Tenggiri', '100000', '100')
INSERT INTO PRODUK 
VALUES ('P3_tongkol', 'Ikan Tongkol', '35000', '100')
INSERT INTO PRODUK 
VALUES ('P4_kakap', 'Ikan Kakap', '70000', '100')
INSERT INTO PRODUK 
VALUES ('P5_lobster', 'Lobster', '165000', '100')
INSERT INTO PRODUK 
VALUES ('P6_kerang', 'Kerang Tiram', '40000', '100')
INSERT INTO PRODUK 
VALUES ('P7_kepiting', 'Kepiting', '90000', '100')
INSERT INTO PRODUK 
VALUES ('P8_udang', 'Udang', '75000', '100')

INSERT INTO TRANSAKSI 
VALUES ('10225', '05-10-2020', '5000000','1100','P8_udang')


insert into karyawan values ('2008','muhammad rizal','2000000','20')
insert into karyawan values ('2001','rimba sany','1750000','21')
insert into karyawan values ('2002','suci ayu','2000000','22')
insert into karyawan values ('2003','Queen Safira','2000000','23')
insert into karyawan values ('2004','Yusairyan naufaldi','1750000','24')
insert into karyawan values ('2005','azizah azahra','1500000','25')
insert into karyawan values ('2006','mefta aureli','2500000','23')
insert into karyawan values ('2007','marvel inosyafa','1750000','21')
insert into karyawan values ('2009','dinda safira','2500000','23')
insert into karyawan values ('2010','akhsa rian','1800000','24')

insert into departemen values ('20','dpt_keamanan',' 08158893730',' Jl. Jati Negara, No.15, Jaktim','2000')
insert into departemen values ('21','dpt_keuangan','09177893000',' Jl. Kramat jati, No.06, Jaktim','2001')
insert into departemen values ('22','dpt_marketing','09177682830',' Jl. Pulo Gadung, No.34, Jaktim','2002')
insert into departemen values ('23','dpt_logistic','08244442830',' Jl. Pulo Gadung, No.56, Jaktim','2003')
insert into departemen values ('24','dpt_personalia','012354467730',' Jl. Duren sawit, No.09, Jaktim','2004')
insert into departemen values ('25','dpt_administrasi',' 08158893730',' Jl. Jati Negara, No.15, Jaktim','2005')

exec addManager '2008','muhammad rizal','20'
exec addManager '2001','rimba sany','21'
exec addManager '2002','suci ayu','22'
exec addManager '2003','Queen Safira','23'
exec addManager '2004','Yusairyan naufaldi','24'
exec addManager '2005','azizah azahra','25'
/*2001 rimba sany 1750000 21
2002 suci ayu 2000000 22
2003 Queen Safira 2000000 23
2004 Yusairyan naufaldi 1750000 24
2005 azizah azahra 1500000 25
2006 mefta aureli 2500000 23
2007 marvelino syafa 1750000 21
2008 muhammad rizal 2000000 20
2009 dinda safira 2500000 23
2010 akhsa rian 1800000 24


21 dpt_keuangan 09177893000 Jl. Kramat jati, No.06, Jaktim
22 dpt_marketing 09177682830 Jl. Pulo Gadung, No.34, Jaktim
23 dpt_logistic 08244442830 Jl. Pulo Gadung, No.56, Jaktim
24 dpt_personalia 012354467730 Jl. Duren sawit, No.09, Jaktim
25 dpt_ administrasi 08158893730 Jl. Jati Negara, No.15, Jaktim*/

SELECT * FROM DEPARTEMEN
select * from KARYAWAN
exec getAllKaryawan
exec getAllManager
SELECT * FROM PEMBELI
SELECT * FROM PENGIRIM
SELECT * FROM PRODUK
SELECT * FROM TRANSAKSI

Go
CREATE or alter PROCEDURE getAllDepartemen
AS 
SELECT * FROM DEPARTEMEN
Go

create or alter procedure getAllKaryawan
AS 
SELECT k.ID_Karyawan,k.Nama_Karyawan,k.Gaji,d.Nama_Departemen 
FROM KARYAWAN k join DEPARTEMEN d on k.ID_Departemen=d.ID_Departemen
Go

create or alter procedure getAllManager
AS 
SELECT m.ID_Manager,m.Nama_Manager,d.Nama_Departemen 
FROM MANAGER m join DEPARTEMEN d on m.ID_Departemen=d.ID_Departemen
Go

create or alter procedure getAllPembeli
AS 
SELECT * FROM PEMBELI
Go

create or alter procedure getAllPengirim
AS 
SELECT * FROM PENGIRIM
Go

create or alter procedure getAllProduk
AS 
SELECT * FROM PRODUK
Go

create or alter procedure getAllTransaksi
AS
SELECT * FROM TRANSAKSI
go

create or alter procedure addDepartemen (@i varchar(25),@na varchar(50),@no varchar(15),@al varchar(50),@ma varchar(25))
as
insert into DEPARTEMEN values (@i,@na,@no,@al,@ma)
go

create or alter procedure addKaryawan (@i varchar(25),@na varchar(30),@ga varchar(30),@de varchar(25))
as
insert into Karyawan values (@i,@na,@ga,@de)
go

create or alter procedure addManager (@i varchar(25),@na varchar(30),@de varchar(25))
as
insert into Manager values (@i,@na,@de)
go

create or alter procedure addPembeli (@i varchar(25),@na varchar(30),@ga varchar(15),@de varchar(50))
as
insert into Pembeli values (@i,@na,@ga,@de)
go

create or alter procedure addPengirim (@i varchar(25),@na varchar(30),@de varchar(15))
as
insert into Pengirim values (@i,@na,@de)
go

create or alter procedure addProduk (@i varchar(25),@na varchar(30),@ga varchar(30),@de varchar(25))
as
insert into Produk values (@i,@na,@ga,@de)
go

create or alter procedure addTransaksi (@i varchar(25),@dat date,@na varchar(30),@ga varchar(25),@de varchar(25))
as
insert into Transaksi values (@i,@na,@dat,@ga,@de)
go


--drop all
--EXEC sp_MSforeachtable @command1 = "DROP TABLE ?"

