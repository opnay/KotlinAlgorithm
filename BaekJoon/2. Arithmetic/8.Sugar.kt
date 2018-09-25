/*
 * 설탕배달
 *
 * https://www.acmicpc.net/problem/2839
 */

// Scanner를 통한 풀이입니다.
import java.util.Scanner

fun main(args: Array<String>) {
    Scanner(System.`in`).run {
        val kg = nextInt()
        var n = -1
        
        // 5kg 0개에서 가능한 갯수 동안
        for (i in 0 .. (kg / 5)) {
            // 5kg을 제외한 3kg갯수가 딱맞을때
            if ((kg - (5 * i)) % 3 == 0)
                n = i + ((kg - (5*i)) / 3)
            else continue
        }
        
        println(n)
    }
}
