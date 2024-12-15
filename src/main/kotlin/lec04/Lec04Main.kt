package lec04

import com.lannstark.lec04.JavaMoney

/**
 * 코틀린에서 동일성은 ===, 동등성은 equals 사용
 * 만약, == 사용 시 equals 를 호출한다.
 *
 * 코틀린이 있는 특이한 연산자
 * in/!in : 컬렉션이나 범위에 포함되어 있다.
 * a..b : a부터 b 까지의 범위 객체를 생성
 * a[i] : a에서 특정 index i로 값을 가져온다
 * a[i] = b : a의 특정 index i에 b를 넣는다.
 *
 * 연산자 오버로딩
 *
 * 단항, 산술, 산술대입연산자는 Java와 같다.
 * 비교 연산자도 같으나 객체끼리도 자동 호출되는 compareTo를 이용해 비교 연산자를 사용
 * 코틀린에만 존재하는 연산자가 있다.
 * 객체끼리의 연산자를 직접 정의할 수 있다.
 *
 */
fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("money1이 money2보다 금액이 큽니다.")
    }

    val koMoney = Money(1_000L)
    val koMoney2 = Money(2_000L)
    println(koMoney + koMoney2)
}

fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return false
}