package lec09

/**
 * 코틀린에서는 기본이 public
 * getter, setter 는 자동으로 생성
 * 생성자 키워드인 constructor 생략 가능
 * 객체의 속성을 나타내는 경우에는 custom getter 그렇지 않다면 함수
 * custom getter 사용시 자기 자신에 변형을 줄 수 있다.
 * custom getter/setter 사용 시 무한루프를 막기위해 field 키워드를 사용하는데 이를 backing field 라고 부른다.
 */
fun main() {
    val person = Person("가", 100)
    println(person.name) // 인스턴스.필드를 통해 getter 호출
    person.age = 20 // setter 호출
}

class Person constructor(
    // 주생성자 (반드시 존재해야함)
    val name: String,
    var age: Int
)
//    val name : String = name
//    var age: Int = age
{
    // init 블록은 생성자가 호출되는 시점에 호출
    init {
        if (age < 0) throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
    }
    // 부 생성자 필수는 아니며 사용 시 최종적으로는 this를 통해서 주 생성자를 호출한다. body를 가질 수 있다.
    constructor(name: String) : this(name, 1){
        println("첫 번쨰 부 생성자")
    }
    val isAdult: Boolean
        get() = this.age >= 20
}