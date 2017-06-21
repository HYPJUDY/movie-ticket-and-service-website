--created by Zihan Jiang

--!!!!!!!!!!!!!!!NOTE!!!!!!!!!!!!!!!
--I change the length of 'description' from 100 to 200

--'cast' means the actor/actress of the movie, I splited different names by one space

--I add a new attribute called 'time', which save movie's play time, 
--different times split by one space, each time has the format hh:mm

--I add a new attribute called 'trailer', which is a link to the movie's trailer on Youtube.

ALTER DATABASE CHARACTER SET "utf8";

CREATE TABLE Movie (
    id int not null auto_increment,
    movie_name char(30) not null,
    price double not null,
    description char(200) not null,
    poster char(30) not null,
    rating double not null,
    cast char(100) not null,
    direction char(30) not null,
    genre char(30) not null,
    duration int not null,
    time char(100) not null,
    trailer char(100) not null,
    primary key (id)
);

INSERT INTO Movie VALUES(1, "神奇女侠", 28, "故事讲述盖尔·加朵饰演的亚马逊公主戴安娜·普林斯，经过在家乡天堂岛的训练，取得上帝赐予的武器与装备，化身神奇女侠，与克里斯·派恩饰演的空军上尉史蒂夫·特雷弗一同来到人类世界，一起捍卫和平、拯救世界，在一战期间上演了震撼人心的史诗传奇。", "1.jpg", 7.7, "盖尔·加朵 克里斯·派恩", "派蒂·杰金斯", "动作/冒险/奇幻", 141,"10:45 13:30 14:20 16:15 19:00", "https://www.youtube.com/embed/VSB4wGIdDwo");
INSERT INTO Movie VALUES(2, "加勒比海盗5：死无对证 ", 23, "亡灵萨拉查船长率领亡灵军队逃出百慕大三角区，扬言杀尽所有海盗，头号目标就是杰克船长。为对抗命运，杰克船长将起航寻找传说中海神波塞冬的三叉戟，因为这是能统治整个海洋的神器。波澜壮阔的海战争霸和史诗冒险就此展开。", "2.jpg", 7.6, "约翰尼·德普 哈维尔·巴登", "乔阿吉姆·罗恩尼", "动作/冒险/奇幻", 129, "13:30 15:55 18:20 20:45 23:10", "https://www.youtube.com/embed/Hgeu5rhoxxY");
INSERT INTO Movie VALUES(3, "摔跤吧！爸爸", 18, "本片为Mahavir Singh Phogat教授自己的两个女儿Babita Kumari和Geeta Phogat摔跤的传记片。Geeta后来成为了印度第一位女性摔跤运动员，在2010年的英联邦运动会上夺得了女子52Kg重量级的金牌，而她的姐姐Babita则获得了55Kg重量级的银牌。", "3.jpg", 8.6, "阿米尔·汗 法缇玛·萨那·纱卡", "尼特什·提瓦瑞", "喜剧/动作/家庭", 140, "13:00 14:05 16:40 19:15 21:50", "https://www.youtube.com/embed/x_7YlGv9u1g");
INSERT INTO Movie VALUES(4, "迷失Z城", 18, "1925年，英国探险家珀西·福斯特冒险进入亚马逊丛林寻找一个古老的文明，希望做出史上最重大的发现之一。几世纪来，欧洲人相信这个全世界最大的丛林隐藏着灿烂的黄金国。成千上万人因为寻找它而丧生，这使许多科学家相信，亚马逊丛林对人类有害。但福斯特已经花了几年时间准备他的科学案例。他同他的儿子启程，决心证明这个古老的、被他称作Z的文明是存在的。然后他的探险就销声匿迹了。", "4.jpg", 7.5, "查理·汉纳姆 罗伯特·帕丁森", "詹姆士·格雷", "动作/冒险/传记", 104,"17:30 23:10", "https://www.youtube.com/embed/wwjtdOqTmrA");
INSERT INTO Movie VALUES(5, "美好的意外", 33, "幼年时期的心理创伤所造成的阴影，使得女辩护律师妍雨向来独来独往。而在一个偶然的机会下，崇尚独身主义的她却意外的有了一周的时间，扮演两个孩子的母亲、以及一名妻子的角色。","5.jpg", 7.1, "桂纶镁 王景春 欧阳娜娜", "何蔚庭", "奇幻/剧情/喜剧", 104, "15:45 18:10 19:40", "https://www.youtube.com/embed/Tba73MbxVjw");
INSERT INTO Movie VALUES(6, "荡寇风云", 33, "根据中华民族英雄戚继光的事迹改编，讲述了明嘉靖年间，倭寇在中国沿海烧杀掳掠，在剿倭战争节节失利的情况下，一代名将戚继光（赵文卓饰）组建中国历史上首支 特种部队 戚家军，独创鸳鸯阵，装备狼筅, 三眼铳, 虎蹲炮等先进武器，与俞大猷将军（洪金宝饰）联合扫平倭患怒破千军，实现 封侯非我意，但愿海波平 志向的故事。","6.jpg", 6.7, "赵文卓 万茜 洪金宝", "陈嘉上", "动作/战争", 120, "16:10 18:40 21:20", "https://www.youtube.com/embed/nL0jOIN_ukQ");
INSERT INTO Movie VALUES(7, "吃吃的爱", 33, "想要在巨星姐姐面前证明自己的18线小演员上官娣娣，和多年期待真爱却在最后被狠狠出卖的空间站黑鸟面馆老板娘许春梅，当两个人的世界以想象不到的方式不期而遇，她们的命运会发生什么样的改变?","7.jpg", 6.3, "徐熙娣 林志玲 金世佳", "蔡康永", "喜剧/奇幻/爱情", 90,"16:25 18:05 19:45 21:25 23:05", "https://www.youtube.com/embed/jReEfklqujI");
INSERT INTO Movie VALUES(8, "异星觉醒 ", 33, "几位漂浮在空间站的宇航员们发现了一个来自火星的“神秘样本”，这个样本其实就是他们一直在找寻的高智能“智慧生命体”。它不仅集肌细胞、神经细胞于一体，更拥有超强大脑，能够进行超能进化。但却不知其体内竟然暗藏巨大的杀机，导致整个空间站都弥漫着死亡的气息，人类的命运也危在旦夕。", "8.jpg", 7.2, "杰克·吉伦哈尔 丽贝卡·弗格森", "丹尼尔·伊斯皮诺萨", "恐怖/科幻/惊悚", 103,"17:10 21:10", "https://www.youtube.com/embed/gq8tmWoy-20");
INSERT INTO Movie VALUES(9, "新木乃伊", 23, "影片讲述了千年前的古埃及公主阿玛内特因权力欲望走上黑暗之路，被反抗者制作成木乃伊深埋黄沙之下，千年以后阿玛内特公主得以重返人间，她决定运用自己的黑暗力量夺回失去的一切的故事。","9.jpg", 7.9, "汤姆·克鲁斯 索菲亚·宝特拉", "艾里克斯·库兹曼", "动作/冒险/奇幻", 106,"00:00 00:05", "https://www.youtube.com/embed/GjSTDwV2NNg");
INSERT INTO Movie VALUES(10, "变形金刚5：最后的骑士", 45, "千年之后，地球陷入毁灭危机。以凯德·伊格尔（马克·沃尔伯格饰）、艾德蒙·伯顿爵士（安东尼·霍普金斯饰）、伊莎贝拉（伊莎贝拉·莫奈饰）为首的人类反抗小组，与汽车人联手反击霸天虎在内的入侵者，一场史诗浩劫彻底将地球变成了战场。","10.jpg", 7.1, "马克·沃尔伯格 安东尼·霍普金斯", "迈克尔·贝", "动作/冒险/科幻", 165,"00:00 00:05 10:50 11:20 12:05", "https://www.youtube.com/embed/e_uBTsgRJlk");
