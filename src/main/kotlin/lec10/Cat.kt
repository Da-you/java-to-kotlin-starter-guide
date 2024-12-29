package lec10


class Cat constructor(
    species: String
    // 코틀린에서는 상속 시 상위 클래스의 생성자를 바로 호출하다.
    // 코틀린에서는 상속 키워드 extends 가 없으며 : 을 사용한다.
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 걷는다.")
    }
}