package lec13

/**
 * 중첩 클래스는 2가지가 있다.
 * static 사용 클래스 미사용 클래스 권장되는 것은 static를 사용하는것
 * 코틀린에서 이런 가이드를 지키고자
 * 클래스 안에 기본 클래스를 사용하면 바깥 클래스에 대한 참조가 없고
 * 바깥 클래스를 참조하고 싶다면, inner 키워드를 사용해야한다(비권장)
 * 코틀린 inner class 에서 바깥 클래스를 참조하려면 this@바깥클래스 를 사용해야한다.
 */
fun main() {

}

class House(
    var address: String,
    var livingRoom: LivingRoom = LivingRoom(10.0),
) {
    class LivingRoom(
        private var area: Double
    )

//  inner  class LivingRoom(
//        private var area: Double,
//    ){
//      val address: String
//          get() = this@House.address
//  }
}