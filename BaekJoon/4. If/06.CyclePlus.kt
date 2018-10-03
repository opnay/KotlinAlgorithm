/*
 * 더하기 사이클
 *
 * https://www.acmicpc.net/problem/1110
 */
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var tmp = n

    var nth = 0
    // 기존의 수에서 1의자리수를 10자리수로 각 자리수를 더하기고 더한값의 1의자리수를 가져와 조합
    do {
        var first = ((tmp % 10) + (tmp / 10)) % 10
        var second = tmp % 10
        tmp = (second * 10) + first
        nth += 1
    } while (tmp != n)

    println(nth)
}
