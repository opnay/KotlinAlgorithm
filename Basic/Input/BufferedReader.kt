/*
 * BufferedReader
 * 이 클래스는 Java 클래스이며, Scanner라는 Java클래스와는 달리
 * 직접 InputStream으로 부터 버퍼를 읽어올 수 있는 클래스입니다.
 * 리눅스나 맥에서 이 예제를 `CompiledKt.jar < 파일이름`으로 실행하면,
 * 파이프를 통해 입력된 파일의 내용을 그대로 읽어와 출력할 수 있습니다.
 *
 * 일부 문제에서 이 방식을 이용해야합니다.
 */

// BufferedReader는 자바 클래스로 임포트가 필요합니다.
import java.io.BufferedReader

fun main(args: Array<String>) {
    // BufferedReader 객체를 생성합니다.
    // System의 in이라는 객체는
    // Kotlin의 키워드중 in이라는 이름과 충돌되어
    // `in`으로 사용됩니다.
   val br = BufferedReader(System.`in`.reader())

   // 생성된 객체의 함수인 forEachLine이라는 Kotlin 익스텐션 함수를 사용했습니다.
   // 후의 람다식으로 변수는 자동으로 it으로 지정되어 사용됩니다.
   // 이 줄은 생성된 객체를 통해 모든 입력이 들어있는 버퍼의 각 줄에 대해 출력해주는 부분입니다.
   br.forEachLine { println(it) }
}