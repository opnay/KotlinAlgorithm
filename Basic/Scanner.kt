/*
 * Scanner
 *
 * Scanner는 자바 클래스로서 사용되며, 코틀린에서 확장함수가 있는 클래스입니다.
 * 자바에서 콘솔입력을 쓸때 많이 사용되며, 코틀린에서 또한 사용 가능합니다.
 * 알고리듬 문제를 풀때 사용하기도 하지만, 대부분 코틀린에서 지원하는 기본 함수를 통해서도 풀 수 있습니다.
 */

// 자바 클래스로서 임포트가 필요합니다.
import java.util.Scanner

fun main(args: Array<String>) {
    // Scanner라는 객체를 생성합니다.
    // 코틀린 키워드중 let이라는 함수를 이용해
    // 람다식으로 변수를 사용해줍니다.
    // 굳이 let을 이용안하고 변수를 만들어 할당해도 됩니다.
    Scanner(System.`in`).let { sc ->
        // Scanner객체의 nextInt라는 메소드를 이용해
        // 입력된 정수를 가져옵니다.
        val line = sc.nextInt()

        // 가져온 정수를 출력합니다.
        println(line)
    }
}