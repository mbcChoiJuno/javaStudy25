 
 /*
     DML (Data Manipulation Language)
 */
 
 /* UPDATE �н� 277p ~ 282p */
 
 
 /* 
  UPDATE �� �����ϱ� 
 */
 -- 277p DEPT �����ؼ� DEPT2 ���̺� �����
 CREATE TABLE dept_temp2 AS SELECT * FROM dept; 
 
 -- dept_temp2 Ȯ��
 SELECT * FROM dept_temp2;
 
 -- 278p UPDATE�� WHERE ���ǹ� ����  ����������  ������ �߻�  ��� �����Ͱ� SEOUL�� �ٲ�
 UPDATE dept_temp2 SET loc = 'SEOUL';
 
 -- 278p �ѹ�
 rollback;
 
 -- 279p �Ϻ� �����͸� �����ϱ�
 UPDATE dept_temp2 SET dname = 'DATABASE', loc = 'SEOUL' WHERE deptno = 40; 
 
 -- 280p ���������� �Ϻ� ������ �����ϱ�  ** �򰥸�
 UPDATE dept_temp2 SET (dname, loc) = (SELECT dname, loc FROM dept WHERE deptno = 40) WHERE deptno = 40;
 
 -- 280p ���������� �Ϻ� ������ �����ϱ�2  �� �ϳ��ϳ� ����  ** �򰥸�
 UPDATE dept_temp2 SET dname = (SELECT dname FROM dept WHERE deptno = 40), loc = (SELECT loc FROM dept WHERE deptno = 40) WHERE deptno = 40;
 
 -- 281p �������� WHERE ������ ����ϱ�
 UPDATE dept_temp2 SET loc = 'SEOUL' WHERE deptno = (SELECT deptno FROM dept_temp2 WHERE dname = 'OPERATIONS'); 
 