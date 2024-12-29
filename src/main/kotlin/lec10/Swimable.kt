package lec10
// backing field 가 없는 프로퍼티 생성 가능
interface Swimable {
    val swimAbility: Int
    fun act() {
        println("어푸 어푸")
    }
    
}