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
     * */
    var isBool: Boolean
    var testNumbForBooleanVar: Int = 5


    isBool = testNumbForBooleanVar % 2 == 0
    println(isBool)
}