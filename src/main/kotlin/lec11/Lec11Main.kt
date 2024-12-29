package lec11

/**
 * public 모든 곳에서 접근 가능
 * protected 선언된 클래스 또는 하위 클래스에서만 접근 가능
 * internal 같은 모듈에서만 접근 가능(바이트 코드로 변경시 public)
 * private 선언된 클래스내에서만 접근 가능
 */
private val NUM = 3

fun add(a: Int, b: Int): Int {
    println(NUM)
    return a + b
}
fun isDirectorPath(path: String): Boolean {
    return path.endsWith("/")
}