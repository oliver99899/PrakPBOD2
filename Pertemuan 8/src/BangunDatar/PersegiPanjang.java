package BangunDatar;

/* Nama file  : PersegiPanjang.java  
 * Deskripsi  : implementasi BangunDatar (persegi panjang)
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 8 Mei 2025
 */

public class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar   = lebar;
    }
    @Override
    public double luas() { return panjang * lebar; }
    @Override
    public double keliling() { return 2 * (panjang + lebar); }
}