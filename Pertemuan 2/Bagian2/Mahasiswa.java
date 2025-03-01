/* Nama file  : Mahasiswa.java
 * Deskripsi  : berisi atribut dan method dalam class Mahasiswa
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Februari 2025
 */

 package Bagian2;

 import java.util.ArrayList;
 
 public class Mahasiswa {
     /********************Atribut********************/
     private String nim;
     private String nama;
     private String prodi;
     private ArrayList<MataKuliah> listMatkul; 
     private Dosen dosenWali; 
     private Kendaraan kendaraan;
     /********************Method*********************/
     public Mahasiswa(Dosen dosenWali){
         this.nim = "-";
         this.nama = "-";
         this.prodi = "-";
         this.listMatkul = new ArrayList<>();
         this.dosenWali = dosenWali;
         this.kendaraan = null;
         dosenWali.addMahasiswa(this);
     }
     
     public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali){
         this.nim = nim;
         this.nama = nama;
         this.prodi = prodi;
         this.listMatkul = new ArrayList<>();
         this.dosenWali = dosenWali;
         this.kendaraan = null;
         dosenWali.addMahasiswa(this);
     }
 
     public void addMatKul(MataKuliah matkul) {
         if (listMatkul.size() < 50) {
             listMatkul.add(matkul);
         } else {
             System.out.println("Mahasiswa tidak boleh mengambil lebih dari 50 mata kuliah!");
         }
     }
 
     /***************Getter & Setter*****************/
     public void setNim(String Nim){
         this.nim = Nim;
     }
 
     public void setNama(String Nama){
         this.nama = Nama;
     }
 
     public void setProdi(String Prodi){
         this.prodi = Prodi;
     }
 
     public String getNim() {
         return nim;
     }
 
     public String getNama() {
         return nama;
     }
 
     public String getProdi() {
         return prodi;
     }
 
     public ArrayList<MataKuliah> getListMatkul() {
         return listMatkul;
     }
 
     public Dosen getDosenWali() {
         return dosenWali;
     }
 
     public Kendaraan getKendaraan() {
         return kendaraan;
     }

     public void setDosenWali(Dosen dosenWaliBaru) {
        if (this.dosenWali != null) {
            this.dosenWali.hapusMahasiswa(this);
        }
        this.dosenWali = dosenWaliBaru;
        dosenWaliBaru.addMahasiswa(this); 
    }

    public void setKendaraan(Kendaraan kendaraanBaru) {
        if (this.kendaraan != null) {
            this.kendaraan.setPemilik(null); 
        }
        this.kendaraan = kendaraanBaru;
        if (kendaraanBaru != null) {
            kendaraanBaru.setPemilik(this); 
        }
    }
 
     public int getJumlahSKS() {
         int totalSKS = 0;
         for (MataKuliah matkul : listMatkul) {
             totalSKS += matkul.getSKS();
         }
         return totalSKS;
     }
 
     public int getJumlahMatKul() {
         return listMatkul.size();
     }
 
     public void printMhs() {
         System.out.println("NIM: " + nim);
         System.out.println("Nama: " + nama);
         System.out.println("Prodi: " + prodi);
     }
 
     public void printDetailMhs() {
         printMhs();
         System.out.println("Daftar Mata Kuliah:");
         for (MataKuliah matkul : listMatkul) {
             System.out.println(" - " + matkul.getNamaMatkul() + " (" + matkul.getSKS() + " SKS)");
         }
         System.out.println("Dosen Wali: " + dosenWali.getNamaDosen());
         if (kendaraan != null) {
             System.out.println("Kendaraan: " + kendaraan.getJenis() + " - " + kendaraan.getNoPlat());
         } else {
             System.out.println("Kendaraan: Tidak ada");
         }
     }
 }