CREATE TABLE GOODS_KOR (
SEQ NUMBER PRIMARY KEY,
COUNTRY VARCHAR2(10),
GOODS VARCHAR2(80) NOT NULL
);

CREATE SEQUENCE KOR_SEQ NOCACHE;

INSERT INTO GOODS_KOR (SEQ, COUNTRY, GOODS) VALUES (KOR_SEQ.NEXTVAL, '�ѱ�', '�������� ������');
INSERT INTO GOODS_KOR VALUES (KOR_SEQ.NEXTVAL, '�ѱ�', '�ڵ���');
INSERT INTO GOODS_KOR VALUES (KOR_SEQ.NEXTVAL, '�ѱ�', '��������ȸ��');
INSERT INTO GOODS_KOR VALUES (KOR_SEQ.NEXTVAL, '�ѱ�', '����');
INSERT INTO GOODS_KOR VALUES (KOR_SEQ.NEXTVAL, '�ѱ�', 'LCD');
INSERT INTO GOODS_KOR VALUES (KOR_SEQ.NEXTVAL, '�ѱ�', '�ڵ�����ǰ');
INSERT INTO GOODS_KOR VALUES (KOR_SEQ.NEXTVAL, '�ѱ�', '�޴���ȭ');
COMMIT;

SELECT * FROM GOODS_KOR;
-------------------------------------------------------------------------

CREATE TABLE GOODS_JAP (
SEQ NUMBER PRIMARY KEY,
COUNTRY VARCHAR2(10),
GOODS VARCHAR2(80) NOT NULL
);

CREATE SEQUENCE JAP_SEQ NOCACHE;

INSERT INTO GOODS_JAP VALUES (JAP_SEQ.NEXTVAL, '�Ϻ�', '�ڵ���');
INSERT INTO GOODS_JAP VALUES (JAP_SEQ.NEXTVAL, '�Ϻ�', '�ڵ�����ǰ');
INSERT INTO GOODS_JAP VALUES (JAP_SEQ.NEXTVAL, '�Ϻ�', 'ȭ����');
INSERT INTO GOODS_JAP VALUES (JAP_SEQ.NEXTVAL, '�Ϻ�', '�Ǽ����');
INSERT INTO GOODS_JAP VALUES (JAP_SEQ.NEXTVAL, '�Ϻ�', '���̿���');
INSERT INTO GOODS_JAP VALUES (JAP_SEQ.NEXTVAL, '�Ϻ�', 'Ʈ��������');
INSERT INTO GOODS_JAP VALUES (JAP_SEQ.NEXTVAL, '�Ϻ�', '�ݵ�ü������');
COMMIT;

SELECT * FROM GOODS_JAP;
-------------------------------------------------------------------------

SELECT GOODS FROM GOODS_KOR
UNION 
SELECT GOODS FROM GOODS_JAP;

SELECT COUNTRY, GOODS FROM GOODS_KOR
UNION 
SELECT COUNTRY,GOODS FROM GOODS_JAP;
-------------------------------------------------------------------------

UPDATE GOODS_JAP SET COUNTRY = '�ѱ�';

SELECT COUNTRY, GOODS FROM GOODS_KOR
UNION ALL
SELECT COUNTRY,GOODS FROM GOODS_JAP ORDER BY COUNTRY, GOODS;
-------------------------------------------------------------------------

SELECT EMPLOYEE_ID, JOB_ID FROM EMPLOYEES
UNION
SELECT EMPLOYEE_ID, JOB_ID FROM JOB_HISTORY ORDER BY EMPLOYEE_ID, JOB_ID;
-------------------------------------------------------------------------
ROLLBACK;
-------------------------------------------------------------------------

UPDATE GOODS_KOR SET GOODS = '�ڵ���' WHERE SEQ = 3;
UPDATE GOODS_KOR SET GOODS = '�ڵ�����ǰ' WHERE SEQ = 4;

SELECT GOODS FROM GOODS_KOR
INTERSECT 
SELECT GOODS FROM GOODS_JAP;
-------------------------------------------------------------------------

UPDATE GOODS_JAP SET COUNTRY = '�ѱ�' WHERE SEQ = 1 OR SEQ = 2;

