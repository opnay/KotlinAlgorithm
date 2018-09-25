/*
 * 구구단
 *
 * https://www.acmicpc.net/problem/2742
 */

// Scanner를 통한 풀이입니다.
import java.util.Scanner

fun main(args: Array<String>) {
    Scanner(System.`in`).run {
        val a = nextInt()
        // Kotlin에서 문자열에 변수삽입은 $를 이용하면됩니다.
        for (i in 1 .. 9) println("$a * $i = ${a * i}")
    }
}
