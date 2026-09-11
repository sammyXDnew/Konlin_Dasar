fun main() {
    println("Tugas B.5 Menghitung Nilai Akhir Mahasiswa")
    val namaMahasiswa = "Siti"
    val tugas = 85.0
    val kuis = 80.0
    val uts = 78.0
    val uas = 90.0

    val nilaiAkhir = (tugas * 0.25) + (kuis * 0.15) + (uts * 0.25) + (uas * 0.35)

    println("Nama Mahasiswa: $namaMahasiswa")
    println("Nilai Akhir: $nilaiAkhir")
}