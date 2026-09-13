class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    // Custom getter returns true if playCount is 1,000 or more
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

fun main() {
    val song1 = Song("Bohemian Rhapsody", "Queen", 1975, 2500000)
    val song2 = Song("Indie Track", "Local Artist", 2024, 450)

    song1.printDescription()
    println("Is popular: ${song1.isPopular}")

    println()

    song2.printDescription()
    println("Is popular: ${song2.isPopular}")
}
