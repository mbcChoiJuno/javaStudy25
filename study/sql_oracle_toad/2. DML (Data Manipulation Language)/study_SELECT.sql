 
 /*
     DML (Data Manipulation Language)
 */
 
 /* SELECT 학습 73p ~ 240p */
 
 
 -- [emp 테이블] 구조보기
 desc emp;       
 
 -- [emp 테이블] 내용보기
 select * from emp;  
 
 -- [dept 테이블] 구조보기
 desc dept;      
 
 -- [dept 테이블] 내용보기
 select * from dept;  
 
 -- [bonus 테이블] 구조보기
 desc bonus;     
 
 -- [bonus 테이블] 내용보기
 select * from bonus;  
 
 -- [salgrade 테이블] 구조보기
 desc salgrade;  
 
 -- [salgrade 테이블] 내용보기
 select * from salgrade;  
 
  
 
 
 
 -- 연습장
 
 -- 73p DTO 테이블 구조 
 desc emp;
 
 -- 74p DTO 테이블 구조 
 desc dept;
 
 -- 75p DTO 테이블 구조 
 desc salgrade;
 
 /* 80p emp 테이블의 모든 필드를 조회한다. */
 select * from emp;
 
 /* 81p emp 테이블의 empno, ename, deptno 필드를 조회한다. */
 select empno, ename, deptno from emp;
 
 /* 82p emp 테이블에서 중복되는 값을 하나만 포함하여 deptno 필드를 조회한다. */
 select distinct deptno from emp;
 
 /* 83p emp 테이블에서 job, deptno의 조합이 중복되는 경우 하나만 포함하여 job, deptno 필드를 조회한다. */
 select distinct job, deptno from emp;
     
 /* 83p emp 테이블에서 모든 job, deptno 필드를 조회한다.  *** all이 빠져도 작동함. 나중에 필드의 변수형 때문에 다르게 사용할 수 도 있음 (확인) */
 select all job, deptno from emp;
 
 /* 84p emp 테이블에서 ename, sal, (custom 필드), comm을 조회한다.  custom 필드는 수식연산이되고 별도의 define이 없으면 식으로 필드명이 정해짐 */
 select ename, sal, sal*12+comm, comm from emp;
 
 /* 85p emp 테이블에서 ename, sal, (custom 필드), comm을 조회한다.  위와 동일,  여기서 comm이 null인경우 같이 null로 들어가는듯  */
 select ename, sal, sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+comm, comm from emp;
 
 /* 86p emp 테이블에서 ename, sal, (custom 필드), comm을 조회한다.  as 예약어를 통해 custom 필드의 명칭은 annsal로 조회된다. */
 select ename, sal, sal*12+comm as annsal, comm from emp;
 
 /* 88p emp 테이블을 sal 필드를 기준으로 정렬된 상태로 모든 필드를 조회한다.  별도의 옵션을 주지않으면 오름차순으로 정렬된다.*/
 select * from emp order by sal;
 
 /* 89p emp 테이블을 sal 필드를 기준으로 내림차순 정렬하여 모든 필드를 조회한다.  desc 옵션: 내림차순 */
 select * from emp order by sal desc;
 
 /* 91p emp 테이블을 2개 필드를 기준으로 정렬하여 모든 필드를 조회한다.  먼저 선언된 deptno 필드를 asc 옵션: 오름차순으로 정렬하고, 이후에 sal 필드를 desc 옵션: 내림차순 정렬한다. */
 select * from emp order by deptno asc, sal desc;
 
 
 /* 92p 
 test 1 : select, from, 별칭 */
 
 /* 92p
 test 2 : */
 select distinct job from emp;
 
 /* 92p
 test 3 : */
 select empno as EMPLOYEE_NO, ename as EMPLOYEE_NAME, mgr as MANAGER, sal as SALARY, comm as COMMOSSION, deptno as DEPARTMENT_NO from emp order by deptno desc, ename asc;
 
 
 /* 94p 
 emp 테이블의 모든 필드를 조회한다. */
 select * from emp;
 
 /* 94p 
 emp 테이블에서 deptno이 30인 rows 모든 필드를 조회한다.  */
 select * from emp where deptno = 30;
 
 /* 97p
 emp 테이블에서 deptno이 30 이면서 job이 'SALESMAN'인 rows 모든 필드를 조회한다. */
 select * from emp where deptno = 30 and job = 'SALESMAN';
 
 /* 98p
 emp 테이블에서 deptno이 30 이거나 job이 'CLERK'인 rows 모든 필드를 조회한다. */
 select * from emp where deptno = 30 or job = 'CLERK';
 
 /* 101p
 emp 테이블에서 sal 필드의 값이 조건식에 맞는 rows 모든 필드를 조회한다. */
 select * from emp where sal * 12 = 36000;
 
 /* 102p
 위와 동일하다. 특이사항 없음 */
 select * from emp where sal >= 3000;
 
 /* 102p
 emp 테이블의 ename을 비교하여 첫글자가 F 거나 다음 알파벳으로 되어있는 필드의 rows 모든 필드를 조회한다.    문자형 데이터를 비교연산시 오름차순 내림차순으로 계산한다.  */
 select * from emp where ename >= 'F';
 
 /* 103p
 emp 테이블의 ename을 첫글자부터 비교하여 F O R Z 거나 이전 알파벳으로 되어있는 필드의 rows 모든 필드를 조회한다. */
 select * from emp where ename <= 'FORZ';
 
 /* 104p
 emp 테이블의 sal 필드가 3000이 아닌 rows 모든 필드를 조회한다. */
 select * from emp where sal != 3000;
 
 /* 104p
 emp 테이블의 sal 필드가 3000이 아닌 rows 모든 필드를 조회한다. */
 select * from emp where sal <> 3000;
 
 /* 104p
 emp 테이블의 sal 필드가 3000이 아닌 rows 모든 필드를 조회한다. */
 select * from emp where sal ^= 3000;
 
 /* 105p
 emp 테이블의 sal 필드가 3000이 아닌 rows 모든 필드를 조회한다. */
 select * from emp where not sal = 3000;
 
 /* 106p
 emp 테이블의 job 필드가 'MANAGER', 'SALESMAN', 'CLERK'인 필드 rows 모든 필드를 조회한다. */
 select * from emp where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK'; 
 
 /* 107p
 위와 동일한 결과, in 예약어 사용 */
 select * from emp where job in ('MANAGER', 'SALESMAN', 'CLERK');
 
 /* 108p
 emp 테이블의 job 필드가 'MANAGER', 'SALESMAN', 'CLERK'가 아닌 rows 모든 필드를 조회한다. */
 select * from emp where job != 'MANAGER' and job <> 'SALESMAN' and job ^= 'CLERK';
 
 /* 108p
 위와 동일한 결과, not과 in 예약어 사용 */
 select * from emp where job not in ('MANAGER', 'SALESMAN', 'CLERK');
 
 /* 109p
 emp 테이블의 sal 필드가 2000 이상이면서 3000 이하인 rows 모든 필드를 조회한다. */
 select * from emp where sal >= 2000 and sal <= 3000;
 
 /* 110p
 위와 동일한 결과, between 예약어 사용 */
 select * from emp where sal between 2000 and 3000; 
 
 /* 110p
 emp 테이블의 sal 필드가 2000 이상이면서 3000 이하인 필드를 제외한 rows 모든 필드를 조회한다. */
 select * from emp where sal not between 2000 and 3000;
 
 /* 111p
 emp 테이블의 ename 필드가 S로 시작하는 모든 rows 모든 필드를 조회한다. */
 select * from emp where ename like 'S%';
 
 /* 111p
 emp 테이블의 ename 필드가 2번째 자리 L로 시작하는 모든 rows 모든 필드를 조회한다. */
 select * from emp where ename like '_L%';
 
 /* 112p
 emp 테이블의 ename 필드 내에 AM 문자열이 포함된 모든 rows 모든 필드를 조회한다. */
 select * from emp where ename like '%AM%';
 
 /* 112p
 emp 테이블의 ename 필드 내에 AM 문자열이 포함된 rows를 제외한 rows 모든 필드를 조회한다. */
 select * from emp where ename not like '%AM%';
 
 /* 114p
 emp 테이블에서 ename, sal, (custom 필드), comm을 조회한다.  as 예약어를 통해 custom 필드의 명칭은 annsal로 조회된다. */
 select ename, sal, sal*12+comm as annsal, comm from emp;
 
 /* 115p
 emp 테이블에서 comm이 null인 모든 필드를 조회하고자 하지만 조회되지 않음. null은 산술연산자 비교시 null이됨  null 비교시 is 사용 */
 select * from emp where comm = null;
 
 /* 116p
 emp 테이블에서 comm이 null인 모든 필드를 조회한다. */
 select * from emp where comm is null;
 
 /* 116p
 emp 테이블에서 comm이 null이 아닌 모든 필드를 조회한다. */
 select * from emp where comm is not null;
 
 /* 117p
 emp 테이블에서 sal필드를 null과 산술 연산하여 null이 되어 아무것도 조회되지 않음 */
 select * from emp where sal > null and comm is null;
 
 /* 118p
 emp 테이블에서 sal필드를 null과 산술 연산하여 null이 되었지만 or 연산으로 인해 comm 필드가 null이 아닌 모든 필드를 조회한다. */
 select * from emp where sal > null or comm is null;
 
 
 /* -------- 집합 연산자 -------- */
 /* 119p
 합집합 (VARCHAR2, VARCHAR2, VARCHAR2) + (VARCHAR2, VARCHAR2)
 1번 결과: emp 테이블에서 deptno 필드가 10인 empno, ename, sal, deptno 필드를 조회한다.
 2번 결과: emp 테이블에서 deptno 필드가 20인 empno, ename, sal, deptno 필드를 조회한다. 
 연산결과: emp 테이블에서 deptno 필드가 10 이거나 20인 rows  empno, ename, sal, deptno 필드를 조회한다. */
 select empno, ename, sal, deptno from emp where deptno = 10 union select empno, ename, sal, deptno from emp where deptno = 20;
 
 /* 120p
 오류 케이스
 합집합 (VARCHAR2, VARCHAR2, VARCHAR2) + (VARCHAR2, VARCHAR2)
 union 예약어를 사용하려면 조회결과를 합치려는 테이블 끼리  조회필드 개수가 같아야 한다. */
 select empno, ename, sal, deptno from emp where deptno = 10 union select empno, ename, sal from emp where deptno = 20;
 
 /* 120p
 오류 케이스 
 합집합 (VARCHAR2, VARCHAR2, VARCHAR2) + (!!!NUMBER!!!, VARCHAR2, VARCHAR2) 시 오류
 union 예약어를 사용하려면 조회결과를 합치려는 테이블 끼리  조회필드간 자료형이 같아야 한다. */
 select empno, ename, sal, deptno from emp where deptno = 10 union select ename, empno, deptno, sal from emp where deptno = 20;
 
 /* 120p
 합집합 (VARCHAR2, VARCHAR2, VARCHAR2) + (VARCHAR2, VARCHAR2, VARCHAR2)
 기능적으로는 이해할 수 없지만, 
 조회결과를 합치려는 두 테이블의 필드가 다르고 자료형이 같아서 
 조회결과가 합쳐진다. 즉 필드의 명칭과 관계없이 자료형만 가지고 합쳐진다. 
  *** 먼저 작성된 조회 테이블의 명칭으로 조회되는듯함 */
 select empno, ename, sal, deptno from emp where deptno = 10 union select sal, job, deptno, sal from emp where deptno = 20;
 
 /* 121p
 합집합 중복 제거됨  UNION
 emp 테이블의 조회 결과가 같은 경우 별도의 예약어를 쓰지 않으면  중복된 rows 필드는 합쳐지지 않는다. 
 1번 결과: emp 테이블의 deptno가 10인 rows empno, ename, sal, deptno 필드를 조회한다.
 2번 결과: emp 테이블의 deptno가 10인 rows empno, ename, sal, deptno 필드를 조회한다.
 연산결과: emp 테이블의 deptno가 10인 rows empno, ename, sal, deptno 필드를 조회한다. */
 select empno, ename, sal, deptno from emp where deptno = 10 union select empno, ename, sal, deptno from emp where deptno = 10;
 
 /* 122p
 합집합 중복 허용  UNION ALL
 emp 테이블의 조회 결과가 같지만  all 예약어를 사용하여 중복된 rows 필드도 테이블에 합쳐진다. 
 1번 결과: emp 테이블의 deptno가 10인 rows empno, ename, sal, deptno 필드를 조회한다.
 2번 결과: emp 테이블의 deptno가 10인 rows empno, ename, sal, deptno 필드를 조회한다.
 연산결과: emp 테이블의 deptno가 10인 rows empno, ename, sal, deptno 필드를 2번씩 조회한다. */
 select empno, ename, sal, deptno from emp where deptno = 10 union all select empno, ename, sal, deptno from emp where deptno = 10;
 
 /* 122p
 차집합 연산 
 1번 결과: emp 테이블에서 empno, ename, sal, deptno 필드를 모두 조회한다.
 2번 결과: emp 테이블에서 deptno가 10인 empno, ename, sal, deptno 필드를 조회한다.
 연산결과: emp 테이블에서 deptno가 10인 rows 를 제외하고  empno, ename, sal, deptno 필드를 조회한다. */
 select empno, ename, sal, deptno from emp minus select empno, ename, sal, deptno from emp where deptno = 10;
 
 /* 123p
 교집합 연산 
 1번 결과: emp 테이블에서 empno, ename, sal, deptno 필드를 모두 조회한다.
 2번 결과: emp 테이블에서 deptno가 10인 empno, ename, sal, deptno 필드를 조회한다.
 연산결과: emp 테이블에서 deptno가 10인 rows의 empno, ename, sal, deptno 필드를 조회한다. */
 select empno, ename, sal, deptno from emp intersect select empno, ename, sal, deptno from emp where deptno = 10;
 
 
 /* 125p
 test 1 */
 select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp where ename like '%S';
 
 /* 125p
 test 2 */
 select empno, ename, job, sal, deptno from emp where job = 'SALESMAN';
 
 /* 125p
 test 3 집합연산자 사용 x*/
 select empno, ename, job, sal, deptno from emp where sal > 2000 and (deptno = 20 or deptno = 30);
 
 /* 125p
 test 3 집합연산자 사용 o*/
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
  내부 Value 대소문자 변경해서 조회
 */
 select ename, upper(ename), lower(ename), initcap(ename) from emp;
 
 -- 응용 1  ename 필드에서  scott Scott SCOTT 상관없이 비교연산
 select * from emp where upper(ename) = upper('scott');
 
 -- 응용 2  ename 필드에서  o, O가 포함된 문자열 찾기
 select * from emp where upper(ename) like upper('%o%');
 
 
 /* 
  132p ~ 133p
  Length
  eneme 필드 Value의 문자열 길이로 조회 */
 select ename, length(ename) from emp;
 
 -- 응용 1
 select ename, length(ename) from emp where length(ename) >= 5;
 
 -- 응용 2 ( 예제에는 lengthb 한글 4bytes 라고 하는데,  인코딩 형식때문에 한글자당 3bytes, 두글자 6으로 조회됨 )
 select length('한글'), lengthb('한글') from dual;
 
 
 /* 
  134p
  substr(필드, 시작위치, 추출할 길이)  index 1부터 시작 !!!
 */
 select job, substr(job, 1, 2), substr(job, 3, 2), substr(job, 5) from emp;
 
 /* 
  136p
  substr 시작위치가 음수인경우 꺼꾸로 카운팅됨
  CLERK -> -5-4-3-2-1
  -6으로 넘어가는순간  _C가 아니라 null이됨
   */
 select job, substr(job, -length(job)), substr(job, -length(job), 2), substr(job, -3) from emp;
 
 /*
  137p ~ 138p
  instr( varchar2 , 'varchar2', 찾기 시작할 INDEX (1부터),  ????? )
 */
 select instr('HELLO, ORACLE!','LO') as INSTR_1, instr('HELLO, ORACLE!','L', 5) as INSTR_2, instr('HELLO, ORACLE!','L', 2, 2) as INSTR_3 from dual;
 
 -- 응용 1 ( like 연산처럼 사용 가능하지만 잘 안씀. 그냥 응용할 수 있다는 것 )
 select * from emp where instr(ename, 'S') > 0;
 
 -- 응용 2 ( instr로 대체한 like 연산 )
 select * from emp where ename like '%S%';
 
 /*
  139p
  replace ( value, 찾을 문자열, 변경할 문자열 )
  ** 변경할 문자열 작성 안하면 삭제 처리됨.
 */
 select '010-1234-5678' as REPLACE_BEFORE, REPLACE('010-1234-5678','-', ' ') as REPLACE_1, REPLACE('010-1234-5678','-') as REPLACE_2 from dual;
 
 /*
  140p ~ 141p
  LPAD, RPAD ( 문자열, 결과물 자릿수, 채울 문자(선택) )
  여백문자 미설정시 공백
  좌 우측 여백과  여백을 채울 문자 설정
 */
 select 'Oracle', lpad('Oracle', 10, '#') as LPAD_1, rpad('Oracle', 10, '*') as RPAD_1, lpad('Oracle', 10) as LPAD_2, rpad('Oracle', 10) as RPAD_2 from dual;
 
 -- 응용
 select rpad('971225-', 14, '*') as RPAD_JMNO, rpad('010-1234-', 13, '*') as RPAD_PHONE from dual;
 
 /*
  142p
  Concat 문자열 합치기
 */
 select concat(empno, ename), concat(empno, concat(' : ', ename)) from emp where ename = 'SCOTT';
 
 /*
  143p
  Trim 공백 제거 ( 삭제할 문자가 없음때 )
 */
 select '[' || trim(' _ _Oracle_ _ ') || ']' as TRIM, '[' || trim(LEADING FROM ' _ _Oracle_ _ ') || ']' as TRIM_LEADING, '[' || trim(TRAILING FROM ' _ _Oracle_ _ ') || ']' as TRIM_TRAILING, '[' || trim(BOTH FROM ' _ _Oracle_ _ ') || ']' as TRIM_BOTH from dual;
 
 /*
  143p
  Trim 공백 제거 (삭제할 문자가 있을 때)
 */
 select '[' || trim('_' from '_ _Oracle_ _') || ']' as TRIM, '[' || trim(LEADING '_' FROM '_ _Oracle_ _') || ']' as TRIM_LEADING, '[' || trim(TRAILING '_' FROM '_ _Oracle_ _') || ']' as TRIM_TRAILING, '[' || trim(BOTH '_' FROM '_ _Oracle_ _') || ']' as TRIM_BOTH from dual;
 
 /*
  144p
  Trim 공백 제거 (L R)
 */
 select '[' || trim('_' from ' _Oracle_ ') || ']' as TRIM, '[' || trim(LEADING '_' FROM '_ _Oracle_ _') || ']' as TRIM_LEADING, '[' || trim(TRAILING '_' FROM '_ _Oracle_ _') || ']' as TRIM_TRAILING, '[' || trim(BOTH '_' FROM '_ _Oracle_ _') || ']' as TRIM_BOTH from dual;
 
 /*
  146p ~ 149p
  숫자 연산
  ROUND 반올림
  TRUNC 버림
  CEIL 지정수보다 다음으로 큰수
  FLOOR 지정수보다 다음으로 낮은수
  MOD 나머지 구하기
 */
 select round(1234.5678) as ROUND, round(1234.5678, 0) as ROUND_0, round(1234.5678, 1) as ROUND_1, round(1234.5678, 2) as ROUND_2, round(1234.5678, -1) as ROUND_MINUS1, round(1234.5678, -2) as ROUND_MINUS2 from dual;
 
 select trunc(1234.5678) as TRUNC, trunc(1234.5678, 0) as TRUNC_0, trunc(1234.5678, 1) as TRUNC_1, trunc(1234.5678, 2) as TRUNC_2, trunc(1234.5678, -1) as TRUNC_MINUS1, trunc(1234.5678, -2) as TRUNC_MINUS2 from dual;
 
 -------------------------------------------- 중단 숫자 연산부터 더해야함
 
 /*
  조인, 서브쿼리가 중요해서 우선학습
  
  결론적으로  조인이란  from 테이블1, 테이블2 로 여러개를 작성  +  테이블1 T1, 테이블2 T2로 별칭 선언하여   select T1.필드, T2.필드 하는것
  
  214p ~ 261p
 */
 
 /*
  216p
  조인을 사용하지 않고 두개 테이블을 선택한경우, 
  emp 테이블의 14개 데이터에 대해  dept 테이블 4개 데이터가 곱해져 
  모든 경우의 수를 조회하려고 함. -> 56 rows
  */
 select * from emp, dept order by empno;
 
 select * from emp, dept;
 
 /*  
  218p
  조인을 사용하지 않고 두개 테이블 선택하고
  deptno가 동일한 값만 조회하여  emp 테이블의 14개만큼만 출력됨 
 */  
 select * from emp, dept where emp.DEPTNO = dept.DEPTNO order by empno;
 
 /*
  219p
  테이블도 별칭을 지정할 수 있다.
  as 는 사용안함
  */
 select * from emp E, dept D where E.DEPTNO = D.DEPTNO order by empno;
 
 
 /*
  조인 종류 : 등가조인, 비등가조인, 자체조인, 외부조인,  
  
  SELECT - FROM - (WHERE)
  WHERE 절에서 JOIN하는 것을 알 수 있다.  (헷갈린다)
  
  밑에 SQL-99 문법이 나랑 잘맞는거같음
  
 */
 
 /*
  221p
  등가조인 
  필드를 직접 선택하는 경우
  여러 테이블의 필드 이름이 같으면
  열의 정의가 애매하여 오류 */ 
 select empno, ename, deptno, dname, loc from emp E, dept D where E.DEPTNO = D.DEPTNO;
 
 /*
  222p
  등가조인 
  필드를 직접 선택하는 경우
  여러 테이블의 필드 이름이 같으면
  테이블의 별칭을 지정하여 해결
 */
 select E.empno, E.ename, D.deptno, D.dname, D.loc from emp E, dept D where E.DEPTNO = D.DEPTNO order by D.DEPTNO, E.EMPNO;
 
 
 /*
  224p
  비등가조인
  위의 emp + dept 테이블 등가조인의 경우,
  각 테이블의 deptno 라는 필드의 값이 일치하여  같은 테이블로 불렀을때 매칭이 되는반면
  
  아래는 emp + salgrade 테이블을 조인하는 케이스로
  각 테이블에서 서로 일치하는 값이 없을때 합치는 방법을 테스트한다.
 */
 
 select * from emp, salgrade order by empno;
 
 select * from emp E, salgrade s;
 
 select * from EMP E, SALGRADE S where (E.SAL between S.LOSAL and S.HISAL);
 
 select * from emp where sal between 700 and 1200;
 
 select * from salgrade;
 
 
 /*
  227p
  자체조인
  emp 테이블 + emp 테이블을 합치는 케이스
  emp 테이블의 매니저번호(mgr)는 다른 사원의 사원번호(empno)를 바라보고 있다.
  각 사원의 오른쪽에  자신의 매니저 사원 정보를 표시하는 테스트 
 */
 select E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO as MGR_EMPNO, E2.ENAME as MGR_ENAME from emp E1, emp E2 where E1.MGR = E2.EMPNO; 
 
 /*
  229p
  **** 헷갈림 ****
  외부조인 ( 왼쪽, 오른쪽 )    
 */
 -- 왼쪽으로 더한다. :  E1 사원목록의 MGR을 따라서 E2의 EMPNO이 일치하는 데이터를 더해줌.  매니저가 없는 (MGR null) 대표까지 출력됨 ( 더해진 데이터 없음 )
 select E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO as MGR_EMPNO, E2.ENAME as MGR_ENAME from emp E1, emp E2 where E1.MGR = E2.EMPNO(+) order by E1.EMPNO;
 
 -- 오른쪽으로 더한다. :  E2 사원목록의 EMPNO를 따라서 E1의 MGR이 일치하는 데이터를 더해줌.  
 -- E2의 EMPNO이  누구의 MGR하고도 일치하지 않는경우  데이터를 더해주지 않으면 되는데,  아래 쿼리는  E2의 EMPNO은 기본으로 출력하고  E1.MGR이 일치하는 경우 E1의 데이터를 더해주고있음
 -- 그래서  자신의 EMPNO가 누구의 매니저도 아닌경우 (최하위 직급) 까지 출력됨     
 select E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO as MGR_EMPNO, E2.ENAME as MGR_ENAME from emp E1, emp E2 where E1.MGR(+) = E2.EMPNO order by E1.EMPNO;
 
 
 
 /*
  232p
  SQL-99 표준 문법으로 배우는 조인
  
  FROM 절에서 조인 조건식이 쓰임
  
  INNER JOIN이 가장 많이 쓰이고  JOIN만 작성해도  INNER JOIN임
  
  JOIN ~ ON이 가장 범용성 있음
  
  */
 
 /*
  232p
  NATURAL JOIN ( 등가조인 형태라고 함 )
  위에서 등가조인 했을때  deptno가 겹쳐서  정의가 애매하다고 오류 났었는데
  여기선 별도 정의 없이 바로 합쳐짐. 
  */
 SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, deptno, D.DNAME, D.LOC FROM emp E NATURAL JOIN dept D order by deptno, E.EMPNO; 
 
 -- 결과값 동일함
 SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno, dname, loc FROM emp NATURAL JOIN dept order by deptno, empno; 
 
 -- 그냥 deptno가 작성 안되어있어도   테이블 두개 특성상 겹치는 값이면 적용 되는듯
 SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, D.DNAME, D.LOC FROM emp E NATURAL JOIN dept D order by E.EMPNO; 
 
 
 
 /* 
  233p
  JOIN ~ UNING ( 등가 조인 형태라고 함 )
   */
 SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, deptno, D.DNAME, D.LOC FROM emp E JOIN dept D USING (deptno) WHERE sal >= 3000 ORDER BY deptno, E.EMPNO; 
 
 /*
  234p
  JOIN ~ ON ( 등가 조인 형태 ) ***********
 */
 SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, E.DEPTNO, D.DNAME, D.LOC FROM emp E JOIN dept D ON(E.DEPTNO = D.DEPTNO) WHERE sal <= 3000 ORDER BY E.DEPTNO, EMPNO; 
 
 /*
  INNER JOIN  책에 안나옴 ***** 확인하기 ( 제일 중요해보임 )
  확인결과 : JOIN 만 쳐도 INNER JOIN임   
  table1 JOIN table2 ON (필드=필드)
 */
 SELECT * FROM emp E INNER JOIN dept D ON (E.DEPTNO = D.DEPTNO) ORDER BY E.EMPNO; 
 
 
 /*
  234p ~ 238p
  OUTER JOIN ( 외부 조인 )
  
  LEFT, RIGHT로 데이터를 더할 수 있다.
  
  FULL OUTER는  LEFT, RIGHT로 나온 결과를 모두 합쳐서 보여준다.  ( 일반 외부 조인으로는  두번 외부조인 한다음 UNION으로 합쳐야 같은 결과가 나온다. )
  */
  
 -- LEFT OUTER
 SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO as mgr_no, E2.ENAME as mgr_name FROM emp E1 LEFT OUTER JOIN emp E2 ON (E1.MGR = E2.EMPNO) ORDER BY E1.EMPNO; 
 
 -- RIGHT OUTER
 SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO as mgr_empno, E2.ENAME as mgr_name FROM emp E1 RIGHT OUTER JOIN emp E2 ON (E1.MGR = E2.EMPNO) ORDER BY E1.EMPNO, mgr_empno; 
 
 -- FULL OUTER (LEFT + RIGHT)
 SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO as mgr_empno, E2.ENAME as mgr_name FROM emp E1 FULL OUTER JOIN emp E2 ON (E1.MGR = E2.EMPNO) ORDER BY E1.EMPNO; 
 
 
 
 