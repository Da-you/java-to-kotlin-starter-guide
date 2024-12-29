package lec05

import org.graalvm.compiler.debug.TTY.printf

fun validateScore(score: Int) {
    if (score in 0..100) {
        throw IllegalArgumentException("Score must be between 0 and 100")
    }
}

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun getPassOrFail(score: Int): String {
//    if (score >= 50) {
//        return "P"
//    } else {
//        return "F"
//    }
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

fun getGradeWithSwitch(score: Int): String {
//    return when (score /10){
//        9 -> "A"
//        8 -> "B"
//        7 -> "C"
//        else -> "D"
//    }
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun judgeNumber(number: Int) {
    when {
        number == 0 -> printf("주어진 숫자는 0입니다.")
        number % 2 ==0 -> println("주어진 숫자느 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}