/*
 * 음계
 *
 * https://www.acmicpc.net/problem/2920
 */
fun main(args: Array<String>) {
    readLine()!!.split(" ").map { it.toInt() }.let { ns ->
        var order = when (ns[0]) {
            1 -> 1
            8 -> 2
            else -> 3
        }
        ns.forEachIndexed { idx, e ->
            order = when {
                (((idx + 1) == e) && (order == 1) ) -> 1
                (((ns.size - idx) == e) && (order == 2)) -> 2
                else -> {
                    println("mixed")
                    return
                }
            }
        }
        when (order) {
            1 -> println("ascending")
            2 -> println("descending")
            else -> println("mixed")
        }
    }
}
