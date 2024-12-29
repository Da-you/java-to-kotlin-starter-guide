package lec12

import com.lannstark.lec12.Movable

fun main(){
    // 익명 클래스
    moveSomething(object : Movable {
        override fun move() {
            println("이동")
        }

        override fun fly() {
            println("날다")
        }
    })
}

private fun moveSomething(movable: Movable){
    movable.move()
    movable.fly()
}