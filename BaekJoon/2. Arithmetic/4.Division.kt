/*
 * A/B
 *
 * https://www.acmicpc.net/problem/1008
 */

// Scanner를 통한 풀이입니다.
import java.util.Scanner

fun main(args: Array<String>) {
    Scanner(System.`in`).run {
        // 오차는 10의 -9제곱까지이니, Float보단 Double이 정확하다.
        println("%.9f".format(nextInt() / nextInt().toDouble()))
    }
}
