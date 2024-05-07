package kt_240503.q_lambda

// 고차함수: 리턴 타입으로 함수를 반환하는 고차함수
fun getOperation (operator: String): (Int, Int) -> Int {
    return when(operator) {
        "add", "더하기", "+" -> {a,b -> a + b}
        "sub", "빼기", "-" -> {a,b -> a - b}
        "mul", "곱하기", "*" -> {a,b -> a * b}
        "div", "나누기", "/" -> {a,b -> a / b}
        else -> {_,_ -> 0}
    }
}

fun main() {
    val addFunction1 = getOperation("+")
    println(addFunction1(10, 20))

    val addFunction2 = getOperation("더하기")
    println(addFunction2(30,50))

    val subFunction1 = getOperation("빼기")
    println(subFunction1(30, 15))

    val subFunction2 = getOperation("sub")
    println(subFunction2(20, 10))

    val divFunction = getOperation("나누기")

    // 람다를 호출하는 법
    println(divFunction.invoke(10, 5))
    println(divFunction(10, 5))
}