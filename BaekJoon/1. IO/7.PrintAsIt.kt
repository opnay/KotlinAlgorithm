/*
 * 그대로 출력하기
 *
 * https://www.acmicpc.net/problem/11718
 */

// 문제에서 입력이 최대 100줄로 이루어져 있다고 되어있는데
// 콘솔입력이아닌 버퍼입력일 가능성이 크므로, BufferedReader를 이용한 입력을 사용.
import java.io.BufferedReader

fun main(args: Array<String>) {
    val br = BufferedReader(System.`in`.reader())
    br.forEachLine { println(it) }
}
