package kt_240503.p_extension

fun registerUser(name: String, age: Int) {
    // 유효성 검증 로직
    fun validDataInput(input: String) {
        if(input.isNullOrEmpty()) {
            throw IllegalArgumentException("유효한 입력이 아닙니다. ")
        }
        if(input.length > 100) {
            throw IllegalArgumentException("너무 긴 이름입니다. ")
        }
    }

    validDataInput(name)        // 이름에 대한 유효성 검사

    if(age < 18) {
        throw IllegalArgumentException("나이는 19세 이상되어야 합니다. ")
    }

    println("회원이 가입되었습니다: ${name}, ${age} 세")
}

fun main() {
    registerUser("홍길동", 30)
    try {
        registerUser("", 30)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // 지역함수는 해당 지역에서만 호출 가능
    // validDataInput("abcd")

    registerUser("김철수", 5)
}