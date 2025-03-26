package Praktikum.Pertemuan5;

/* Nama file  : Petani.java
 * Deskripsi  : berisi atribut dan method dalam class Petani
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 19 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia {
    /* ---------------Atribut------------------ */
    private String asal_kota;
    private static int counterPetani = 0;
    
    /* ---------------Method------------------- */
    public Petani() {
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }
    
    public Petani(String nama, String tgl_mulai_kerja, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }
    
    public String getAsal_kota() {
        return asal_kota;
    }
    
    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }
    
    @Override
    public double hitungPajak() {
        return 0;
    }
    
    @Override
    public int hitungMasaKerja() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate tanggalMulai = LocalDate.parse(tgl_mulai_kerja, formatter);
            LocalDate now = LocalDate.now();
            
            int masaKerja = (int) ChronoUnit.YEARS.between(tanggalMulai, now);
            
            int C = 0; 
            
            return masaKerja + C;
        } catch (Exception e) {
            System.out.println("Error format tanggal: " + e.getMessage());
            return 0;
        }
    }
    
    @Override
    public void cetakInfo() {
        System.out.println("=================================== INFORMASI PETANI =====================================");
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Pajak: Rp " + hitungPajak());
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("==========================================================================================");
    }
}