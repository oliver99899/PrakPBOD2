/* Nama file  : Burung.java  
 * Deskripsi  : realisasi Anabul untuk burung
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 8 Mei 2025
 */
package Anabul;

public class Burung extends Anabul {
    public Burung(String nama) { super(nama); }
    @Override public void gerak() { System.out.println("Burung " + nama + " bergerak dengan terbang."); }
    @Override public void bersuara() { System.out.println("Burung " + nama + " bersuara: cuit."); }
}