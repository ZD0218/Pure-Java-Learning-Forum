-- 如果数据库已经存在则删除 
drop database if exists javaforum;
-- 创建数据库javaforum并指定编码和排序规则
CREATE DATABASE javaforum CHARACTER SET utf8 COLLATE utf8_general_ci;
-- 切换到javaforum数据库
use javaforum;

-- 创建用户表：user
create table user(
	id	int not null auto_increment,
	username varchar(20) not null,
	password varchar(20) not null,
	sex varchar(10),
	personalDescription varchar(200),
	primary key(id)
);

-- 创建版块表：block
create table block(
	id int not null auto_increment,
	title varchar(20) not null,
	content varchar(500) not null,
	level int not NULL,
	primary key(id)
);

-- 创建帖子表：post
create table post(
	id int not null auto_increment,
	title varchar(80) not null,
	content varchar(2000),
	postTime Date not null,
	updateTime Date not null,
	block_id int not null,
	user_id int not null,
	primary key(id),
	foreign key(block_id) references block(id),
	foreign key(user_id) references user(id)
);

-- 创建回帖表：comment
create table comment(
	id int not null auto_increment,
	content varchar(500),
	postTime Date not null,
	updateTime Date not null,
	post_id int not null,
	user_id int not null,
	primary key(id),
	foreign key(post_id) references post(id),
	foreign key(user_id) references user(id)
);

-- 创建黑名单表：blacklist
create table blacklist(
	id int not null auto_increment,
	user_id int not null,
	primary key(id),
	foreign key(user_id) references user(id)
);