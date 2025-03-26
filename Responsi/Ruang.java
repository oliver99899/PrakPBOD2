package Praktikum.Responsi;

/* Nama file  : Ruang.java
 * Deskripsi  : berisi atribut dan method dalam class Ruang
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Maret 2025
 */

abstract class Ruang {
    /* -------------------Atribut------------------- */
    private String kode;
    private double panjang;
    private double lebar;
    private int kapasitas;

    /* -------------------Method-------------------- */
    public Ruang() {
        this.kode = "";
        this.panjang = 0.0;
        this.lebar = 0.0;
        this.kapasitas = 0;
    }
    
    public Ruang(String kode, double panjang, double lebar, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.kapasitas = kapasitas;
    }
    
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }
    
    public abstract double hitungBiayaKebersihan();
    
    public void printInfo() {
        System.out.println("Informasi Ruang:");
        System.out.println("Kode: " + kode);
        System.out.println("Panjang: " + panjang + " m");
        System.out.println("Lebar: " + lebar + " m");
        System.out.println("Kapasitas: " + kapasitas + " orang\n");
    }
}