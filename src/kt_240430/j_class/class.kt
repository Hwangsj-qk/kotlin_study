package kt_240430.j_class

// 클래스 선언 기본 구조
    // 생성자
class 클래스이름 constructor() {     // constructor 생략 가능
    // 프로퍼티(java의 필드)
    var 프로퍼티이름: String      // 프로퍼티는 기본적으로 초기되어야 함

    // 초기화 블록(java의 생성자)
    init {
        프로퍼티이름 = "프로퍼티값"
    }

    // 메서드
    fun 메서드이름(매개변수명:String): String {
        return "리턴할 값"
    }
}

class Person {
    // 프로퍼티
    // 초기값이 필요
    var name:String = "무명"
    var age: Int = 0

    // 메서드
    fun greet() {
        println("안녕하세요, 저는 ${name}이고 ${age}세 입니다. ")
    }
}

fun main() {
    // 인스턴스 생성: 클래스명()  | 자바와 달리 new 키워드 없음
    val person = Person()       // 타입은 추론 -> 타입이 분명할 경우 명시적으로 작성 X

    println(person.name)        // 내부적으로 getter 호출

    // 내부적으로 setter 호출
    person.name = "홍길동"
    person.age = 30

    person.greet()
}