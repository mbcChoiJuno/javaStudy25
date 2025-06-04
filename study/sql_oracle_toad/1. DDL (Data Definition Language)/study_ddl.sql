
 /*
     DDL (Data Definition Language)
     
     ������ ���Ǿ�
     ��ü ����,  ��ü �� ��(Cols) ������ 
     �������� ������  ���̺� �����ϰ� ( ��ü�� ����/����/���� �� )
         
     SYSTEM�� DBA���� �ַ� �����ϰ�
     �ٸ� USER���Դ� ���� ������ ������ �� �ִ�.
     
     -CREATE TABLE
     -ALTER TABLE
     -TRUNCATE TABLE
     -DROP  
     -RENAME
 */
 
 /*
     312p ~ 324p
     ���Ǿ� ����
 */
 
 /*
  ������ ���Ǿ� :
  ��ü�� ����/����/���� ���� ����� ����
 */
 
 SELECT * FROM all_tables; -- DB�� ��ü ���̺� ��ȸ
 
 SELECT * FROM user_tables; -- user�� �����ϴ� ���̺� ��ȸ
 
 SELECT * FROM tabs; -- user�� �����ϴ� ���̺� ��ȸ
 
 
 
 /* 
     312p
     ���̺� ���� CREATE
 
 */
 
 -- 313p ���̺� �����ϱ�
 CREATE TABLE emp_ddl( empno NUMBER(4), ename VARCHAR2(10), job VARCHAR2(10), mgrno NUMBER(4), hiredate DATE, sal NUMBER(7,2), comm NUMBER(7,2), deptno NUMBER(2));
 
 SELECT * FROM EMP_DDL;
 
 DESC EMP_DDL;
 
 
 -- 314p �ٸ� ���̺� ����
 CREATE TABLE dept_ddl AS SELECT * FROM dept;
 
 -- 314p ���� ��ȸ
 DESC dept_ddl;
 
 SELECT * FROM dept_ddl;  
 
 
 -- 315p ���̺� �Ϻθ� ���� (������ �ɾ ������ �� ����)
 CREATE TABLE emp_ddl_30 AS SELECT * FROM emp WHERE (deptno = 30); 
 
 SELECT * FROM emp_ddl_30;  
 
 
 -- 315p ���̺� ������ �����ϱ�
 CREATE TABLE empdept_ddl AS SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, E.DEPTNO, D.DNAME, D.LOC FROM emp E JOIN dept D ON (E.DEPTNO) WHERE 1 <> 1;
 
 SELECT * FROM empdept_ddl;  
 
 
 
 /*
     317p
     ���̺� ���� ALTER
     
 */
 
 -- ���̺� �����ؼ� �����ϱ�
 CREATE TABLE emp_alter AS SELECT * FROM emp;
 
 SELECT * FROM emp_alter;
 
 
 -- 318p ���̺� ��(cols)�� �߰��ϴ�  ALTER TABLE - ADD 
 ALTER TABLE emp_alter ADD hp VARCHAR2(20);
     
 SELECT * FROM emp_alter;
 
 
 -- 318p ��(cols) �̸��� �����ϱ�  ALTER TABLE - RENAME COLUMN - TO -
 ALTER TABLE emp_alter RENAME COLUMN hp TO tel;
 
 SELECT * FROM emp_alter;
 
 
 -- 319p �ʵ��� ������ ���� �����ϱ�?   ALTER TABLE - MODIFY - -
 -- ���� �������� ����� �ٷ� �����
 ALTER TABLE emp_alter MODIFY empno NUMBER(5); 
 
 -- �̹� ����ִ� ������ ��ҽ�Ű���� �ϰų�,  �ƿ� �ٸ� �������� �����  
 -- ������ ���� ������� ������  ������ ����
 ALTER TABLE emp_alter MODIFY empno NUMBER(3);  -- ���� 
 ALTER TABLE emp_alter MODIFY tel VARCHAR2(10); -- ���� 
 
 SELECT * FROM emp_alter;
 
 
 -- 319p ��(cols) ����  ALTER TABLE - DROP COLUMN -
 ALTER TABLE emp_alter DROP COLUMN tel;
 
 SELECT * FROM emp_alter;
 
 
 
 /*
     321p
     ���̺� �̸� ���� RENAME
     
 */
 
 -- 321p ���̺� �̸� �����ϱ�   RENAME - TO -
 RENAME emp_alter TO emp_rename;
 
 SELECT * FROM emp_rename;
 
 -- 321p ���� ���̺� Ȯ�� 
 DESC emp_alter;
 
 -- 321p ���� ���̺� Ȯ��
 SELECT * FROM emp_rename;
 
 
 
 /*
     322p
     ���̺� ������ ���� TRUNCATE
     
 */
 
 -- 322p ���̺� ��ü ������ ����   TRUNCATE TABLE -
 -- ���̺� ���� �ƴ� !!!  ���̺� ������ DROP
 -- DELETE�� �ٸ��� ���Ǿ��  ROLLBACK �Ұ���
 TRUNCATE TABLE emp_rename;
 
 SELECT * FROM emp_rename;
 
 
 
 /*
     323p
     ���̺� ���� DROP
     
 */
 
 -- 323p ���̺� ����  DROP TABLE - 
 DROP TABLE emp_rename;
 
 -- 323p ���̺� Ȯ�� 
 DESC emp_rename;
 
 
 