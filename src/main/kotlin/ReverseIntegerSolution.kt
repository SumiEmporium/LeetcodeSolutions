fun main() {

    reverse(-2147483648)

}

fun reverse(x: Int): Int {
    var isNegativeNum = false
    var number: Int = x
    if (x < 0) {
        number = -number
        isNegativeNum = true
    }

    var reverse: Long = 0
    while (number != 0) {
        val remainder = number % 10
        reverse = reverse * 10 + remainder
        number /= 10
    }

    return if (reverse > Int.MAX_VALUE || reverse<Int.MIN_VALUE) {
        0
    } else {
        if (isNegativeNum) {
            -reverse.toInt()
        } else {
            reverse.toInt()
        }

    }
}