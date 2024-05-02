package kt_240502.k_extends.diamond

import kt_240502.k_extends.Animal

// abstract class Animal()

interface Flyable {
    fun fly()
    fun move() : Unit {     // Unit은 생략 가능
        return println("납니다.")
    }
}

interface Swimmable {
    fun swim()
    fun move() = println("해엄칩니다.")
}

class Duck(name: String) : Animal(), Flyable, Swimmable {
    override fun fly() {
        println("납니다. ")
    }

    override fun swim() {
        println("헤엄칩니다.")
    }

    override fun move() {
        // 양쪽 인터페이스의 본문을 가진 메서드 중 구체적인 타입을 선택하여 호출
        super<Flyable>.move()       // Fiyable의 move 메서드 호출
        super<Swimmable>.move()     // Swimmable의 move 메서드 호출
    }
}

fun main() {
    val duck = Duck("오리")
    duck.move()
}