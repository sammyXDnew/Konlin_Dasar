fun main() {
    println("Tugas B.2 Pertukaran Nilai Variabel")
    var a = 10
    var b = 20

    println("Sebelum ditukar:")
    println("A = $a")
    println("B = $b")

    println()
    val temp = a
    a = b
    b = temp

    println("Setelah ditukar:")
    println("A = $a")
    println("B = $b")
}