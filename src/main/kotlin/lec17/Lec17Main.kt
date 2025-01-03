package lec17

import com.lannstark.lec17.Fruit

/**
 * 자바에서는 함수는 2급 시민이지만, 코틀린은 함수 자체를 1급 시민으로 취급
 * 함수 자체를 변수에 넣을 수도 있고, 파라미터로 전달 가능
 * 코틀린에서 함수 타입은 (파라미터 타입,...) -> 반환 타입
 * 마지막 파라미터가 함수인 경우, 소괄호 밖에 람다 사용 가눙
 * 람다의 마지막 expression 결과는 람다의 반환 값이다.
 * Closure를 사용해 non-final 변수도 람다에서 사용할 수 있다.
 */


fun main() {
    val fruits = listOf(
    Fruit("사과", 1_000),
    Fruit("사과", 1_200),
    Fruit("바나나", 1_000),
    Fruit("사과", 1_000),
    Fruit("사과", 1_000),
    Fruit("사과", 1_000),
    )
//    filterFruits(fruits) {fruit -> fruit.name == "사과" }
    filterFruits(fruits) {it.name  == "사과" }
}

val isApple = fun(fruit: Fruit): Boolean {
    return fruit.name == "사과"
}
// 자주 사요
val isApple2 = { fruit: Fruit -> fruit.name == "사과" }


private fun filterFruits(
    fruits: List<Fruit>, filter: (fruit: Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for(fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}