/*
 * A+B - 2
 *
 * https://www.acmicpc.net/problem/2558
 *
 * Kotlin, Java의 기본 내장 함수/메소드중 nextInt같은거는 ' '나, 줄넘김문자 등을 전부 제외시키고
 * 숫자를 가져오는 함수들이라 1단계의 2번문제와 동일한 풀이가 가능합니다.
 */

// Scanner를 통한 풀이입니다.
import java.util.Scanner

fun main(args: Array<String>) {
    Scanner(System.`in`).run {
        println(nextInt() + nextInt())
    }
}
