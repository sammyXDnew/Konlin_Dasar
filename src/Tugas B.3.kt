fun main() {
    println("Tugas B.3 Menghitung Total Belanja")
    val namaBarang = "Tas Ransel"
    val harga = 150000
    val jumlah = 2
    val diskon = 10

    val subtotal = harga * jumlah
    val potongan = subtotal * diskon / 100
    val totalBayar = subtotal - potongan

    println("Nama Barang: $namaBarang")
    println("Subtotal: Rp$subtotal")
    println("Potongan: Rp$potongan")
    println("Total Bayar: Rp$totalBayar")
}