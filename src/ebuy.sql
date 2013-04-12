--ebuy电子商城数据库脚本
--glf
--20130410


--Customer 表
CREATE TABLE Customer
(
	c_id int(11) not null AUTO_INCREMENT primary key,
	c_name varchar(30) not null,
	c_pass varchar(30) not null,
	c_header varchar(30) not null,
	c_phone char(15) not null,
	c_question varchar(30) not null,
	c_answer varchar(30) not null,
	c_address varchar(50) null,
	c_email varchar(50) not null
)

--Product 表(产品表)
CREATE TABLE Product
(
	p_id int(11) not null AUTO_INCREMENT primary key,
	p_type varchar(30) not null,
	p_name varchar(40) not null,
	p_price double not null,
	p_quantity int not null,
	p_image varchar(100) not null,
	p_description varchar(2000) not null,
	p_time datetime null
)

--Idea 表(客户反馈的信息)
CREATE TABLE Idea
(
	id int(10) not null AUTO_INCREMENT primary key,
	c_name varchar(30) not null,
	c_header varchar(30) not null,
	new_message varchar(1000) not null,
	re_message varchar(1000) null,
	new_time datetime not null,
	re_time char(15) null
)

--Notice 表(公告栏信息)
CREATE TABLE Notice
(
	n_id int(10) not null AUTO_INCREMENT primary key,
	n_message varchar(1000)  not null,
	n_admin char(30) not null,
	n_header varchar(50) not null,
	n_time datetime not null
)

--Payment 表(支付信息)
CREATE TABLE Payment
(
	pay_id int(10) not null AUTO_INCREMENT primary key,
	pay_way varchar(50) not null,
	pay_msg varchar(500) null
)

--Orders 表(订单表)
CREATE TABLE Orders
(
	order_id int(10) not null AUTO_INCREMENT primary key,
	order_itemid int(10) not null,
	order_payment varchar(100) not null,
	order_address varchar(200) not null,
	order_email varchar(50) not null,
	order_user varchar(30) not null,
	order_time datetime not null,
	order_sum double not null
)

--OrderDetails 表(详细订单表)
CREATE TABLE OrderDetails
(
	detail_id int(10) not null AUTO_INCREMENT primary key,
	order_id int(10) not null,
	p_id char(10) not null,
	p_name char(20) not null,
	p_price double not null,
	p_number int not null,
	p_cost double not null
)

--Admin 表
CREATE TABLE Admin
(
	a_id int(11) not null primary key AUTO_INCREMENT,
	a_name varchar(30) not null,
	a_pass varchar(30) not null,
	a_header varchar(30) not null,
	a_phone char(15) not null,
	a_email varchar(40) not null
)

--main_type 表(菜单类别)
CREATE TABLE main_type
(
	t_id int(11) not null primary key AUTO_INCREMENT,
	t_type varchar(30) not null
)