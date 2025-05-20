package TugasLanjutan;

/* Nama file  : Kucing.java
 * Deskripsi  : realisasi Anabul untuk kucing
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 24 April 2025
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Kucing " + nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing " + nama + " bersuara: meong.");
    }
}