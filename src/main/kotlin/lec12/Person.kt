package lec12

fun main() {
    println(Singleton.a)
    Singleton.a = 10
    println(Singleton.a)
}

class Person constructor(
    private var name: String,
    private var age: Int
) {
    // 코틀린에는 static 가 없으며 대신 companion object 가 존재
    // companion object는 객체로 취급되어 이름을 가질수도 있으며, 인터페이스를 상속할 수 있다.
    // 클래스와 동행하는 유일한 오브젝트
    // const 키워드 사용시 컴파일시에 변수가 할당되며 상수에 사용하는 용도
    // Java에서 코틀린 companion object를 사용하고 싶으면 메서드에 @JVMStatic 사용
    companion object Factory : Log {
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스")
        }
    }
}
// 코틀린에서 싱들톤
object Singleton {
    var a: Int = 0
}