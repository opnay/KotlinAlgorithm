/*
 * 셀프 넘버
 *
 * https://www.acmicpc.net/problem/4673
 */
fun main(args: Array<String>) {
    ArrayList((1 until 10000).toList()).also { arr ->
        (1 until 10000).toList().forEach { n ->
            arr.remove(getNum(n))
        }
        arr.forEach { println(it) }
    }
}

fun getNum(n: Int): Int {
    var answer = n
    var anotherN = n

    while (anotherN != 0) {
        answer += (anotherN % 10)
        anotherN /= 10
    }

    return answer
}
