 
 /*
     DML (Data Manipulation Language)
 */
 
 /* SELECT �н� 73p ~ 240p */
 
 
 -- [emp ���̺�] ��������
 desc emp;       
 
 -- [emp ���̺�] ���뺸��
 select * from emp;  
 
 -- [dept ���̺�] ��������
 desc dept;      
 
 -- [dept ���̺�] ���뺸��
 select * from dept;  
 
 -- [bonus ���̺�] ��������
 desc bonus;     
 
 -- [bonus ���̺�] ���뺸��
 select * from bonus;  
 
 -- [salgrade ���̺�] ��������
 desc salgrade;  
 
 -- [salgrade ���̺�] ���뺸��
 select * from salgrade;  
 
  
 
 
 
 -- ������
 
 -- 73p DTO ���̺� ���� 
 desc emp;
 
 -- 74p DTO ���̺� ���� 
 desc dept;
 
 -- 75p DTO ���̺� ���� 
 desc salgrade;
 
 /* 80p emp ���̺��� ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp;
 
 /* 81p emp ���̺��� empno, ename, deptno �ʵ带 ��ȸ�Ѵ�. */
 select empno, ename, deptno from emp;
 
 /* 82p emp ���̺��� �ߺ��Ǵ� ���� �ϳ��� �����Ͽ� deptno �ʵ带 ��ȸ�Ѵ�. */
 select distinct deptno from emp;
 
 /* 83p emp ���̺��� job, deptno�� ������ �ߺ��Ǵ� ��� �ϳ��� �����Ͽ� job, deptno �ʵ带 ��ȸ�Ѵ�. */
 select distinct job, deptno from emp;
     
 /* 83p emp ���̺��� ��� job, deptno �ʵ带 ��ȸ�Ѵ�.  *** all�� ������ �۵���. ���߿� �ʵ��� ������ ������ �ٸ��� ����� �� �� ���� (Ȯ��) */
 select all job, deptno from emp;
 
 /* 84p emp ���̺��� ename, sal, (custom �ʵ�), comm�� ��ȸ�Ѵ�.  custom �ʵ�� ���Ŀ����̵ǰ� ������ define�� ������ ������ �ʵ���� ������ */
 select ename, sal, sal*12+comm, comm from emp;
 
 /* 85p emp ���̺��� ename, sal, (custom �ʵ�), comm�� ��ȸ�Ѵ�.  ���� ����,  ���⼭ comm�� null�ΰ�� ���� null�� ���µ�  */
 select ename, sal, sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+comm, comm from emp;
 
 /* 86p emp ���̺��� ename, sal, (custom �ʵ�), comm�� ��ȸ�Ѵ�.  as ���� ���� custom �ʵ��� ��Ī�� annsal�� ��ȸ�ȴ�. */
 select ename, sal, sal*12+comm as annsal, comm from emp;
 
 /* 88p emp ���̺��� sal �ʵ带 �������� ���ĵ� ���·� ��� �ʵ带 ��ȸ�Ѵ�.  ������ �ɼ��� ���������� ������������ ���ĵȴ�.*/
 select * from emp order by sal;
 
 /* 89p emp ���̺��� sal �ʵ带 �������� �������� �����Ͽ� ��� �ʵ带 ��ȸ�Ѵ�.  desc �ɼ�: �������� */
 select * from emp order by sal desc;
 
 /* 91p emp ���̺��� 2�� �ʵ带 �������� �����Ͽ� ��� �ʵ带 ��ȸ�Ѵ�.  ���� ����� deptno �ʵ带 asc �ɼ�: ������������ �����ϰ�, ���Ŀ� sal �ʵ带 desc �ɼ�: �������� �����Ѵ�. */
 select * from emp order by deptno asc, sal desc;
 
 
 /* 92p 
 test 1 : select, from, ��Ī */
 
 /* 92p
 test 2 : */
 select distinct job from emp;
 
 /* 92p
 test 3 : */
 select empno as EMPLOYEE_NO, ename as EMPLOYEE_NAME, mgr as MANAGER, sal as SALARY, comm as COMMOSSION, deptno as DEPARTMENT_NO from emp order by deptno desc, ename asc;
 
 
 /* 94p 
 emp ���̺��� ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp;
 
 /* 94p 
 emp ���̺��� deptno�� 30�� rows ��� �ʵ带 ��ȸ�Ѵ�.  */
 select * from emp where deptno = 30;
 
 /* 97p
 emp ���̺��� deptno�� 30 �̸鼭 job�� 'SALESMAN'�� rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where deptno = 30 and job = 'SALESMAN';
 
 /* 98p
 emp ���̺��� deptno�� 30 �̰ų� job�� 'CLERK'�� rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where deptno = 30 or job = 'CLERK';
 
 /* 101p
 emp ���̺��� sal �ʵ��� ���� ���ǽĿ� �´� rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where sal * 12 = 36000;
 
 /* 102p
 ���� �����ϴ�. Ư�̻��� ���� */
 select * from emp where sal >= 3000;
 
 /* 102p
 emp ���̺��� ename�� ���Ͽ� ù���ڰ� F �ų� ���� ���ĺ����� �Ǿ��ִ� �ʵ��� rows ��� �ʵ带 ��ȸ�Ѵ�.    ������ �����͸� �񱳿���� �������� ������������ ����Ѵ�.  */
 select * from emp where ename >= 'F';
 
 /* 103p
 emp ���̺��� ename�� ù���ں��� ���Ͽ� F O R Z �ų� ���� ���ĺ����� �Ǿ��ִ� �ʵ��� rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where ename <= 'FORZ';
 
 /* 104p
 emp ���̺��� sal �ʵ尡 3000�� �ƴ� rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where sal != 3000;
 
 /* 104p
 emp ���̺��� sal �ʵ尡 3000�� �ƴ� rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where sal <> 3000;
 
 /* 104p
 emp ���̺��� sal �ʵ尡 3000�� �ƴ� rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where sal ^= 3000;
 
 /* 105p
 emp ���̺��� sal �ʵ尡 3000�� �ƴ� rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where not sal = 3000;
 
 /* 106p
 emp ���̺��� job �ʵ尡 'MANAGER', 'SALESMAN', 'CLERK'�� �ʵ� rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK'; 
 
 /* 107p
 ���� ������ ���, in ����� ��� */
 select * from emp where job in ('MANAGER', 'SALESMAN', 'CLERK');
 
 /* 108p
 emp ���̺��� job �ʵ尡 'MANAGER', 'SALESMAN', 'CLERK'�� �ƴ� rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where job != 'MANAGER' and job <> 'SALESMAN' and job ^= 'CLERK';
 
 /* 108p
 ���� ������ ���, not�� in ����� ��� */
 select * from emp where job not in ('MANAGER', 'SALESMAN', 'CLERK');
 
 /* 109p
 emp ���̺��� sal �ʵ尡 2000 �̻��̸鼭 3000 ������ rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where sal >= 2000 and sal <= 3000;
 
 /* 110p
 ���� ������ ���, between ����� ��� */
 select * from emp where sal between 2000 and 3000; 
 
 /* 110p
 emp ���̺��� sal �ʵ尡 2000 �̻��̸鼭 3000 ������ �ʵ带 ������ rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where sal not between 2000 and 3000;
 
 /* 111p
 emp ���̺��� ename �ʵ尡 S�� �����ϴ� ��� rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where ename like 'S%';
 
 /* 111p
 emp ���̺��� ename �ʵ尡 2��° �ڸ� L�� �����ϴ� ��� rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where ename like '_L%';
 
 /* 112p
 emp ���̺��� ename �ʵ� ���� AM ���ڿ��� ���Ե� ��� rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where ename like '%AM%';
 
 /* 112p
 emp ���̺��� ename �ʵ� ���� AM ���ڿ��� ���Ե� rows�� ������ rows ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where ename not like '%AM%';
 
 /* 114p
 emp ���̺��� ename, sal, (custom �ʵ�), comm�� ��ȸ�Ѵ�.  as ���� ���� custom �ʵ��� ��Ī�� annsal�� ��ȸ�ȴ�. */
 select ename, sal, sal*12+comm as annsal, comm from emp;
 
 /* 115p
 emp ���̺��� comm�� null�� ��� �ʵ带 ��ȸ�ϰ��� ������ ��ȸ���� ����. null�� ��������� �񱳽� null�̵�  null �񱳽� is ��� */
 select * from emp where comm = null;
 
 /* 116p
 emp ���̺��� comm�� null�� ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where comm is null;
 
 /* 116p
 emp ���̺��� comm�� null�� �ƴ� ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where comm is not null;
 
 /* 117p
 emp ���̺��� sal�ʵ带 null�� ��� �����Ͽ� null�� �Ǿ� �ƹ��͵� ��ȸ���� ���� */
 select * from emp where sal > null and comm is null;
 
 /* 118p
 emp ���̺��� sal�ʵ带 null�� ��� �����Ͽ� null�� �Ǿ����� or �������� ���� comm �ʵ尡 null�� �ƴ� ��� �ʵ带 ��ȸ�Ѵ�. */
 select * from emp where sal > null or comm is null;
 
 
 /* -------- ���� ������ -------- */
 /* 119p
 ������ (VARCHAR2, VARCHAR2, VARCHAR2) + (VARCHAR2, VARCHAR2)
 1�� ���: emp ���̺��� deptno �ʵ尡 10�� empno, ename, sal, deptno �ʵ带 ��ȸ�Ѵ�.
 2�� ���: emp ���̺��� deptno �ʵ尡 20�� empno, ename, sal, deptno �ʵ带 ��ȸ�Ѵ�. 
 ������: emp ���̺��� deptno �ʵ尡 10 �̰ų� 20�� rows  empno, ename, sal, deptno �ʵ带 ��ȸ�Ѵ�. */
 select empno, ename, sal, deptno from emp where deptno = 10 union select empno, ename, sal, deptno from emp where deptno = 20;
 
 /* 120p
 ���� ���̽�
 ������ (VARCHAR2, VARCHAR2, VARCHAR2) + (VARCHAR2, VARCHAR2)
 union ���� ����Ϸ��� ��ȸ����� ��ġ���� ���̺� ����  ��ȸ�ʵ� ������ ���ƾ� �Ѵ�. */
 select empno, ename, sal, deptno from emp where deptno = 10 union select empno, ename, sal from emp where deptno = 20;
 
 /* 120p
 ���� ���̽� 
 ������ (VARCHAR2, VARCHAR2, VARCHAR2) + (!!!NUMBER!!!, VARCHAR2, VARCHAR2) �� ����
 union ���� ����Ϸ��� ��ȸ����� ��ġ���� ���̺� ����  ��ȸ�ʵ尣 �ڷ����� ���ƾ� �Ѵ�. */
 select empno, ename, sal, deptno from emp where deptno = 10 union select ename, empno, deptno, sal from emp where deptno = 20;
 
 /* 120p
 ������ (VARCHAR2, VARCHAR2, VARCHAR2) + (VARCHAR2, VARCHAR2, VARCHAR2)
 ��������δ� ������ �� ������, 
 ��ȸ����� ��ġ���� �� ���̺��� �ʵ尡 �ٸ��� �ڷ����� ���Ƽ� 
 ��ȸ����� ��������. �� �ʵ��� ��Ī�� ������� �ڷ����� ������ ��������. 
  *** ���� �ۼ��� ��ȸ ���̺��� ��Ī���� ��ȸ�Ǵµ��� */
 select empno, ename, sal, deptno from emp where deptno = 10 union select sal, job, deptno, sal from emp where deptno = 20;
 
 /* 121p
 ������ �ߺ� ���ŵ�  UNION
 emp ���̺��� ��ȸ ����� ���� ��� ������ ���� ���� ������  �ߺ��� rows �ʵ�� �������� �ʴ´�. 
 1�� ���: emp ���̺��� deptno�� 10�� rows empno, ename, sal, deptno �ʵ带 ��ȸ�Ѵ�.
 2�� ���: emp ���̺��� deptno�� 10�� rows empno, ename, sal, deptno �ʵ带 ��ȸ�Ѵ�.
 ������: emp ���̺��� deptno�� 10�� rows empno, ename, sal, deptno �ʵ带 ��ȸ�Ѵ�. */
 select empno, ename, sal, deptno from emp where deptno = 10 union select empno, ename, sal, deptno from emp where deptno = 10;
 
 /* 122p
 ������ �ߺ� ���  UNION ALL
 emp ���̺��� ��ȸ ����� ������  all ���� ����Ͽ� �ߺ��� rows �ʵ嵵 ���̺� ��������. 
 1�� ���: emp ���̺��� deptno�� 10�� rows empno, ename, sal, deptno �ʵ带 ��ȸ�Ѵ�.
 2�� ���: emp ���̺��� deptno�� 10�� rows empno, ename, sal, deptno �ʵ带 ��ȸ�Ѵ�.
 ������: emp ���̺��� deptno�� 10�� rows empno, ename, sal, deptno �ʵ带 2���� ��ȸ�Ѵ�. */
 select empno, ename, sal, deptno from emp where deptno = 10 union all select empno, ename, sal, deptno from emp where deptno = 10;
 
 /* 122p
 ������ ���� 
 1�� ���: emp ���̺��� empno, ename, sal, deptno �ʵ带 ��� ��ȸ�Ѵ�.
 2�� ���: emp ���̺��� deptno�� 10�� empno, ename, sal, deptno �ʵ带 ��ȸ�Ѵ�.
 ������: emp ���̺��� deptno�� 10�� rows �� �����ϰ�  empno, ename, sal, deptno �ʵ带 ��ȸ�Ѵ�. */
 select empno, ename, sal, deptno from emp minus select empno, ename, sal, deptno from emp where deptno = 10;
 
 /* 123p
 ������ ���� 
 1�� ���: emp ���̺��� empno, ename, sal, deptno �ʵ带 ��� ��ȸ�Ѵ�.
 2�� ���: emp ���̺��� deptno�� 10�� empno, ename, sal, deptno �ʵ带 ��ȸ�Ѵ�.
 ������: emp ���̺��� deptno�� 10�� rows�� empno, ename, sal, deptno �ʵ带 ��ȸ�Ѵ�. */
 select empno, ename, sal, deptno from emp intersect select empno, ename, sal, deptno from emp where deptno = 10;
 
 
 /* 125p
 test 1 */
 select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp where ename like '%S';
 
 /* 125p
 test 2 */
 select empno, ename, job, sal, deptno from emp where job = 'SALESMAN';
 
 /* 125p
 test 3 ���տ����� ��� x*/
 select empno, ename, job, sal, deptno from emp where sal > 2000 and (deptno = 20 or deptno = 30);
 
 /* 125p
 test 3 ���տ����� ��� o*/
 select empno, ename, job, sal, deptno from emp where sal > 2000 intersect select empno, ename, job, sal, deptno from emp where deptno = 20 or deptno = 30;
 
 /* 126p
 test 4 */
 select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp where sal > 3000 or 2000 > sal;
 
 /* 126p
 test 5 */
 select ename, empno, sal, deptno from emp where ename like '%E%' and deptno = 30 and (sal > 2000 or 1000 > sal);
 
 /* 126p
 test 6 */
 select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp where comm is null and job in ('MANAGER', 'CLERK') and ename not like '_L%';
 
 /*
  130p ~ 131p
  Uppercase Lowercase Initcap
  ���� Value ��ҹ��� �����ؼ� ��ȸ
 */
 select ename, upper(ename), lower(ename), initcap(ename) from emp;
 
 -- ���� 1  ename �ʵ忡��  scott Scott SCOTT ������� �񱳿���
 select * from emp where upper(ename) = upper('scott');
 
 -- ���� 2  ename �ʵ忡��  o, O�� ���Ե� ���ڿ� ã��
 select * from emp where upper(ename) like upper('%o%');
 
 
 /* 
  132p ~ 133p
  Length
  eneme �ʵ� Value�� ���ڿ� ���̷� ��ȸ */
 select ename, length(ename) from emp;
 
 -- ���� 1
 select ename, length(ename) from emp where length(ename) >= 5;
 
 -- ���� 2 ( �������� lengthb �ѱ� 4bytes ��� �ϴµ�,  ���ڵ� ���Ķ����� �ѱ��ڴ� 3bytes, �α��� 6���� ��ȸ�� )
 select length('�ѱ�'), lengthb('�ѱ�') from dual;
 
 
 /* 
  134p
  substr(�ʵ�, ������ġ, ������ ����)  index 1���� ���� !!!
 */
 select job, substr(job, 1, 2), substr(job, 3, 2), substr(job, 5) from emp;
 
 /* 
  136p
  substr ������ġ�� �����ΰ�� ���ٷ� ī���õ�
  CLERK -> -5-4-3-2-1
  -6���� �Ѿ�¼���  _C�� �ƴ϶� null�̵�
   */
 select job, substr(job, -length(job)), substr(job, -length(job), 2), substr(job, -3) from emp;
 
 /*
  137p ~ 138p
  instr( varchar2 , 'varchar2', ã�� ������ INDEX (1����),  ????? )
 */
 select instr('HELLO, ORACLE!','LO') as INSTR_1, instr('HELLO, ORACLE!','L', 5) as INSTR_2, instr('HELLO, ORACLE!','L', 2, 2) as INSTR_3 from dual;
 
 -- ���� 1 ( like ����ó�� ��� ���������� �� �Ⱦ�. �׳� ������ �� �ִٴ� �� )
 select * from emp where instr(ename, 'S') > 0;
 
 -- ���� 2 ( instr�� ��ü�� like ���� )
 select * from emp where ename like '%S%';
 
 /*
  139p
  replace ( value, ã�� ���ڿ�, ������ ���ڿ� )
  ** ������ ���ڿ� �ۼ� ���ϸ� ���� ó����.
 */
 select '010-1234-5678' as REPLACE_BEFORE, REPLACE('010-1234-5678','-', ' ') as REPLACE_1, REPLACE('010-1234-5678','-') as REPLACE_2 from dual;
 
 /*
  140p ~ 141p
  LPAD, RPAD ( ���ڿ�, ����� �ڸ���, ä�� ����(����) )
  ���鹮�� �̼����� ����
  �� ���� �����  ������ ä�� ���� ����
 */
 select 'Oracle', lpad('Oracle', 10, '#') as LPAD_1, rpad('Oracle', 10, '*') as RPAD_1, lpad('Oracle', 10) as LPAD_2, rpad('Oracle', 10) as RPAD_2 from dual;
 
 -- ����
 select rpad('971225-', 14, '*') as RPAD_JMNO, rpad('010-1234-', 13, '*') as RPAD_PHONE from dual;
 
 /*
  142p
  Concat ���ڿ� ��ġ��
 */
 select concat(empno, ename), concat(empno, concat(' : ', ename)) from emp where ename = 'SCOTT';
 
 /*
  143p
  Trim ���� ���� ( ������ ���ڰ� ������ )
 */
 select '[' || trim(' _ _Oracle_ _ ') || ']' as TRIM, '[' || trim(LEADING FROM ' _ _Oracle_ _ ') || ']' as TRIM_LEADING, '[' || trim(TRAILING FROM ' _ _Oracle_ _ ') || ']' as TRIM_TRAILING, '[' || trim(BOTH FROM ' _ _Oracle_ _ ') || ']' as TRIM_BOTH from dual;
 
 /*
  143p
  Trim ���� ���� (������ ���ڰ� ���� ��)
 */
 select '[' || trim('_' from '_ _Oracle_ _') || ']' as TRIM, '[' || trim(LEADING '_' FROM '_ _Oracle_ _') || ']' as TRIM_LEADING, '[' || trim(TRAILING '_' FROM '_ _Oracle_ _') || ']' as TRIM_TRAILING, '[' || trim(BOTH '_' FROM '_ _Oracle_ _') || ']' as TRIM_BOTH from dual;
 
 /*
  144p
  Trim ���� ���� (L R)
 */
 select '[' || trim('_' from ' _Oracle_ ') || ']' as TRIM, '[' || trim(LEADING '_' FROM '_ _Oracle_ _') || ']' as TRIM_LEADING, '[' || trim(TRAILING '_' FROM '_ _Oracle_ _') || ']' as TRIM_TRAILING, '[' || trim(BOTH '_' FROM '_ _Oracle_ _') || ']' as TRIM_BOTH from dual;
 
 /*
  146p ~ 149p
  ���� ����
  ROUND �ݿø�
  TRUNC ����
  CEIL ���������� �������� ū��
  FLOOR ���������� �������� ������
  MOD ������ ���ϱ�
 */
 select round(1234.5678) as ROUND, round(1234.5678, 0) as ROUND_0, round(1234.5678, 1) as ROUND_1, round(1234.5678, 2) as ROUND_2, round(1234.5678, -1) as ROUND_MINUS1, round(1234.5678, -2) as ROUND_MINUS2 from dual;
 
 select trunc(1234.5678) as TRUNC, trunc(1234.5678, 0) as TRUNC_0, trunc(1234.5678, 1) as TRUNC_1, trunc(1234.5678, 2) as TRUNC_2, trunc(1234.5678, -1) as TRUNC_MINUS1, trunc(1234.5678, -2) as TRUNC_MINUS2 from dual;
 
 -------------------------------------------- �ߴ� ���� ������� ���ؾ���
 
 /*
  ����, ���������� �߿��ؼ� �켱�н�
  
  ���������  �����̶�  from ���̺�1, ���̺�2 �� �������� �ۼ�  +  ���̺�1 T1, ���̺�2 T2�� ��Ī �����Ͽ�   select T1.�ʵ�, T2.�ʵ� �ϴ°�
  
  214p ~ 261p
 */
 
 /*
  216p
  ������ ������� �ʰ� �ΰ� ���̺��� �����Ѱ��, 
  emp ���̺��� 14�� �����Ϳ� ����  dept ���̺� 4�� �����Ͱ� ������ 
  ��� ����� ���� ��ȸ�Ϸ��� ��. -> 56 rows
  */
 select * from emp, dept order by empno;
 
 select * from emp, dept;
 
 /*  
  218p
  ������ ������� �ʰ� �ΰ� ���̺� �����ϰ�
  deptno�� ������ ���� ��ȸ�Ͽ�  emp ���̺��� 14����ŭ�� ��µ� 
 */  
 select * from emp, dept where emp.DEPTNO = dept.DEPTNO order by empno;
 
 /*
  219p
  ���̺� ��Ī�� ������ �� �ִ�.
  as �� ������
  */
 select * from emp E, dept D where E.DEPTNO = D.DEPTNO order by empno;
 
 
 /*
  ���� ���� : �����, ������, ��ü����, �ܺ�����,  
  
  SELECT - FROM - (WHERE)
  WHERE ������ JOIN�ϴ� ���� �� �� �ִ�.  (�򰥸���)
  
  �ؿ� SQL-99 ������ ���� �߸´°Ű���
  
 */
 
 /*
  221p
  ����� 
  �ʵ带 ���� �����ϴ� ���
  ���� ���̺��� �ʵ� �̸��� ������
  ���� ���ǰ� �ָ��Ͽ� ���� */ 
 select empno, ename, deptno, dname, loc from emp E, dept D where E.DEPTNO = D.DEPTNO;
 
 /*
  222p
  ����� 
  �ʵ带 ���� �����ϴ� ���
  ���� ���̺��� �ʵ� �̸��� ������
  ���̺��� ��Ī�� �����Ͽ� �ذ�
 */
 select E.empno, E.ename, D.deptno, D.dname, D.loc from emp E, dept D where E.DEPTNO = D.DEPTNO order by D.DEPTNO, E.EMPNO;
 
 
 /*
  224p
  ������
  ���� emp + dept ���̺� ������� ���,
  �� ���̺��� deptno ��� �ʵ��� ���� ��ġ�Ͽ�  ���� ���̺�� �ҷ����� ��Ī�� �Ǵ¹ݸ�
  
  �Ʒ��� emp + salgrade ���̺��� �����ϴ� ���̽���
  �� ���̺��� ���� ��ġ�ϴ� ���� ������ ��ġ�� ����� �׽�Ʈ�Ѵ�.
 */
 
 select * from emp, salgrade order by empno;
 
 select * from emp E, salgrade s;
 
 select * from EMP E, SALGRADE S where (E.SAL between S.LOSAL and S.HISAL);
 
 select * from emp where sal between 700 and 1200;
 
 select * from salgrade;
 
 
 /*
  227p
  ��ü����
  emp ���̺� + emp ���̺��� ��ġ�� ���̽�
  emp ���̺��� �Ŵ�����ȣ(mgr)�� �ٸ� ����� �����ȣ(empno)�� �ٶ󺸰� �ִ�.
  �� ����� �����ʿ�  �ڽ��� �Ŵ��� ��� ������ ǥ���ϴ� �׽�Ʈ 
 */
 select E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO as MGR_EMPNO, E2.ENAME as MGR_ENAME from emp E1, emp E2 where E1.MGR = E2.EMPNO; 
 
 /*
  229p
  **** �򰥸� ****
  �ܺ����� ( ����, ������ )    
 */
 -- �������� ���Ѵ�. :  E1 �������� MGR�� ���� E2�� EMPNO�� ��ġ�ϴ� �����͸� ������.  �Ŵ����� ���� (MGR null) ��ǥ���� ��µ� ( ������ ������ ���� )
 select E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO as MGR_EMPNO, E2.ENAME as MGR_ENAME from emp E1, emp E2 where E1.MGR = E2.EMPNO(+) order by E1.EMPNO;
 
 -- ���������� ���Ѵ�. :  E2 �������� EMPNO�� ���� E1�� MGR�� ��ġ�ϴ� �����͸� ������.  
 -- E2�� EMPNO��  ������ MGR�ϰ� ��ġ���� �ʴ°��  �����͸� �������� ������ �Ǵµ�,  �Ʒ� ������  E2�� EMPNO�� �⺻���� ����ϰ�  E1.MGR�� ��ġ�ϴ� ��� E1�� �����͸� �����ְ�����
 -- �׷���  �ڽ��� EMPNO�� ������ �Ŵ����� �ƴѰ�� (������ ����) ���� ��µ�     
 select E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO as MGR_EMPNO, E2.ENAME as MGR_ENAME from emp E1, emp E2 where E1.MGR(+) = E2.EMPNO order by E1.EMPNO;
 
 
 
 /*
  232p
  SQL-99 ǥ�� �������� ���� ����
  
  FROM ������ ���� ���ǽ��� ����
  
  INNER JOIN�� ���� ���� ���̰�  JOIN�� �ۼ��ص�  INNER JOIN��
  
  JOIN ~ ON�� ���� ���뼺 ����
  
  */
 
 /*
  232p
  NATURAL JOIN ( ����� ���¶�� �� )
  ������ ����� ������  deptno�� ���ļ�  ���ǰ� �ָ��ϴٰ� ���� �����µ�
  ���⼱ ���� ���� ���� �ٷ� ������. 
  */
 SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, deptno, D.DNAME, D.LOC FROM emp E NATURAL JOIN dept D order by deptno, E.EMPNO; 
 
 -- ����� ������
 SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno, dname, loc FROM emp NATURAL JOIN dept order by deptno, empno; 
 
 -- �׳� deptno�� �ۼ� �ȵǾ��־   ���̺� �ΰ� Ư���� ��ġ�� ���̸� ���� �Ǵµ�
 SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, D.DNAME, D.LOC FROM emp E NATURAL JOIN dept D order by E.EMPNO; 
 
 
 
 /* 
  233p
  JOIN ~ UNING ( � ���� ���¶�� �� )
   */
 SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, deptno, D.DNAME, D.LOC FROM emp E JOIN dept D USING (deptno) WHERE sal >= 3000 ORDER BY deptno, E.EMPNO; 
 
 /*
  234p
  JOIN ~ ON ( � ���� ���� ) ***********
 */
 SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, E.DEPTNO, D.DNAME, D.LOC FROM emp E JOIN dept D ON(E.DEPTNO = D.DEPTNO) WHERE sal <= 3000 ORDER BY E.DEPTNO, EMPNO; 
 
 /*
  INNER JOIN  å�� �ȳ��� ***** Ȯ���ϱ� ( ���� �߿��غ��� )
  Ȯ�ΰ�� : JOIN �� �ĵ� INNER JOIN��   
  table1 JOIN table2 ON (�ʵ�=�ʵ�)
 */
 SELECT * FROM emp E INNER JOIN dept D ON (E.DEPTNO = D.DEPTNO) ORDER BY E.EMPNO; 
 
 
 /*
  234p ~ 238p
  OUTER JOIN ( �ܺ� ���� )
  
  LEFT, RIGHT�� �����͸� ���� �� �ִ�.
  
  FULL OUTER��  LEFT, RIGHT�� ���� ����� ��� ���ļ� �����ش�.  ( �Ϲ� �ܺ� �������δ�  �ι� �ܺ����� �Ѵ��� UNION���� ���ľ� ���� ����� ���´�. )
  */
  
 -- LEFT OUTER
 SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO as mgr_no, E2.ENAME as mgr_name FROM emp E1 LEFT OUTER JOIN emp E2 ON (E1.MGR = E2.EMPNO) ORDER BY E1.EMPNO; 
 
 -- RIGHT OUTER
 SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO as mgr_empno, E2.ENAME as mgr_name FROM emp E1 RIGHT OUTER JOIN emp E2 ON (E1.MGR = E2.EMPNO) ORDER BY E1.EMPNO, mgr_empno; 
 
 -- FULL OUTER (LEFT + RIGHT)
 SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO as mgr_empno, E2.ENAME as mgr_name FROM emp E1 FULL OUTER JOIN emp E2 ON (E1.MGR = E2.EMPNO) ORDER BY E1.EMPNO; 
 
 
 
 