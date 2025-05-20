package BangunDatar;

/* Nama file  : MainBangunDatar.java  
 * Deskripsi  : main program untuk menguji BangunDatarGenerik
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 8 Mei 2025
 */

public class MainBangunDatar {
    public static void main(String[] args) {
        BangunDatarGenerik<Persegi> pg = new BangunDatarGenerik<>(new Persegi(5));
        System.out.println("=== Persegi (S = 5) ==="); pg.tampilkan();

        System.out.println();
        BangunDatarGenerik<PersegiPanjang> pp = new BangunDatarGenerik<>(new PersegiPanjang(6,4));
        System.out.println("=== Persegi Panjang (6x4) ==="); pp.tampilkan();

        System.out.println();
        BangunDatarGenerik<Segitiga> sg = new BangunDatarGenerik<>(new Segitiga(4,3,3,4,5));
        System.out.println("=== Segitiga (Alas = 4,Tinggi = 3, S1 = 3, S2 = 4, S3 = 5) ==="); sg.tampilkan();
    }
}