package Praktikum.Responsi;

/* Nama file  : Departemen.java
 * Deskripsi  : berisi atribut dan method dalam class Departemen
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Maret 2025
 */

class Departemen {
    /* -------------------Atribut------------------- */
    private String nama;
    private String ketuaDepartemen;
    private double tarifKebersihan;
    
    /* -------------------Method-------------------- */
    public Departemen() {
        this.nama = "";
        this.ketuaDepartemen = "";
        this.tarifKebersihan = 0.0;
    }
    
    public Departemen(String nama, String ketuaDepartemen, double tarifKebersihan) {
        this.nama = nama;
        this.ketuaDepartemen = ketuaDepartemen;
        this.tarifKebersihan = tarifKebersihan;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getKetuaDepartemen() {
        return ketuaDepartemen;
    }
    
    public double getTarifKebersihan() {
        return tarifKebersihan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setKetuaDepartemen(String ketuaDepartemen) {
        this.ketuaDepartemen = ketuaDepartemen;
    }
    
    public void setTarifKebersihan(double tarifKebersihan) {
        this.tarifKebersihan = tarifKebersihan;
    }

    public void printInfo() {
        System.out.println("Informasi Departemen:");
        System.out.println("Nama: " + nama);
        System.out.println("Ketua Departemen: " + ketuaDepartemen);
        System.out.println("Tarif Kebersihan: Rp " + tarifKebersihan + " per m²\n");
    }
}