package kt_240430.i_function

// default parameter
// 입력 파라미터에 기본값을 대입

fun repeat(str: String, num: Int = 3, isNewLine: Boolean = true) {
    for (i in 1..num)
        if(isNewLine) println(str) else print(str)
}

fun main() {
    // 호출시 입력 파라미터 값을 지정하지 않을 경우, 대입한 기본값으로 함수 호출
    repeat("안녕하세요", 3, true)
    repeat("문자열만 입력" )
    repeat("안녕하세요", 2)
}

// Java와 동일하게 오버로딩도 가능
fun repeat(str:String, boolean: Boolean) {}