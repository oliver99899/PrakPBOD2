/* Nama file  : Garis.java
 * Deskripsi  : berisi atribut dan method dalam class garis
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Februari 2025
 */


 public class Garis {
     /************Atribut**********/
     private Titik TAwal;
     private Titik TAkhir;
     private static int countgaris = 0;
 
     /***********Method************/
     public Garis(){
         TAwal = new Titik();
         TAkhir = new Titik(1, 1);
         countgaris++;
     }
 
     public Garis(Titik TAwal, Titik TAkhir) {
         this.TAwal = TAwal;
         this.TAkhir = TAkhir;
         countgaris++;
     }
 
     public Titik getTAwal() {
         return TAwal;
     }
 
     public void setTAwal(Titik TAwal) {
         this.TAwal = TAwal;
     }
 
     public Titik getTAkhir() {
         return TAkhir;
     }
 
     public void setTAkhir(Titik TAkhir) {
         this.TAkhir = TAkhir;
     }
 
     public static int getCountGaris() {
         return countgaris;
     }
 
     public double getPanjang() {
         return TAwal.getJarak(TAkhir);
     }
 
     public double getGradien() {
         return (TAkhir.getOrdinat() - TAwal.getOrdinat()) / 
                (TAkhir.getAbsis() - TAwal.getAbsis());
     }
 
     public Titik getTitikTengah() {
         return new Titik(
             (TAwal.getAbsis() + TAkhir.getAbsis())/2,
             (TAwal.getOrdinat() + TAkhir.getOrdinat())/2
         );
     }
 
     public boolean isSejajar(Garis g) {
         return Math.abs(this.getGradien() - g.getGradien()) < 0.0001;
     }
 
     public boolean isTegakLurus(Garis g) {
         return Math.abs(this.getGradien() * g.getGradien() + 1) < 0.0001;
     }
 
     public void printGaris() {
         System.out.printf("Titik Awal: (%.2f, %.2f)\n", TAwal.getAbsis(), TAwal.getOrdinat());
         System.out.printf("Titik Akhir: (%.2f, %.2f)\n", TAkhir.getAbsis(), TAkhir.getOrdinat());
     }
 
     public String getPersamaanGaris() {
         double m = getGradien();
         double c = TAwal.getOrdinat() - m * TAwal.getAbsis();
         return String.format("y = %.2fx + %.2f", m, c);
     }
 }