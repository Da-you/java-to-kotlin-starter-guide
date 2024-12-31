package lec15

fun main() {
    /**
     * 배열
     * indices : 0부터 마지막 인덱스까지의 Range를 가지고 반복문 수행
     * withIndex() : 인덱스와 값을 한번에 가져옴
     */
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println(array[i])
    }
    for ((idx, value) in array.withIndex()) {
        println("${idx},${value}")
    }

    val numbers = listOf(100, 200)
    println(numbers[0])

    for (number in numbers) {
        println(number)
    }
    for ((idx, value) in numbers.withIndex()) {
        println("${idx},${value}")
    }
    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "안녕")
    oldMap[2] = "자바 9"

    mapOf(1 to "어우", 2 to "중위 호출")

    for (key in oldMap.keys) {
        println("${key},${oldMap[key]}")
    }
    for ((key, value) in oldMap.entries) {
        println("${key},${value}")
    }
}

