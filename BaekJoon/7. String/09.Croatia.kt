/*
 * 크로아티아 알파벳
 *
 * https://www.acmicpc.net/problem/2941
 */
fun main(args: Array<String>) {
    val word = readLine()!!
    var num = 0
    word.forEachIndexed { idx, e ->
        num += 1
        if (idx != 0) {
            when ("${word[idx - 1]}$e") {
                "z=" -> {
                    num -= if ((idx >= 2) && (word[idx-2] == 'd')) 2
                        else 1
                }
                "c=" -> num -= 1
                "c-" -> num -= 1
                "d-" -> num -= 1
                "lj" -> num -= 1
                "nj" -> num -= 1
                "s=" -> num -= 1
                else -> {}
            }
        }
    }
    println(num)
}
