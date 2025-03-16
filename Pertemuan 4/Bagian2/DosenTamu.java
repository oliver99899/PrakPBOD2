/* Nama file  : DosenTamu.java
 * Deskripsi  : berisi atribut dan method dalam class DosenTamu
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 12 Maret 2025
 */

public class DosenTamu extends Dosen {
    /* -------------Atribut---------------- */
    private String NIDK;
    private Tanggal tanggalBerakhirKontrak;
    
    /* -------------Method---------------- */
    public DosenTamu(String NIP, String NIDK, String nama, Tanggal tanggalLahir, Tanggal TMT, 
                     double gajiPokok, String fakultas, Tanggal tanggalBerakhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
    
    public String getNIDK() {
        return NIDK;
    }
    
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }
    
    public Tanggal getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }
    
    public void setTanggalBerakhirKontrak(Tanggal tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
    
    public Periode calculateMasaKontrak() {
        return Periode.antara(Tanggal.sekarang(), tanggalBerakhirKontrak);
    }
    
    @Override
    public double calculateTunjangan() {
        return 0.025 * gajiPokok; // 2,5% dari gaji pokok
    }
    
    @Override
    public void printInfo() {
        String formatTanggal = "d MMMM yyyy";
        Periode masaKerja = calculateMasaKerja();
        Periode masaKontrak = calculateMasaKontrak();
        System.out.println("NIP             : " + NIP);
        System.out.println("NIDK            : " + NIDK);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tanggalLahir.format(formatTanggal));
        System.out.println("TMT             : " + TMT.format(formatTanggal));
        System.out.println("Masa Kerja      : " + masaKerja.getTahun() + " tahun " + masaKerja.getBulan() + " bulan");
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Akhir Kontrak   : " + tanggalBerakhirKontrak.format(formatTanggal));
        System.out.println("Sisa Kontrak    : " + masaKontrak.getTahun() + " tahun " + masaKontrak.getBulan() + " bulan");
        System.out.println("Tunjangan       : 2,5% x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", calculateTunjangan()));
    }
}