fun main() {
    // task1 - print
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
    
    // task2 - debugging
    println("New chat message from a friend.")
    
    //task3 - debugging
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
    
    //task4 - debugging
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
    
    //task5 - formatting
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
    
    //task6 - math basic
    val firstNumber = 10
    val secondNumber = 17
    val thirdNumber = 7
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    val subtractResult = subtract(firstNumber, secondNumber)
    val anotherSubtractResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $subtractResult")
    println("$firstNumber - $thirdNumber = $anotherSubtractResult")
    
    //task7 - parameters
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
    
    //task8 - Pedometer
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories")
    
    //task9 - compare
    val result1 = compareScreenTime(timeSpentToday = 300, timeSpentYesterday = 250)
    println(result1) // Output: true

    val result2 = compareScreenTime(timeSpentToday = 300, timeSpentYesterday = 300)
    println(result2) // Output: false

    val result3 = compareScreenTime(timeSpentToday = 200, timeSpentYesterday = 220)
    println(result3) // Output: false
    
    //task10 - move into a function
    printCityWeather("Ankara", 27, 31, 82)
    printCityWeather("Tokyo", 32, 36, 10)
    printCityWeather("Cape Town", 59, 64, 2)
    printCityWeather("Guatemala City", 50, 55, 7)
}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedPerStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedPerStep
    return totalCaloriesBurned
}

fun compareScreenTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

fun printCityWeather(
    cityName: String, 
    lowTemp: Int, 
    highTemp: Int, 
    rainChance: Int
) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $rainChance%")
    println()
}
