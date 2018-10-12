/*
 * 단어 공부
 *
 * https://www.acmicpc.net/problem/1157
 */
fun main(args: Array<String>) {
    readLine()!!.toUpperCase().let { str ->
        var n = 0
        var c = '?'
        ('A' .. 'Z').forEach { alpha ->
            val size = str.filter { alpha == it }.length
            when {
                (size > n) -> {
                    n = size
                    c = alpha
                }
                (size == n) -> {
                    c = '?'
                }
                else -> {}
            }
        }
        println(c)
    }
}
