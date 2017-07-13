--id, pw, name, ssn, regdate; 
CREATE TABLE Member(
	id VARCHAR2(10), 
	name VARCHAR2(20),
	pw VARCHAR2(10), 
	ssn VARCHAR2(15),
	regdate DATE,
	PRIMARY KEY (id)
);
SELECT * FROM Member;
DROP TABLE Member;