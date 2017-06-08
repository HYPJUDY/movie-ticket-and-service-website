--通过以下命令创建数据库

ALTER DATABASE CHARACTER SET "utf8";
CREATE TABLE Customer (
     customer_name CHAR(30) NOT NULL,
     password char(30) not null

);

CREATE TABLE Movie(
    id int not null auto_increment,
    movie_name char(30) not null,
    price double not null,
    description char(100) not null,
    poster char(30) not null,
    rating double not null,
    cast char(100) not null,
    direction char(30) not null,
    genre char(30) not null,
    duration int not null,
    primary key (id)
);

CREATE TABLE OrderTable(
    id int not null auto_increment,
    customer_name char(30),
    expenditure double not null,
    movie_name char(30) not null,
    seating char(30) not null,
    play_time char(30) not null,
    ticket_count int not null,
    primary key(id)
);

CREATE TABLE Role (
    role_id int(11) not null,
    role_name char(20) not null,
    primary key(role_id)
);

CREATE TABLE Customer_Role (
    role_id int(11) not null,
    customer_name char(30) not null
);

CREATE TABLE Permission(
    permission_id int(11) not null,
    permission_name char(20) not null,
    primary key(permission_id)
);

CREATE TABLE Role_Permission(
    permission_id int(11) not null,
    role_id int(11) not null
);

INSERT INTO Customer VALUES("linxp", "password");
INSERT INTO Role VALUES(0, "CustomerVIP");
INSERT INTO Permission VALUES(0, "Dischange");
INSERT INTO Role_Permission VALUES(0, 0);
INSERT INTO Customer_Role VALUES(0, "linxp");
