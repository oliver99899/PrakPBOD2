package Praktikum.Responsi;

/* Nama file  : Laboratorium.java
 * Deskripsi  : berisi atribut dan method dalam class Laboratorium
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Maret 2025
 */

abstract class Laboratorium extends Ruang {
    /* -------------------Atribut------------------- */
    private String namaLab;
    private double hargaSewa;
    private static int totalLaboratorium = 0;
    
    /* -------------------Method------------------- */
    public Laboratorium() {
        super();
        this.namaLab = "";
        this.hargaSewa = 0.0;
        totalLaboratorium++;
    }
    
    public Laboratorium(String kode, double panjang, double lebar, int kapasitas, String namaLab, double hargaSewa) {
        super(kode, panjang, lebar, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
        totalLaboratorium++;
    }
    
    public String getNamaLab() {
        return namaLab;
    }
    
    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setNamaLab(String namaLab) {
        this.namaLab = namaLab;
    }
    
    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    
    public static int getTotalLaboratorium() {
        return totalLaboratorium;
    }
    
    @Override
    public double hitungBiayaKebersihan() {
        return getPanjang() * getLebar() * Fakultas.getTarifKebersihan();
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Nama Laboratorium: " + namaLab);
        System.out.println("Harga Sewa: Rp " + hargaSewa);
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan() + "\n");
    }
}