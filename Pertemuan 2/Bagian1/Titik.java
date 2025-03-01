/* Nama file  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class titik
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Februari 2025
 */

 public class Titik {
     /**************Atribut*****************/
     private double absis;
     private double ordinat;
     private static int counterTitik = 0;
 
     /**************Method******************/
     public Titik(){
         this(0,0);
     }
 
     public Titik(double X, double Y){
         this.absis = X;
         this.ordinat = Y;
         counterTitik++;
     }
 
     public static int getCountTitik(){
         return counterTitik;
     }
 
     public double getAbsis(){
         return absis;
     }
 
     public double getOrdinat(){
         return ordinat;
     }
 
     public void setAbsis(double X){
         absis = X;
     }
 
     public void setOrdinat(double Y){
         ordinat = Y;
     }
 
     public void geser(double X, double Y){
         absis += X;
         ordinat += Y;
     }
 
     public int getKuadran(){
         if (absis > 0 && ordinat > 0) return 1;
         else if (absis < 0 && ordinat > 0) return 2;
         else if (absis < 0 && ordinat < 0) return 3;
         else if (absis == 0 && ordinat == 0) return 0;
         else return 4;
     }
 
     public double getJarakPusat() {
         return Math.sqrt(absis*absis + ordinat*ordinat);
     }
 
     public double getJarak(Titik T){
         return Math.sqrt(Math.pow(T.absis - absis, 2) + Math.pow(T.ordinat - ordinat, 2));
     }
 
     public void refleksiX(){
         ordinat *= -1;
     }
 
     public void refleksiY(){
         absis *= -1;
     }
 
     public void printTitik(){
         System.out.println("Titik (" + absis + "," + ordinat + ")");
     }
 
     public Titik getRefleksiX() {
         return new Titik(absis, -ordinat);
     }
 
     public Titik getRefleksiY() {
         return new Titik(-absis, ordinat);
     }
 }