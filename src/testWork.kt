fun main() {
    //замокать - заполнить программу какими-то данными, что бы получить результат работы программы
    val expectedEarnings = 500

    val day1Earnings = calculateEarningPerDay(6, 8)
    val day2Earnings = calculateEarningPerDay(3, 2)
    val day3Earnings = calculateEarningPerDay(4, 11)
    val day4Earnings = calculateEarningPerDay(7, 0)
    val day5Earnings = calculateEarningPerDay(3, 7)
    val day6Earnings = calculateEarningPerDay(0, 0)

    val actualEarnings = (day1Earnings + day2Earnings + day3Earnings + day4Earnings + day5Earnings + day6Earnings) / 6f

    val isPromiseFulfilled = actualEarnings >= expectedEarnings

    println(actualEarnings)
    println(isPromiseFulfilled)
}

fun calculateEarningPerDay(goodSteelWeight: Int, badSteelWeight: Int): Int {
    val goodSteelPrice = 120
    val badSteelPrice = 50
    val gasCostPerTrip = 300
    return goodSteelWeight * goodSteelPrice + badSteelWeight * badSteelPrice - gasCostPerTrip

}

/*
хороший металл стоил 110 рублей, а плохой — 55
Ответ: 514 средний чек, да выполнил обещание
затраты на бензин были бы 350 рублей, а не 300
Ответ: 482 ср. чек, нет не выполнил
на шестой день он поехал бы без жены и застрял в гараже с друзьями, ничего не добыв
Ответ: 472 ср. чек, нет не выполнил
**/
