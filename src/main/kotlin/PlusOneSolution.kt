fun main(){
    var nums = intArrayOf(1, 2, 9)
    plusOne(nums)
}

fun plusOne(digits: IntArray): IntArray {

    for (i in  digits.size - 1 downTo 0){
        if (digits[i] == 9){
            digits[i] = 0
        }else {
            digits[i] = digits[i] + 1
            digits.forEach { print(it) }
            return digits
        }
    }
    val outputArr = IntArray(digits.size + 1)
    outputArr[0] = 1
    outputArr.forEach { print(it) }
    return outputArr
}