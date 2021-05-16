DROP TABLE IF EXISTS book;
CREATE TABLE book
(
    id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(128),
    author VARCHAR(62),
    publication_at DATETIME
);

DROP TABLE IF EXISTS user;
CREATE TABLE user
(
    id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(128),
    birth INT(4)
);

DROP TABLE IF EXISTS store;
CREATE TABLE store
(
    id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(128),
    address VARCHAR(512)
);