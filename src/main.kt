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

    //Nullable типы
    //Null - это отсутствие ссылки у переменной (не ссылается ни на какую область памяти
    // "?." - safe-call оператор

    var notNullString: String = "I'm not nullable"
    var nullableString: String? = null
    var nullableString2: String?
    var nullableString3: String? = "Hello"

    println(nullableString?.uppercase())
    // println(nullableString2?.uppercase()) //must be initialized
    println(nullableString3?.uppercase())
    if (nullableString3 != null) {
        println(nullableString3.uppercase()) //safe-call оператор уже не используется после явной проверки
    }

    // "?:" - элвис оператор. Если значение не null, в нём используется значение переменной, если null, то значение справа
    var profession1: String? = "Крановщик"
    var profession2: String? = null
    val defaultAnswer = "Не указано"
    println(profession1 ?: defaultAnswer)
    println(profession2 ?: defaultAnswer)

    // "!!" - это не null
    //    val nullableString: String? = "not null string"
    //    val newString: String = nullableString так компилятор не даст собрать программу

    //Но прямо здесь в коде мы ввели её значение и точно знаем, что она не null,
    //поэтому можем с уверенностью применить оператор «!!»
    val nullableStringAssertOperator: String? = "not null string"
    val newString: String = nullableStringAssertOperator!!
    // но если в nullableStringAssertOperator попадёт null - программа крашнется
    val nullableStringAssertOperatorCrashTest: String? = null
    val newStringCrash: String = nullableStringAssertOperatorCrashTest!!
}

