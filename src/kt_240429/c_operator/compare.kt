package kt_240429.c_operator

import kotlin.system.measureNanoTime

// 돈 클래스 돈의 양을 비교하는 기능의 클래스
data class Money(val amount:Int) : Comparable<Money> {

    override fun compareTo(other: Money): Int {
        return this.amount - other.amount
    }
}

fun main() {
    val moneyA = Money(5000)
    val moneyB = Money(10000)

    // 자바에서 금액을 비교하는 법, compareTo => 양수, 0, 음수
    if(moneyA.compareTo(moneyB) > 0) {
        println("금액이 같습니다. ")
    } else if (moneyA.compareTo(moneyB) > 0) {
        println("moneyA 금액이 더 큽니다. ")
    } else {
        println("moneyB 금액이 더 큽니다. ")
    }

    // 코틀린에서는 객체끼리도 비교연사자를 사용할 수 있음
    // 내부적으로는 compareTo를 사용
    // 자바보다는 더 간결하고 읽기 쉬운 코드 작성 가능
    println(moneyA > moneyB)
    println(moneyA < moneyB)
    println(moneyA >= moneyB)
    println(moneyA <= moneyB)

    //
}