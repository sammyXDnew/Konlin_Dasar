fun main() {
    println("Tugas B.4 Menghitung Gaji Bersih")
    val namaPegawai = "Budi Santoso"
    val gajiPokok = 5000000
    val tunjangan = 1000000
    val uangLembur = 500000
    val potongan = 200000

    val gajiKotor = gajiPokok + tunjangan + uangLembur
    val gajiBersih = gajiKotor - potongan

    println("Nama Pegawai: $namaPegawai")
    println("Gaji Kotor: Rp$gajiKotor")
    println("Gaji Bersih: Rp$gajiBersih")
}