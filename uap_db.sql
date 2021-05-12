INSERT INTO FILM_067 (judul,sinopsis,tahun,aktor,rating)
VALUES
('StartUp','Perebutan saham antara anggota Samsan Tech',2020,'Nam Joo Hyuk, Bae Suzy, Kim Seon Ho',8.8),
('Game of Thrones','Intinya series ini udah banyak bange',2013,'Emilia Clarke, Peter Dinklage, Kit Harington',9.3),
('Homeland','Agen CIA Carrie Mathison sedang mencari tahanan Amerika',2014,'Rupert Friend,Claire Danes,Maury Sterling',8.3),
('Hobbs and Shaw','Tim agen MI6 berusaha untuk menghentikan penyebaran virus',2019,'Dwayne Johnson, Jason Statham, Idris Elba',6.4),
('Pengabdi Setan','Serem banget pas ibunya bunyiin kerincingan weh',2017,'Tara Basro, Ayu Laksmi, Endy Arfian',6.6),
('Dilan 1991','Kamu jangan rindu, itu berat kamu gak akan kuat',2019,'Iqbaal Ramadhan, Vanesha Prescilla, Jerome Kurnia',6.4),
('Big Hero 6','Kisah tentang Baymax si robot imut.',2014,'T. J. Miller, Jamie Chung, Maya Rudolph',7.7)

INSERT INTO USER_067 (username,email,katasandi,bio,nama)
VALUES
('iwingiwing','iwingiwing@gmail.com','lidya123','eat sleep movie repeat','diena'),
('wuvel','wuvel@ub.ac.id','wuvellato','hai','ahmad wuvel'),
('pquin','quin@gmail.com','quinquin','hi there im using netflix','Piquin'),
('winterfox57','winterfox57@gmail.com','112233Winter','Hello World!','Belah'),
('admin','admin@netflix.com','admin321','aku admin','ncupp')

INSERT INTO REVIEW_067
(id_film,username,isi,rating,timestamp) VALUES
(213,'pquin','TOP BANGET GAN',5.0,'2020-10-19'),
(211,'iwingiwing','Parah gokil abizz',9.0,'2020-11-11'),
(211,'winterfox57','belum kelar dramanya :(',6.0,'2020-11-22'),
(212,'iwingiwing','wow',6.4,'2020-11-05'),
(216,'admin','bagus pake banget',7.5,'2020-11-09'),
(211,'wuvel','seru banget ga bohong',8.5,'2020-10-10'),
(215,'wuvel','ga sesuai ekspektasi ku hmm',4.1,'2020-11-11')
INSERT INTO KATEGORI_067 (nama_kategori) VALUES
('drama'),('komedi'),('action'),('horror'),('thriller'),
('animation'),('romance'),('technology'),('romance'),('fantasy')

INSERT INTO KATEGORI_FILM_067 (id_film,id_kategori) VALUES
(211,311),(211,317),(211,318),(212,320),(212,311),
(213,311),(213,315),(214,312),(214,313),(215,314),
(215,315),(216,312),(216,317),(217,312),(217,316)