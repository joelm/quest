set echo on feedback on;

-- spool create_tables.log  --this dumps the output to a log

CREATE DATABASE /*!32312 IF NOT EXISTS*/ quest  /*!40100 DEFAULT CHARACTER SET utf8 */;

USE quest;

--drop any sequences?

-- constraints
ALTER TABLE game DROP FOREIGN KEY game_user_fk;
ALTER TABLE game DROP FOREIGN KEY answer_fk;

--drop these in reverse order
DROP TABLE game_user;
DROP TABLE game;
DROP TABLE question;
DROP TABLE answer;

DROP TABLE employee;

CREATE TABLE game_user (
  user_id INT NOT NULL AUTO_INCREMENT,
  username varchar(50) NOT NULL,
  first_name varchar(50) DEFAULT NULL,
  last_name varchar(50) DEFAULT NULL,
  email varchar(100) DEFAULT NULL,
  password varchar(50) NOT NULL,
  created_on datetime DEFAULT NULL,
  PRIMARY KEY (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE game (
  game_id INT NOT NULL AUTO_INCREMENT,
  user_id INT NOT NULL,
  score  INT NOT NULL,
  elapsed_time varchar(50) DEFAULT NULL,
  created_on datetime DEFAULT NULL,
  PRIMARY KEY (game_id),
  CONSTRAINT game_user_fk FOREIGN KEY (user_id) REFERENCES game_user(user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE answer (
  answer_id INT NOT NULL AUTO_INCREMENT,
  answer varchar(50) NOT NULL,
  created_on datetime DEFAULT NULL,
  PRIMARY KEY (answer_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE question (
  question_id INT NOT NULL AUTO_INCREMENT,
  question varchar(50) NOT NULL,
  category varchar(50) DEFAULT NULL,
  answer_id INT NOT NULL,
  created_on datetime DEFAULT NULL,
  PRIMARY KEY (question_id),
  CONSTRAINT answer_fk FOREIGN KEY (answer_id) REFERENCES answer(answer_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE employee (
  emp_id int(11) NOT NULL AUTO_INCREMENT,
  emp_name varchar(20) DEFAULT NULL,
  dept varchar(10) DEFAULT NULL,
  salary int(10) DEFAULT NULL,
  PRIMARY KEY (emp_id)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


COMMIT;

INSERT INTO quest.game_user (username,first_name,last_name,email,password,created_on)
    VALUES('joelm', 'Joel', 'Mahatsri', 'joelm@rulefinancial.com', 'joelm', '2013-07-15 17:08:02');
INSERT INTO quest.game_user (username,first_name,last_name,email,password,created_on)
    VALUES('anotherUser', 'Another', 'User', 'haah@rulefinancial.com', 'anotherUser', '2013-07-15 17:08:02');
INSERT INTO quest.game_user (username,first_name,last_name,email,password,created_on)
    VALUES('simonb', 'Simon', 'Black', 'simon.black@rulefinancial.com', 'simonb', '2013-07-16 16:02:46');


INSERT INTO employee (emp_id, emp_name, dept, salary)
	VALUES (1,"Joel Mahatsri","Delivery", 10000);
INSERT INTO employee (emp_id, emp_name, dept, salary)
	VALUES (2,"Jack Black","Delivery", 50000);
INSERT INTO employee (emp_id, emp_name, dept, salary)
	VALUES (3,"Henry Thompson","AMS", 900000);
INSERT INTO employee (emp_id, emp_name, dept, salary)
	VALUES (4,"Tom Getty","Delivery", 10000);


set echo off feedback off;

spool off;

