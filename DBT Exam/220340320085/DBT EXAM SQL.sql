
-- 1
CREATE table DEPT
(
DEPTNO int(2),
DNAME varchar(15),
LOC varchar(10)
);

INSERT into dept(DEPTNO,DNAME,LOC)
values(10,'ACCOUNTING','NEW YORK'),
(20 ,'RESEARCH' ,'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONS' ,'BOSTON');

SELECT * from DEPT;


-- 2
CREATE table EMP
(
EMPNO int(4),
ENAME varchar(10),
JOB varchar(9),
HIREDATE date,
SAL float(7,2),
COMM float(7,2),
DEPTNO int(2)
);

INSERT into EMP(EMPNO,ENAME,JOB,HIREDATE,SAL,COMM,DEPTNO) values
(7839, 'KING' ,'MANAGER' ,'1991-11-17', 5000, NULL, 10),
(7698, 'BLAKE' ,'CLERK', '1981-05-01', 2850, NULL, 30),
(7782, 'CLARK', 'MANAGER', '1981-06-09', 2450 ,NULL ,10),
(7566, 'JONES' ,'CLERK' ,'1981-04-02', 2975, NULL, 20),
(7654, 'MARTIN', 'SALESMAN' ,'1981-09-28', 1250 ,1400 ,30),
(7499, 'ALLEN', 'SALESMAN', '1981-02-20', 1600, 300, 30);

SELECT * from EMP;

-- 3
SELECT * from EMP where SAL BETWEEN 2500 and 5000;

-- 4
SELECT * from EMP
ORDER BY ENAME DESC;

-- 5
SELECT lower(JOB) AS "JOB" from EMP;

-- 6
SELECT ENAME,length(ENAME) AS "LENGTH of ENAME" from EMP;

-- 7
SELECT DEPTNO,COUNT(DEPTNO) AS "Count Of Employees" from EMP
GROUP BY DEPTNO;

-- 8
SELECT DNAME,ENAME from EMP,DEPT
WHERE EMP.deptno = DEPT.deptno;

-- 9
SELECT ENAME,INSTR(ENAME,'AR') AS "Position of 'AR'" from EMP;

-- 10
SELECT ENAME, 0.2*SAL AS "HRA" from EMP;

-- Section 2

-- 1

CREATE TABLE TEMPP
(
col1 VARCHAR(40)
);

delimiter //
CREATE PROCEDURE PROC1(str1 VARCHAR(20),str2 VARCHAR(20))
BEGIN
	IF INSTR(str1,str2)>0 THEN
		INSERT INTO TEMPP VALUES ('String 2 exists in string 1');
	ELSE
		INSERT INTO TEMPP VALUES ('String 2 does not exist in string 1');
	END IF;
END; //
delimiter ;

call PROC1('CDAC','DAC');

SELECT * from TEMPP;

-- 2

delimiter //
CREATE FUNCTION FUNC1(a int, b int, c int)
returns BOOLEAN
DETERMINISTIC
BEGIN
	IF a<(b+c) and b<(a+c) and c<(a+b) THEN
		return true;
	ELSE
		return false;
	END IF;
END; //
delimiter ;

drop function func1;
SELECT FUNC1(3,4,5) from dual;

	
	
	








