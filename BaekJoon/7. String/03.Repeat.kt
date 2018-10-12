/*
 * 문자열 반복
 *
 * https://www.acmicpc.net/problem/2675
 */
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (i in 1 .. n) {
        readLine()!!.split(" ").let { lst ->
            val nLoop = lst[0].toInt()
            lst[1].forEach { c ->
                for (a in 1 .. nLoop) print(c)
            }
        }
        println()
    }
}
