/*
 * 합
 *
 * https://www.acmicpc.net/problem/8393
 */

// Scanner를 통한 풀이입니다.
import java.util.Scanner

fun main(args: Array<String>) {
    Scanner(System.`in`).run {
        val n = nextInt()
        var a = 0
        for (i in 1 .. n) {
            a += i
        }
        println(a)
    }
}
