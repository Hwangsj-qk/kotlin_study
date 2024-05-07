package kt_240503.p_extension

// 정수를 확장하는 확장함수
fun Int.multiply(other: Int): Int {
    return this * other
}

fun main() {
    // inline이 아닌 확장함수는 내부적으로 static 함수를 호출
    println(3.multiply(4))
    // inline 함수는 내부적으로는 함수를 호츨하지 않음
    // 호출한 지점의 함수 본문을 그대로 사용
    // var a = 3
    // var b = 4
    // println(a * b)
}