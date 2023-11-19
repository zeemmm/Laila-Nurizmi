fun main() {
    var health = 40
    var name: String? = null
    var age: Int = 0
    var height: Int = 0

    val hero = Hero()
    hero.setProfile("Hero", 23, 154)
    hero.profile()
    hero.jalan()
    hero.lari()
    hero.makan()
    hero.minum()
    hero.lompat()
    hero.duduk()
    hero.profile()
}

class Hero {
    var health = 40
    var name: String? = null
    var age: Int = 0
    var height: Int = 0

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Anda telah mati $name!!")
        }
    }

    fun jalan() {
        checkHealth()
        println("$name sedang berjalan...")
        health -= 1
    }

    fun lari() {
        checkHealth()
        println("$name sedang berlari...")
        health -= 3
    }

    fun makan() {
        checkHealth()
        println("$name sedang makan...")
        health += 1
    }

    fun minum() {
        checkHealth()
        println("$name sedang minum...")
        health += 1
    }

    fun lompat() {
        checkHealth()
        println("$name sedang lompat...")
        health -= 2
    }

    fun duduk() {
        checkHealth()
        println("$name sedang duduk...")
        health -= 1
    }

    fun setProfile(nama: String, umur: Int, tinggi: Int) {
        name = nama
        age = umur
        height = tinggi
    }
}