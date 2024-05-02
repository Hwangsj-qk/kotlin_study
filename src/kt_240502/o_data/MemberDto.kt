package kt_240502.o_data

// 기본적으로 프로퍼티(getter, setter)
// equals, hashCode, toString 자동으로 만들어줌
// 생성자는 선언부에서 생성
data class MemberDto(val name: String, val age: Int)

fun main() {
    val member1 = MemberDto("또치", 23)
    val member2 = MemberDto("둘리", 15)
    val member3 = MemberDto("또치", 23)

    // equals()
    println(member1 == member2)     // false
    println(member1 == member3)     // true

    // toString()
    println(member1)

    // hashCode
    println(member1.hashCode())
    println(member2.hashCode())
    println(member3.hashCode())

    // copy() : 객체의 복사본 생성
    // 프로퍼티를 복사하되, 복사 시 프로퍼티 값을 변경하는 옵션 제공
    val member1Old = member1.copy(age = 24)
    println(member1Old)     // MemberDto(name=또치, age=24)

    // destructing declaration : 구조분해 할당
    // 데이터 클래스의 내부 프로퍼티를 각각의 이름의 변수에 할당
    val (name, age) = member1

    println("${name}는 ${age}세 입니다. ")

    // Component Functions
    // 데이터 클래스의 각 프로퍼티에 대해 자동으로 생성됨
    // componentN
    println(member2.component1())       // member2.name
    println(member2.component2())       // member2.age
}




