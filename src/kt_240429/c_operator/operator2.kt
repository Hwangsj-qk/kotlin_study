package kt_240429.c_operator

fun main() {
    // 범위 연산자 a..b
    val numberRange = 1..10    // 1부터 10까지의 범위가 생성

    // in 연산자 : 컬렉션이나 범위에 특정 값이 있는지 확인 => true or false 반환
    if(5 in numberRange) {
        println("범위 내에 5가 있습니다. ")
    }

    // !in dustkswk : 특정 범위 내에 값이 없는지 확인
    if(12 !in numberRange) {
        println("범위 내에 12가 없습니다. ")
    }

    // 인덱싱 연산자 variable[i]
    // 문자열과 같은 순서범위에서 특정 인덱스 위치를 가져옴
    val name = "홍길동"
    // 자바에서 name.charAt(0)과 같은 기능
    println(name[0])        // 홍
    println(name[1])        // 길
    println(name[2])        // 동

    // 컬렉션에서 인덱싱
    var names = mutableListOf("홍길동", "임꺽정", "전우치")
    println(names[0])          // 홍길동

    // 인덱싱한 값을 변경하기
    names[0] = "김길동"
    println(names[0])       // 홍길동 → 김길동으로 변경


}