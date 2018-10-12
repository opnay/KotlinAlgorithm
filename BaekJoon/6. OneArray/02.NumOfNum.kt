/*
 * 숫자의 개수
 *
 * https://www.acmicpc.net/problem/2577
 */
fun main(args: Array<String>) {
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    val C = readLine()!!.toInt()
    (A * B * C).let { n ->
        for (i in 0 .. 9) {
            var tmp = n
            var num = 0
            while (tmp > 0) {
                if ((tmp % 10) == i) num += 1
                tmp /= 10
            }
            println(num)
        }
    }
}
