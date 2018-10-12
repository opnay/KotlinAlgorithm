/*
 * 알파벳 찾기
 *
 * https://www.acmicpc.net/problem/10809
 */
fun main(args: Array<String>) {
    val w = readLine()!!
    ('a' .. 'z').forEach { c ->
        var pos = -1
        w.forEachIndexed { idx, s ->
            if ((s == c) && (pos == -1)) pos = idx
        }
        print(pos)
        if (c != 'z') print(" ")
    }
}
