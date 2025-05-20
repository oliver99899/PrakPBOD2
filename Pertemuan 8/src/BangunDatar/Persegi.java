package BangunDatar;

/* Nama file  : Persegi.java  
 * Deskripsi  : implementasi BangunDatar (persegi)
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 8 Mei 2025
 */

public class Persegi extends BangunDatar {
    private double sisi;
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    @Override
    public double luas() { return sisi * sisi; }
    @Override
    public double keliling() { return 4 * sisi; }
}