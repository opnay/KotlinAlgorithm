/*
 * 빠른 A+B
 *
 * https://www.acmicpc.net/problem/15552
 *
 * 본 문제의 의도는 Java의 BufferedReader/Writer를 이용해 빠른 입출력을 하는것이다.
 * 기존의 방식대로하면 2000ms가 넘는 시간을 보여주지만,
 * BufferedReader/Writer를 이용하면 1000ms안으로도 끝낼 수 있다는 것을 보여준다.
 */

import java.io.BufferedReader
import java.io.BufferedWriter

fun main(args: Array<String>) {
    // Reader/Writer 객체
    val br = BufferedReader(System.`in`.reader())
    val bw = BufferedWriter(System.out.writer())

    // 첫줄은 읽어야할 갯수
    // 버퍼를 이용하기 때문에 버퍼의 끝을 알 수 있는 함수가 존재하기 때문에 필요없는 첫줄이 된다.
    // 읽기만하고 변수에 할당은 안한다.
    br.readLine()

    // 버퍼의 각줄에 대해 람다식을 사용한다.
    // 첫줄의 갯수는 이미 읽고 버린상태라 여기 람다식에서는 사용되지 않는다.
    br.forEachLine { it ->
        // 공백을 기준으로 나눈 리스트를 Int형 리스트로 변환
        val tmp = it.split(' ').map { it.toInt() }
        // 버퍼에 더한값을 저장한다.
        // toString을 안하면 숫자가 아스키코드로 인식되 다른 문자가 나온다.
        bw.write((tmp[0] + tmp[1]).toString())
        // println의 마지막 줄개행에 해당되는 부분
        bw.newLine()
    }

    // 버퍼 작성의 끝을 알리는 부분
    bw.flush()
}
