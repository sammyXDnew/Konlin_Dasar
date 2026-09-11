fun main() {
    println("Tugas A.4 Luas dan Keliling Lingkaran")
    print("Masukkan nilai r:")
    val r: Double = readln().toDouble()
    val PI: Double = 3.14159
    val luas: Double = PI*r*r
    val keliling: Double = 2*PI*r

    println("Nilai r : $r")
    println("Luas : $luas")
}