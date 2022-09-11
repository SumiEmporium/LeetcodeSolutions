fun main() {

  //  isPalindrome(-121)

    isPalindromeStr("ABC")
}

fun isPalindrome(x: Int): Boolean {
    var number: Int = if (x < 0) {
        x * -1
    } else {
        x
    }

    var reverse = 0
    while (number != 0) {
        val remainder = number % 10
        reverse = reverse * 10 + remainder
        number /= 10
    }

    return x == reverse
}

fun isPalindromeStr(text: String): Boolean{

    val reversedText = text.reversed()

    println(reversedText)
    print(text == reversedText)
    return text == reversedText

}