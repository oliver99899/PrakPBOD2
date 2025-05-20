package Koleksi;

/* Nama file  : MainKoleksi.java  
 * Deskripsi  : main program untuk menguji Koleksi<T>
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 8 Mei 2025
 */

public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> kol = new Koleksi<>();
        for (char c='A'; c<='J'; c++) kol.add(c);
        kol.showAll();

        System.out.println("\nGet index 3: " + kol.getIsi(3));
        kol.setIsi(3, 'Z');
        System.out.println("Set index 3 ke 'Z':"); kol.showAll();

        kol.delete(5);
        System.out.println("Setelah delete index 5:"); kol.showAll();
    }
}