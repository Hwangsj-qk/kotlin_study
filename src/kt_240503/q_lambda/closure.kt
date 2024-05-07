package kt_240503.q_lambda

import java.util.*

// closure

fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    // 결과를 담을 빈 리스트
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if(filter.invoke(fruit)) {      // 람다식의 결과가 참인 경우
            results.add(fruit)          // 결과 리스트에 객체 추가
        }
    }
    return  results         // 결과 리스트를 반환
}

fun main() {
    val fruits = Arrays.asList(
        Fruit("사과", 3000),
        Fruit("사과", 4000),
        Fruit("사과", 5000),
        Fruit("포도", 6000),
        Fruit("바나나", 3000)
    )

    // Java의 코드와 동일하게 사용
    var targetFruitName = "사과"
    targetFruitName = "바나나"

    filterFruits(fruits) { fruits: Fruit -> fruits.name == targetFruitName }
    filterFruits(fruits) {fruits: Fruit -> fruits.name == targetFruitName}
    val filterFruit = filterFruits(fruits) {it.name == targetFruitName}

    for(fruit in fruits) {
        println("${fruit.name} : ${fruit.price}")
    }
}

