/*
 * 열 개씩 끊어 출력하기
 *
 * https://www.acmicpc.net/problem/11721
 */

// Scanner를 통한 풀이입니다.
import java.util.Scanner

fun main(args: Array<String>) {
    Scanner(System.`in`).run {
        val n2 = next()
        var nth = 0
        var c: Char? = ' '
        while(c != null) {
            for (i in 0 .. 9) {
                c = n2.getOrNull(i + nth)
                print(c ?: break)
            }
            nth += 10
            println("")
        }
    }
}
