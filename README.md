# MymobileApp
유찬이의 모바일앱 실습 수업

## w03 미리보기
<img src="https://github.com/ckato2785/MymobileApp/blob/main/w03/w03_preview.png" width="400">
<br>
w03 미리보기 이미지

## w04 미리보기
<img src="https://github.com/ckato2785/MymobileApp/blob/main/w04/w04_preview.png" width="400">
<br>
w04 미리보기 이미지

## w05 미리보기
<img src="https://github.com/ckato2785/MymobileApp/blob/main/w05/w05_preview.png" width="400">
<br>
w05 미리보기 이미지

## w06 미리보기
<img src="https://github.com/ckato2785/MymobileApp/blob/main/w06/w06_preview.png" width="400">
<br>
w06 미리보기 이미지







# 참새 사냥 게임 만들기 PROJECT!

**Kotlin team project**<br>
*202511070 정유찬* <br>
*202310873 이주현* <br>

**🐦 참새 사냥 게임**

🎯 개요

    장르: 클릭형 캐주얼 슈팅

    플랫폼: Android 8.0 이상

    세션 길이: 스테이지당 30초, 총 4스테이지


🕹 플레이 방식

    화면을 탭해 새를 맞혀 점수 획득

    제한 시간 내 최대 점수를 기록


🐦 등장 개체

    개체	점수	특징

    참새	+5	기본 타깃

    까치	−1	2마리 이상 시 ‘무리사냥’ 발동
    
    멧새	−3	빠른 이동, 작은 크기


⚙ 무리사냥

    조건: 화면 내 까치 ≥ 2

    행동: 가장 가까운 참새를 추격(속도 1.3×)

    해제: 3초 경과 또는 까치 < 2

🎯 점수 규칙

    참새 +5, 까치 −1, 멧새 −3

    까치가 참새 사냥 가능함

