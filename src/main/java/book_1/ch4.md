## 변수

### 변수의 4종류
- 인스턴스 변수 instance variable
  - 클래스 내에서 선언된 변수
  - 객체가 생성된 때 생성되고 참조되지 않는 상태가 되면 GC가 처리함
- 클래스  변수 class variable
  - 인스턴스 변수에 static 키워드가 붙어 선언된 변수
  - 클래스가 처음 호출될떄 생성되고 프로그램이 종료될 때 사라진다.
- 매개 변수 parameter
  - 메서드의 값으로 전달되는 변수
  - 메소드의 호출 -> 메소드의 종료 까지 생명이 유지된다
- 지역 변수 local variable
  - 메서드 내부에서 선언된 변수
  - 선언된 지역 내에서만 유효하다


### 기본 자료형 8종

boolean
- true 혹은 false만 저장
- 0 or 1
- 1bit

byte
- 정수형
- 8bit
- -128 ~ 127
- 양수 최대값 -> 0111 1111 
- 음수 최대값 -> 1000 0000
  - 한개의 값에 따라 최대와 최소값이 반전된다 (127 or 128)

short
- 정수형

int 
- 정수형
- 가장 많이 사용됨

long
- 정수형
- 많이 사용됨
- int보다 큰 값이 필요할 경우 주로 사용된다.

char 
- 정수형
- 문자열과 관련되어 사용된다 ASCII Code를 확인
- 홀따옴표를 활용해 선언한다 ```char c = 'a'```
- 0(₩u0000) ~ 65535(₩ufff) 16진수

float
- 실수형
- 소수점을 표현할 수 있다.

double
- 실수형
- 소수점을 표현하는데 주로 사용된다
- 만약 돈과 같은 정보는 Math.bigDecimal 과 같은 자료형으로 관라한다
- 조단위 돈에서 정확한 값을 보장할 수 없기 때문에 -> 부동 소수점 문제
---



네가지 종류 변수는 어떻게 구분할 수 있나요?
-   위치와 static의 여부

일반 변수의 이름을 지을 때 대문자로 시작하는 것은 일반적인 명명규칙이다.  *
- NO

자료형에는 기본 자료형과 어떤 자료형이 있나요? *
- 참조 자료형

기본 자료형에는 몇가지가 있나요? *
- 8가지

기본 자료형 중 정수형에는 어떤 것들이 있나요? *
- byte , short , int , long , char

byte는 몇 비트(bit)로 되어 있나요? *
- 8bit

byte 타입은 왜 만들었을까요? *
- 데이터 저장시 적은 공간에 효율적으로 저장하기 위해

int와 long중 어떤 타입이 더 큰 숫자를 처리할 수 있나요? *
- long

소수점을 처리하는 타입은 어떤 것이 있나요? *
- float , double

char는 정수형인가요? *
- YES

a라는 값을 char로 정의할 때 어떤 기호로 감싸주어야 하나요? *
- '' (홀따옴표)

true false 두개의 값만을 가지는 타입은 어떤 것인가요? *
- boolean
