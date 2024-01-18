CREATE TABLE DEPT01 AS SELECT * FROM DEPT WHERE 1=0;

INSERT ALL INTO DEPT01 VALUES (DEPTNO, DNAME, LOC) SELECT * FROM DEPT;
COMMIT;

DELETE FROM DEPT01;
COMMIT;
SELECT * FROM DEPT01;
ROLLBACK;
SELECT * FROM DEPT01;



DELETE FROM DEPT01 WHERE DEPTNO = 40;
COMMIT;

--ROLLBACK; ���� �ǵ��ƿ�
SELECT * FROM DEPT01; --30 20 10
--1
DELETE FROM DEPT01 WHERE DEPTNO = 30;
--2
SAVEPOINT C1; --å����C1
SELECT * FROM DEPT01; --20 10

DELETE FROM DEPT01 WHERE DEPTNO = 20;
--3
SAVEPOINT C2; --å����C2
SELECT * FROM DEPT01; --10

DELETE FROM DEPT01 WHERE DEPTNO = 10; -- ����
--4
ROLLBACK TO C2; --C2��
SELECT * FROM DEPT01; --10

ROLLBACK TO C1; --C1����, C2�� ������
SELECT * FROM DEPT01; --20 10

ROLLBACK; --��ü�ѹ�, C1 ����
SELECT * FROM DEPT01; --30 20 10

DROP TABLE DEPT01 PURGE;
-------------------------------------------------------


CREATE TABLE DEPT01 AS SELECT * FROM DEPT;
SELECT * FROM DEPT01;

SAVEPOINT C4; --40 30 20 10
DELETE FROM DEPT01 WHERE DEPTNO = 40;
SELECT * FROM DEPT01;

SAVEPOINT C3; --30 20 10
DELETE FROM DEPT01 WHERE DEPTNO = 30;
SELECT * FROM DEPT01;

SAVEPOINT C2; --20 10
DELETE FROM DEPT01 WHERE DEPTNO = 20;
SELECT * FROM DEPT01;

SAVEPOINT C1; --10
DELETE FROM DEPT01 WHERE DEPTNO = 10;
SELECT * FROM DEPT01; --����

ROLLBACK TO C4; --40 30 20 10, C3,C2,C1 ����
SELECT * FROM DEPT01;

ROLLBACK TO C1;
SELECT * FROM DEPT01;

ROLLBACK;
SELECT * FROM DEPT01;
COMMIT;
-------------------------------------------------------

CREATE TABLE DEPT02 AS SELECT * FROM DEPT;
SELECT * FROM DEPT02;

DELETE FROM DEPT02 WHERE DEPTNO = 40; --�ӽùݿ�
SELECT * FROM DEPT02; --30 20 10

ROLLBACK; --40 30 20 10
SELECT * FROM DEPT02;

DELETE FROM DEPT02 WHERE DEPTNO = 30; --�ӽùݿ�
SELECT * FROM DEPT02; --40 20 10

CREATE TABLE DEPT03 AS SELECT * FROM DEPT; --�ڵ� COMMIT�� ��������

ROLLBACK;
SELECT * FROM DEPT02; --40 20 10
-------------------------------------------------------

CREATE TABLE EMP02 AS SELECT * FROM EMP;
SELECT * FROM EMP02 ORDER BY DEPTNO;

DELETE FROM EMP02 WHERE DEPTNO = 30;
SELECT * FROM EMP02 ORDER BY DEPTNO;

TRUNCATE TABLE EMP02;

ROLLBACK;
SELECT * FROM EMP02;
-------------------------------------------------------

--��� �̸��� 'JONES'�� ����� �μ��� ���
SELECT DEPTNO, DNAME FROM DEPT 
WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'JONES');
-- => WHERE DEPTNO = 20;
SELECT DEPTNO FROM EMP WHERE ENAME = 'JONES'; --20
-------------------------------------------------------

--SMITH�� ���� �μ����� �ٹ��ϴ� ����� ���, �̸�, ����, �Ի�����, ���������� ������ ���

--�������� : ���� SMITH�� ���� �μ���
SELECT EMPNO, ENAME, DEPTNO, JOB, HIREDATE, MGR FROM EMP
WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'SMITH') 
AND ENAME != 'SMITH'; --������ 'SMITH'�� ����

--�������� : SMITH�� �μ� ã��
SELECT DEPTNO FROM EMP WHERE ENAME = 'SMITH';
-------------------------------------------------------

--��� �������� �� ���� ������ �޴� ��� �˻�

--�������� : �� ���� ������ �޴� ���
SELECT * FROM EMP WHERE SAL > (SELECT AVG(NVL(SAL, 0)) FROM EMP)
ORDER BY SAL DESC;

