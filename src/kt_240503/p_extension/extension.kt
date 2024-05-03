package kt_240503.p_extension

fun main() {
    // 문자열의 나만의 함수를 확장하고 싶다.
    // 마지막 글자를 찾는 함수
    // 확장함수 선언
    fun String.lastChar(): Char {
        return this[this.length - 1]
    }
    // `this` 키워드를 통해 실제 클래스 객체의 값에 접근

    val name = "고길동"

    // String 에 있는 멤버함수처럼 사용할 수 있음
    println(name.lastChar())                // 동
    println("확장함수마지막글자".lastChar())     // 자

    // 확장 함수에서 기존 멤버 함수 사용 가능
    fun String.reverse(): String {
        return this.reversed()
    }

    println("또치".reverse())
    println("또치".reversed())


}