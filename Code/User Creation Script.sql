ALTER SESSION SET "_ORACLE_SCRIPT"=true;  

CREATE USER White_Schema IDENTIFIED BY "k'9E&W3q7mc4-JaJ";

GRANT create session TO White_Schema;
GRANT create table TO White_Schema;
GRANT create view TO White_Schema;
GRANT create any trigger TO White_Schema;
GRANT create any procedure TO White_Schema;
GRANT create sequence TO White_Schema;
GRANT create synonym TO White_Schema;