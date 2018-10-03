/*
 * 그대로 출력하기 1, 2
 *
 * 7: https://www.acmicpc.net/problem/11718
 * 8: https://www.acmicpc.net/problem/11719
 *
 * 다른 언어라면 두 문제는 다를 수 있지만, Kotlin, Java에서는 동일한 내용으로 사용 가능하다.
 */

// 문제에서 입력이 최대 100줄로 이루어져 있다고 되어있는데
// 콘솔입력이아닌 버퍼입력일 가능성이 크므로, BufferedReader를 이용한 입력을 사용.
import java.io.BufferedReader

fun main(args: Array<String>) {
    val br = BufferedReader(System.`in`.reader())
    br.forEachLine { println(it) }
}
