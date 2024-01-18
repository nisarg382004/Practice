CREATE DATABASE IF NOT EXISTS student;

USE student;

DROP TABLE IF EXISTS student;

CREATE TABLE student (
    Roll_no INT PRIMARY KEY NOT NULL,
    F_name VARCHAR(20),
    L_name VARCHAR(20),
    Phone_no VARCHAR(20)
);

INSERT INTO student VALUES (1, 'priti', 'pal', '6734256090');
INSERT INTO student VALUES (2, 'pooja', 'yadav', '7864892412');
INSERT INTO student VALUES (3, 'sunny', 'gupta', '6345123435');
