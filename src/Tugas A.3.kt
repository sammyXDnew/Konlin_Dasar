fun main() {
    println("Tugas A.3 Konversi Tipe Data")
    print("Masukkan bilangan desimal: ")
    val bilangan: String = readln()
    val nilai1: Double = bilangan.toDouble()
    val nilai2: Int = nilai1.toInt()
    val nilai3: String = nilai1.toString()

    println("Nilai Double: $nilai1")
    println("Nilai Int: $nilai2")
    println("Nilai String: $nilai3")
}