--�������� : ��� ���� ã��
SELECT AVG(NVL(SAL, 0)) FROM EMP;
-------------------------------------------------------

--�μ���ȣ�� 10���� ��� �߿��� �ִ�޿��� �޴� ����� �����ȣ�� �����

--�������� : �ִ�޿��� �޴� ����� �����ȣ�� �����
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP
WHERE SAL = (SELECT MAX(SAL) FROM EMP WHERE DEPTNO = '10');

--�������� : �μ���ȣ�� 10���� ��� �߿��� �ִ�޿�
SELECT MAX(SAL) FROM EMP WHERE DEPTNO = '10';
-------------------------------------------------------

--IN ������ ���
/*
BLAKE�� ��å�� ���� ������� �μ���ȣ�� �����ͼ� 
�� �μ����� �ٹ��ϴ� ������� �̸��� ������� ���
*/

--�������� : �μ���ȣ�� �����ͼ� �� �μ����� �ٹ��ϴ� ������� �̸��� ������� ���
SELECT ENAME, HIREDATE FROM EMP 
WHERE DEPTNO IN (SELECT DEPTNO FROM EMP 
WHERE JOB = (SELECT JOB FROM EMP WHERE ENAME = 'BLAKE'));
--SELECT ENAME, HIREDATE FROM EMP WHERE DEPTNO IN (10, 20, 30)

--�������� : BLAKE�� ��å�� ���� ������� �μ���ȣ
SELECT DEPTNO FROM EMP 
WHERE JOB = (SELECT JOB FROM EMP WHERE ENAME = 'BLAKE'); --(10, 20, 30)
--SELECT DEPTNO FROM EMP WHERE JOB = 'MANAGER';

--���������� �������� : BLAKE�� ��å�� ���� ������� �μ���ȣ
SELECT JOB FROM EMP WHERE ENAME = 'BLAKE'; --'MANAGER'
-------------------------------------------------------

/*
BLAKE�� ���� �μ��� �ִ� ������� �̸��� ������� ����ϴµ�, BLAKE�� ����
*/

--�������� : BLAKE�� ���� �μ� ������� �̸��� ������� ���
SELECT ENAME, HIREDATE, DEPTNO FROM EMP 
WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'BLAKE') --30
AND ENAME <> 'BLAKE'; --BLAKE�� ����
--SELECT ENAME, HIREDATE, DEPTNO FROM EMP 
--WHERE DEPTNO = 30 AND ENAME <> 'BLAKE';

--�������� : BLAKE �μ�
SELECT DEPTNO FROM EMP WHERE ENAME = 'BLAKE'; --30
-------------------------------------------------------

/*
�޿��� 3000�̻� �޴� ����� ������ �μ����� ���ϴ� ������� �̸�, �޿�, �μ���ȣ
*/

--�������� : ������� �̸�, �޿�, �μ���ȣ
SELECT ENAME, SAL, DEPTNO FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO FROM EMP WHERE SAL >= 3000);
--SELECT ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO IN (10, 20);

--�������� : �޿��� 3000�̻� �޴� ����� ������ �μ�
SELECT DEPTNO FROM EMP WHERE SAL >= 3000; --(10, 20)
-------------------------------------------------------

--ALL ������
SELECT * FROM EMP WHERE NVL(SAL, 0) < ALL(1000, 2000, 3000) ORDER BY SAL;
SELECT * FROM EMP WHERE NVL(SAL, 0) > ALL(1000, 2000, 3000) ORDER BY SAL;
-------------------------------------------------------

/*
�μ���ȣ�� 30�� ������� ���� �� ���� ū ��(2850)���� ���� ������ �޴� ����� �̸�, ����
��, ' > ALL'(���)���̽��� �ִ밪���� ũ�� ���� ��
*/
SELECT ENAME, SAL FROM EMP 
WHERE SAL > ALL(SELECT SAL FROM EMP WHERE DEPTNO = 30);
--SAL > ALL(950, 1250, 1250, 1500, 1600, 2850); 
-- �� SAL�� (950, 1250, 1250, 1500, 1600, 2850) �� ���� ū ������ ũ��

SELECT SAL FROM EMP WHERE DEPTNO = 30 ORDER BY SAL;
--(950, 1250, 1250, 1500, 1600, 2850)
-------------------------------------------------------

