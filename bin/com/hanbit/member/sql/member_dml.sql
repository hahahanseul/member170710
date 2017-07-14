--id,name,pw,ssn,regdate; 
SELECT * FROM Member;
SELECT * FROM Member WHERE name = "hong";
SELECT COUNT(*) AS count FROM Member;a
INSERT INTO Member(id,name,pw,ssn,regdate)
VALUES('song2','송무명','1','170215-4821305',SYSDATE)