package Praktikum.Pertemuan5;

/* Nama file  : PNS.java
 * Deskripsi  : berisi atribut dan method dalam class PNS
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 19 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia {
    /* ---------------Atribut------------------ */
    private String nip;
    private static int counterPNS = 0;

    /* ---------------Method------------------- */
    public PNS() {
        super();
        this.nip = "";
        counterPNS++;
    }
    
    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    public PNS(String nama, String tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public static int getCounterPNS() {
        return counterPNS;
    }
    
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }
    
    @Override
    public int hitungMasaKerja() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate tanggalMulai = LocalDate.parse(tgl_mulai_kerja, formatter);
            LocalDate now = LocalDate.now();
            
            int masaKerja = (int) ChronoUnit.YEARS.between(tanggalMulai, now);
            
            int A = 8; 
            
            return masaKerja + A;
        } catch (Exception e) {
            System.out.println("Error format tanggal: " + e.getMessage());
            return 0;
        }
    }
    
    @Override
    public void cetakInfo() {
        System.out.println("=================================== INFORMASI PNS =========================================");
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Pajak: Rp " + hitungPajak());
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("===========================================================================================");
    }
}
