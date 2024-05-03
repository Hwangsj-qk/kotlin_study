package kt_240502.o_data

// sealed : 봉인된
// 상속이 가능한 클래스를 만들고 싶지만, 외부에서는 상속받지 않으면 좋겠다.
// 정의된 패키지 내부에서만 상속이 가능한 클래스.
// 제한된 상속 -> 코드의 응집력을 높인다.

sealed class Transport (val name: String, val speed: Int)

class Car : Transport("붕붕이", 100)

class Bus : Transport("타요", 80)

class Bicycle : Transport("씽씽이", 30)

object Tank : Transport("전차", 50)
// 싱글톤 객체도 상속 가능

// when 문에서 모든 가능한 하위 클래스 타입을 컴파일 시점에 체크
fun handleTransport(transport: Transport) {
    when(transport) {
        is Bicycle -> println("자전거 ${transport.name}이 시속 ${transport.speed}속도로 달립니다. ")
        is Bike -> println("오토바이 ${transport.name}이 시속 ${transport.speed}속도로 달립니다. ")
        is Bus -> println("버스 ${transport.name}이 시속 ${transport.speed}속도로 달립니다. ")
        is Car -> println("자동차 ${transport.name}이 시속 ${transport.speed}속도로 달립니다. ")
        is Tank -> println("${transport.name}이 ${transport.speed}속도로 달립니다. ")
    }
    // is : instanceOf() -> 타입 확인

}