fun main() {

    val expectedEarnings = 500

    val day1Earnings = 750
    val day2Earnings = 600
    val day3Earnings = 200
    val day4Earnings = -100
    val day5Earnings = 1000

    val actualEarnings = (day1Earnings + day2Earnings + day3Earnings + day4Earnings + day5Earnings) / 5

    val isPromiseFulfilled = actualEarnings >= expectedEarnings
    println(isPromiseFulfilled)

}