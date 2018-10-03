/*
 * A-B
 *
 * https://www.acmicpc.net/problem/1001
 */

fun main(args: Array<String>) {
    val i = readLine()!!
            .split(" ")
            .map { it.toInt() }
    println(i[0] - i[1])
}
