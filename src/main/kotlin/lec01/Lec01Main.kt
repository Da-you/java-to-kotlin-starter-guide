package lec01

import com.lannstark.lec01.Person


/**
 * 코틀린 에서는 별도의 접근 제어가 없다면 Public
 * 모든 변수는 var/ val 를 붙여야 한다.
 * 타입을 명시하지 않아도 타입 추론이 가능
 * 원시 타입과 참조 타입을 구분하지 않아도 된다.
 * 모든 변수에 null safe, null 넣고 싶다면 타입앞에 ? 를 사용
 * 객체를 인스턴스화 할 때 new를 붙이지 않아야 한다.
 */

fun main() {
    /*
    var = variable 로 가변
     */
    var number1 = 10L // var number1: Long = 10
    number1 = 5L

    /*a
    val = value 로 불변(read-only)
     */
    val number2 = 10L
//        number2 = 5L // 컴파일 에러

    // 타입 명시가능 변수명 : 타입
    var number3: Long? = 1_000L
    number3 = null

    var person = Person("hi")
    println(person.toString())


    /**
     * Tip. 모든 변수는 우선 val 로 만들고 필요한 경우에만 var로 변경
     */
}
