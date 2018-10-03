/*
 * 나머지
 *
 * https://www.acmicpc.net/problem/10430
 */

// Scanner를 통한 풀이입니다.
import java.util.Scanner

fun main(args: Array<String>) {
    Scanner(System.`in`).run {
        val a = nextInt()
        val b = nextInt()
        val c = nextInt()
        
        println((a+b)%c)
        println((a%c+b%c)%c)
        println((a*b)%c)
        println(((a%c)*(b%c))%c)
    }
}
