-- �μ���ȣ�� �������� ���� ���� ���� ��� ���̺�� �μ� ���̺� ����

SELECT ENAME, DNAME, DEPT.DEPTNO
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO;
/*
�ؼ�����
FROM�� -> WHERE�� -> GROUP BY�� -> HAVING�� -> SELECT�� -> ORDER BY��
�̱� ������ WHERE���� ��Ī�� ���� ���°Ŷ� ������, WHERE���� ��Ī���� ���Ұ�
*/
SELECT E.ENAME, D.DNAME, 
E.DEPTNO AS EDNO,
D.DEPTNO AS DDNO
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO --EDNO = DDNO
ORDER BY DDNO;
-------------------------------------------------------------------------

/*
�ؼ�����
FROM�� -> WHERE�� -> GROUP BY�� -> HAVING�� -> SELECT�� -> ORDER BY��
�̱� ������ GROUP BY���� ��Ī�� ���� ���°Ŷ� ������, GROUP BY���� ��Ī���� ���Ұ�
*/
SELECT D.DNAME AS DDNM,
E.DEPTNO AS EDNO, 
D.DEPTNO AS DDNO
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
GROUP BY D.DNAME, E.DEPTNO, D.DEPTNO --DDNM, EDNO, DDNO
HAVING (D.DEPTNO = 10)
ORDER BY DDNO;
-------------------------------------------------------------------------

--DEPT���̺�� EMP���̺��� �����Ͽ� �����͸� �����µ�
--SMITH�� ����� ���� �� ���, �̸�, �μ���ȣ, �μ��� ���

SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO AND ENAME = 'SMITH';

SELECT EMPNO, ENAME, DEPTNO, 
(SELECT DNAME FROM DEPT WHERE DEPT.DEPTNO = EMP.DEPTNO) AS DNAME
FROM EMP
WHERE ENAME = 'SMITH';
-------------------------------------------------------------------------

--EMP���̺�� DEPARTMENTS���̺��� �����Ͽ� ���, �̸�, �μ���ȣ, �μ����� ���

SELECT E.EMPNO, E.ENAME, E.DEPTNO, DM.DEPARTMENT_NAME
FROM EMP E, DEPARTMENTS DM
WHERE E.DEPTNO = DM.DEPARTMENT_ID;
-------------------------------------------------------------------------

ALTER TABLE DEPARTMENTS
ADD LOC VARCHAR2(13);
UPDATE DEPARTMENTS
SET LOC = (SELECT LOC FROM DEPT WHERE DEPT.DEPTNO = DEPARTMENTS.DEPARTMENT_ID);
COMMIT;

--EMP���̺�� DEPARTMENTS���̺��� �����Ͽ� 
--Ŀ�̼��� �޴� ��� ����� �̸�, �μ���, �μ���ġ

SELECT ENAME, D.DEPARTMENT_NAME, D.LOC
FROM EMP E, DEPARTMENTS D
WHERE E.DEPTNO = D.DEPARTMENT_ID AND NVL(COMM, 0) != 0;
-------------------------------------------------------------------------

--�̸��� A�� ���� ��� ����� �̸��� �μ��� ���

SELECT ENAME, D.DEPARTMENT_NAME
FROM EMP E, DEPARTMENTS D
WHERE E.DEPTNO = D.DEPARTMENT_ID AND ENAME LIKE '%A%';
-------------------------------------------------------------------------

--����̸� �� �����ȣ�� �ش� �������̸� �� �����ڹ�ȣ�� �Բ� ǥ��
--�� �Ӹ����� ����̸�, �����ȣ, ������ �̸�, ������ ��ȣ �� ǥ��
SELECT E.ENAME AS "����̸�", E.EMPNO AS "�����ȣ", 
E2.ENAME AS "������ �̸�", E2.EMPNO AS "������ ��ȣ"
FROM EMP E, EMP E2
WHERE E.MGR = E2.EMPNO;

SELECT E.ENAME AS "����̸�", E.EMPNO AS "�����ȣ", 
E2.ENAME AS "������ �̸�", E.MGR AS "������ ��ȣ"
FROM EMP E, EMP E2
WHERE E.MGR = E2.EMPNO(+);
-------------------------------------------------------------------------

SELECT ENAME, DNAME
FROM EMP
INNER JOIN DEPT
ON EMP.DEPTNO = DEPT.DEPTNO;
-- ���� ����
SELECT ENAME, DNAME
FROM EMP, DEPT 
WHERE EMP.DEPTNO = DEPT.DEPTNO;
-------------------------------------------------------------------------

SELECT ENAME, DNAME
FROM EMP E
INNER JOIN DEPT D
ON E.DEPTNO = D.DEPTNO
WHERE ENAME = 'SMITH';
-- ���� ����
SELECT ENAME, DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO AND ENAME = 'SMITH';
-------------------------------------------------------------------------

SELECT *
FROM EMP E, DEPARTMENTS D
WHERE E.DEPTNO(+) = D.DEPARTMENT_ID; 
--Ȯ���� �ʿ��Ѱ� �����̶� (+)�� ���ʿ�
--��Ī�� RIGHT OUTER JOIN
--���� ����
SELECT *
FROM EMP E
RIGHT OUTER JOIN DEPARTMENTS D
ON E.DEPTNO(+) = D.DEPARTMENT_ID; 
-------------------------------------------------------------------------

