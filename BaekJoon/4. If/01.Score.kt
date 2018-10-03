/*
 * 세 수
 *
 * https://www.acmicpc.net/problem/10817
 */
import java.util.Scanner

fun main(args: Array<String>) {
    Scanner(System.`in`).let {
        val n1 = it.nextInt()
        val n2 = it.nextInt()
        val n3 = it.nextInt()
        var tmp = n1

        if (n1 in n2 .. n3 || n1 in n3 .. n2) tmp = n1
        if (n2 in n1 .. n3 || n2 in n3 .. n1) tmp = n2
        if (n3 in n1 .. n2 || n3 in n2 .. n1) tmp = n3


        println(tmp)
    }
}
