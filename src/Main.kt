fun main() {

    //Задача 1
    val number = 12.3
    val number2 = number.toInt()
    val number3 = number2.toDouble()
    val binary = Integer.toBinaryString(number3.toInt())
    println("Ответ к задаче 1: $binary.0")
}

//Функция для задачи 2
fun <T> printBasicTypeOf(value: T) {
    when (value) {
        is String -> println("Это строка")
        is Double, is Float -> println("Это число с плавающей точкой")
        is Int, is Short, is Byte -> println("Это целое число")
        else -> println("Неизвестный тип")
    }
}

//Функция для задачи 3
fun <T> printTask3Answer(value: T) {
    when (value) {
        is Int -> println(value + 1)
        is Short -> println(value + 1)
        is Byte -> println(value + 1)
        is String -> println(value.length + 1)
        is IntArray -> println(value.sum())
    }
}