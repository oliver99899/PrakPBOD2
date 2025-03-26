package Praktikum.Responsi;

/* Nama file  : Fakultas.java
 * Deskripsi  : berisi atribut dan method dalam class Fakultas
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Maret 2025
 */

class Fakultas {
    /* -------------------Atribut------------------- */
    private static String nama;
    private static double tarifKebersihan;
    
    /* -------------------Method-------------------- */
    public Fakultas() {
        Fakultas.nama = "";
        Fakultas.tarifKebersihan = 0.0;
    }
    
    public Fakultas(String nama, String dekanFakultas, double tarifKebersihan) {
        Fakultas.nama = nama;
        Fakultas.tarifKebersihan = tarifKebersihan;
    }
    
    public static String getNama() {
        return nama;
    }
    
    public static void setNama(String namaFakultas) {
        nama = namaFakultas;
    }
    
    public static double getTarifKebersihan() {
        return tarifKebersihan;
    }
    
    public static void setTarifKebersihan(double tarif) {
        tarifKebersihan = tarif;
    }

    public static void printInfo() {
        System.out.println("Informasi Fakultas:");
        System.out.println("Nama: " + nama);
        System.out.println("Tarif Kebersihan: Rp " + tarifKebersihan + " per m²\n");
    }
}