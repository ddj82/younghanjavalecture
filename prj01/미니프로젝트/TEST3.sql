SELECT * FROM MENU_INFO WHERE MENU_NO = '4';
SELECT * FROM MENU_INFO;
ALTER TABLE MEM_INFO ADD (ADMIN_ID VARCHAR2(5), ADMIN_PASSWD NUMBER(4));

CREATE TABLE ADMIN_M (ADMIN_ID VARCHAR2(5), ADMIN_PASSWD NUMBER(4));
INSERT INTO ADMIN_M VALUES ('admin', 1234);
COMMIT;
SELECT * FROM ADMIN_M WHERE ADMIN_ID = 'admin' AND ADMIN_PASSWD = 1234;

SELECT * FROM MENU_INFO;
SELECT * FROM MENU_INFO WHERE MENU_NO = 5;

SELECT * FROM MENU_INFO WHERE MENU_CAT = '����';

CREATE TABLE CART (
CART_ORDERNUM VARCHAR2(15) NOT NULL,
CART_MENUNO NUMBER(2),
CART_EA NUMBER(3),
CART_TOT NUMBER(10),
CART_ADR VARCHAR2(100) NOT NULL
);
DROP TABLE CART PURGE;

SELECT SUM(ORDER_TOT) TOTAL FROM ORDER_LIST WHERE ORDER_NM = 'ȫ�浿' AND ORDER_ADR = '�G��' GROUP BY ORDER_NUM ;
SELECT SUM(ORDER_TOT) TOTAL FROM ORDER_LIST WHERE ORDER_NM = '1' AND ORDER_ADR = '1' GROUP BY ORDER_NUM;
SELECT DISTINCT ORDER_BR, ORDER_DT, ORDER_MA FROM ORDER_LIST WHERE ORDER_NM = '�ٹ��';
SELECT DISTINCT ORDER_NM, ORDER_PN, ORDER_ADR FROM ORDER_LIST WHERE ORDER_NM = '�ٹ��';

SELECT MENU_NM, SUM(ORDER_EA), SUM(ORDER_TOT) FROM ORDER_LIST O, MENU_INFO M 
WHERE MENU_NO = ORDER_MENUNO AND ORDER_NM = '�ٹ��' 
GROUP BY MENU_NM ORDER BY SUM(ORDER_TOT) DESC;

SELECT SUM(ORDER_TOT) TOTAL FROM ORDER_LIST WHERE ORDER_NM = '�ٹ��' AND ORDER_ADR = '���̽��ڽ�' GROUP BY ORDER_NUM;

SELECT DISTINCT MENU_NM, MENU_WG, MENU_ML, MENU_K, MENU_SU, MENU_D, MENU_F, MENU_N, MENU_C
FROM MENU_INFO M, ORDER_LIST O
WHERE MENU_NO = ORDER_MENUNO AND ORDER_NM = '�ٹ��';

select * FROM ORDER_LIST WHERE ORDER_NUM = 202402070032; --AND ORDER_STATUS LIKE '%����%';

SELECT M.MENU_NM, O.ORDER_MENUNO, M.MENU_PR, O.ORDER_EA FROM ORDER_LIST O INNER JOIN MENU_INFO M ON O.ORDER_MENUNO = M.MENU_NO WHERE O.ORDER_NUM = 202402070046;