/*
 * A+B
 *
 * 1번 풀이
 *
 * https://www.acmicpc.net/problem/1000
 */

import java.util.Scanner

fun main(args: Array<String>) {
    // Kotlin 기본함수로 한줄을 읽습니다.
    // !!를 통해 Not Null타입으로 만들어줍니다.
    readLine()!!
            .split(" ") // " " 공백을 기준으로 나눕니다.
             // split으로 나온 리스트의 각 아이템을 toInt()함수를 사용해 정수로 변경합니다.
            .map { it.toInt() }
            // Kotlin 리스트 기본 확장 함수인 sum()을 통해 받아온 정수를 더합니다.
            // 더한 값을 let을 통해 람다식으로 넘겨줘, println으로 출력을합니다.
            .sum().let { println(it) }
}
