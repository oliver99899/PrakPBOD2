package TugasLanjutan;

/* Nama file  : Anabul.java
 * Deskripsi  : kelas induk untuk hewan peliharaan (polimorfisme)
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 24 April 2025
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}