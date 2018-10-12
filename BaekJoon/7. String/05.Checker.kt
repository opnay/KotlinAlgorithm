/*
 * 그룹 단어 체커
 *
 * https://www.acmicpc.net/problem/1316
 */
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var answer = 0

    for (i in 1 .. n) {
        val word = readLine()!!
        var alpha = arrayListOf(word[0])

        word.forEachIndexed { idx, e ->
            if (alpha.last() != e)
                alpha.add(e)
        }

        var isGroup = true
        alpha.forEachIndexed { idx, e ->
            if (alpha.indexOfLast { it == e } != idx) isGroup = false
        }
        if (isGroup) answer += 1
    }

    println(answer)
}
