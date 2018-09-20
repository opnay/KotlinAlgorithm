/*
 * Lambda
 *
 * 코틀린의 람다식은 특별합니다.
 * 람다식 자체가 변수로서 사용이 가능합니다.
 */

fun main(args: Array<String>) {
    // 매개변수를 String으로 받는 람다식 변수 입니다.
    val test = { arg: String ->
        println(arg)
    }
    // 람다식을 실행하며, 매개변수로 "ABC"를 넘겨줍니다.
    test("ABC")

    // 아래의 TestFunc라는 함수를 실행합니다.
    // 마지막 매개변수가 람다식이면 함수()의 바깥에 작성할 수 있습니다.
    TestFunc {
        // TestFunc의 "CDE"가 this로 오게됩니다.
        println(this)
        println(this)

        // 람다식의 리턴값을 "ZXY"로 해줍니다.
        return@TestFunc "ZXY"
    }
}

// TestFunc라는 함수고, 매개변수는 람다식입니다.
// 람다식은 String이라는 클래스의 확장함수로, 매개변수는 없고, 리턴은 String입니다.
fun TestFunc(lambda: String.() -> String) {
    // TestFunc내에서만 String클래스의 확장함수인 lambda라는 함수가 존재합니다.
    // lambda라는 함수의 리턴값인 "ZXY"가 오게되며 출력하게됩니다.
    println("CDE".lambda())
}