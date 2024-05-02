package kt_240502.m_object

interface Printable {
    fun print()
}

class Printer {
    // 인터페이스 구현 등의 확장 기능
    companion object : Printable {
        override fun print() {
            println("컴패니언 객체에서 프린트합니다. ")
        }
    }
}

fun main() {
    Printer.print()     // 클래스에서 Interface 메서는 호출
}

