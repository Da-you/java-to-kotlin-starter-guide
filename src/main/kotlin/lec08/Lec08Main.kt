package lec08

fun main() {
    repeat("Hello World")

    printAll("a", "b", "c")
    val array = arrayOf("a", "b", "c")
    printAll(*array)
}
// 함수 선언 문법
/**
 * 접근 제어자 생략 가능
 * fun은 함수를  나타내는 지시어
 * 파라미터는 변수명: 타입
 */
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

/**
 * default parameter
 */
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

/**
 * named argument
 * builder 를 사용하는 효과를 나타냄(매개 변수가 많을 경우 값을 잘못 넣는 휴먼에러의 가능성이 줄어듬
 */

/**
 * 가변 인자
 * 가변 인자를 사용하는 경우 vararg를 변수명 앞에 적어준다.
 * 배열을 바로 넣는 대신 스프레드 연산자인 *를 붙여야 한다.
 */
fun printAll(vararg strings: String) {
    for (str in strings) println(str)
}