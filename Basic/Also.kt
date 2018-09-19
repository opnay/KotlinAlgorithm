/*
 * Also
 *
 * 코틀린의 기본 확장 함수로서, 람다식을 사용합니다.
 * also를 사용한 변수는 also의 람다식의 매개변수로 오게됩니다.
 * 람다식은 also를 사용한 변수를 리턴합니다.
 */

 fun main(args: Array<String>) {
     // "ABC"라는 문자열을 만들어 also라는 함수로 람다식을 실행합니다.
     // also는 자기자신을 리턴하므로, "ABC"가 오면서 str이라는 변수는 "ABC"가 대입됩니다.
     val str = "ABC".also { s -> println(s.length) }
     println(str)
 }
