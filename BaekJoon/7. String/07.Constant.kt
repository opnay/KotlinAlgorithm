/*
 * 상수
 *
 * https://www.acmicpc.net/problem/2908
 */
fun main(args: Array<String>) {
    val line = readLine()!!.split(" ")
    line.map { it.reversed() }.let { nList ->
        if (nList[0] > nList[1]) println(nList[0])
        else println(nList[1])
    }
}
