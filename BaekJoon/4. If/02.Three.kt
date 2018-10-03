/*
 * 시험 성적
 *
 * https://www.acmicpc.net/problem/15552
 */
import java.util.Scanner

fun main(args: Array<String>) {
    Scanner(System.`in`).let {
        val n = it.nextInt()
        // Kotlin에서는 C의 switch문이 when으로 사용됩니다.
        // 하지만 switch문과는 달리 break가 없고 각 조건절'만' 실행되어 when을 빠져나오게 됩니다.
        // in이라는 키워드는 비교되는 변수가 우측의 숫자 범위 내라면 true를 나타냅니다.
        when (n) {
            in 90 .. 100 -> println("A")
            in 80 .. 89 -> println("B")
            in 70 .. 79 -> println("C")
            in 60 .. 69 -> println("D")
            else -> println("F")
        }
    }
}
