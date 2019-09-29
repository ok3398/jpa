docker run -p 5432:5432 -e POSTGRES_PASSWORD=pass -e POSTGRES_USER=suran -e POSTGRES_DB=springdata --name postgres_boot -d postgres

docker exec -i -t postgres_boot bash

su - postgres

// psql: FATAL:  role "postgres" does not exist 오류 발생 시 
// psql --username suran --dbname springdata

psql springdata

데이터베이스 조회
\list

테이블 조회
\dt

쿼리
SELECT * FROM account;



//빌드 시 intellij 에서 에러 발생
//Error:java: javacTask: source release 8 requires target release 1.8 
File > Settings > Build, Execution, Deployment > Java Compiler에서 project bytecodec version을 설정한다.
Per-module bytecode version에서 특정 프로젝트의 Target bytecode version을 설정한다.


매핑 정보를 기술한 메타데이터를 사용하여 
자바의 객체를 sql 데이터베이스 테이블에 자동으로 생성하여
깔끔하게 영속화해주는 기술
transparent => 코드를 숨겨서 깔끔하게 보이게

