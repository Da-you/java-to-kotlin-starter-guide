package lec10

class Penguin constructor(
    species: String
) : Animal(species, 2), Flyable, Swimable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직임")
    }

    // 코틀린에서는 추상 프로퍼티가 아니라면 상속 받을때 open 키워드를 붙여야 한다.
    override val legCount: Int
        get() = super.legCount + this.wingCount

    // 중복되는 인터페이스 특정 시 super<타입>.함수 사용
    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }

    override val swimAbility: Int
        get() = 3

}