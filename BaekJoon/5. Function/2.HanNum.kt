/*
 * 한수
 *
 * https://www.acmicpc.net/problem/1065
 */
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    ArrayList((1 .. n).toList()).also { arr ->
        arr.removeAll { !isHan(it) }
        println(arr.size)
    }
}

fun isHan(n: Int): Boolean {
    if (n < 100) return true
    var th = 0
    var tmp = n
    while (tmp > 0) {
        tmp /= 10
        th += 1
    }

    tmp = n
    val m = ((n / 10) % 10) - (n % 10)
    tmp /= 10
    for (i in 2 until th) {
        var tmp2 = (tmp % 100)
        if (m != ((tmp2 / 10) % 10) - (tmp2 % 10)) return false
        tmp /= 10
    }
    return true
}
