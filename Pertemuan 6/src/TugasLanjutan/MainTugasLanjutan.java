package TugasLanjutan;

/* Nama file  : MainTugasLanjutan.java
 * Deskripsi  : simulasi semua bunyi dan gerakan tiap tipe Anabul
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 24 April 2025
 */

import java.util.ArrayList;
public class MainTugasLanjutan {
    public static void main(String[] args) {
        ArrayList<Anabul> daftar = new ArrayList<>();
        daftar.add(new Kucing("Mimi"));
        daftar.add(new Anjing("Bobby"));
        daftar.add(new Burung("Tweety"));
        
        for (Anabul h : daftar) {
            System.out.println("---- " + h.getClass().getSimpleName() + " ----");
            h.gerak();
            h.bersuara();
            System.out.println();
        }
    }
}