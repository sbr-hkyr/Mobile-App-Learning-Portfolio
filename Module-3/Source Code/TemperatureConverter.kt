fun main() {
    // Celsius to Fahrenheit
    printFinalTemperature(
        initialMeasurement = 27.0,
        initialUnit = "Celsius",
        finalUnit = "Fahrenheit",
        conversionFormula = { celsius -> (9.0 / 5.0) * celsius + 32 }
    )

    // Kelvin to Celsius
    printFinalTemperature(
        initialMeasurement = 350.0,
        initialUnit = "Kelvin",
        finalUnit = "Celsius",
        conversionFormula = { kelvin -> kelvin - 273.15 }
    )

    // Fahrenheit to Kelvin
    printFinalTemperature(
        initialMeasurement = 10.0,
        initialUnit = "Fahrenheit",
        finalUnit = "Kelvin",
        conversionFormula = { fahrenheit -> (5.0 / 9.0) * (fahrenheit - 32) + 273.15 }
    )
}

fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
