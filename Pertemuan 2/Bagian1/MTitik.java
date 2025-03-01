/* Nama file  : MTitik.java
 * Deskripsi  : main program untuk class titik
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Februari 2025
 */

 public class MTitik {
     public static void main(String[] args){
         Titik T1 = new Titik();
         System.out.println("Titik awal:");
         T1.printTitik();
         
         T1.setAbsis(5);
         T1.setOrdinat(3);
         System.out.println("\nSetelah diubah:");
         T1.printTitik();
         
         System.out.println("\nKuadran: " + T1.getKuadran());
         System.out.println("Jarak ke pusat: " + T1.getJarakPusat());
         
         Titik T2 = new Titik(2, 4);
         System.out.println("Titik T2:");
         T2.printTitik();
         System.out.println("\nJarak ke T2: " + T1.getJarak(T2));
         
         T1.geser(1, -1);
         System.out.println("\nSetelah digeser:");
         T1.printTitik();
         
         System.out.println("\nRefleksi X:");
         T1.refleksiX();
         T1.printTitik();
         
         System.out.println("\nTotal titik: " + Titik.getCountTitik());
     }
 }