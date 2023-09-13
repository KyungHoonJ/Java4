# Database
- 자료를 저장하는 곳
- 데이터를 정리하는 곳
- 저장된 자료를 찾는 곳

- 하나의 창고라고 생각했을 때 종류
	- 금고 / 의류 / 물류 / 식료품 / -> 공간만 있는 것 
	- 냉동 창고 -> 들어갈 물품에 따라 기능에 차이가 생긴다.

## 종류
-noSQL(크게 정해진 규격이 없다.)
	-MongoDB(noSQL은 대게 이쪽/ 파일로 저장하는 것과 다를개 없다. 타입에 연연하지 않음(보통 log 불러오는대 쓰는 편)), 
	-Redis(물리적인 저장공간이 RAM이라서 따로 저장해두지 않으면 전부 휘발된다. 대신 굉장히 빠르다.)
	
-SQL, RDBMS(사용하기 위해서 정해진 규격을 맞춰줘야한다.)
		   (난이도가 있는 편이다.)
	-Oracle(기업에서 가장 많이 쓴다. 문제의 책임이 Oracle기업에 있다.)
	-mySQL(SQL은 대게 이쪽. 기본적으로는 오픈소스. 문제의 책임이 자신에게 있다.)
	
## SQL
	- Language(DB와 대화하기위한 언어)
	- Structured Query Language
### 명령어	
	- create(구조 생성)
```sql
create table test (
id number(10, 0),
name varchar2(10),
score number(10, 5),
address varchar2(20)
);

create table test2 (
id number(10, 0) CONSTRAINT pk_id PRIMARY KEY,
name varchar2(10) NOT NULL,
score number(10, 5) DEFAULT 0,
address varchar2(20)
);

create table test3 (
id number(10, 0),
name varchar2(10),
score number(10, 5),
address varchar2(20),
created_at timestamp default to_date(sysdate, 'yyyy/mm/dd hh:mi:ss')
);
```
      - CONSTRAINT : 제약 조건

	- drop(구조 삭제)
	- alter(구조 수정-테이블)
	- rename(테이블 명 수정)
	
### 데이터 조작어
	- insert(데이터 삽입)
	  - insert into 테이블명 (컬럼명, 컬럼명, ...) values (값, 값, ...);
	- update(데이터 수정)
	  - update 테이블명 set 컬럼명 = 값, 컬럼명 = 값, ... where 조건;
	- delete(데이터 삭제)
	  - delete from 테이블명 where 조건;
	- select(데이터 선택)
	  - select 컬럼명, 컬럼명, ... from 테이블명;
	  - select * from all_tables; 
	    - 이건 치면 지옥을 보게됨
	  - select * from user_tables;
	
### 유저 조작어
	- grant(권한부여)
	- revoke(권한박탈)

### Type
	#### 숫자
		- Number(Integer | Long | Short)
		- Float(Double | Float)
	#### 문자
		- Char(Character) => 고정길이 max : 2000byte
		- VarChar2(mtSQL = VarChar)(Var = Variable) => 넣은 데이터에 따라 용량이 변해서 따로 지정할 필요가 없다.(가변길이)   max : 4000byte                                                                                                                                                                                                                                                                                                                                                                                                                          
		- Long(String) => 길이에 대한 조건이 없다. max : 2gb
		- Clob => long보다 크다 4gb
		- NChar => 유니코드 관련 텍스트 
		- NVarChar => 유니코드 관련 텍스트
		- NClob => 유니코드 관련 텍스트
	#### 기타
		- Date => 날짜
		- Timestamp => 기간

### Option
	#### NOT NULL => (NULLABLE)
	#### DEFAULT : 기본값
	#### UNIQUE : 중복 체크
	  - 보통 NOT NULL이랑 같이 쓴다. 
	#### PRIMARY KEY : 기본키
	  - 테이블의 유일한 컬럼
	  - NOT NULL + UNIQUE
	  - 관계를 맺을 때 쓴다.
	  - id
	#### FOREIGN KEY : 외래키
	  - 관계 맺을 때
	  - 관계에 대해서 이름
	
	
테이블 생성 => create
이름, 타입, 데이터의 길이를 정한다
Number(10, 10)(Precision, Scale) = 10의자리 수까지만 넣을 수 있다. / 소숫점 길이
Float(10) = 자동으로 소숫점 이후 길이가 들어가있어 전체길이만 넣으면 된다.
Char(10) = 10글자까지(메모리는 10만큼 쓴다)
VarCahr2(500) = 500글자까지 (메모리는 쓴만큼만 차지)
Long 
	
##DB
	- 데이터를 어떻게 저장을 할까?
	- table(head, )
	- DataBase || Schema를 생성한다. create
	- DB에 속하는 데이블을 생성한다. create
	- 생성한 테이블에 넣는다. insert
	- 생성한 테이블에서 데이터를 가져온다. select


## RDBMS
	- Relational DataBase Management System
	- 관계형 데이터 베이스
	- 데이터를 저장하고 그 데이터끼리 연동해준다.(데이터를 확실하게 지정할 수 있도록 원하는 데이터끼리의 관계를 설정한다.)
	
## noSQL
	- 비관계형 데이터 베이스
	
## JSon
	- 우리가 다루는 데이터(객체, String, Array) => 문자열로 바꿔준다.
	- "안녕하세요, 저는 아무개입니다."
	- [안녕하세요, 저는 아무개입니다.] => "안녕하세요, 저는 아무개입니다."
	- JSON형태로 바꾸면 ["안녕하세요", "저는 아무개입니다."]
	- {name : "아무개"} => {"name" : "아무개"}
	
	
# 주석
- 현재 시간 확인
``` sql
select to_char(sysdate, 'yy mm dd hh mi ss') from dual;
```