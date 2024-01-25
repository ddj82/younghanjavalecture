SET SERVEROUTPUT ON

DECLARE
VEMP EMP%ROWTYPE;
ANNSAL NUMBER(7, 2);
BEGIN
--���� �� �޴� ���� �� ����
SELECT * INTO VEMP FROM EMP
WHERE ENAME = 'SMITH';

IF (VEMP.COMM IS NULL) THEN
ANNSAL := VEMP.SAL * 12;
ELSE
ANNSAL := VEMP.SAL * 12 + VEMP.COMM;
END IF;

DBMS_OUTPUT.PUT_LINE('��� / �̸� / ����');
DBMS_OUTPUT.PUT_LINE('-------------------');
DBMS_OUTPUT.PUT_LINE(VEMP.EMPNO || ' / ' || VEMP.ENAME || ' / ' || ANNSAL);
END;
/
-------------------------------------------------------------------------

DECLARE
V_EMPNO NUMBER(4) := 8888;
V_DEPTNO NUMBER(2);
V_ENAME VARCHAR2(10) := 'XMAN';
V_JOB VARCHAR2(9);
V_SAL NUMBER(7, 2);
BEGIN
V_DEPTNO := 20;

IF V_JOB IS NULL THEN
V_JOB := '����';
END IF;

IF V_JOB = '����' THEN
V_SAL := 2000;
ELSIF V_JOB IN ('MANAGER', 'ANALYST') THEN
V_SAL := 3500;
ELSE 
V_SAL := 2500;
END IF;

INSERT INTO EMP(DEPTNO, EMPNO, ENAME, SAL, JOB)
VALUES (V_DEPTNO, V_EMPNO, V_ENAME, V_SAL, V_JOB);
--COMMIT; --�ڵ�COMMIT�� �ƴϹǷ� ROLLBACK�� �ǵ����� ����
END;
/
-------------------------------------------------------------------------

DECLARE
N NUMBER := 1;
BEGIN
LOOP
DBMS_OUTPUT.PUT_LINE(N);
N := N + 1;
IF N > 5 THEN
EXIT; --BREAK�� ����� ��. END LOOP�� ��.
/*
EXIT -> IF���� ���� ��밡��. �Ǵ� EXIT WHEN ����; ���� ���� Ż�⹮ ��� ����
*/
END IF;
END LOOP;
END;
/
-------------------------------------------------------------------------

DECLARE
K INT := 1;
BEGIN
LOOP
DBMS_OUTPUT.PUT_LINE(K);
K := K + 1;
EXIT WHEN K > 10;
END LOOP;
END;
/
-------------------------------------------------------------------------

DECLARE
CNT NUMBER := 1;
STAR VARCHAR2(10) := NULL;
BEGIN
LOOP
STAR := STAR || '*';
CNT := CNT + 1;
DBMS_OUTPUT.PUT_LINE(STAR);
IF CNT > 5 THEN
EXIT;
END IF;
END LOOP;
END;
/
-------------------------------------------------------------------------

DECLARE
N NUMBER := 1;
TOT NUMBER := 0;
BEGIN
LOOP
TOT := TOT + N;
N := N + 1;
IF N > 10 THEN
EXIT;
END IF;
END LOOP;
DBMS_OUTPUT.PUT_LINE(TOT); --55
DBMS_OUTPUT.PUT_LINE(N); --11
END;
/
-------------------------------------------------------------------------

BEGIN
FOR N IN 1..5 LOOP
--N := N + 1; --����
DBMS_OUTPUT.PUT_LINE(N);
END LOOP;
END;
/
-------------------------------------------------------------------------

BEGIN
FOR N IN REVERSE 1..5 LOOP
DBMS_OUTPUT.PUT_LINE(N);
END LOOP;
END;
/
-------------------------------------------------------------------------

DECLARE
VNUM NUMBER := 3;
BEGIN
FOR I IN 1..9 LOOP
CONTINUE WHEN MOD(I, 2) = 0; --CONTINUE : LOOP �Ӹ��� ���ư���
DBMS_OUTPUT.PUT_LINE(I); --Ȧ���� ���
END LOOP;
END;
/
-------------------------------------------------------------------------

