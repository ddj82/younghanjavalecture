CREATE TABLE TEST1 (
ID NUMBER (2) CONSTRAINT TEST1_ID_PK PRIMARY KEY,
NAME VARCHAR2(10),
AGE NUMBER(2)
);

CREATE TABLE TEST2 (
ID NUMBER (2) CONSTRAINT TEST2_ID_PK REFERENCES TEST1(ID),
JOB VARCHAR2(20)
);
-------------------------------------------------------------------------

INSERT INTO TEST1 VALUES(1, '�����', 10);
INSERT INTO TEST1 VALUES(2, '��ȿ��', 25);
INSERT INTO TEST1 VALUES(3, '�̳���', 40);
INSERT INTO TEST1 VALUES(5, '������', 35);
INSERT INTO TEST1 VALUES(6, '������', 15);
COMMIT;

INSERT INTO TEST2 VALUES(1, '���');
INSERT INTO TEST2 VALUES(3, '����');
INSERT INTO TEST2 VALUES(5, '����');
INSERT INTO TEST2 VALUES(3, '����');
INSERT INTO TEST2 VALUES(2, '�Ǵ�'); 
COMMIT;
-------------------------------------------------------------------------

SELECT * 
FROM TEST1 T1
JOIN TEST2 T2
ON T1.ID = T2.ID;

--SELECT * FROM TEST1 T1, TEST2 T2 WHERE T1.ID = T2.ID; 
-------------------------------------------------------------------------

SELECT ID, NAME, AGE, JOB 
FROM TEST1 T1
INNER JOIN TEST2 T2
USING (ID);
-------------------------------------------------------------------------
