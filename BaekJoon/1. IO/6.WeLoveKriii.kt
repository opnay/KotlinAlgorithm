/*
 * We love kriii
 *
 * https://www.acmicpc.net/problem/10718
 */

// Kotlin, Java에서의 한글출력은 기본적으로 지원되나, 일부환경에서는 글자가 깨집니다.
// 따라서, 수동으로 UTF-8로 설정해야합니다.
import java.io.PrintStream

fun main(args: Array<String>) {
    // UTF-8 인코딩으로 설정한 출력 스트림 객체를 생성합니다.
    PrintStream(System.out, true, "UTF-8").let {
        // 생성한 스트림객체를 통해 출력합니다.
        it.println("강한친구 대한육군")
        it.println("강한친구 대한육군")
    }
}
