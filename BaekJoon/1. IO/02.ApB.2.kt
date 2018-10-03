/*
 * A+B
 *
 * 2번 풀이
 *
 * https://www.acmicpc.net/problem/1000
 */

import java.util.Scanner

fun main(args: Array<String>) {
    // Scanner객체를 만들어 sc라는 변수에 넣습니다.
    val sc: Scanner = Scanner(System.`in`)

    // nextInt()로 정수 값을 두번 받아와 서로 더해 println으로 출력합니다.
    println(sc.nextInt() + sc.nextInt())
}
