package kt_240507.t_lazy

class Lazy {
    // 프로퍼티로 사용되는 경우 반드시 초기화 되어야 함
    // val lazyValue: String
    // lateinit val lazyValue2: String // val에는 lateinit 사용불가
    val lazyValue: String by lazy {
        println("로직 수행 ")
        "안녕하세요 지연초기화입니다."
    }

}

fun main() {
    val lazyValue: String       // 메인의 지역변수이므로 가능
    lazyValue = "초기값"           // 1회에 한하여 초기화 가능
    // lazyValue = "변경불가"

    val lazy = Lazy()           // 객체 생성

    println(lazy.lazyValue)  // getter 호출
    // 프로퍼티가 초기값을 가지고 있지 않다고 getter가 호출되는 순간
    // 초기화가 수행

    println()

}
