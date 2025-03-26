package Praktikum.Pertemuan5;

/* Nama file  : Pengusaha.java
 * Deskripsi  : berisi atribut dan method dalam class Pengusaha
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 19 Maret 2025
 */ 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia {
    /* ---------------Atribut------------------ */
    private String npwp;
    private static int counterPengusaha = 0;
    
    /* ---------------Method------------------- */
    public Pengusaha() {
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    public Pengusaha(String nama, String tgl_mulai_kerja, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    public String getNpwp() {
        return npwp;
    }
    
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
    
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
    
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
    
    @Override
    public int hitungMasaKerja() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate tanggalMulai = LocalDate.parse(tgl_mulai_kerja, formatter);
            LocalDate now = LocalDate.now();
            
            int masaKerja = (int) ChronoUnit.YEARS.between(tanggalMulai, now);
            
            int B = 7;
            
            return masaKerja + B;
        } catch (Exception e) {
            System.out.println("Error format tanggal: " + e.getMessage());
            return 0;
        }
    }
    
    @Override
    public void cetakInfo() {
        System.out.println("=================================== INFORMASI PENGUSAHA ===================================");
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Pajak: Rp " + hitungPajak());
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("==========================================================================================");
    }
}
