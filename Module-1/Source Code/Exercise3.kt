fun main() {
    birthdayGreeting1()
    birthdayGreeting2()
    val greeting = birthdayGreeting3()
    println(greeting)
    println(birthdayGreeting4("Bilge"))
    println(birthdayGreeting4("Meliha"))
    println(birthdayGreeting4("Azra"))
    println(birthdayGreeting5(name = "Ali", age = 22))
}

fun birthdayGreeting1() {
    println("Happy Birthday, Munevver!")
    println("You are now 21 years old!")
}

fun birthdayGreeting2(): Unit {
    println("Happy Birthday, Serife!")
    println("You are now 20 years old!")
}

fun birthdayGreeting3(): String {
    val nameGreeting = "Happy Birthday, Naz!"
    val ageGreeting = "You are now 20 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting4(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 20 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting5(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}
