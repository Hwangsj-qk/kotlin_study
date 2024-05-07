package kt_240507.t_lazy

class Person {
    // var name: String        // 프로퍼티: 반드시 초기//어야 함
    // var name: String? = null
    // 만약 초기값으로 null을 준다면 해당 프로퍼티를 사용하는 모든 곳에서
    // nullable과 safe all을 사용해야하는 문제가 발생

    lateinit var name: String
    // nullable로 사용하지 않으면서 초기화를 뒤로 미룰 수 있음

    fun initName(name: String) {
        this.name = name
    }

    fun printName() {
        println("이름은 $name")
    }
}

fun main() {
    val person = Person()
    // person.printName()      // 초기화 되지 않으 시점에서 이름을 출력하려고 하다면 exception 발생
    // UninitializedPropertyAccessException
    person.initName("둘리")       // lateinit 프로퍼티는 이 시점에서 초기화
    person.printName()
}