DECLARE
TOT NUMBER := 0;
BEGIN
FOR N IN 1..10 LOOP
TOT := TOT + N;
END LOOP;
DBMS_OUTPUT.PUT_LINE(TOT);
END;
/
-------------------------------------------------------------------------

DECLARE
VDEPT DEPT%ROWTYPE;
BEGIN
DBMS_OUTPUT.PUT_LINE('�μ���ȣ / �μ��� / ������');
DBMS_OUTPUT.PUT_LINE('----------------------------');
FOR CNT IN 1..4 LOOP
--���� �� �� ������ ��츸 ����.
SELECT DISTINCT * INTO VDEPT FROM DEPT
WHERE DEPTNO = 10 * CNT;
DBMS_OUTPUT.PUT_LINE(VDEPT.DEPTNO || ' / ' || VDEPT.DNAME || ' / ' || VDEPT.LOC);
END LOOP;
END;
/
-------------------------------------------------------------------------

DECLARE
N NUMBER := 1;
BEGIN
WHILE N <= 5 LOOP
DBMS_OUTPUT.PUT_LINE(N);
N := N + 1;
END LOOP;
END;
/
-------------------------------------------------------------------------

DECLARE
VNUM NUMBER := 2;
BEGIN
<<GUBUN>> --���� ���� �� �ִ�.
FOR I IN 1..9 LOOP
DBMS_OUTPUT.PUT_LINE(VNUM || ' * ' || I || ' = ' || VNUM * I);
IF VNUM < 9 AND I = 9 THEN
VNUM := VNUM + 1;
DBMS_OUTPUT.PUT_LINE('');
GOTO GUBUN; --�󺧷� ���ư���, ��ҹ��� ���� ����.
ELSIF VNUM = 9 AND I = 9 THEN
EXIT;
END IF;
END LOOP;
END;
/
-------------------------------------------------------------------------

DECLARE
VNUM NUMBER := 2;
BEGIN

<<EVEN>>
LOOP
IF MOD(VNUM, 2) = 0 THEN
DBMS_OUTPUT.PUT_LINE(VNUM || '�� ¦');
VNUM := VNUM + 1;
ELSE 
GOTO ODD;
END IF;
IF VNUM = 10 THEN
EXIT;
END IF;
END LOOP;

<<ODD>>
LOOP
IF MOD(VNUM, 2) = 1 THEN
DBMS_OUTPUT.PUT_LINE(VNUM || '�� Ȧ');
VNUM := VNUM + 1;
ELSE
GOTO EVEN;
END IF;
IF VNUM = 10 THEN
EXIT;
END IF;
END LOOP;

END;
/
-------------------------------------------------------------------------

DECLARE
V_DEPTNO EMP.DEPTNO%TYPE := 30; --NUMBER(2)
V_EMP EMP%ROWTYPE; --EMP ���̺��� ������ ������ �� �� �ڷ������� �����͸� �޾ƿ��� �����ڷ���
BEGIN
--������ Ŀ�� : ���� ���� �����Ͱ� �ڵ�����(����������) ó����.
UPDATE EMP01
SET SAL = SAL + SAL * 0.01
WHERE DEPTNO = V_DEPTNO;
DBMS_OUTPUT.PUT_LINE(SQL%ROWCOUNT);
--SQL%ROWCOUNT : Ŀ������ ���� ��� �ٷ� ���� ����� SQL���� ROW�� ��ȯ�ϴ� Ŀ���� �Ӽ���.
--Ŀ������ �ִ� ��� SQL�κ��� Ŀ�������� ���� �� �ִ�.
SELECT * INTO V_EMP FROM EMP01 WHERE ROWNUM = 1;
DBMS_OUTPUT.PUT_LINE(SQL%ROWCOUNT);
END;
/
-------------------------------------------------------------------------

