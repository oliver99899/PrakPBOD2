/* Nama file  : Persegi.java
 * Deskripsi  : berisi atribut dan method dalam class Persegi
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 12 Maret 2025
 */
public class Persegi extends BangunDatar {
    /* -------------Atribut---------------- */
    private double sisi;

    /* -------------Method----------------- */
    public Persegi() {
        setJmlSisi(4);
    }
    
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }
    
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public double getLuas() {
        return sisi * sisi;
    }
    
    public double getKeliling() {
        return 4 * sisi;
    }
    
    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }
    
    // Metode printInfo tidak bisa di-override karena final di superclass. Tetapi untuk menampilkan informasi bisa buat method baru
    public void printSisiInfo() {
        System.out.println("Sisi: " + sisi);
    }
}