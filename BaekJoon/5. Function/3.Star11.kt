/*
 * 별찍기 - 11
 *
 * https://www.acmicpc.net/problem/1065
 *
 * 모양을 보게되면 가장작은 삼각형(1~3번줄 / 3x3)을 다음 줄에 복사해서 양옆으로 놓이게되는 모습이다.
 */

// 메인 함수
fun main(args: Array<String>) {
    // n = 3 * 2 ^ k (k <= 10)
    val n = readLine()!!.toInt()
    val floor = n / 3

    printStar(floor)
    line.forEach { println(it) }
}

// 복사할 삼각형 변수
// 초기는 3x3의 가장 작은 삼각형
var line = arrayListOf("  *  ", " * * ", "*****")

fun printStar(floor: Int) {
    var nGroup = 0
    var tmp = floor
    while (tmp > 1) {
        tmp /= 2
        nGroup += 1
    }

    // k == 0
    // 삼각형을 N번복사한다.
    for (i in 1 .. nGroup) {
        cloneLine()
    }
}

// line변수의 삼각형을 계속 복사해나간다.
fun cloneLine() {
    val tmp = ArrayList<String>()
    val margin = line.size
    line.forEach { str ->
        tmp.add(buildString {
            for (i in 1 .. margin) append(" ")
            append(str)
            for (i in 1 .. margin) append(" ")
        })
    }

    line.forEach { str ->
        tmp.add(buildString {
            append(str)
            append(" ")
            append(str)
        })
    }

    line = tmp
}
