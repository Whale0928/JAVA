## 3장 정리
### 클래스 와 객체...란 무엇이냐..!


# Class 클래스
### 상태(state) 와 행위(behavior) 가 있는 것

예) 핸드폰

상태 state
- 전원이 켜진 상태
- 전원이 꺼진 상태
- 고장이 난 상태
- 프로그램이 동작 중인 상태

행위 behavior
- 전화를 거는 행동
- 카카오톡을 사용하는 행위
- 노래를 듣는 행위

클래스 안에는 생성자가 있어 클래스의 객체를 생성 할 수 있다( 생성자가 하나도 없을때에는 묵시적으로 기본 생성자가 있다)

----
# Object 객체 or Instance 인스턴스
### 클래스를 활용해 하나의 객체로 다루는 형태

핸드폰이라는 개념이 클래스라면 아이폰14max , 갤럭시폴드4와 같은 실제 핸드폰이 존재한다.

ex)
```java
public class Phone{
    
    String number;//전화번호
    String category;//핸드폰 종류
    int sNumber;  //시리얼넘버
    
    public Phone(){
        //기본생성자
    }
    public void sendMessage(String myMessage){
        //~~~에세 sendMessage 전송
    }
}   
public class main{
    Phone iPhone_14Max = new Phone();
    Phone Glaxy_Fold_4 = new Phone();
    
    Glaxy_Fold_4.sendMessage("아이폰으로 메시지를 전송");
}
```


---
# Quest


1.클래스와 객체의 차이점
-   클래스를 통해서 객체를 생성할 수 있다. 즉, 하나의 클래스를 만들면 그 클래스의 모습을 갖는 여러 객체들을 생성 할 수 있다.
그러므로, 일반적인 경우 클래스의 메소드나 변수들을 사용하려면 객체를 생성하여 사용하여야 한다.
- 내용이 애매했는데 그냥 길이를 체크하는 것이였나 보다 설계도와 구현체으로 짦게 하니 안된듯

2.객체를 생성하기 위해 필요한 예약어
- new

3.객체를 생성하기 위해 사용하는 메서드와 비슷하게 생긴 소괄호가 있는 것
- 기본생성자

4.객체의 메소드를 사용하려면 사용하는 기호
- . 점(point)

5.메소드를 사용하기 위해서 만들어야하는 것
- 객체

6.객체의 어느 예약어,어느 클래스를 사용해야 하는가
- new , 기본생성자