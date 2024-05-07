package kt_240503.q_lambda

// 람다 선언 단계
fun printList(items: List<Int>) {
    // 람다함수를 매개변수로 받는 함수 (고차함수)
    items.forEach({item -> println(item)})
}

fun printList2(items: List<Int>) {
    // 코틀린에서 마지막 인자 람다 표현식인 경우, 람다를 괄호 밖으로 뺄 수 있음
    // 후행 람다 trailing lambda
    // 코틀린에서 람다 고차함수로 사용할 때 권장되는 방식
    items.forEach {item -> println(item)}
}

fun main() {
    val intList = listOf(1,2,3,4)
    printList(intList)
}