package Praktikum.Responsi;

/* Nama file  : RuangKelas.java
 * Deskripsi  : berisi atribut dan method dalam class RuangKelas
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Maret 2025
 */

class RuangKelas extends Ruang {
    /* -------------------Atribut------------------- */
    private int jumlahKursiTersedia;
    private int jumlahKursiRusak;
    private static int totalRuangKelas = 0;
    
    /* -------------------Method-------------------- */
    public RuangKelas() {
        super();
        this.jumlahKursiTersedia = 0;
        this.jumlahKursiRusak = 0;
        totalRuangKelas++;
    }
    
    public RuangKelas(String kode, double panjang, double lebar, int kapasitas, int jumlahKursiTersedia, int jumlahKursiRusak) {
        super(kode, panjang, lebar, kapasitas);
        this.jumlahKursiTersedia = jumlahKursiTersedia;
        this.jumlahKursiRusak = jumlahKursiRusak;
        totalRuangKelas++;
    }
    
    public int getJumlahKursiTersedia() {
        return jumlahKursiTersedia;
    }

    public void setJumlahKursiTersedia(int jumlahKursiTersedia) {
        this.jumlahKursiTersedia = jumlahKursiTersedia;
    }
    
    public int getJumlahKursiRusak() {
        return jumlahKursiRusak;
    }
    
    public void setJumlahKursiRusak(int jumlahKursiRusak) {
        this.jumlahKursiRusak = jumlahKursiRusak;
    }

    public static int getTotalRuangKelas() {
        return totalRuangKelas;
    }
    
    @Override
    public double hitungBiayaKebersihan() {
        return getPanjang() * getLebar() * Fakultas.getTarifKebersihan();
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Kursi Tersedia: " + jumlahKursiTersedia);
        System.out.println("Jumlah Kursi Rusak: " + jumlahKursiRusak);
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan() + "\n");
    }
}