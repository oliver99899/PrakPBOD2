/* Nama file  : Dosen.java
 * Deskripsi  : berisi atribut dan method dalam class Dosen
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Februari 2025
 */

 package Bagian2;

 import java.util.ArrayList;
 import java.util.List;
 
 public class Dosen {
     /********************Atribut********************/
     private String nip;
     private String namaDosen;
     private String prodiDosen;
     private List<Mahasiswa> mahasiswaPerwalian;
     /********************Method*********************/
     public Dosen(){
         this.nip = "-";
         this.namaDosen = "-";
         this.prodiDosen = "-";
         this.mahasiswaPerwalian = new ArrayList<>();
     }
     
     public Dosen(String nip, String namaDosen, String prodiDosen){
         this.nip = nip;
         this.namaDosen = namaDosen;
         this.prodiDosen = prodiDosen;
         this.mahasiswaPerwalian = new ArrayList<>();
     }
 
     public void addMahasiswa(Mahasiswa m) {
         if (!mahasiswaPerwalian.contains(m)) {
             mahasiswaPerwalian.add(m);
         }
     }
 
     public void hapusMahasiswa(Mahasiswa m) {
         mahasiswaPerwalian.remove(m);
     }
 
     /***************Getter & Setter*****************/
     public void setNip(String nip){
         this.nip = nip;
     }
 
     public void setNamaDosen(String namaDosen){
         this.namaDosen = namaDosen;
     }
     
     public void setProdiDosen(String prodiDosen){
         this.prodiDosen = prodiDosen;
     }
     
     public String getNip(){
         return this.nip;
     }
 
     public String getNamaDosen(){
         return this.namaDosen;
     }
     public String getProdiDosen(){
         return this.prodiDosen;
     }
 
     public List<Mahasiswa> getMahasiswaPerwalian() {
         return mahasiswaPerwalian;
     }
 }