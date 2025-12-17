# MymobileApp
유찬이의 모바일앱 실습 수업

## 🔍 주차별 미리보기

| 구분 | W03 미리보기 | W04 미리보기 | W05 미리보기 | W06 미리보기 |
| :--: | :----------: | :----------: | :----------: | :----------: |
| **기본적인 코드** | <img src="https://github.com/ckato2785/MymobileApp/blob/main/w03/w03_preview.png" width="200"> | <img src="https://github.com/ckato2785/MymobileApp/blob/main/w04/w04_preview.png" width="200"> | <img src="https://github.com/ckato2785/MymobileApp/blob/main/w05/w05_preview.png" width="200"> | <img src="https://github.com/ckato2785/MymobileApp/blob/main/w06/w06_preview.png" width="200"> |
| 나만의 수정 후 | - | - | <img src="https://github.com/ckato2785/MymobileApp/blob/main/app/w03_myself.png" width="200"> | <img src="https://github.com/ckato2785/MymobileApp/blob/main/app/w04_myself.png" width="200"> | <img src="https://github.com/ckato2785/MymobileApp/blob/main/app/w05_myself.png" width="200"> | - |
| w03 미리보기 이미지 | w04 미리보기 이미지 | w05 미리보기 이미지 | w06 미리보기 이미지 |


# 참새 사냥 게임 만들기 PROJECT!

**Kotlin team project**<br>

*202511070 정유찬* <br>
*202310873 이주현* <br>

**🐦 참새 사냥 게임**

🎯 개요

    장르: 클릭형 캐주얼 슈팅

    플랫폼: Android 8.0 이상 , API 32 이상

    플레이 시간 : 60초


🕹 플레이 방식

    화면을 탭해 참새를 클릭해 점수 획득

    제한 시간 내 기준점수를 달성하여 스테이지 클리


🐦 등장 개체

    개체	점수	특징

    참새	+5점    기본 타깃,최대 4마리

    까치	−2점    최대 3마리,조금 더 큰 크기
    
    멧새	−5점    빠른 이동,최대 2마리



🎯 점수 규칙

    참새 +5, 까치 −1, 멧새 −3

    까치가 참새 사냥 가능함


🤖 이후 추가 개발 방향

    ⚙ 무리사냥

    조건 : 화면 내의 까치 3마리 or 45초 15초에 도달 했을 경우

    행동 : 화면 내의 순간 모든 새 객체를 삭제

    해제 : 점수 - 를 감수하고 까치를 클릭하기

    💥 콤보 시스템

    까치나 멧새를 클릭하지 않고 참새만 정확하게 계속해서 여러번 클릭 할 경우 점수 어드벤티지 제공


| 사용자 화면 미리 보기 | 기준점수 도달 실패 | 기준점수 도달 성공 |
| :----------: | :----------: | :----------: |
| <img src="https://github.com/ckato2785/MymobileApp/blob/main/hunts/hunts_uipreview.png" width="200"> | <img src="https://github.com/ckato2785/MymobileApp/blob/main/hunts/hunts_uipreviewfail.png" width="200"> | <img src="https://github.com/ckato2785/MymobileApp/blob/main/hunts/hunts_uipreviewwin.png" width="200"> |
| 사용자 화면 | 실패 시 | 성공 시 |