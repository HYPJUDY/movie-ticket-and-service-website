--created by Zihan Jiang

--!!!!!!!!!!!!!!!NOTE!!!!!!!!!!!!!!!
--I change the length of 'description' from 100 to 200

--'movieCast' means the actor/actress of the movie, I splited different names by one space

--I add a new attribute called 'theater'

--I add a new attribute called movieTime, which save today's movie time, 
--different times split by one space, each time has the format hh:mm

--I add a new attribute called trailer, which is a link to the movie's trailer on Youtube.

ALTER DATABASE CHARACTER SET "utf8";

CREATE TABLE Movie (
    id int not null auto_increment,
    movie_name char(30) not null,
    price double not null,
    description char(200) not null,
    moviePoster char(30) not null,
    movieAvgRating double not null,
    movieCast char(100) not null,
    movieDirection char(30) not null,
    movieGenre char(30) not null,
    movieDuration int not null,
    theater char(30) not null,
    movieTime char(100) not null,
    trailer char(100) not null,
    primary key (id)
);

INSERT INTO Movie VALUES(1, "神奇女侠", 28, "故事讲述盖尔·加朵饰演的亚马逊公主戴安娜·普林斯，经过在家乡天堂岛的训练，取得上帝赐予的武器与装备，化身神奇女侠，与克里斯·派恩饰演的空军上尉史蒂夫·特雷弗一同来到人类世界，一起捍卫和平、拯救世界，在一战期间上演了震撼人心的史诗传奇。",
						 "movies/1.jpg", 7.7, "盖尔·加朵 克里斯·派恩", "派蒂·杰金斯", "动作/冒险/奇幻", 141,
						 "映联万和广州南丰汇影城", "10:45 13:30 14:20 16:15 19:00", "https://www.youtube.com/watch?v=VSB4wGIdDwo");
INSERT INTO Movie VALUES(2, "加勒比海盗5：死无对证 ", 23, "亡灵萨拉查船长率领亡灵军队逃出百慕大三角区，扬言杀尽所有海盗，头号目标就是杰克船长。为对抗命运，杰克船长将起航寻找传说中海神波塞冬的三叉戟，因为这是能统治整个海洋的神器。波澜壮阔的海战争霸和史诗冒险就此展开。",
						 "movies/2.jpg", 7.6, "约翰尼·德普 哈维尔·巴登", "乔阿吉姆·罗恩尼", "动作/冒险/奇幻", 129,
						 "广州飞扬影城-正佳IMAX店", "13:30 15:55 18;20 20:45 23:10", "https://www.youtube.com/watch?v=Hgeu5rhoxxY");
INSERT INTO Movie VALUES(3, "摔跤吧！爸爸", 18, "本片为Mahavir Singh Phogat教授自己的两个女儿Babita Kumari和Geeta Phogat摔跤的传记片。Geeta后来成为了印度第一位女性摔跤运动员，在2010年的英联邦运动会上夺得了女子52Kg重量级的金牌，而她的姐姐Babita则获得了55Kg重量级的银牌。",
						 "movies/3.jpg", 8.6, "阿米尔·汗 法缇玛·萨那·纱卡", "尼特什·提瓦瑞", "喜剧/动作/家庭", 140,
						 "保利国际影城广州中环店", "13:00 14:05 16:40 19:15 21:50", "https://www.youtube.com/watch?v=x_7YlGv9u1g");
INSERT INTO Movie VALUES(4, "迷失Z城", 7.5, "1925年，英国探险家珀西·福斯特冒险进入亚马逊丛林寻找一个古老的文明，希望做出史上最重大的发现之一。几世纪来，欧洲人相信这个全世界最大的丛林隐藏着灿烂的黄金国。成千上万人因为寻找它而丧生，这使许多科学家相信，亚马逊丛林对人类有害。但福斯特已经花了几年时间准备他的科学案例。他同他的儿子启程，决心证明这个古老的、被他称作“Z”的文明是存在的。然后他的探险就销声匿迹了。",
						 "movies/4.jpg", 7.5, "查理·汉纳姆 罗伯特·帕丁森", "詹姆士·格雷", "动作/冒险/传记", 104,
						 "华影星美国际影城", "17:30 23:10", "https://www.youtube.com/watch?v=wwjtdOqTmrA");
--INSERT INTO Movie VALUES(5);
--INSERT INTO Movie VALUES(6);
--INSERT INTO Movie VALUES(7);
--INSERT INTO Movie VALUES(8);
--INSERT INTO Movie VALUES(9);
--INSERT INTO Movie VALUES(10);




						 
						 
						 
						 
