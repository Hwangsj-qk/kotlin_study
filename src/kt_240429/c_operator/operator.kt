package kt_240429.c_operator

fun main() {
    // 연산자는 자바와 유사한 기본 연산자 지원
    val a = 10
    val b = 20
    println(a + b)      // 산술 연산자 : +, -, *, /, %
    println(a > b)      // 비교 연산자 : ==, !=, < > <= >=
    // 논리 연산자 : &&, ||, !

    // 객체의 동등성(Equality)과 동일성(Identity) 비교
    // 두 객체가 같은 객체인지 비교
    // 동등성(Equality) : 두 객체와 값이 같다
    // 동일성(Identity) : 완전히 동일한 객체, 참조 주소가 같다.

    // Java 에서 동등성 비교는 equals(), 동등성 비교는 ==
    // kotlin에서
    // 동등성 비교 == 연산자 사용 : 내부적으로 equals 기능을 안전하게 수행
    // 동일성 비교 === 연산자 사용 : 자바의 == 연산과 동일한 기능 (참조 주소, 값 비교)

    val name1 = "홍길동"
    val name2 = "홍길동"

    // 같은 값의 내용을 다른 문자열 객체로 생성
    val str1 : String = String("홍길동".toCharArray())
    val str2 : String = String("홍길동".toCharArray())


    val isEqual = str1 == str2     // 동등 비교, 문자열 내요 비교 (True)
    val isSame = str1 === str2      // 동일 비교, 메모리 주소 비교 (False)

    println("동등: " + isEqual)
    println("동일: " + isSame)


}