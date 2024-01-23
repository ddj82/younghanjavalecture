select * from dba_profiles where profile = 'DEFAULT';
select * from dba_profiles where resource_name = 'PASSWORD_LIFE_TIME';
alter profile default limit password_life_time unlimited;
-------------------------------------------------------------------------

SELECT ROWNUM, ROWID, C.* FROM CUSTOMERS C WHERE CUST_GENDER = 'F';

SELECT * FROM CUSTOMERS WHERE ROWNUM < 1000 AND CUST_GENDER = 'M';

SELECT ROWNUM RN, C.* 
FROM (SELECT * FROM CUSTOMERS WHERE CUST_GENDER = 'M') C
WHERE ROWNUM <= 500;
-------------------------------------------------------------------------

SELECT ROWNUM RN, C.* 
FROM (SELECT * FROM CUSTOMERS WHERE CUST_GENDER = 'M') C
WHERE ROWNUM <= 500
ORDER BY CUST_ID;

--�߸��� ����¡ ����
SELECT ROWNUM RN, C.* 
FROM (SELECT * FROM CUSTOMERS WHERE CUST_GENDER = 'M' ORDER BY CUST_ID) C
WHERE ROWNUM >= 11 AND ROWNUM <= 50;
-------------------------------------------------------------------------

--���� ���� ��������
SELECT * FROM CUSTOMERS WHERE CUST_GENDER = 'M' ORDER BY CUST_ID;

--���� ��������
SELECT ROWNUM RN, C.* 
FROM (SELECT * FROM CUSTOMERS WHERE CUST_GENDER = 'M' ORDER BY CUST_ID) C;

--�������� ����¡ ���� (�ι��� ���������� ROWNUM�� �÷����� ����� ���)
SELECT * FROM 
(SELECT ROWNUM RN, C.* 
FROM (SELECT * FROM CUSTOMERS WHERE CUST_GENDER = 'M' ORDER BY CUST_ID) C
)
WHERE RN >= 11 AND RN <= 50;

--�������� ����¡ ����
SELECT * FROM 
(SELECT ROWNUM RN, C2.* FROM CUSTOMERS C2 WHERE CUST_GENDER = 'M')
WHERE RN BETWEEN 10 AND 20;
-------------------------------------------------------------------------

ALTER TABLE EMP ADD DNAME VARCHAR2(20);
DESC EMP;

MERGE INTO EMP
USING DEPT
ON (EMP.DEPTNO = DEPT.DEPTNO)
WHEN MATCHED THEN
UPDATE SET EMP.DNAME = DEPT.DNAME --UPDATE�� �ʼ�
DELETE WHERE EMP.MGR IS NULL --DELETE���� UPDATE���� �־�߸� ����
--WHEN NOT MATCHED THEN
--INSERT (EMPNO, ENAME) VALUES (9999, 'TEST') --NOT MATCHED������ INSERT���� ����
;

ROLLBACK;
-------------------------------------------------------------------------

MERGE INTO EMP
USING DEPT
ON (EMP.DEPTNO = DEPT.DEPTNO)
WHEN MATCHED THEN
UPDATE SET EMP.DNAME = DEPT.DNAME 
--MERGE������ WHERE�� ��밡��, ���������� �̿��ϴ� �ͺ��� �ӵ��� ������.
WHERE EMP.DEPTNO = 10;

ROLLBACK;
-------------------------------------------------------------------------

MERGE INTO (SELECT * FROM EMP WHERE DEPTNO = 20) E
USING DEPT D
ON (E.DEPTNO = D.DEPTNO)
WHEN MATCHED THEN
UPDATE SET E.DNAME = D.DNAME;

ROLLBACK;
-------------------------------------------------------------------------

MERGE INTO (SELECT * FROM EMP WHERE DEPTNO = 30) E
USING 
(SELECT DEPARTMENT_NAME, DEPTNO 
FROM DEPT DD, DEPARTMENTS S WHERE DD.DEPTNO = S.DEPARTMENT_ID) D
ON (E.DEPTNO = D.DEPTNO)
WHEN MATCHED THEN
UPDATE SET E.DNAME = D.DEPARTMENT_NAME;

--���������� ���� Ȯ��
--SELECT DEPARTMENT_NAME, DEPTNO 
--FROM DEPT DD, DEPARTMENTS S WHERE DD.DEPTNO = S.DEPARTMENT_ID;

ROLLBACK;
-------------------------------------------------------------------------

CREATE TABLE EMP01 AS SELECT * FROM EMP WHERE DEPTNO = 10;

SELECT * FROM EMP01;

MERGE INTO EMP01 A
USING (SELECT EMPNO, SAL, JOB FROM EMP WHERE DEPTNO = 10) B
ON (A.EMPNO = B.EMPNO)
WHEN MATCHED THEN
UPDATE SET A.SAL = SAL + SAL * 0.01
WHEN NOT MATCHED THEN
INSERT (A.EMPNO, SAL, JOB) VALUES (B.EMPNO, B.SAL, B.JOB);

ROLLBACK;
-------------------------------------------------------------------------

MERGE INTO EMP01 A
USING (SELECT EMPNO, SAL, JOB FROM EMP WHERE DEPTNO = 20) B
ON (A.EMPNO = B.EMPNO)
WHEN MATCHED THEN
UPDATE SET A.SAL = SAL+SAL*0.01
WHEN NOT MATCHED THEN
INSERT (A.EMPNO, SAL, JOB) VALUES (B.EMPNO, B.SAL, B.JOB);

ROLLBACK;
-------------------------------------------------------------------------

MERGE INTO EMP01 A
USING (SELECT EMPNO, SAL, JOB FROM EMP WHERE ENAME = 'KING' AND DEPTNO = 10) B
ON (A.EMPNO = B.EMPNO)
WHEN MATCHED THEN
UPDATE SET A.SAL = 8000
WHEN NOT MATCHED THEN
INSERT (A.EMPNO, SAL, JOB) VALUES (B.EMPNO, B.SAL, B.JOB);

ROLLBACK;
-------------------------------------------------------------------------

MERGE INTO EMP01 A
USING (SELECT EMPNO, SAL, JOB FROM EMP WHERE ENAME = 'KING' AND DEPTNO = 10) B
ON (A.EMPNO = B.EMPNO)
WHEN MATCHED THEN
UPDATE SET A.SAL = 8000
DELETE WHERE A.DEPTNO = 10 --������ �Ǵ� USING�� �߿��� �����
WHEN NOT MATCHED THEN
INSERT (A.EMPNO, SAL, JOB) VALUES (B.EMPNO, B.SAL, B.JOB);

ROLLBACK;
-------------------------------------------------------------------------

DROP TABLE EMP01 PURGE;
-------------------------------------------------------------------------