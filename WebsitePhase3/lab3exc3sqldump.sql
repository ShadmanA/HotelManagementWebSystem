CREATE TABLE ROOM(
id INT NOT NULL AUTO_INCREMENT,
Primary KEY (id),
roomno INT NOT NULL,
UNIQUE(roomno),
bedno int NOT NULL,
balno INT NOT NULL,
startDate DATE NOT NULL,
dueDate DATE NOT NULL,
available bit
);


CREATE TABLE USER
(
fullname VARCHAR(100),
email VARCHAR(40) NOT NULL,
UNIQUE(email),
address VARCHAR(60),
phone VARCHAR(22),
userid INT NOT NULL AUTO_INCREMENT,
Primary KEY (userid),
username VARCHAR(33) NOT NULL,
password VARCHAR(33) NOT NULL,
UNIQUE(username)
);

CREATE TABLE User_ROOM_Book
(
roomid INT NOT NULL,
userid INT NOT NULL,
startDate DATE NOT NULL,
dueDate DATE NOT NULL,
roomno INT NOT NULL,
foreign key (roomid) references ROOM (id),
foreign key (userid) references USER (userid),
primary key (roomid, userid)
);

CREATE TABLE User_ROOM_Extend
(
roomid INT NOT NULL,
userid INT NOT NULL,
startDate DATE NOT NULL,
dueDate DATE NOT NULL,
roomno INT NOT NULL,
foreign key (roomid) references ROOM (id),
foreign key (userid) references USER (userid),
primary key (roomid, userid)
);

INSERT INTO USER (fullname, email, address, phone, userid, username, password)
VALUES("Dale Kruger", "dkruger@gmail.com", "15 Soroboy Drive", "416-967-1111", 1, "DK_Luger", "pass123");

INSERT INTO ROOM (id, roomno, bedno, balno, startDate, dueDate, available)
VALUES(907504, 504, 1, 0, date'2023-06-09', date'2023-07-21', 0);

INSERT INTO User_ROOM_Book (roomid, userid, startDate, dueDate, roomno)
VALUES(907504, 1, date'2023-06-09', date'2023-07-21', 504);


SELECT * FROM LUXIANO.`USER` LIMIT 100;

SELECT * FROM LUXIANO.`ROOM` LIMIT 100;

SELECT * FROM LUXIANO.`User_ROOM_Book` LIMIT 100;

SELECT * FROM LUXIANO.`User_ROOM_Extend` LIMIT 100;

SHOW CREATE TABLE User_ROOM_Book;