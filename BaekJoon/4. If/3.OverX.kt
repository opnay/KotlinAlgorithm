/*
 * 시험 성적
 *
 * https://www.acmicpc.net/problem/15552
 */
import java.io.BufferedReader

fun main(args: Array<String>) {
    BufferedReader(System.`in`.reader()).let { br ->
        var N = 0
        var X = 0
        br.readLine().split(" ").let {
            N = it[0].toInt()
            X = it[1].toInt()
        }

        val list = arrayListOf<Int>()
        br.readLine().split(" ").map {
            list.add(it.toInt())
        }

        list.filter { it in 1 until X }.let {
            it.forEachIndexed { idx, i ->
                print(i)
                if (idx != it.size - 1)
                    print(" ")
                else println()
            }
        }
    }
}
