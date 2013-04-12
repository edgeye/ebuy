select * from product;

insert into product values(1, '笔记本', 'computer', 4000, 1, 'a', 'good', '2012-04-12');
insert into product values(2, '手机', 'computer', 4000, 1, 'a', 'good', '2012-05-14');
insert into product values(3, '空调', 'computer', 4000, 1, 'a', 'good', '2012-06-28');
insert into product values(4, '火车', 'computer', 4000, 1, 'a', 'good', '2012-05-24');
insert into product values(5, '笔记本', 'computer', 4000, 1, 'a', 'good', '2012-04-21');
insert into product values(6, '手机', 'computer', 4000, 1, 'a', 'good', '2012-05-26');
insert into product values(7, '空调', 'computer', 4000, 1, 'a', 'good', '2012-06-25');
insert into product values(8, '火车', 'computer', 4000, 1, 'a', 'good', '2012-05-24');

drop table OrderDetails;

select * from admin;

select * from orders;

select * from orderdetails;

select * from payment;
insert into payment values(1, 'bank', 'aaa');
insert into payment values(2, 'alipay', 'bbb');
insert into payment values(3, 'phone', 'ccc');

insert into main_type values(1, '计算机');
insert into main_type values(2, '马路');

select * from admin;
select * from product;
select * from product where p_type = '笔记本' and p_name like '%com%';

drop table product;

select * from customer;

select * from idea;

drop table Notice;
drop table Orders;
drop table orders;

select * from notice;

insert into idea values(1, 'alex', '111', );

insert into notice values(1, '1234321543', 'emily', 'good', '2012-04-12');
insert into notice values(2, 'fdsafdsafd', 'emily', 'good', '2012-04-12');
insert into notice values(3, 't45u65jhr6u', 'emily', 'good', '2012-04-12');
insert into notice values(4, '464f3t2fdsa', 'emily', 'good', '2012-04-12');
insert into notice values(5, '54479909909', 'emily', 'good', '2012-04-12');
insert into notice values(6, '54479909909', 'emily', 'good', '2012-04-12');
insert into notice values(7, '54479909909', 'emily', 'good', '2012-04-12');
insert into notice values(8, '54479909909', 'emily', 'good', '2012-04-12');