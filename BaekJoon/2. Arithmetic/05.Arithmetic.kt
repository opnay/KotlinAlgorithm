/*
 * 사칙연산
 *
 * https://www.acmicpc.net/problem/10869
 */

// Scanner를 통한 풀이입니다.
import java.util.Scanner

fun main(args: Array<String>) {
    Scanner(System.`in`).run {
        val a = nextInt()
        val b = nextInt()
        println(a+b)
        println(a-b)
        println(a*b)
        println(a/b)
        println(a%b)
    }
}