DECLARE
VDEPT DEPT%ROWTYPE;
CURSOR C2 IS SELECT * FROM DEPT;
BEGIN
DBMS_OUTPUT.PUT_LINE('�μ���ȣ / �μ��� / ������');
DBMS_OUTPUT.PUT_LINE('--------------------------');
OPEN C2;
LOOP
FETCH C2 INTO VDEPT.DEPTNO, VDEPT.DNAME, VDEPT.LOC;
EXIT WHEN C2%NOTFOUND; --�� �̻� �о���� FETCH�� ������ TRUE
DBMS_OUTPUT.PUT_LINE(VDEPT.DEPTNO || ' ' || VDEPT.DNAME || ' ' || VDEPT.LOC);
END LOOP;
DBMS_OUTPUT.PUT_LINE('��� => ' || C2%ROWCOUNT);
CLOSE C2;
END;
/
-------------------------------------------------------------------------

DECLARE
V_EMPNO EMP.EMPNO%TYPE;
V_ENAME EMP.ENAME%TYPE;
CURSOR CUR_EMP(P_DEPTNO EMP.DEPTNO%TYPE)
IS SELECT EMPNO, ENAME FROM EMP WHERE DEPTNO = P_DEPTNO;
BEGIN
OPEN CUR_EMP(30);
LOOP
--Ŀ���� ����� �÷��� ����, ����, �ڷ�����
--FETCH ~ INTO�� �ȿ� ����� ������ ����, ����, �ڷ����� ��ġ�ؾ� �Ѵ�.
FETCH CUR_EMP INTO V_EMPNO, V_ENAME;
EXIT WHEN CUR_EMP%NOTFOUND;
DBMS_OUTPUT.PUT_LINE(V_EMPNO || ' ' || V_ENAME);
END LOOP;
CLOSE CUR_EMP;
END;
/
-------------------------------------------------------------------------

DECLARE
CURSOR C2 IS SELECT * FROM DEPT;
BEGIN
DBMS_OUTPUT.PUT_LINE('�μ���ȣ / �μ��� / ������');
DBMS_OUTPUT.PUT_LINE('----------------------------');
FOR VDEPT IN C2 LOOP
DBMS_OUTPUT.PUT_LINE(VDEPT.DEPTNO || ' ' || VDEPT.DNAME || ' ' || VDEPT.LOC);
END LOOP;
END;
/
-------------------------------------------------------------------------

DECLARE
CURSOR CUR_EMP(P_DEPTNO EMP.DEPTNO%TYPE)
IS SELECT * FROM EMP WHERE DEPTNO = P_DEPTNO;
BEGIN
FOR EMP_ROW IN CUR_EMP(30)
LOOP
DBMS_OUTPUT.PUT_LINE(EMP_ROW.EMPNO || ' ' || EMP_ROW.ENAME);
END LOOP;
END;
/
-------------------------------------------------------------------------

BEGIN
FOR EMP_ROW IN (SELECT * FROM EMP WHERE DEPTNO = 30)
LOOP
DBMS_OUTPUT.PUT_LINE(EMP_ROW.EMPNO || ' ' || EMP_ROW.ENAME);
END LOOP;
END;
/
-------------------------------------------------------------------------

DECLARE
VEMPNO EMP.EMPNO%TYPE;
VENAME EMP.ENAME%TYPE;
VJOB EMP.JOB%TYPE;
V_SQL VARCHAR2(1000);
BEGIN
--SQL�������� ������ ��´�
--V_SQL������ VARCHAR2�̹Ƿ� ���� SMITH�� ���ڿ��̶�� ���� �ν��ϵ��� �ϱ� ���ؼ���
--''��''(��������ǥ 2��)�� ����ؾ� �Ѵ�. ū����ǥ�� �ƴ�.
V_SQL := 'SELECT EMPNO, ENAME, JOB FROM EMP WHERE ENAME = ''SMITH'' ';
EXECUTE IMMEDIATE V_SQL INTO VEMPNO, VENAME, VJOB;
DBMS_OUTPUT.PUT_LINE('EMPNO : ' || VEMPNO);
DBMS_OUTPUT.PUT_LINE('ENAME : ' || VENAME);
DBMS_OUTPUT.PUT_LINE('JOB : ' || VJOB);
END;
/
-------------------------------------------------------------------------

