package Anabul;
import java.util.ArrayList;

/* Nama file  : KoleksiAnabul.java  
 * Deskripsi  : kelas koleksi khusus Anabul dengan prosedur showAll
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 8 Mei 2025
 */

public class KoleksiAnabul {
    private ArrayList<Anabul> daftar = new ArrayList<>();

    public void add(Anabul a) { daftar.add(a); }
    public void delete(int idx) { daftar.remove(idx); }
    public int getSize() { return daftar.size(); }

    public void showAll() {
        System.out.println("=== Koleksi Anabul ===");
        for (Anabul a : daftar) {
            System.out.println("Nama   : " + a.getNama());
            System.out.print("Gerak  : "); a.gerak();
            System.out.print("Suara  : "); a.bersuara();
            System.out.println();
        }
    }
}