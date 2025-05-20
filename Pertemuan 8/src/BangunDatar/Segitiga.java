package BangunDatar;

/* Nama file  : Segitiga.java  
 * Deskripsi  : implementasi BangunDatar (segitiga)
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 8 Mei 2025
 */

public class Segitiga extends BangunDatar {
    private double alas, tinggi, a, b, c;
    public Segitiga(double alas, double tinggi, double a, double b, double c) {
        this.alas   = alas;
        this.tinggi = tinggi;
        this.a = a; this.b = b; this.c = c;
    }
    @Override
    public double luas() { return 0.5 * alas * tinggi; }
    @Override
    public double keliling() { return a + b + c; }
}