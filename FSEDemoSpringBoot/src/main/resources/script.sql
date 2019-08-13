create schema customerdb;
use customerdb;
create table customer (
customer_id int auto_increment primary key,
full_name varchar(100) not null,
email_address varchar(50) not null,
mobile_number bigint not null,
date_of_birth date,
acive_flag int default 1);