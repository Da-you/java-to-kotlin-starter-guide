package lec02

import com.lannstark.lec02.Person

/**
 * Safe Call : null이 아니면 실행 null이면 실행하지 않는다(그대로 Null)
 * Elvis 연산자 : 앞의 연산 결과가 Null이면 뒤의 값을 사용
 */
fun main() {
    val str: String? = null
    //println(str.length) // Null이 존재하는 변수에 대해서는 바로 메서드 접근 불가, 컴파일 에러 발생
//    println(str?.length) // str 이 Null 이라면 Null 반환, Safe Call
    println(str?.length ?: 0) // Elvis 연산자 ?:

    val person = Person("공부하는 개발자")
    startsWithA(person.name)
}
fun startsWithA(str: String) : Boolean {
    return str.startsWith("A")
}


fun startWithA1(str: String?): Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("null이 입력됨")
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 입려됨")
}


fun startWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")
}

// nullable 타입이나 조건상 Null 절대 올 수 없는 경우 !! 사용
fun startsWith(str : String?) : Boolean {
    return str!!.startsWith("A")
}