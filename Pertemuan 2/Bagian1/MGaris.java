/* Nama file  : MGaris.java
 * Deskripsi  : main program untuk class garis
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Februari 2025
 */

 public class MGaris {
     public static void main(String[] args) {
         Titik T1 = new Titik(1, 2);
         Titik T2 = new Titik(4, 6);
         Garis G1 = new Garis(T1, T2);
         G1.printGaris();
         
         System.out.println("Panjang garis: " + G1.getPanjang());
         System.out.println("Gradien: " + G1.getGradien());
         System.out.println("Titik tengah: " + 
             G1.getTitikTengah().getAbsis() + ", " + 
             G1.getTitikTengah().getOrdinat());
         
         Garis G2 = new Garis(new Titik(2,3), new Titik(5,7));
         System.out.println("\nSejajar? " + G1.isSejajar(G2));
         System.out.println("Tegak lurus? " + G1.isTegakLurus(G2));
         
         System.out.println("\nPersamaan G1: " + G1.getPersamaanGaris());
         System.out.println("Total garis: " + Garis.getCountGaris());
     }
 }