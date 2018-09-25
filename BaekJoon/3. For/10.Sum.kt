/*
 * 숫자의 합
 *
 * https://www.acmicpc.net/problem/11720
 */

// Scanner를 통한 풀이입니다.
import java.util.Scanner

fun main(args: Array<String>) {
    var answer = 0

    Scanner(System.`in`).run {
        val n1 = nextInt()
        val n2 = next()
        n2?.map { c ->
            var tmp = (c - '0').toInt()
            if (tmp in 0 .. 9)
                answer += tmp
        }
        println(answer)
    }
}
