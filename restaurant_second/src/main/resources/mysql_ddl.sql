--通过以下命令创建数据库
--young dou

ALTER DATABASE CHARACTER SET "utf8";
CREATE TABLE Customer (
     customer_name CHAR(30) NOT NULL,
     password char(30) not null,
	 primary key(customer_name)
);

CREATE TABLE Dish(
    id int not null auto_increment,
    name char(30) not null,
    price double not null,
    description char(100) not null,
    pic char(30) not null,
    primary key (id)
);

CREATE TABLE OrderTable(
    id int not null auto_increment,
    customerName char(30),
    expenditure double not null,
    dishName char(30) not null,
    dishCount int not null,
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

INSERT INTO Customer VALUES("youngdou", "password");
INSERT INTO Role VALUES(0, "CustomerVIP");
INSERT INTO Permission VALUES(0, "Dischange");
INSERT INTO Role_Permission VALUES(0, 0);
INSERT INTO Customer_Role VALUES(0, "youngdou");

INSERT INTO Dish VALUES(1, "扬州炒饭", 32.0, "飘香米饭，材料丰富", "menu1.jpg");
INSERT INTO Dish VALUES(2, "鲜虾粥", 12.0, "鲜甜河虾，回味无穷", "menu2.jpg");
INSERT INTO Dish VALUES(3, "三明治", 12.0, "新鲜美味，健康有机", "menu3.jpg");
INSERT INTO Dish VALUES(4, "牛肉面", 15.0, "正宗牛肉", "menu4.jpg");
INSERT INTO Dish VALUES(5, "章鱼小丸子", 12.0, "酱香浓郁", "menu5.jpg");
INSERT INTO Dish VALUES(6, "鸡扒饭", 11.0, "香脆鸡扒", "menu6.jpg");
INSERT INTO Dish VALUES(7, "虾饺", 17.0, "味道鲜美爽滑，美味可口。", "9.jpg");