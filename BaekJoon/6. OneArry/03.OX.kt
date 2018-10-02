/*
 * OX퀴즈
 *
 * https://www.acmicpc.net/problem/8958
 */
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (i in 1 .. n) {
        var score = 0
        var curSc = 0
        readLine()!!.forEach {
            if (it == 'O') {
                curSc += 1
                score += curSc
            } else curSc = 0
        }
        println(score)
    }
}
