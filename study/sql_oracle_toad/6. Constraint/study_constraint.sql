  
 /*
     Constraint
     
     ��������
     
     Ư���� ���̺��� ��(cols) �ʵ忡  ������ ������ ����, NULL�� ����ϴ��� ���� �� 
     ���� �Ӽ��� �ο������ν�
     
     ���� ���̺��� ���̴� ������ ���� �ӿ���
     ������ ���Ἲ�� ��Ų��.
     
     ������ ���Ἲ: ��Ȯ�� + �ϰ���
 */

 /* 
    359p ~ 393p
    ���� ���� ����
    
 */
 
 -- 362p
 CREATE TABLE table_notnull(
    login_id   VARCHAR2(20) NOT NULL,
    login_pwd  VARCHAR2(20) NOT NULL,
    login_tel  VARCHAR2(20)
 );
 DESC table_notnull;
 
 -- 362p  NOT NULL�� NULL�� ���� ���� �߻�
 INSERT INTO table_notnull VALUES('TEST_ID_01', NULL, '010-1234-5678');
 
 -- 363p  ���� �۵�
 INSERT INTO table_notnull VALUES('TEST_ID_01', '1234', NULL);
 
 -- Ȯ�ο�
 SELECT * FROM table_notnull;
 
 -- 363p  TEST_ID_01 ������ login_pwd�ʵ�(NOT NULL)��  NULL������ ���� �õ�
 UPDATE table_notnull SET login_pwd = NULL WHERE login_id = 'TEST_ID_01';
 
 
 
 /*
    364p
    �������� ��ü Ȯ��
    
 */
 
 -- 364p �������� ���캸��
 SELECT * FROM USER_CONSTRAINTS;
 
 
 /*
    365p
    �������� �̸� ���� ����   CONSTRAINT -���Ǹ�- ��������
    
 */
 
 -- 365p ���̺� �����ϸ鼭 �ٷ� �������� ����
 CREATE TABLE table_notnull2(
    login_id    VARCHAR(20) CONSTRAINT TBLNN2_LGNID_NN NOT NULL,
    login_pwd   VARCHAR(20) CONSTRAINT TBLNN2_LGNPW_NN NOT NULL,
    tel         VARCHAR(20)
 );
 
 SELECT * FROM USER_CONSTRAINTS;
 
 
 -- 366p  �̹� ������ ���̺�  �������� �ο� ��
 -- tel ��(cols)�� null�� �̹� �־ NOT NULL �ο� �Ұ���
 ALTER TABLE table_notnull MODIFY (tel NOT NULL);
 
 -- 366p  tel �������� ����
 UPDATE table_notnull SET tel = '010-1234-5678' WHERE login_id = 'TEST_ID_01';
 
 SELECT * FROM table_notnull;
 
 -- 367p  �ٽ��ѹ� NOT NULL �ο�
 ALTER TABLE table_notnull MODIFY (tel NOT NULL);
 
 -- 367p  �������ǿ� �̸� �����ؼ� �߰�
 ALTER TABLE table_notnull2 MODIFY (tel CONSTRAINT TBLNN_TEL_NN2 NOT NULL);
 
 SELECT * FROM USER_CONSTRAINTS;
 
 /* 
    368p
    �̹� ������ �������� �̸� ����
 
 */
 
 -- 368p  �̹� ������ ��������  �̸� ����
 ALTER TABLE table_notnull2 RENAME CONSTRAINT tblnn_tel_nn2 to tblnn2_tel_nn;
 
 -- 369p  �������� �����ϱ�
 ALTER TABLE table_notnull2 DROP CONSTRAINT tblnn_tel_nn2;
 
 
 /*
    370p
    �ߺ����� �ʴ� �� UNIQUE
 */
 
 -- 370p  ���̺� �����ϸ鼭 �������� UNIQUE �ο��ϱ�
 CREATE TABLE table_unique (
    login_id    VARCHAR2(20) CONSTRAINT table_unique_login_id_u UNIQUE,
    login_pwd   VARCHAR2(20) CONSTRAINT table_unique_login_pw_nn NOT NULL,
    tel         VARCHAR2(20)
 );
 
 SELECT * FROM USER_CONSTRAINTS WHERE table_name = 'TABLE_UNIQUE';
 
 -- 371p unique �ʵ忡 ���̵� �Է�1
 INSERT INTO table_unique (login_id, login_pwd, tel) VALUES ('TEST_ID_01', 'PWD01', '010-1234-5678');
 
 SELECT * FROM table_unique;
 
 -- 371p unique �ʵ忡 ���̵� �Է�2 = �ߺ����� ���Ἲ ���� ����
 INSERT INTO table_unique (login_id, login_pwd, tel) VALUES ('TEST_ID_01', 'PWD01', '010-1234-5678');
 
 -- 372p �ٸ� ID �Է½� ���� �Էµ�
 INSERT INTO table_unique (login_id, login_pwd, tel) VALUES ('TEST_ID_02', 'PWD01', '010-1234-5678');

 -- 372p unique ������ �־  �ߺ��� 2�� 3�� ��� ��
 INSERT INTO table_unique (login_id, login_pwd, tel) VALUES (NULL, 'PWD01', '010-1234-5678');
 
 -- 373p unique ���� �ʵ忡 ������ �����ϱ�  �̹� �ִ� ID��  ���Ἲ ���� ����
 UPDATE table_unique SET login_id = 'TEST_ID_01' WHERE login_id IS NULL;
 
 
 -- 373p ���̺� �����Ҷ� unique ���� �̸� �����
 -- ������ �̹� �׷��� ��
 
 
 /* 
    377p
    ���� Ű
    PRIMARY KEY
 
 */
 
 -- 377p
 CREATE TABLE table_pk(
    login_id    VARCHAR2(20) CONSTRAINT tpk_loginid_pk PRIMARY KEY,
    login_pw    VARCHAR2(20) NOT NULL,
    tel         VARCHAR2(20)
 );
 
 SELECT * FROM USER_CONSTRAINTS;
 
 -- 378p skip
 
 
 /*
    379p
    PRIMARY KEY (PK)
    
 */
 
 -- 379p   PRIMARY KEY��  �ߺ���, NULL�� ������ ����  �������Է� 1
 INSERT INTO table_pk VALUES('TEST_ID_01', 'PWD01', '010-6800-3743');
 
 SELECT * FROM table_pk;
 
 -- 379p   PRIMARY KEY��  �ߺ���, NULL�� ������ ����  �������Է� 2  -> ���Ἲ ���� ����
 INSERT INTO table_pk VALUES('TEST_ID_01', 'PWD02', '010-6800-3743');
 
 -- 380p   PRIMARY KEY��  �ߺ���, NULL�� ������ ����  �������Է� 3  -> ���Ἲ ���� ����
 INSERT INTO table_pk VALUES(NULL, 'PWD03', '010-6800-3743');
 
 -- 380p   PRIMARY KEY��  �Ͻ������� NULL�� �־  -> ���Ἲ ���� ����
 INSERT INTO table_pk (login_pw, tel) VALUES('PWD03', '010-6800-3743');
 
 
 /*
    382p
    FOREIGN KEY (FK)
    
 */
 
 -- 382p  �׽�Ʈ�� SCOTT ���� ���̺���  �������� ���캸��
 SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME, R_OWNER, R_CONSTRAINT_NAME FROM USER_CONSTRAINTS WHERE TABLE_NAME IN ('EMP', 'DEPT'); 
 
 -- 383p  FK�� �����ϴ� ���� �������� �ʴ� ������ �Է��ϱ�  deptno�� 10~40�ۿ� ����
 INSERT INTO emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (9999, 'ȫ�浿', 'CLERK', '7788', TO_DATE('2025-06-04','YYYY/MM/DD'), 1200, NULL, 50);
 
 
 -- 384p  PK�� ���� dept fk ���̺� �����
 CREATE TABLE dept_fk (
    deptno  NUMBER(2) CONSTRAINT deptfk_deptno_pk PRIMARY KEY,
    dname   VARCHAR2(14),
    loc     VARCHAR2(13)
 );
 
 -- 385p  PK�� ������,  fk��  dept fk�� �ٶ󺸴�  emp fk ���̺� �����
 CREATE TABLE emp_fk(
    empno       NUMBER(2) CONSTRAINT empfk_empno_pk PRIMARY KEY,
    ename       VARCHAR2(10),
    job         VARCHAR2(9),
    mgr         NUMBER(4),
    hiredate    DATE,
    sal         NUMBER(7,2),
    comm        NUMBER(7,2),
    deptno      NUMBER(2) CONSTRAINT empfk_deptno_fk REFERENCES dept_fk(deptno)
 );
 
 SELECT * FROM emp_fk;
 
 -- 386p  �ʱ�ܰ��  dept fk ���̺� �����Ͱ� ����,  emp fk ���̺� �����͸� �������� �ϸ�  ���Ἲ ����
 INSERT INTO emp_fk VALUES (99, 'TEST_NAME', 'TEST_JOB', NULL, TO_DATE('2025-06-04','YYYY/MM/DD'), 3000, NULL, 10);
 
 -- 386p  dept fk ���̺� ������ �����ϱ�
 INSERT INTO dept_fk VALUES (10, 'TEST_DNAME', 'TEST_LOC');
 
 -- 386p  fk ���� ���̺� ������ ������  emp ���̺� ������ ������ �۵�
 INSERT INTO emp_fk VALUES (99, 'TEST_NAME', 'TEST_JOB', NULL, TO_DATE('2025-06-04','YYYY/MM/DD'), 3000, NULL, 10);
 
 SELECT * FROM emp_fk;
 
 
 -- 387p  dept_fk ���̺��� 10�� �μ� ������ ���� �õ�  = deptno 10�� �����ϴ� ���̺��� �־ ���Ἲ ����
 DELETE FROM dept_fk WHERE deptno = 10; 
 
 
 
 /*
    390p
    CHECK ��������
 */
 
 -- 390p  ���̺� �����Ҷ� check �������� �ֱ�
 CREATE TABLE table_check (
    login_id    VARCHAR2(20) CONSTRAINT tblck_loginid_pk PRIMARY KEY,
    login_pwd   VARCHAR2(20) CONSTRAINT tblck_loginpw_ck CHECK (LENGTH(login_pwd) > 3),
    tel         VARCHAR2(20)
 );
 
 -- 390p  check �������ǿ� �����ʴ� �� �Է� ��  ���Ἲ ����� ����
 INSERT INTO table_check VALUES ('TEST_ID_01', '123', '010-6800-3743');
 
 -- 391p  check �������ǿ� �´� �� �Է½� �����۵�
 INSERT INTO table_check VALUES ('TEST_ID_01', '1234', '010-6800-3743');
 
 SELECT * FROM table_check;
 
 
 
 /*
    392p
    DEFAULT ��������
 */
 
 -- 392p  default ������ �ɰ�  ���̺����
 CREATE TABLE table_default(
    login_id    VARCHAR2(20) CONSTRAINT tblck2_loginid_pk PRIMARY KEY,
    login_pwd   VARCHAR2(20) DEFAULT '1234',
    tel         VARCHAR2(20)
 );
 
 -- 392p  default�� ������ �ʵ�  null�� �Է�
 INSERT INTO table_default VALUES ('TEST_ID_01', NULL, '010-4561-7897');
 
 SELECT * FROM table_default; -- NULL�̶� NULL�� �����Ǿ� ��
 
 INSERT INTO table_default (login_id, tel) VALUES ('TEST_ID_02', '010-1234-1233');
 
 SELECT * FROM table_default; -- �Ͻ������� �ƹ��͵� ����������  NULL ��� DEFAULT value�� ��