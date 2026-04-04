# Code Pattern Extractor

대규모 코드베이스에서 특정 메서드 호출 내부의 패턴을 추출하는 정적 분석 도구입니다.

---

## 🔍 배경

레거시 시스템 개발 과정에서  
특정 기능(서비스 코드/트랜잭션 ID 등)을 추적하기 위해  
여러 파일을 반복적으로 확인해야 하는 비효율이 존재했습니다.

이를 해결하기 위해 정규식 기반의 코드 분석 자동화 도구를 개발했습니다.

---

## 🚀 주요 기능

- 특정 메서드 호출 블록 추출
- 문자열 패턴 기반 코드 식별
- 마지막 파라미터 자동 추출
- 중복 제거 및 정렬 출력

---

## 🛠 기술 스택

- Java
- Regex (Pattern, Matcher)

---

## 🚀 개선 경험
대규모 화면/기능 개발 과정에서 반복적으로 코드 위치를 추적해야 하는 문제를 해결하기 위해 개발하였으며,
분석 시간을 단축하고 개발 생산성을 향상시켰습니다.

---

## 📦 프로젝트 구조
```
extractor/
├── CodePatternExtractor.java
├── FileLoader.java
└── PatternConfig.java
```


---

## ▶️ 실행 방법

```bash
java -cp . extractor.Main
java extractor.Main
```

## 📄 샘플 입력

`sample/sample-input.txt` 파일을 사용하면 바로 테스트할 수 있습니다.

## ▶️ 실행 예시

### 1. 프로그램 실행

```bash
프로젝트 루트(code-pattern-extractor)로 이동

javac -d out/production/code-pattern-extractor src/main/java/extractor/*.java
java -cp out/production/code-pattern-extractor extractor.Main
```

### 2. 파일 경로 입력

```
sample/sample-input.txt
```

### 3. 출력 결과
```
=== 추출 결과 ===
ABC1234X001
LMN0001U003
XYZ5678R002
```
