🧩 기본 정보 (Account & Summoner)
Name	설명
ACCOUNT-V1	Riot 계정 단위 API. PUUID(플레이어 고유 ID), 게임 계정 간 매핑 조회. Riot 통합 계정(LOL, TFT, VAL, LOR 등) 관리 시 사용.
SUMMONER-V4	리그 오브 레전드 전용 소환사 정보. Summoner ID, 아이콘, 레벨, 최근 수정 시각 등 기본 프로필 조회용.
🏅 리그/랭크/도전 관련
Name	설명
CHAMPION-MASTERY-V4	챔피언 숙련도 API. 소환사별 챔피언 숙련도(Mastery Level, 점수, 최근 플레이 등) 조회.
CHAMPION-V3	현재 로테이션 챔피언 목록. 매주 무료 챔피언 풀 확인용 API.
LEAGUE-V4	소환사 랭크 정보. 티어, 디비전, LP, 승/패 수 등 랭크 세부 정보.
LEAGUE-EXP-V4	랭크 확장 API. 특정 큐(queue) 기준으로 전체 플레이어 랭킹 목록(예: 마스터 이상) 조회.
LOL-CHALLENGES-V1	도전과제(Challenges) 시스템. 챌린지 목록, 구성 정보, 플레이어별 진행도 및 순위.
⚔️ 게임 & 매치 데이터
Name	설명
MATCH-V5	매치 상세 데이터. PUUID로 매치 ID 리스트 조회 → 각 경기의 모든 세부 정보(참가자, 스탯, 챌린지 지표 등) 반환.
LOL-RSO-MATCH-V1	Riot Sign-On(통합 로그인 기반) 매치 API. OAuth2 Access Token 기반으로 개인 매치 데이터 접근. 내부·통합 계정용.
SPECTATOR-V5	현재 진행 중인 경기 정보. 소환사 PUUID 기준으로 실시간 게임 상태(맵, 팀, 챔피언, 룬, 스펠 등) 조회.
CLASH-V1	Clash 토너먼트 시스템. 팀 구성, 참가자, 일정, 경기 상태 등의 정보 조회.
🛠️ 상태 및 공지
Name	설명
LOL-STATUS-V4	리그 오브 레전드 서버 상태. 점검, 장애, 공지, 플랫폼별 이슈 등 상태 데이터.
🎯 토너먼트 시스템
Name	설명
TOURNAMENT-STUB-V5	토너먼트 Stub(테스트용) API. 실제 게임 없이 로비 생성, 코드 발급, 이벤트 플로우를 테스트할 수 있는 개발 전용 API.
TOURNAMENT-V5	실제 토너먼트 운영 API. Provider 등록 → Tournament 생성 → Code 생성 → 로비 이벤트 및 경기 결과 조회. 실제 게임 서버와 연동됨.