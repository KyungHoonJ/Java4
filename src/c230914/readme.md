# 오늘 수업 쿼리문

``` sql
--alter table student drop constraint fk_hobby_to_student;

drop table student_hobby;
drop table hobby;
drop table student;

create table student(
    id number(8,0) generated as identity constraint pk_student_id PRIMARY KEY,
    name varchar2(10) not null,
    student_id varchar2(10) unique,
    student_pw varchar2(10) not null,
    age number(3),
    git_address varchar2(100)
--    hobby_id number(10,0)
);

insert into student (name, student_id, student_pw, age, git_address) values('김동선',null,'qwer',29,'https://github.com/KDS01');
insert into student (name, student_id, student_pw, age, git_address) values('이민규',null,'1234',23,'https://github.com/LEEMINGYU28/Java4.git');
insert into student (name, student_id, student_pw, age, git_address) values('권원준', 'oooonx', 'may', 22,'https://github.com/KWWWJ/just1.git');
insert into student (name, student_id, student_pw, age, git_address) values('박정완', 'pjw', 'qwer', 27, 'https://github.com/pjw222');
insert into student (name, student_id, student_pw, age, git_address) values('한상윤','hsy','qwer1234',37,'https://github.com/Natseol');
insert into student (name, student_id, student_pw, age, git_address) values('임현규','TLM','486',27,'https://github.com/mabiTLM/Java4');
insert into student (name, student_id, student_pw, age, git_address) values('김남균','knk','1234',27,'https://github.com/LiamKim-0218/HomeWork2');
insert into student (name, student_id, student_pw, age, git_address) values('임주한','LJH','3232',32,'https://github.com/Juhan008/java-D');

create table hobby(
    id number(10,0) generated as identity constraint pk_hobby_id PRIMARY KEY,
    name varchar2(20),
    explain varchar2(200),
    created_at timestamp default sysdate,
    average_time number(30, 0),
    locate varchar2(100),
    student_id number(8,0),
    constraint fk_student_to_hobby foreign key (student_id) references student (id)
);

insert into hobby (name, explain,average_time, locate, student_id) values('헬스', '유산소와 웨이트 트레이닝을 기구를 활용하여 시간을 보낼 수 있는 곳', 7200000,'천호', 3);
insert into hobby (name, explain,average_time, locate, student_id) values('독서','책읽기',3600000,'실내', 5);
insert into hobby (name, explain,average_time, locate, student_id) values('달리기','운동',3600000,'야외', 3);
insert into hobby (name, explain,average_time, locate) values('영화보기','ott는 사랑입니다',7200000,'아무데나');
insert into hobby (name, explain,average_time, locate) values('숨쉬기','생산적인활동입니다',86400000,'any where!');

--alter table student add constraint fk_hobby_to_student foreign key (hobby_id) references hobby (id);


create table student_hobby(
    student_id number(8,0),
    hobby_id number(10,0),
    constraint fk_student_id foreign key (student_id) references student (id),
    constraint fk_hobby_id foreign key (hobby_id) references hobby (id)
);

insert into student_hobby values(1, 2);
insert into student_hobby values(1, 1);
insert into student_hobby values(1, 5);
insert into student_hobby values(1, 1);
insert into student_hobby values(2, 1);
insert into student_hobby values(2, 3);

select student.name as "학생", student.age as "나이", hobby.name as "취미" from student 
cross join hobby;-- on student.id = hobby.student_id;

select student.name as "학생", hobby.name as "취미" from student_hobby
join student on student.id = student_hobby.student_id
join hobby on hobby.id = student_hobby.hobby_id;

-- 패키지.클래스(객체.키)
-- DB(User).테이블.컬럼

select * from student where rownum <= 1 and name like '김%';

select count(*) from student where name like '김%';

```