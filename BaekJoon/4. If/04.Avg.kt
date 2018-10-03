/*
 * 평균
 *
 * https://www.acmicpc.net/problem/1546
 */
import java.io.BufferedReader

fun main(args: Array<String>) {
    BufferedReader(System.`in`.reader()).also { br ->
        // 과목 수
        val n = br.readLine()!!.toInt()
        val scoreList = br.readLine()!!.split(" ").map { it.toInt() }

        val reScore = scoreList.map { (it.toFloat() / scoreList.max()!! * 100F) }
        println(reScore.sum() / n)
    }
}
