/*
 * 평균 점수
 *
 * https://www.acmicpc.net/problem/10039
 */
fun main(args: Array<String>) {
    val lst = arrayListOf<Int>()
    (1 .. 5).forEach { _ ->
        readLine()!!.toInt().let { n ->
            if (n < 40) lst.add(40)
            else lst.add(n)
        }
    }

    println(lst.sum() / 5)
}
