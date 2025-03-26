package Praktikum.Responsi;

/* Nama file  : RuangFakultas.java
 * Deskripsi  : berisi atribut dan method dalam class RuangFakultas
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Maret 2025
 */

abstract class RuangFakultas extends Ruang {
    /* -------------------Atribut------------------- */
    private static double tarifKebersihan = 50000; // per m²
    
    /* -------------------Method-------------------- */
    public RuangFakultas(String kode, double panjang, double lebar, int kapasitas) {
        super(kode, panjang, lebar, kapasitas);
    }
    
    @Override
    public double hitungBiayaKebersihan() {
        return getPanjang() * getLebar() * tarifKebersihan;
    }
    
    public static void setTarifKebersihan(double tarif) {
        tarifKebersihan = tarif;
    }
    
    public static double getTarifKebersihan() {
        return tarifKebersihan;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis: Ruang Fakultas");
        System.out.println("Tarif Kebersihan: Rp " + tarifKebersihan + " per m²");
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan() + "\n");
    }
}