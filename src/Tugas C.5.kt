// 1. Fungsi Penjumlahan
fun tambah(a: Double, b: Double): Double {
    return a + b
}

// 2. Fungsi Pengurangan
fun kurang(a: Double, b: Double): Double {
    return a - b
}

// 3. Fungsi Perkalian
fun kali(a: Double, b: Double): Double {
    return a * b
}

// 4. Fungsi Pembagian dengan pengecekan nilai 0
fun bagi(a: Double, b: Double): Double {
    if (b == 0.0) {
        println("Pesan Kesalahan: Pembagian dengan nol tidak diperbolehkan!")
        return Double.NaN
    }
    return a / b
}

fun main() {
    println("=== Kalkulator Sederhana ===")
    println("1. Penjumlahan")
    println("2. Pengurangan")
    println("3. Perkalian")
    println("4. Pembagian")
    print("Pilih operasi (1/2/3/4): ")

    val pilihan = readlnOrNull()?.toIntOrNull()

    if (pilihan != null && pilihan in 1..4) {
        print("Masukkan bilangan pertama (A): ")
        val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0

        print("Masukkan bilangan kedua (B): ")
        val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0

        val hasil: Double

        when (pilihan) {
            1 -> {
                hasil = tambah(a, b)
                println("Hasil Penjumlahan: $hasil")
            }
            2 -> {
                hasil = kurang(a, b)
                println("Hasil Pengurangan: $hasil")
            }
            3 -> {
                hasil = kali(a, b)
                println("Hasil Perkalian: $hasil")
            }
            4 -> {
                hasil = bagi(a, b)
                if (!hasil.isNaN()) {
                    println("Hasil Pembagian: $hasil")
                }
            }
        }
    } else {
        println("Pilihan operasi tidak valid. Silakan jalankan ulang program.")
    }
}