SELECT COUNTRY, GOODS FROM GOODS_KOR
INTERSECT 
SELECT COUNTRY, GOODS FROM GOODS_JAP;
-------------------------------------------------------------------------

SELECT GOODS FROM GOODS_JAP
MINUS  
SELECT GOODS FROM GOODS_KOR;
-------------------------------------------------------------------------

SET SERVEROUTPUT ON
SET SERVEROUTPUT OFF
-------------------------------------------------------------------------

BEGIN
DBMS_OUTPUT.PUT_LINE('HELLO ORACLE');
END;
/
-------------------------------------------------------------------------

DECLARE
VEMPNO NUMBER(4);
VENAME VARCHAR2(10);
BEGIN 
VEMPNO := 7788;
VENAME := 'SCOTT';
DBMS_OUTPUT.PUT_LINE('��� / �̸�');
DBMS_OUTPUT.PUT_LINE('---------');
DBMS_OUTPUT.PUT_LINE(VEMPNO || '/' || VENAME);
END;
/
-------------------------------------------------------------------------

DECLARE
var VARCHAR2(15);
BEGIN 
DBMS_OUTPUT.PUT_LINE('Hello Oracle~');
VAR := '�ȳ� PL/SQL';
DBMS_OUTPUT.PUT(var || ' ');
DBMS_OUTPUT.PUT_LINE('hello');
DBMS_OUTPUT.PUT_LINE('PL/SQL');
END;
/
-------------------------------------------------------------------------

--BEGIN
DECLARE
--��������
VAR VARCHAR2(15);
--�ڵ��ۼ�
BEGIN
VAR := '�ȳ� PL/SQL';
--����Լ�
DBMS_OUTPUT.PUT(VAR);
DBMS_OUTPUT.PUT_LINE('hello PL/SQL');
END;
/
-------------------------------------------------------------------------

BEGIN
DECLARE
--��������
VAR VARCHAR2(15);
BEGIN
--�ڵ��ۼ�
VAR := '�ȳ� PL/SQL';
--����Լ�
DBMS_OUTPUT.PUT(VAR);
DBMS_OUTPUT.PUT_LINE('hello PL/SQL');
END;
DBMS_OUTPUT.PUT_LINE('�ٱ� BEGIN�� ����');
END;
/
-------------------------------------------------------------------------

DECLARE
--�� �� �ּ� : ���� ����
va INTEGER := 2**2 * 3**2;
vb POSITIVE := 5;		-- 0������ ���, 1�̻��� ���
vc SIGNTYPE;		-- -1, 0, 1, NULL�� ����
vd NATURALN := 0;	-- 0���� ���, NULL�Ұ�
ce constant VARCHAR2(20) := '��� �׽�Ʈ';
BEGIN
/*
������ �ּ� : �����
DBMS_OUTPUT�� �̿��� ���� �� ���
*/
--����
--ce := '����� ����';
DBMS_OUTPUT.PUT_LINE('va = ' || va || ', vb = ' || vb || ', vc = ' || vc || ', vd = ' || vd);
DBMS_OUTPUT.PUT_LINE('va = ' || TO_CHAR(va));
DBMS_OUTPUT.PUT_LINE('��� ce = ' || ce);
END;
/
-------------------------------------------------------------------------

DECLARE
--���̺��� �÷��� ������Ÿ�԰� ��ġ���� �ִ� ���� ����. ���� ����
--��Į�� ���� ����
VEMPNO NUMBER(4);
VENAME VARCHAR2(10);
VDEPTNO NUMBER(2);
VDNAME VARCHAR2(14);
BEGIN
--���̺� ���� �����͸� �޾ƿ��� ��� select�� �ȿ� into�� �̿��Ѵ�.
--select�� �÷��� ������Ÿ��, ����, ������
--INTO���� ������ ������Ÿ��, ����, ������ ��ġ�ؾ� �Ѵ�.
--select���� �����ʹ� INTO���� ���� �ش� ������ �ʱ�ȭ ����� �ϱ� ������ 
--�ݵ�� �� ���� �����͸� �������� �������̿��� �Ѵ�.

SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME
INTO VEMPNO, VENAME, VDEPTNO, VDNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO AND E.ENAME = 'SMITH';

