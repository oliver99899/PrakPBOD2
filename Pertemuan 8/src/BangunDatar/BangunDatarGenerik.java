package BangunDatar;

/* Nama file  : BangunDatarGenerik.java  
 * Deskripsi  : wrapper generic untuk tipe turunan BangunDatar
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 8 Mei 2025
 */

public class BangunDatarGenerik<T extends BangunDatar> {
    private T bangun;

    public BangunDatarGenerik(T bangun) {
        this.bangun = bangun;
    }

    public T getBangun() {
        return bangun;
    }

    public void setBangun(T bangun) {
        this.bangun = bangun;
    }

    public void tampilkan() {
        System.out.println("Luas    : " + bangun.luas());
        System.out.println("Keliling: " + bangun.keliling());
    }
}