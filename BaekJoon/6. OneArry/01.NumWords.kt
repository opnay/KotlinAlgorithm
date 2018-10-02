/*
 * 단어의 개수
 *
 * https://www.acmicpc.net/problem/1152
 */
fun main(args: Array<String>) {
    readLine()!!.split(" ").let { words ->
        var n = 0
        words.forEach {
            if (it != "") n += 1
        }
        println(n)
    }
}
