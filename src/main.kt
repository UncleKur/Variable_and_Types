fun main() {
    //числа
    var numByte: Byte //(-128 +127)
    var numShort: Short // (-32768 +32767)
    var numInt: Int // (-2^31 +2^31-1)
    var numLong: Long // (-2^63 +2^63-1)
    var numFloat: Float // литерал f к числу с точкой
    var numDouble: Double

    //Логическая история
    /**
     * Нейминг лучше начинать со слов is, should, has (явлеятся, должен, имеет)
     * Иногда вместо этого применяют слово flag (флаг) на конце, так как логические переменные часто называют флагом
     * cancelFlag — «флаг отмены» (пример)
     * == проверка на равенсто
     * Конъюнкция, или логическое «и». В языке Kotlin записывается как &&
     * Дизъюнкция, или логическое «или». В языке Kotlin записывается как ||
     * Ещё знак | называют «пайп» (pipe)
     * -------------------------------------------------------
     * Из логических выражений выполняем по порядку:
     * Выражения в скобках.
     * Инверсия (логическое отрицание, НЕ).
     * Конъюнкция (логическое умножение, И).
     * Дизъюнкция (логическое сложение, ИЛИ).
     * */
    var isBool: Boolean
    var testNumbForBooleanVar: Int = 5


    isBool = testNumbForBooleanVar % 2 == 0
    println(isBool)

    //Символьная история
    /**
     * тип чар поддерживает управляющие символы \t, \b, \n, \t, \', \", \\ и \$
     * можно конвертировать в Int. Результатом будет код этого символа в таблице символов Unicode
     * */

    val charSymbol: Char = 'A'
    val charC = charSymbol + 2
    val letterByCode: Char = Char(42)
    println(charC)
    println(letterByCode)

    //Строки
    /**
     *
     * */
    //Длина строки $str$ - $length$ символов
    val longStr: String = "The longest str you've ever seen"
//    var resultString = "Length of " + "\"" + longStr + "\"" + longStr.length + " symbols."
//    println(resultString)
    val resultString = "Length of \"$longStr\" - ${longStr.length} symbols"
    println(resultString)

    val testStr = "Hello Kotlin!"
    println(testStr.contains("H"))
    println(testStr.contains("kotlin"))
    println(testStr.contains("kotlin", true))
    println(testStr.contains("world"))
    println()
    println(testStr.replace('l', 'L'))
    println(testStr.replace("l", "WOW"))
    println(testStr.replaceFirst("l", "WOW"))
    println(testStr.replaceFirst("Hel", "Dow"))
    println(testStr.replaceFirst("Kotlin", "Popkin"))

}

