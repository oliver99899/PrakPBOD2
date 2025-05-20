package PostTest;
/* Nama file  : Pegawai.java
 * Deskripsi  : berisi atribut dan method dalam class Pegawai
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 24 April 2025
 */
public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;
    
    public Pegawai(String nama) {
        this.nama = nama;
    }
        
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}