/* Nama file  : Main.java
 * Deskripsi  : berisi main method untuk menjalankan program
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 12 Maret 2025
 */
public class Main {
    public static void main(String[] args) {
        // Persegi Baru
        Persegi P1 = new Persegi(5.0, "Merah", "Hitam");
        
        // Lingkaran Baru
        Lingkaran L1 = new Lingkaran(10.0, "Biru", "Hijau");
        
        System.out.println("=== Informasi Persegi ===");
        P1.printInfo(); 
        P1.printSisiInfo(); 
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());
        System.out.println("Diagonal: " + P1.getDiagonal());
        
        System.out.println("\n=== Informasi Lingkaran ===");
        L1.printInfo(); 
        L1.printJariInfo();
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());
        
        System.out.println("\n=== Counter Objek ===");
        BangunDatar.printCounterBangunDatar();
    }
}