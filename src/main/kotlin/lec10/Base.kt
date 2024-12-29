package lec10

/**
 * final : 오버라이드를 할 수 없게 한다. default로 보이지 않게 한다.
 * open : 오버라이드를 열어준다.
 * abstract : 반드시 오버라이드 한다.
 * override : 상위타입을 구현하고 있다.
 * 상위 클래스의 생성자 또는 초기화 블록에서 open 프로퍼티 사용 시 예상치 못한 버그가 생길 수 있다.
 */
fun main(){
    Derived(300)
}
open class Base constructor(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived constructor(
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}