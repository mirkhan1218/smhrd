select * from board;

create table myboard(
idx number not null,
memId varchar2(30) not null, -- 회원아이디 추가
title varchar2(100) not null,
content varchar2(2000) not null,
writer varchar2(20) not null,
indate date default sysdate,
count number default 0,
primary key(idx)
);

create sequence idx_seq;

insert into board(idx, title, content, writer)
values(idx_seq.nextval,'게시판연습1', '게시판연습1','관리자');
insert into board(idx, title, content, writer)
values(idx_seq.nextval,'게시판연습2', '게시판연습2','미리칸');
insert into board(idx, title, content, writer)
values(idx_seq.nextval,'게시판연습3', '게시판연습3','격리중');

select * from board order by idx desc;

-- 회원 table
create table memtbl(
memId varchar2(30) not null,
memPwd varchar2(30) not null,
memName varchar2(30) not null,
primary key(memId)
);

insert into memtbl values('smhrd01','smhrd01','관리자');
insert into memtbl values('smhrd02','smhrd02','미리칸');
insert into memtbl values('smhrd03','smhrd03','스탠리');

select * from memtbl;