/*
�μ���ȣ�� 30�� ������� ���� �� ���� ���� ��(950)���� ���� ������ �޴� ����� �̸�, ����
��, ' < ALL'(�Ҽ�)���̽��� �ּҰ����� ������ ���� ��
*/
SELECT ENAME, SAL FROM EMP 
WHERE SAL < ALL(SELECT SAL FROM EMP WHERE DEPTNO = 30);
--SAL > ALL(950, 1250, 1250, 1500, 1600, 2850); 
-- �� SAL�� (950, 1250, 1250, 1500, 1600, 2850) �� ���� ���� ������ �۴�

SELECT SAL FROM EMP WHERE DEPTNO = 30 ORDER BY SAL;
--(950, 1250, 1250, 1500, 1600, 2850)
-------------------------------------------------------

--�μ����� ��� ������ 2916.66 �̹Ƿ� ������ 2916.66�� �Ѵ� ����� ����

--�������� : �ְ� ������ �Ѵ� ����� ����
SELECT * FROM EMP 
WHERE SAL > ALL(SELECT AVG(SAL) FROM EMP GROUP BY DEPTNO);

--�������� : �μ����� ��� ����
SELECT AVG(SAL) FROM EMP GROUP BY DEPTNO;
-------------------------------------------------------

--ANY ������
SELECT * FROM EMP WHERE SAL < ANY(1000, 2000, 3000) ORDER BY SAL;
SELECT * FROM EMP WHERE SAL > ANY(1000, 2000, 3000) ORDER BY SAL;
-------------------------------------------------------

/*
�μ���ȣ�� 30�� ������� ���� �� ���� ���� ��(950)���� ���� ������ �޴� ����� �̸�, ����
��, ' > ANY'(���)���̽��� �ּҰ����� ũ�� ���� ��
*/
SELECT ENAME, SAL FROM EMP 
WHERE SAL > ANY(SELECT SAL FROM EMP WHERE DEPTNO = 30);
--SAL > ALL(950, 1250, 1250, 1500, 1600, 2850); 
-- �� SAL�� (950, 1250, 1250, 1500, 1600, 2850) �� ���� ���� ������ ũ��

SELECT SAL FROM EMP WHERE DEPTNO = 30 ORDER BY SAL;
--(950, 1250, 1250, 1500, 1600, 2850)
-------------------------------------------------------

/*
�μ���ȣ�� 30�� ������� ���� �� ���� ū ��(2850)���� ���� ������ �޴� ����� �̸�, ����
��, ' < ANY'(�Ҵ�)���̽��� �ִ밪���� ������ ���� ��
*/
SELECT ENAME, SAL FROM EMP 
WHERE SAL < ANY(SELECT SAL FROM EMP WHERE DEPTNO = 30);
--SAL > ALL(950, 1250, 1250, 1500, 1600, 2850); 
-- �� SAL�� (950, 1250, 1250, 1500, 1600, 2850) �� ���� ū ������ �۴�

SELECT SAL FROM EMP WHERE DEPTNO = 30 ORDER BY SAL;
--(950, 1250, 1250, 1500, 1600, 2850)
-------------------------------------------------------

--�繫��(CLERK)�� �޴� �ְ� ���� �� �ְ� ������ 1300���� ���� �����鼭
--�繫��(CLERK)�� �ƴ� ����� ����

--�������� : �繫��(CLERK)�� �޴� �ְ� �������� ���� �����鼭 �繫���� �ƴ� ����� ����
SELECT * FROM EMP 
WHERE SAL < ANY(SELECT SAL FROM EMP WHERE JOB = 'CLERK') 
AND JOB != 'CLERK';

--�������� : �繫��(CLERK)�� �޴� �ְ� ����
SELECT SAL FROM EMP WHERE JOB = 'CLERK';
-------------------------------------------------------

UPDATE DEPT01
SET LOC = (SELECT LOC FROM DEPT WHERE DEPTNO = 40) WHERE DEPTNO = 10;
--SELECT LOC FROM DEPT01 WHERE DEPTNO = 40; --'BOSTON'
--SET LOC = 'BOSTON' WHERE DEPTNO = 10;
-------------------------------------------------------

--**���������� �̿��� �� �� �̻��� �÷��� ���� �� ����(������ �����÷�)
UPDATE DEPT01
SET (DNAME, LOC) = (SELECT DNAME, LOC FROM DEPT WHERE DEPTNO = 30) 
WHERE DEPTNO = 10;
--SELECT DNAME, LOC FROM DEPT WHERE DEPTNO = 30; --('SALES', 'CHICAGO')
-------------------------------------------------------

--**���������� �̿��� �� �� �̻��� �÷��� ���� �� �� �̻��� �� ����(������ �����÷�)
UPDATE DEPT01
SET DNAME = (SELECT DNAME FROM DEPT WHERE DEPT.DEPTNO = EMP01.DEPTNO);
-------------------------------------------------------