DBMS_OUTPUT.PUT_LINE('��� / �̸� / �μ���ȣ / �μ���');
DBMS_OUTPUT.PUT_LINE('---------------------------------');
DBMS_OUTPUT.PUT_LINE(VEMPNO || ' / ' || VENAME || ' / ' || VDEPTNO || ' / ' || VDNAME);
END;
/
-------------------------------------------------------------------------

DECLARE
VEMPNO EMP.EMPNO%TYPE;
VENAME EMP.ENAME%TYPE;
VDEPTNO DEPT.DEPTNO%TYPE;
VDNAME DEPT.DNAME%TYPE;
BEGIN
-- ���� ���� �޴� �������� ��� ����, ROW�� 1���� ���� �� �ִ�.
SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME
INTO VEMPNO, VENAME, VDEPTNO, VDNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO AND E.ENAME = 'SMITH';

DBMS_OUTPUT.PUT_LINE('��� / �̸� / �μ���ȣ / �μ���');
DBMS_OUTPUT.PUT_LINE('---------------------------------');
DBMS_OUTPUT.PUT_LINE(VEMPNO || ' / ' || VENAME || ' / ' || VDEPTNO || ' / ' || VDNAME);
END;
/
-------------------------------------------------------------------------

DECLARE
VEMP EMP%ROWTYPE;
BEGIN
-- ���� ���� �޴� �������� ��� ����, ROW�� 1���� ���� �� �ִ�.
SELECT *
INTO VEMP
FROM EMP
WHERE ENAME = 'SMITH';

DBMS_OUTPUT.PUT_LINE('��� / �̸� / �μ���ȣ');
DBMS_OUTPUT.PUT_LINE('-----------------------');
DBMS_OUTPUT.PUT_LINE(VEMP.EMPNO || ' / ' || VEMP.ENAME || ' / ' || VEMP.DEPTNO);
END;
/
-------------------------------------------------------------------------

DECLARE
VEMP EMP%ROWTYPE;
VDEPT DEPT%ROWTYPE;
BEGIN
-- ���� ���� �޴� �������� ��� ����, ROW�� 1���� ���� �� �ִ�.
SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME
INTO VEMP.EMPNO, VEMP.ENAME, VDEPT.DEPTNO, VDEPT.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO AND E.ENAME = 'SMITH';

DBMS_OUTPUT.PUT_LINE('��� / �̸� / �μ���ȣ / �μ���');
DBMS_OUTPUT.PUT_LINE('---------------------------------');
DBMS_OUTPUT.PUT_LINE(VEMP.EMPNO || ' / ' || VEMP.ENAME || ' / ' || VDEPT.DEPTNO || ' / ' || VDEPT.DNAME);
END;
/
-------------------------------------------------------------------------

DECLARE
VNUM1 NUMBER := 1;
VNUM2 NUMBER := 2;
BEGIN
IF VNUM1 >= VNUM2 THEN
DBMS_OUTPUT.PUT_LINE(VNUM1 || '��(��) ' || VNUM2 || '���� ū �� �Դϴ�.');
ELSE
DBMS_OUTPUT.PUT_LINE(VNUM2 || '��(��) ' || VNUM1 || '���� ū �� �Դϴ�.');
END IF;
END;
/
-------------------------------------------------------------------------


DECLARE
V_SAL NUMBER := 0;
V_DEPTNO NUMBER := 0;

BEGIN
V_DEPTNO := ROUND(DBMS_RANDOM.VALUE(10, 30), -1);
SELECT MAX(SAL) AS SAL INTO V_SAL FROM EMP
WHERE DEPTNO = V_DEPTNO;
DBMS_OUTPUT.PUT_LINE('����' || V_SAL);

IF V_SAL BETWEEN 1 AND 1000 THEN
DBMS_OUTPUT.PUT_LINE('����');
ELSIF V_SAL BETWEEN 1001 AND 2000 THEN
DBMS_OUTPUT.PUT_LINE('�߰�');
ELSIF V_SAL BETWEEN 2001 AND 3000 THEN
DBMS_OUTPUT.PUT_LINE('����');
ELSE 
DBMS_OUTPUT.PUT_LINE('�ֻ���');
END IF;

END;
/
-------------------------------------------------------------------------

