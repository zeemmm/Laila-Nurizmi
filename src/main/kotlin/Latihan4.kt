fun main() {
    try {
        val input = readLine()?.toInt()
        if (input == null) {
            throw IllegalArgumentException("Input tidak valid.")
        }
        if (input == 30) {
            println("Input anda sesuai dengan angka 20.")
        } else {
            println("Input anda tidak sesuai dengan angka 20.")
        }
    } catch (e: NumberFormatException) {
        println("Input harus berupa angka.")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    } finally {
        println("Program selesai.")
    }
}