CREATE DATABASE fooddelivery;
use fooddelivery;
CREATE TABLE user (
    id BIGINT NOT NULL AUTO_INCREMENT,
    email VARCHAR(55) NOT NULL UNIQUE,
    password text NOT NULL,
    firstname VARCHAR(55) NOT NULL,
    lastname VARCHAR(55),
    PRIMARY KEY (id)
);

create table product(
  id bigint not null auto_increment primary key,
  title varchar(50),
  description text,
  image varchar(255),
  price double not null,
  discount double default 0);
  insert into product (title,description,image,price,discount) values ("burger","very yummy","url",20,0);
  commit;
create table orders(
  id bigint not null auto_increment primary key,
  user_id bigint ,
  orderdate timestamp default current_timestamp(),
  address varchar(100) not null,
  phone varchar(20) not null,
  total double not null,
  subtotal double not null,
  delivery_fee double not null,
  status varchar(50),
  foreign key (user_id) references user(id) on delete cascade);
create table order_item(
   id bigint not null auto_increment primary key,
   order_id bigint,
   product_id bigint,
   quantity int default 1,
   foreign key (order_id) references orders(id) on delete cascade,
   foreign key (product_id) references product(id) on delete cascade
   );
drop table order_item;
drop table orders;