--���ε� ���� ��� : �������ִ� ������ ���ε��� ��.
--SQL�������� ������ �����Ͽ� �ش� ������ �����ϴ� ���� �������ִ� ���
--���� SQL���� ���� ����Ǿ ������ �������� �ʿ䰡 ����.
DECLARE
VEMPNO EMP.EMPNO%TYPE;
VENAME EMP.ENAME%TYPE;
--���ε� ������ �� ����
VJOB EMP.JOB%TYPE := 'CLERK';
VDEPTNO EMP.DEPTNO%TYPE := 30;

V_SQL VARCHAR2(1000);
BEGIN
--SQL�������� ���ε� ������ ó��
--SQL������ ���� ���ε� ������ �� [:������] �������� ������־�� �Ѵ�.
V_SQL := 'SELECT EMPNO, ENAME FROM EMP WHERE JOB = :A AND DEPTNO = :B';
--V_SQL := 'SELECT EMPNO, ENAME FROM EMP WHERE JOB = :A AND DEPTNO = :A'; --����
EXECUTE IMMEDIATE V_SQL INTO VEMPNO, VENAME
USING VJOB, VDEPTNO;
DBMS_OUTPUT.PUT_LINE('EMPNO : ' || VEMPNO);
DBMS_OUTPUT.PUT_LINE('ENAME : ' || VENAME);
END;
/
-------------------------------------------------------------------------

DECLARE
VIDS MYINFO.IDS%TYPE := 1;
VNM MYINFO.NM%TYPE := 'ALBERT';
VBD MYINFO.BD%TYPE := TO_DATE('2000/01/01', 'YYYY/MM/DD');
--VIDS MYINFO.IDS%TYPE := 2;
--VNM MYINFO.NM%TYPE := 'MAX';
--VBD MYINFO.BD%TYPE := TO_DATE('2005/03/05', 'YYYY/MM/DD');
VSQL VARCHAR2(1000);
BEGIN
VSQL := 'INSERT INTO MYINFO VALUES (:A, :A, :A)';
EXECUTE IMMEDIATE VSQL USING VIDS, VNM, VBD;
COMMIT;
END;
/
-------------------------------------------------------------------------

DECLARE
VIDS MYINFO.IDS%TYPE := 1;
VNM MYINFO.NM%TYPE := 'ALBERT';
VBD MYINFO.BD%TYPE := TO_DATE('2010/01/01', 'YYYY/MM/DD');
VMY MYINFO%ROWTYPE;
CURSOR C_MYINFO IS SELECT * FROM MYINFO;
VSQL VARCHAR2(1000);

BEGIN

VSQL := 'UPDATE MYINFO SET BD = :A WHERE IDS = :A';
EXECUTE IMMEDIATE VSQL USING VBD, VIDS;
COMMIT;

SELECT NM, BD INTO VNM, VBD FROM MYINFO WHERE IDS = VIDS;
DBMS_OUTPUT.PUT_LINE('UPDATE�� ���� ��(COMMIT) : ' || VNM || ', ' || VBD);
VIDS := 2; 

VSQL := 'DELETE FROM MYINFO WHERE IDS = :A';
EXECUTE IMMEDIATE VSQL USING VIDS; 

OPEN C_MYINFO;
LOOP
FETCH C_MYINFO INTO VMY;
EXIT WHEN C_MYINFO%NOTFOUND;
DBMS_OUTPUT.PUT_LINE('DELETE�� ���� �� : ' || VMY.IDS || '' || VMY.NM || ' ' || VMY.BD);
END LOOP;
CLOSE C_MYINFO;

DBMS_OUTPUT.PUT_LINE('---------------------------------------------------');

ROLLBACK;

OPEN C_MYINFO;
LOOP
FETCH C_MYINFO INTO VMY;
EXIT WHEN C_MYINFO%NOTFOUND;
DBMS_OUTPUT.PUT_LINE('DELETE�� ���� �� : ' || VMY.IDS || '' || VMY.NM || ' ' || VMY.BD);
END LOOP;
CLOSE C_MYINFO;
END;
/
-------------------------------------------------------------------------


-------------------------------------------------------------------------


-------------------------------------------------------------------------


-------------------------------------------------------------------------


-------------------------------------------------------------------------


-------------------------------------------------------------------------


-------------------------------------------------------------------------


-------------------------------------------------------------------------


-------------------------------------------------------------------------