--ORACLE������ BOOLEAN�ڷ���
--�� : TRUE, FALSE, NULL ���� ���� �� �ִ�. (��ҹ��� �Ȱ���)
--�ٸ� �ڷ����� DBMS_OUTPUT�� ��¹��� ���� ��� ���������� 
--BOOLEAN�ڷ��� ���� DBMS_OUTPUT�� ��¹����� �ٷ� ���� ����� �� ����.(����)

DECLARE
V_PI INTEGER;
V_VC VARCHAR2(10);
V_ORDER BOOLEAN;
BEGIN
DBMS_OUTPUT.PUT_LINE('V_PI = ' || V_PI);
DBMS_OUTPUT.PUT_LINE('V_VC = ' || V_VC);
V_ORDER := TRUE; 
DBMS_OUTPUT.PUT_LINE(
'BAL = ' || 
CASE 
WHEN V_ORDER = TRUE THEN 'Ture'
WHEN V_ORDER = FALSE THEN 'False'
ELSE 'NULL'
END
);
END;
/
-------------------------------------------------------------------------

DECLARE
V_DNAME DEPT.DNAME%TYPE := 0;
V_DEPTNO DEPT.DEPTNO%TYPE := 0;

BEGIN
V_DEPTNO := ROUND(DBMS_RANDOM.VALUE(10, 40), -1);
SELECT DEPTNO, DNAME INTO V_DEPTNO, V_DNAME FROM DEPT
WHERE DEPTNO = V_DEPTNO;

DBMS_OUTPUT.PUT_LINE('�μ���ȣ' || V_DEPTNO);

CASE V_DEPTNO WHEN 10 THEN
DBMS_OUTPUT.PUT_LINE(V_DNAME);
WHEN 20 THEN
DBMS_OUTPUT.PUT_LINE(V_DNAME);
WHEN 30 THEN
DBMS_OUTPUT.PUT_LINE(V_DNAME);
ELSE 
DBMS_OUTPUT.PUT_LINE(V_DNAME);
END CASE;

END;
/
-------------------------------------------------------------------------

DECLARE
V_DEPT DEPT%ROWTYPE;

BEGIN
V_DEPT.DEPTNO := ROUND(DBMS_RANDOM.VALUE(10, 40), -1);
SELECT * INTO V_DEPT FROM DEPT
WHERE DEPTNO = V_DEPT.DEPTNO;

DBMS_OUTPUT.PUT_LINE('�μ���ȣ' || V_DEPT.DEPTNO);

CASE V_DEPT.DEPTNO WHEN 10 THEN
DBMS_OUTPUT.PUT_LINE(V_DEPT.DNAME);
WHEN 20 THEN
DBMS_OUTPUT.PUT_LINE(V_DEPT.DNAME);
WHEN 30 THEN
DBMS_OUTPUT.PUT_LINE(V_DEPT.DNAME);
ELSE 
DBMS_OUTPUT.PUT_LINE(V_DEPT.DNAME);
END CASE;

END;
/
-------------------------------------------------------------------------

DECLARE
--%ROWTYPE �Ӽ����� �ο츦 ������ �� �ִ� ���۷��� ���� ����
VEMP EMP%ROWTYPE;
ANNSAL NUMBER(7, 2);

BEGIN
--���� ���� �޴� �������� ��� ����, ROW�� 1���� ���� �� �ִ�.
SELECT * INTO VEMP FROM EMP
WHERE ENAME = 'SMITH';

--������ ���̺��� %ROWTYPE���� �Ͽ��⿡
--�� �÷������� ���ٽÿ��� ������.�÷������� ������ �� �ִ�.
IF VEMP.COMM IS NULL THEN
VEMP.COMM := 0;
END IF;

--�Ҽ��� ��° �ڸ������� �ݿø� ��.
ANNSAL := VEMP.SAL * 12 + 1.156 + VEMP.COMM;

DBMS_OUTPUT.PUT_LINE('��� / �̸� / �μ���ȣ');
DBMS_OUTPUT.PUT_LINE('-----------------------');
--�ڹ��� ��ü ����� ����
DBMS_OUTPUT.PUT_LINE(VEMP.EMPNO || ' / ' || VEMP.ENAME || ' / ' || ANNSAL);
END;
/
-------------------------------------------------------------------------


