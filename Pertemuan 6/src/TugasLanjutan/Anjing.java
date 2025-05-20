package TugasLanjutan;

/* Nama file  : Anjing.java
 * Deskripsi  : realisasi Anabul untuk anjing
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 24 April 2025
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Anjing " + nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println("Anjing " + nama + " bersuara: guk-guk.");
    }
}