/*
 * N 찍기
 *
 * https://www.acmicpc.net/problem/2741
 */

// Scanner를 통한 풀이입니다.
import java.util.Scanner

fun main(args: Array<String>) {
    Scanner(System.`in`).run {
        for (i in 1 .. nextInt()) println(i)
    }
}
