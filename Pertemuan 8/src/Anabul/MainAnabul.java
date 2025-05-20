package Anabul;
import java.util.ArrayList;
import java.util.Random;

/* Nama file  : MainAnabul.java  
 * Deskripsi  : simulasi semua bunyi dan gerakan tiap tipe Anabul
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 8 Mei 2025
 */

public class MainAnabul {
    public static void main(String[] args) {
        ArrayList<Anabul> daftar = new ArrayList<>();
        String[] namaSample = {"Tom","Jerry","Buddy","Lily","Oscar","Milo","Coco","Rex","Kiwi","Shadow"};
        Random rnd = new Random();
        for (String nama : namaSample) {
            int j = rnd.nextInt(3);
            switch(j) {
                case 0: daftar.add(new Kucing(nama)); break;
                case 1: daftar.add(new Anjing(nama)); break;
                default: daftar.add(new Burung(nama)); break;
            }
        }
        System.out.println("=== Koleksi Anabul ===");
        for (Anabul h : daftar) {
            System.out.println("---- " + h.getClass().getSimpleName() + " ----");
            h.gerak(); h.bersuara(); System.out.println();
        }
    }
}