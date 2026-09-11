fun cekGenapGanjil(bilangan: Int): String {
    return if (bilangan % 2 == 0) {
        "Genap"
    } else {
        "Ganjil"
    }
}

fun main() {
    println("Tugas C.3 Fungsi Genap atau Ganjil")
    val bilangan = 29
    println("Masukkan bilangan: $bilangan")
    println("$bilangan merupakan bilangan ${cekGenapGanjil(bilangan)}")
}