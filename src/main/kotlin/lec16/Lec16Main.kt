package lec16

/**
 * 확장함수 : 자바로 만들어진 라이러리를 유지 보수 하고자 등장
 * 확장함수는 원본 클래스의 private과 protected 멤버 접근이 안된다.
 * 멤버함수, 확장함수 중 멤버함수에 우선권이 있다.
 * 확장함수는 현재 타입을 기준으호 호출된다.
 * 함수 호출 방식을 바꿔주는 infix 함수가 존재
 * 함수를 복사 - 붙여넣기 하는 inline 함수 존재
 * 함수 안에 함수를 선언하는 지역함수 존재
 */

fun main(){
    val str  = "abcv"
    str.lastChar()

}
// String 클래스를 확장하는 함수를 만듬
fun String.lastChar(): Char {
    return this[this.length - 1]
}