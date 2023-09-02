# [토이 프로젝트] 스프링부트를 통한 유튜브 클론 코딩 프로젝트 연동
 
## 1. 프로젝트 설명
 - 이전에 만들었던 유튜브 클론 코딩 프로젝트에 필요한 데이터를 로컬을 통해 가져올 수 있도록 만들어 본 별도의 서버입니다.
 - Spring Boot 서버는 클라이언트의 요청에 해당하는 데이터를 반환하기 위해 The Movie DB 서버와 연동해 데이터를 가져온 후 반환해 줍니다.
 - 강의를 통해 배운 스프링 관련 지식을 사용하여 만들어 보았습니다.
<br/><br/>


## 2. 기술적 경험
 - `WebClient`를 통한 The Movie DB 서버와의 연동
 - `Spring Boot`를 통한 리액트 프로젝트와의 연동
 - github push를 위한 key 값 등의 `설정값 처리`
<br/><br/>


## 3. 테크 스택  
 - Back-End : Spring Boot
<br/><br/>


## 4. 인프라 구조
<img width="877" alt="기술 스택 이미지" src="https://github.com/handseokjin/youtube-clone-server-spring/assets/32458465/cad86307-0f24-43d1-875e-f310aa537ba2">
<br/><br/>


## 5. 회고
 스프링 관련 강의를 들은 후, 이전에 만들었던 유튜브 클론 코딩에서 필요한 데이터를 The Movie DB 서버가 아닌 별도로 만든 스프링 부트 서버에서 가져올 수 있도록 하면 어떨까 생각했습니다.
 이를 통해 프론트 프로젝트와 연동해 보는 경험, 내가 만든 서버(스프링 부트)와 다른 서버를 연동해 보는 경험을 해 보며 전반적인 흐름을 좀 더 알 수 있었습니다.
