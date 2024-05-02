package kt_240502.k_extends

// 추상 클래스
abstract class Vehicle {
    // 추상 메서드
    abstract fun drive() : String
}

class Car : Vehicle() {
    override fun drive(): String {
        return "차를 운전합니다. "
    }
}

class Truck : Vehicle() {
    override fun drive(): String {
        return "트럭을 운전합니다. "
    }
}

fun main() {
    val car: Vehicle = Car()
    val truck : Vehicle = Truck()

    println(car.drive())
    println(truck.drive())
}