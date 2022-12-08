
use pritamdb;
create table bank(
acc_no integer primary key auto_increment,
acc_holder varchar(20) not null,
ifsc_code varchar(10) unique not null,
branch varchar(10),
acc_type varchar(10),
balance numeric(12,2) check(balance>1999),
pin numeric(4) unique not null);