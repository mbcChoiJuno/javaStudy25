 
 /*
     DML (Data Manipulation Language)
 */
 
 /* INSERT �н� 264p ~ 276p */
 
 
 -- 266p ���̺� �����ϱ� 
 CREATE TABLE dept_temp AS SELECT * FROM DEPT;
 
 -- 266p ������ ���̺� ��ȸ
 SELECT * FROM dept_temp;
 
 -- 268p ���̺�  ������ �߰��ϱ�
 INSERT INTO dept_temp (deptno, dname, loc) VALUES (50, 'DATABASE', 'SEOUL');
 
 -- 270p NULL�� �����Ͽ� �Է��ϱ�
 INSERT INTO dept_temp (deptno, dname, loc) VALUES (70, 'WEB', NULL);
 
 -- 271p ���� ���ڿ��� NULL �Է��ϱ�
 INSERT INTO dept_temp (deptno, dname, loc) VALUES (80, 'MOBILE', '');
 
 -- 271p �� �����͸� ���� �ʴ� ������� NULL �Է��ϱ�
 INSERT INTO dept_temp (deptno, loc) VALUES (90, 'INCHEON');
 
 
 
 -- 272p EMP ���̺��� �����ؼ� emp_temp ���̺� �����
 CREATE TABLE emp_temp AS SELECT * FROM emp WHERE 1 <> 1;
 
 -- 272p ���̺� Ȯ��
 SELECT * FROM emp_temp;
 
 -- 273p INSERT ������ ��¥ �Է��ϱ� ( HIREDATE �ʵ尡 DATE Ÿ���̶� ��¥���·� �Է� )
 INSERT INTO emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (9999, 'ȫ�浿', 'PRESIDENT', NULL, '2025/06/03', 5000, 1000, 10);
 
 -- 273p INSERT ������ ��¥ �Է��ϱ� 2 ( HIREDATE �ʵ尡 DATE Ÿ���̶� ��¥���·� �Է� )
 INSERT INTO emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (1111, '������', 'MANAGER', 9999, '2025-06-03', 4000, NULL, 20);
 
 -- 273p ���� ���̽� ��¥ ���ڿ��� �߸� �Է��ϸ� ���峲
 INSERT INTO emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (2222, '�̼���', 'MANAGER', 9999, '06/03/2025', 4000, NULL, 20);
 
 -- 274p ��¥�� TO_DATE �Լ� ����� ����
 INSERT INTO emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (2222, '�̼���', 'MANAGER', 9999, TO_DATE('03/06/2025', 'DD/MM/YYYY'), 4000, NULL, 20);
 
 -- 275p SYSDATE ( ���� ��¥ )
 INSERT INTO emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (3333, '��û��', 'MANAGER', 9999, SYSDATE, 4000, NULL, 30);
 
 
 -- 275p ���������� �ѹ��� ���� ������ �߰�
 INSERT INTO emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) (SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, E.DEPTNO FROM emp E, salgrade S WHERE E.SAL BETWEEN S.LOSAL and S.HISAL and S.GRADE = 1);
