/*
 * 별찍기 - 4
 *
 * https://www.acmicpc.net/problem/2441
 */

// Scanner를 통한 풀이입니다.
import java.util.Scanner

fun main(args: Array<String>) {
    Scanner(System.`in`).run {
        val num = nextInt()
        for (i in 1 .. num) {
            for (j in 1 until i) {
                print(" ")
            }

            for (j in i .. num) {
                print("*")
            }
            println("")
        }
    }
}
