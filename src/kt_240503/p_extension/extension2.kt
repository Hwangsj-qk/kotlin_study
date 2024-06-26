package kt_240503.p_extension

import kt_240430.j_class.Person

// 만약 원래 기존 멤버 함수와 확장함수의 시그니처가 같은 경우
fun Person.nextYearAge() : Int {
    println("확장함수")
    return this.age + 1
}

// 멤버함수가 우선적으로 호출됨
fun main() {
    val person = Person("고길동", 30)
    println(person.nextYearAge())
}