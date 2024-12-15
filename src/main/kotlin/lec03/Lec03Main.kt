package lec03

import com.lannstark.lec03.Person

/**
 * 기본 타입간의 변환은 명시적으로 이루어져야 한다.
 * 코틀린에는 특이한 3가지 타입이 존재
 * Any == 자바의 Object 역할, Any는 null 포함을 인정하지 않기에 Any? 로 사용
 * Unit == 자바의 void 역할
 * Nothing == 무한 루프 함수를 가리킴 즉, 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
 */

fun main(){
    val number1= 3
    val number2 : Long = number1.toLong()

    val number3 : Int? = 3 // null 올 수 있는 데이터 타입
    val number4 : Long = number3?.toLong() ?: 0L // Safe call 과 Elvis의 사용
}

fun printAgeIfPerson(obj:Any){
    if (obj is Person) { // is == instanceOf, !is == !변수명 instanceOf
        val person = obj as? Person // as == (Person) obj
        println(person?.age)
        // println(obj.age) 도 가능
    }
}