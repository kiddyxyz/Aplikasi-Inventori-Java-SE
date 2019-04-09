create table product(
 id int IDENTITY(1,1) PRIMARY KEY,
 name varchar(200) NOT NULL,
 product_type varchar(200),
 stock int,
 price bigint,
 expired date NULL
);