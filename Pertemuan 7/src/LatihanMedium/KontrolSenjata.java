package LatihanMedium;

/* Nama file  : KontrolSenjata.java
 * Deskripsi  : kontrol mekanisme menembak, isi peluru, dan bayonet pada sebuah Senjata
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 30 April 2025
 */

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
            return;
        }
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Menusuk berhasil";
        } else {
            return "Gagal menusuk, bayonet belum terpasang";
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}