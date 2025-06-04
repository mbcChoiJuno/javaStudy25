 
 /*
     DML (Data Manipulation Language)
 */
 
 /* DELETE �н� 283p ~ 286p */
 
 
 -- 283p emp ���̺� �����ϱ�
 CREATE TABLE emp_temp2 AS SELECT * FROM emp; 
 
 -- 283p ������ ���̺� Ȯ��
 SELECT * FROM emp_temp2;
 
 -- 284p WHERE ���� ������ �Ϻλ���
 DELETE FROM emp_temp2 WHERE job = 'MANAGER'; 
 
 -- 285p WHERE + ���������� ������ �Ϻλ���
 /* �ؼ�: 
  emp_temp2����  ���������� �ش��ϴ� empno�� �ִ� ���� �����Ѵ�.
  ��������: emp_temp2 ���̺�� salgrade ���̺� ����
  emp_temp2 ���̺��� sal ���� salgrade �� low, high ������ ���� sal grade�� ���
  grade�� 3�� deptno 30 �μ��� �����ȣ ������� ���� 
 */
 DELETE FROM emp_temp2 WHERE empno IN (SELECT E.EMPNO FROM emp_temp2 E, salgrade S WHERE E.SAL BETWEEN S.LOSAL and S.HISAL and S.GRADE = 3 and deptno = 30);
 
 
 -- 286p ���̺��� ��ü ������ ����
 DELETE FROM emp_temp2;
 