INSERT INTO EMP VALUES (9999, 'TEST2', '', '', '', '', '', '');
INSERT INTO EMP VALUES (8888, 'TEST1', '', '', '', '', '', '');
COMMIT;
-------------------------------------------------------------------------

--EMP, DEPT ���̺��� �����ϴµ�, �μ������� �ο����� ���� �����
--���, �̸�, �μ���ȣ, �μ��� ���

SELECT EMPNO, ENAME, D.DEPTNO, DNAME
FROM EMP E
LEFT OUTER JOIN DEPT D
ON E.DEPTNO = D.DEPTNO;

SELECT EMPNO, ENAME, D.DEPTNO, DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO(+);
-------------------------------------------------------------------------

--����, 10�� �μ����� �ٹ��ϴ� ����� �̸��� 10�� �μ��� �μ����� ���

SELECT ENAME, DNAME
FROM EMP E
JOIN DEPT D
ON E.DEPTNO = D.DEPTNO
WHERE E.DEPTNO = 10;

SELECT ENAME, DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO AND E.DEPTNO = 10;

--��������
SELECT ENAME, 
(SELECT DNAME FROM DEPT WHERE DEPT.DEPTNO = EMP.DEPTNO) DNAME
FROM EMP WHERE DEPTNO = 10;
-------------------------------------------------------------------------

--���ο��� ������� : �ִ� 5�� �̻��� ���̺� ������ �����ض�

SELECT E.EMPNO, E.ENAME, D.DEPTNO, S.DEPARTMENT_NAME
FROM EMP E, DEPT D, DEPARTMENTS S
WHERE E.DEPTNO(+) = D.DEPTNO 
AND E.DEPTNO = S.DEPARTMENT_ID(+);

SELECT E.EMPNO, E.ENAME, D.DEPTNO, S.DEPARTMENT_NAME 
FROM EMP E
JOIN DEPT D ON E.DEPTNO = D.DEPTNO
JOIN DEPARTMENTS S ON E.DEPTNO = S.DEPARTMENT_ID;
-------------------------------------------------------------------------

ON E.DEPTNO = S.DEPARTMENT_ID;

SELECT E.EMPNO, E.ENAME, D.DEPTNO, S.DEPARTMENT_NAME 
FROM EMP E
FULL OUTER JOIN DEPT D 
ON E.DEPTNO = D.DEPTNO
FULL OUTER JOIN DEPARTMENTS S
ON E.DEPTNO = S.DEPARTMENT_ID;
-------------------------------------------------------------------------

--�μ������� ��� �������µ�, ��������� �����ϴ� �μ������� ����������

SELECT * FROM DEPT B
WHERE EXISTS (SELECT * FROM EMP E WHERE E.DEPTNO = B.DEPTNO);
-------------------------------------------------------------------------

--��������� ��� �������µ�, �μ������� �����ϴ� ��������� ����������

SELECT * FROM EMP E
WHERE EXISTS (SELECT * FROM DEPT B WHERE B.DEPTNO = E.DEPTNO);

--���� IN�����ڷ� 
SELECT * FROM EMP E
WHERE E.DEPTNO IN (SELECT DEPTNO FROM DEPT);
-------------------------------------------------------------------------

--�μ������� ��� �������µ�, ��������� �������� �ʴ� �μ������� ����������

SELECT * FROM DEPT B
WHERE NOT EXISTS (SELECT * FROM EMP E WHERE E.DEPTNO = B.DEPTNO);
-------------------------------------------------------------------------

--��������� ��� �������µ�, �μ������� �������� �ʴ� ��������� ����������

SELECT * FROM EMP E
WHERE NOT EXISTS (SELECT * FROM DEPT B WHERE B.DEPTNO = E.DEPTNO);

--���� NOT IN�����ڷ� 
SELECT * FROM EMP E
WHERE NVL(E.DEPTNO, 0) NOT IN (SELECT DEPTNO FROM DEPT);
-------------------------------------------------------------------------

SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME, D.LOC
FROM EMP E, DEPT D;

SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME, D.LOC
FROM EMP E
CROSS JOIN DEPT D;
-------------------------------------------------------------------------

--������� : EMPLOYEES
--�μ����� : DEPARTMENTS
--�λ�θ� �����ϴ� ����μ��� �ٹ��ϴ� ������� �̸�, �μ���ȣ, �μ����� ���

SELECT E.EMP_NAME, E.DEPARTMENT_ID, D.DEPARTMENT_NAME
FROM EMPLOYEES E
JOIN DEPARTMENTS D
ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
WHERE D.DEPARTMENT_ID = (SELECT MANAGER_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME = '��ȹ��');


SELECT E.EMP_NAME, E.DEPARTMENT_ID, D.DEPARTMENT_NAME
FROM EMPLOYEES E, DEPARTMENTS D
WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID 
AND D.DEPARTMENT_ID = (SELECT MANAGER_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME = '��ȹ��');
-------------------------------------------------------------------------

