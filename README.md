# scc-selectionshop
SCC 내일배움캠프 2회차 수업자료 - 내셀랙션샵

### 옵션 1
- [ ] 내 컴퓨터 IDE에서 Spring Initializr 로 프로젝트 만들기
- [ ] 코드 복사 붙여넣기 (스니펫으로 사용)
- [ ] `java/com/sparta/springcore/utils/NaverShopSearch.java`파일 내에 아래 부분을 발급받은 NaverSearch API 인증값으로 세팅
   ```java
   	headers.add("X-Naver-Client-Id", "내클라이언트아이디");
		headers.add("X-Naver-Client-Secret", "내클라이언트시크");
   ```

### 옵션 2
- [ ] 수업자료 내 로컬 컴퓨터에 세팅 (다운로드, git clone, fork,...)
- [ ] gradle 로 build 해서 세팅해보기
- [ ] `java/com/sparta/springcore/utils/NaverShopSearch.java`파일 내에 아래 부분을 발급받은 NaverSearch API 인증값으로 세팅
   ```java
   	headers.add("X-Naver-Client-Id", "내클라이언트아이디");
		headers.add("X-Naver-Client-Secret", "내클라이언트시크");
   ```


### Test
#### UI 를 사용
- http://localhost:8080 에 접속 후 아래처럼 동작 테스트
![uitest](https://user-images.githubusercontent.com/81408668/140886411-5b9f1c98-e785-4fdd-8e14-3645705f9676.gif)

