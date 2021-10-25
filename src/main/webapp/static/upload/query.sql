/* FORMATTED ON 2021-07-12 오후 3:02:46 (QP5 V5.115.810.9015) */
create or replace view notice_view1 as
SELECT   *
  FROM   (SELECT   ROWNUM AS NUM, A.*
            FROM   (  SELECT   *
                        FROM   NOTICE1 WHERE TITLE like '%'
                    ORDER BY   REGDATE DESC) A) Z
 WHERE   NUM BETWEEN 1 AND 10


CREATE VIEW NOTICE_VIEW
AS
SELECT * FROM (
    SELECT ROWNUM NUM, N.* FROM (
        SELECT * FROM NOTICE ORDER BY REGDATE DESC
    ) N
);

/* Formatted on 2021-07-12 오후 3:10:04 (QP5 v5.115.810.9015) */
SELECT   *
  FROM   NOTICE1
 WHERE   ID = (SELECT   ID
                 FROM   NOTICE1
                WHERE   REGDATE > (SELECT   REGDATE
                                     FROM   NOTICE1
                                    WHERE   ID = 3)
                        AND ROWNUM = 1)
                        
                        
/* Formatted on 2021-07-12 오후 3:13:30 (QP5 v5.115.810.9015) */
SELECT   ID
  FROM   (  SELECT   *
              FROM   NOTICE1
          ORDER BY   REGDATE DESC)
 WHERE   REGDATE < (SELECT   REGDATE
                      FROM   NOTICE1
                     WHERE   ID = 3)
         AND ROWNUM = 1
         
  drop table notice1
         
CREATE TABLE "NOTICE1"
(
     ID        NUMBER,
     title    VARCHAR2(2000),
     WRITER_ID    NVARCHAR2(50),
     content    VARCHAR2(2000),
     REGDATE      date,
     hit    NUMBER,
     pub    NUMBER
)                 

         
delete from notice1

INSERT INTO NOTICE1 VALUES(5,11111,55,'',SYSDATE,11,0)

SELECT * FROM NOTICE1



/* FORMATTED ON 2021-07-12 오후 3:02:46 (QP5 V5.115.810.9015) */
SELECT   COUNT(ID) COUNT 
  FROM   (SELECT   ROWNUM AS NUM, A.*
            FROM   (  SELECT   *
                        FROM   NOTICE1 WHERE title LIKE '%' 
                    ORDER BY   REGDATE DESC) A) Z
                    
CREATE TABLE "COMMENT1"
(
     ID        NUMBER,
     CONTENT    NVARCHAR2(2000),
     REGDATE      TIMESTAMP,
     WRITER_ID    NVARCHAR2(50),
     NOTICE_ID    NUMBER
);


select * from notice1 

select * from comment1                   


select * from jindan


create or replace view notice_view as

select n.id, n.title, n.writer_id, n.regdate, n.hit, n.pub, n.files, count(c.id) as cmt_count from notice1 n left join comment1 c on n.id = c.id 
group  by n.id, n.title, n.writer_id, n.regdate, n.hit, n.pub, n.files


CREATE SEQUENCE CLI.JINDANSEQ
  START WITH 106331
  MAXVALUE 9999999999999999999999999999
  MINVALUE 1