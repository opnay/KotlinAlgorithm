/*
 * 2007년
 *
 * https://www.acmicpc.net/problem/1924
 */

// Scanner를 통한 풀이입니다.
import java.util.Scanner

// 2007년
fun main(args: Array<String>) {
    // 요일
    val week = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
    // 월별 마지막날
    val dayOf = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    Scanner(System.`in`).run {
        val mon = nextInt()
        var day = nextInt()

        // 1월 1일 월요일기준 x월 y일이 몇번째 일
        for (i in 0 until mon - 1) {
            day += dayOf[i]
        }

        // 7로 나눈 나머지가 요일
        println(week[day % 7])
    }
}
