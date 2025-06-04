 
 /*
     Structure
     
     ��ü :
     ������ ���� �� ������ ����  ���� ���, ������ ��ü�� ���� ������
     
     ���̺�,  
     ������ ����, �ε���, ��, ������, ���Ǿ� �� 
 */
 
 /*
     326p ~ 358p
     ��ü ����
 */
 
 /*
     327p
     ������ ����
     
 */
 
 -- 328p  DICT  SCOTT ���� : ������ ���� ���캸��
 SELECT * FROM DICT;
 
 -- 328p  DICTIONARY  SCOTT ���� : ������ ���� ���캸��
 SELECT * FROM DICTIONARY;
 
 -- 328p  USER_  ���θ� ���� ������ ����   SCOTT ������ ���� ��ü ���� ���캸��     FROM USER_TABLES
 SELECT TABLE_NAME FROM USER_TABLES;
 
 SELECT * FROM USER_TABLES; -- ������
 
 SELECT * FROM tabs; -- ������         FROM TABS;
 
 -- 329p  ALL_  ���θ� ���� ������ ����   SCOTT ������ ����� �� �ִ� ��ü ���캸��   FROM ALL_TABLES
 SELECT owner, table_name FROM ALL_TABLES;
 
 SELECT * FROM ALL_TABLES; 
 
 --331p  DBA_  ���θ� ���� ������ ����   SCOTT �������� DBA_ ���ٽ� ����
 SELECT * FROM DBA_TABLES;
 
 
 /* 
     �ý��� �������� �׽�Ʈ 
 */
 SELECT * FROM DBA_TABLES; -- DBA ���� ��ü ��ȸ 
 
 SELECT * FROM DBA_USERS; -- ����� ���� ��ȸ
 
 SELECT * FROM DBA_USERS WHERE USERNAME = 'SCOTT'; -- ����� ���� ��ȸ
 
 /* 
     �ý��� �������� �׽�Ʈ 
 */
 
 
 
 /*
     334p
     �ε��� ( ������ �˻� )
     
 */
 
 -- 335p  SCOTT ������ ������ INDEX ��ü Ȯ��
 SELECT * FROM USER_INDEXES;
 
 -- 335p  SCOTT ������ ������ INDEX �÷� ���� �˾ƺ���
 SELECT * FROM USER_IND_COLUMNS;
 
 
 /*
         �ε��� ����
 */
 -- 336p  EMP ���̺��� SAL �ʵ带 �����Ͽ� �ε��� �����ϱ�
 -- CREATE INDEX - ON emp(sal) 
 CREATE INDEX IDX_EMP_SAL ON emp(sal);
 
 SELECT * FROM USER_IND_COLUMNS;
 
 
 /*
         �ε��� ����
 */
 -- 337p  �ε��� �����ϱ�
 DROP INDEX IDX_EMP_SAL;
 
 SELECT * FROM USER_IND_COLUMNS;
 
 
 
 /*
     338p
     ��   (���̺�ó�� ���)
    
     �ణ �������� ó��  �ֹ߼� ���̺�� ������.  
     ���̺� ��ü�� �ѱ�°� �ƴϿ���  ���߰���� �ʵ带  ������������
 */
 
 -- 340p �� ����
 -- SCOTT������ CREATE VIEW ������ ���� SYSTEM �������� �ش� ���� �ο��Ͽ���
 
 
 -- ************ 358p ���� �߰� �н� �ʿ��� ***************
 
 