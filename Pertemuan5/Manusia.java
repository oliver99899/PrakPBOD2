package Praktikum.Pertemuan5;

/* Nama file  : Manusia.java
 * Deskripsi  : berisi atribut dan method dalam class Manusia
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 19 Maret 2025
 */

public abstract class Manusia implements Pajak {
    /* ---------------Atribut------------------ */
    protected String nama;
    protected String alamat;
    protected String tgl_mulai_kerja;
    protected double pendapatan;
    protected static int counterMns = 0;
    
    /* ---------------Method------------------- */
    public Manusia() {
        this.nama = "";
        this.tgl_mulai_kerja = "00-00-0000";
        this.alamat = "";
        this.pendapatan = 0;
        counterMns++;
    }

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    public Manusia(String nama, String tgl_mulai_kerja, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.pendapatan = pendapatan;
        this.alamat = "";
        counterMns++;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }
    
    public double getPendapatan() {
        return pendapatan;
    }
    
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
    
    public static int getCounterMns() {
        return counterMns;
    }
    
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
    
    public abstract int hitungMasaKerja();
}