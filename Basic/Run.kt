/*
 * Run
 *
 * 코틀린의 기본 확장함수인 `.run`입니다.
 * 매개변수는 람다식으로, 확장한 객체를 this로 받습니다.
 * 또한 자기자신을 리턴하면 추가적으로 확장함수를 달 수 있습니다.
 */

fun main(args: Array<String>) {
    val str = "가나다"
    str.run {
        // 오류
        // this += "라마바사아"
        
        println(this)

        // this로서 사용되어 str.length가 length로도 사용가능하다.
        println(length)

        // 이 run 람다식의 리턴값을 자기 자신으로 한다.
        // 람다식의 return은 생략이 가능하다.
        //return@run this
        this
    }
    println(str)

    // run의 리턴값을 str에 대입한다.
    str = str.run {
        // 가나다를 ABC로 바꾼다.
        replace("가나다","ABC")
        this
    }
    println(str)
}
