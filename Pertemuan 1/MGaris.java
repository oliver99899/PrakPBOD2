/* Nama file  : MGaris.java
 * Deskripsi  : main program untuk class garis
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 19 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {

        Titik T1 = new Titik(2, 3);
        Titik T2 = new Titik(5, 7);
        System.out.println("Titik Awal: " + T1.getAbsis() + ", " + T1.getOrdinat());
        System.out.println("Titik Akhir: " + T2.getAbsis() + ", " + T2.getOrdinat());

        Garis G1 = new Garis(T1, T2);
        System.out.println("\nGaris G1 dibuat dari Titik Awal ke Titik Akhir.");

        System.out.println("\nPanjang garis: " + G1.getPanjang());
        
        System.out.println("Gradien garis: " + G1.getGradien());
        
        Titik tengah = G1.getTitikTengah();
        System.out.println("Titik tengah garis: (" + tengah.getAbsis() + ", " + tengah.getOrdinat() + ")");
        
        Garis G2 = new Garis(new Titik(1, 1), new Titik(4, 5));
        System.out.println("\nGaris kedua dibuat:");
        G2.printGaris();

        System.out.println("Apakah garis pertama sejajar dengan garis kedua? " + G1.isSejajar(G2));
        System.out.println("Apakah garis pertama tegak lurus dengan garis kedua? " + G1.isTegakLurus(G2));
        System.out.println("\nPersamaan garis pertama: " + G1.getPersamaanGaris());
        System.out.println("Persamaan garis kedua: " + G2.getPersamaanGaris());
        System.out.println("\nJumlah objek garis yang telah dibuat: " + Garis.getCountGaris());
    }

}
