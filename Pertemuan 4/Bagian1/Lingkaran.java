/* Nama file  : Lingkaran.java
 * Deskripsi  : berisi atribut dan method dalam class Lingkaran
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 12 Maret 2025
 */
public class Lingkaran extends BangunDatar {
    /* -------------Atribut---------------- */
    private double jarijari;
    
    /* -------------Method----------------- */
    public Lingkaran() {
        setJmlSisi(1);
    }
    
    public Lingkaran(double jarijari, String warna, String border) {
        super(1, warna, border);
        this.jarijari = jarijari;
    }
    
    public double getJari() {
        return jarijari;
    }
    
    public void setJari(double jarijari) {
        this.jarijari = jarijari;
    }
    
    public double getLuas() {
        return Math.PI * jarijari * jarijari;
    }
    
    public double getKeliling() {
        return 2 * Math.PI * jarijari;
    }
    
    // Metode printInfo tidak bisa di-override karena final di superclass. Tetapi untuk menampilkan informasi bisa buat method baru
    public void printJariInfo() {
        System.out.println("Jari-jari: " + jarijari);
    }
}