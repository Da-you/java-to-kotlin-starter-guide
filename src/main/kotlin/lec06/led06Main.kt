package lec06
/*
for-each문, 전통 for문, Progression과 Range, while문
.. 연산자는 범위를 만들어내는 연산자
 */

fun main(){
    val numbers = listOf(1,2,3,4,5)
    // for each ":" 대신  in 사용
    for( number in numbers){
        println(number)
    }

    // 전통 for문 i++ (코틀린은 등차수열과 in을 사용)
    for(i in 1..3){
        println(i)
    }
    // 전통 for문 i--
    for(i in 3 downTo 1){
        println(i)
    }

    // 2씩 증가
    for (i in 1..5 step 2){
        println(i)
    }
    //while문
    var i =1
    while (i <= 3){
        println(i)
        i++
    }
}