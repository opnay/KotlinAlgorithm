/*
 * 평균은 넘겠지
 *
 * https://www.acmicpc.net/problem/4344
 */
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (i in 1 .. n) {
        val scores = readLine()!!.split(" ")
                .map { it.toInt() }
                .let { it -> it.subList(1, it.size) }
        var nOver = 0F
        scores.forEach {
            if (it > (scores.sum() / scores.size))
                nOver += 1
        }
        // Float타입 소수점 셋째자리까지 출력 "%.3f"
        println("%.3f%%".format( nOver / scores.size * 100))
    }
}
