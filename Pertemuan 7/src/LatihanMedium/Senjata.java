package LatihanMedium;

/* Nama file  : Senjata.java
 * Deskripsi  : merepresentasikan sebuah senjata dengan bunyi, kapasitas peluru, dan mode menusuk
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 30 April 2025
 */

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
        this.menusuk = false;
    }

    public String getBunyi() {
        return bunyi;
    }
    public int getPeluru() {
        return peluru;
    }
    public boolean isMenusuk() {
        return menusuk;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}