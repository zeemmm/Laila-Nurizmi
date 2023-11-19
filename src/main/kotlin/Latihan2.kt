fun main() {
    val genap = mutableListOf<Int>()
    for (i in 1..100) {
        if (i % 2 == 0) {
            genap.add(i)
        }
    }

    val bulan = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

    bulan.forEach { (key, value) ->
        println("$key -> $value")
    }

    val monthNow = "Nov"
    val birthMonth = "Apr"

    println("It's $monthNow now, I was born in ${bulan[birthMonth]}")}