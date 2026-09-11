fun main() {
    println("Tugas A.5 Analisis Karakter")
    while (true){
        print("Masukkan karakter: ")
        val input = readlnOrNull()

        if (!input.isNullOrEmpty()) {
            val karakter = input[0]

            println("Karakter       : $karakter")
            println("Kode karakter  : ${karakter.code}")
            println("Termasuk huruf : ${karakter.isLetter()}")
            println("Termasuk angka : ${karakter.isDigit()}")
            break
        } else {
            println("Input tidak valid. Harap masukkan sebuah karakter.")
            return
        }
    }
}