--���� ���̺� �����ͱ��� ���� ���2
CREATE TABLE EMP01 AS SELECT E.* FROM EMP E;
ALTER TABLE EMP01 ADD DNAME VARCHAR2(14);

--���� ���̺� �����ͱ��� ������ �� �� ���̺� �÷� �߰��ϸ鼭 �����
CREATE TABLE EMP02 AS SELECT E.*, 'ABC' AS DNAME FROM EMP E;
UPDATE EMP02 SET DNAME = NULL;
ALTER TABLE EMP02 MODIFY DNAME VARCHAR2(14);

--���� ���̺� �����ͱ��� ������ �� �� ���̺� �÷� �߰��ϸ鼭 �����
CREATE TABLE EMP03 
AS SELECT E.*,(SELECT DNAME FROM DEPT WHERE DEPT.DEPTNO = E.DEPTNO) 
AS DNAME FROM EMP E;
-------------------------------------------------------

--���������� �̿��� ������ ����
DELETE FROM EMP01
WHERE DEPTNO = (SELECT DEPTNO FROM DEPT WHERE DNAME = 'SALES');
--DELETE FROM EMP01 WHERE DEPTNO = 30;
ROLLBACK;

SELECT DEPTNO FROM DEPT WHERE DNAME = 'SALES'; --30
-------------------------------------------------------

--EMP01���̺��� �����͸� �����ϴµ� �μ����� RESEARCH, SALES �� ����� ����
DELETE FROM EMP01
WHERE DEPTNO IN (SELECT DEPTNO FROM DEPT WHERE DNAME IN ('RESEARCH', 'SALES'));
ROLLBACK;
-------------------------------------------------------

BLAKE�� ���� ��å�� ���� ��� ���� BLAKE����
DELETE FROM EMP01 WHERE JOB = (SELECT JOB FROM EMP01 WHERE ENAME = 'BLAKE');
SELECT JOB FROM EMP01 WHERE ENAME = 'BLAKE';
ROLLBACK;
-------------------------------------------------------

DROP TABLE dept PURGE;

--------------------------------------------------------
--  ������ ������ - �����-1��-18-2024   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table EMP01
--------------------------------------------------------

  CREATE TABLE "TEST"."EMP01" 
   (	"EMPNO" NUMBER(4,0), 
	"ENAME" VARCHAR2(10 BYTE), 
	"JOB" VARCHAR2(9 BYTE), 
	"MGR" NUMBER(4,0), 
	"HIREDATE" DATE, 
	"SAL" NUMBER(7,2), 
	"COMM" NUMBER(7,2), 
	"DEPTNO" NUMBER(2,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into TEST.EMP01
SET DEFINE OFF;
Insert into TEST.EMP01 (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (7369,'SMITH','CLERK',7902,to_date('80/12/17','RR/MM/DD'),800,null,20);
Insert into TEST.EMP01 (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (7499,'ALLEN','SALESMAN',7698,to_date('81/02/20','RR/MM/DD'),1600,300,30);
Insert into TEST.EMP01 (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (7521,'WARD','SALESMAN',7698,to_date('81/02/22','RR/MM/DD'),1250,500,30);
Insert into TEST.EMP01 (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (7566,'JONES','MANAGER',7839,to_date('81/04/02','RR/MM/DD'),2975,null,20);
Insert into TEST.EMP01 (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (7654,'MARTIN','SALESMAN',7698,to_date('81/09/28','RR/MM/DD'),1250,1400,30);
Insert into TEST.EMP01 (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (7698,'BLAKE','MANAGER',7839,to_date('81/05/01','RR/MM/DD'),2850,null,30);
Insert into TEST.EMP01 (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (7782,'CLARK','MANAGER',7839,to_date('81/06/09','RR/MM/DD'),2450,null,10);
Insert into TEST.EMP01 (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (7839,'KING','PRESIDENT',null,to_date('81/11/17','RR/MM/DD'),5000,null,10);
Insert into TEST.EMP01 (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (7844,'TURNER','SALESMAN',7698,to_date('81/09/08','RR/MM/DD'),1500,0,30);
Insert into TEST.EMP01 (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (7900,'JAMES','CLERK',7698,to_date('81/12/03','RR/MM/DD'),950,null,30);
Insert into TEST.EMP01 (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (7902,'FORD','ANALYST',7566,to_date('81/12/03','RR/MM/DD'),3000,null,20);
Insert into TEST.EMP01 (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (7934,'MILLER','CLERK',7782,to_date('82/01/23','RR/MM/DD'),1300,null,10);


create table dept as select * from scott.dept;
create table emp as select * from scott.emp;