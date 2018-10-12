/*
 * 다이얼
 *
 * https://www.acmicpc.net/problem/5622
 */
fun main(args: Array<String>) {
    val line = readLine()!!
    var answer = 0
    line.forEach { c ->
        when (c) {
            in 'A' .. 'C' -> answer += 3
            in 'D' .. 'F' -> answer += 4
            in 'G' .. 'I' -> answer += 5
            in 'J' .. 'L' -> answer += 6
            in 'M' .. 'O' -> answer += 7
            in 'P' .. 'S' -> answer += 8
            in 'T' .. 'V' -> answer += 9
            in 'W' .. 'Z' -> answer += 10
        }
    }
    println(answer)
}
