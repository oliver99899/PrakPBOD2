/* Nama file  : MainLatihan.java
 * Deskripsi  : berisi kelas utama untuk menguji implementasi pegawai perguruan tinggi
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 12 Maret 2025
 */

 public class MainLatihan {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548", "78647324", "Andi", 
            new Tanggal("5-5-1990"),
            new Tanggal("1-1-2015"),
            5000000.0, "Fakultas Sains dan Matematika"
        );
        
        DosenTamu dosenTamu = new DosenTamu(
            "8475643657", "89756324", "Budi",
            new Tanggal("10-6-1985"),
            new Tanggal("1-2-2018"),
            4500000.0, "Fakultas Teknik",
            new Tanggal("31-12-2025")
        );
        
        Tendik tendik = new Tendik(
            "7654345234", "Charlie",
            new Tanggal("15-7-1988"),
            new Tanggal("1-3-2016"),
            3500000.0, "Akademik"
        );
        
        System.out.println("=== Detail Dosen Tetap ===");
        dosenTetap.printInfo();
        
        System.out.println("\n=== Detail Dosen Tamu ===");
        dosenTamu.printInfo();
        
        System.out.println("\n=== Detail Tenaga Kependidikan ===");
        tendik.printInfo();
    }
}