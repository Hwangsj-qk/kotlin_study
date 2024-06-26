package kt_240430.g_null_safety

// null 단언 연산자(!!)
// 개발자가 해당 변수의 값이 null이 아니라고 강제로 단언
// 사용 시 프로그램 안정성을 해치는 위험이 있기 때문에 safety call, elvis 사용 권장

fun main() {
    val name: String? = "홍길동"    // name = "홍길동" → 3 출력
    // val name:String? = null     // name = null → NPE 발생

    println("문자열의 길이 : ${name!!.length}")

    // 그럼에도 불구하고 null을 대입하는 경우 NullPointerException 발생

    // 사용자의 입력을 받는 경우 readLine()
    print("문자열을 입력하세요: ")
    val input: String? = readLine()

    // null 검증
    if (input != null) {
        processInput(input)
    } else {
        println("유효한 입력이 아닙니다. ")
    }

    // println("입력한 내용 : ${input}")        // 함수 생성하기(processInput)
}
    fun processInput(input: String?) {
        val validInput = input !!       // null 검증이 끝났음을 개발자가 단언
        println("문자열의 길이: ${validInput.length}")
    }
