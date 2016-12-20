-- Create table
create table staff
(
  id    number(4),
  name  varchar2(20),
  job   varchar2(20),
  phone char(11),
  email varchar2(20)
)
;
-- Create/Recreate primary, unique and foreign key constraints 
alter table staff
  add constraint id primary key (ID);

-- Create sequence 
create sequence SEQ_STAFF
minvalue 1000
maxvalue 9999
start with 1
increment by 1
nocache
order;