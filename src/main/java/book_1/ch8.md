## ch8 참조 자료형


```
왜 생성자가 필요할까?
인스턴스(객체)를 생성하기 위해 존재한다.
```
```
static 클래스를 static 변수만 활용 가능하다.
```




----

생성자는 반드시 만들어야 하나요?
- 아니다 생성자가 하나도 없으면 묵시적으로 기본생성자가 있기 때문에. 

만약 매개변수가 있는 생성자를 만들고, 매개변수가 없는 기본 생성자를 호출하면 어떻게 될까요?
- 에러가 발생한되 왜냐? 묵시적 기본 생성자는 생성자가 아예 없을때만 생성되고 매개변수 생성자가 있다면 자동으로 생성되지 않는다.

생성자의 개수는 제한이 있나요?
- nope

인스턴스의 변수와 매개변수나 메소드 내에서 생성한 변수와 구분하기 위해서 사용하는 키워드는 무엇인가요?
- this

메소드 선언시 리턴 타입으로 지정한 데이터를 넘겨줄 때 사용하는 키워드는 무엇인가요?
- return

메소드 선언시 아무 데이터도 리턴 타입으로 넘겨주지 않겠다는 것을 지정하는 키워드는 무엇인가요?
- void

메소드 선언에 static 이 있는 것과 없는 것의 차이는 무엇인가요?
- 객체를 생성하지 않고서도 접근할 수 있다. 모든 객체가 static 메서드를 쳐다보기 때문에. 

필자가 엄청나게 중요하다고 한 것 중 메소드의 이름은 같으나 매개변수를 다르게 하는 것의 명칭은 무엇인가요?
- 오버로딩 

기본 자료형을 매개변수로 넘겨 줄 때 Pass by value인가요? 아니면 Pass by reference인가요?
- Pass by Value

참조 자료형을 매개변수로 넘겨 줄 때 Pass by value인가요? 아니면 Pass by reference인가요?
- Pass by Reference

매개변수의 수가 가변적일 때 메소드 선언시 타입과 변수 이름 사이에 어떤 것을 적어줘야 하나요?
- ... 키워드

```
1. 생성자는 반드시 만들 필요는 없으나, 만드는 습관을 가지는 것이 좋다.

2. 기본 생성자를 만들지 않고, 매개변수가 있는 생성자만 만들었을 때, 기본 생성자를 사용하여 객체를 생성할 수는 없다. 그러면 컴파일 에러가 발생한다.

3. 생성자의 개수는 제한이 없다.

4. this라는 예약어는 해당 객체를 의미한다. 따라서, 메소드 내에서 this를 사용하면 인스턴스 변수를 의미하게 된다.

5. return 예약어를 사용하여 메소드를 호출한 문장으로 결과를 넘겨준다.

6. void 라는 예약어는 해당 메소드의 리턴 값이 없다는 것을 의미한다.

7. static 메소드는 클래스의 객체를 생성하지 않고 클래스 이름만으로 참조할 수 있다. 
많이 사용하는 System.out.println()의 경우는 System클래스에 out이라는 이름으로 선언된 클래스에 static으로 선언된 println()메소드를 호출하는 것이다.

8.메소드의 이름을 동일하게하고, 매개변수만을 다르게 하는 것은 overloading이다. 

9. 모든 기본 자료형과 참조 자료형은 매개변수로 넘어갈 때 값이 넘어가는 Pass by Value이다. 

10. 모든 기본 자료형과 참조 자료형은 매개변수로 넘어갈 때 값이 넘어가는 Pass by Value이다. 
단, 참조 자료형 안에 있는 변수들은 매개변수로 넘어갈 때 참조가 넘어가는 Pass by Reference 이다. 

11. 가변 매개변수를 지정할 때에는 "변수타입...변수명"으로 선언하면 된다. 이 선언을 할 때, 해당 변수는 매개변수 선언의 가장 마지막에 위치해야만 한다. 
```



