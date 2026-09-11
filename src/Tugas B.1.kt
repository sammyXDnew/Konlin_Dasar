fun main() {
    val nama: String = "Budi Santoso"
    val npm: String = "21081010001"
    var semester: Int = 3
    var ipk: Double = 3.45

    println("=== Data Mahasiswa (Awal) ===")
    println("Nama     : $nama")
    println("NPM      : $npm")
    println("Semester : $semester")
    println("IPK      : $ipk")
    println()

    semester = 4
    ipk = 3.75

    println("=== Data Mahasiswa (Setelah Diperbarui) ===")
    println("Nama     : $nama")
    println("NPM      : $npm")
    println("Semester : $semester")
    println("IPK      : $ipk")
}