/* Nama file  : Pegawai.java
 * Deskripsi  : berisi atribut dan method dalam class Pegawai
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 12 Maret 2025
 */

 public class Pegawai {
    /* -------------Atribut---------------- */
    protected String NIP;
    protected String nama;
    protected Tanggal tanggalLahir;
    protected Tanggal TMT;
    protected double gajiPokok;
    
    /* -------------Method---------------- */
    public Pegawai(String NIP, String nama, Tanggal tanggalLahir, Tanggal TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }
    
    public String getNIP() {
        return NIP;
    }
    
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Tanggal getTanggalLahir() {
        return tanggalLahir;
    }
    
    public void setTanggalLahir(Tanggal tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public Tanggal getTMT() {
        return TMT;
    }
    
    public void setTMT(Tanggal TMT) {
        this.TMT = TMT;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public Periode calculateMasaKerja() {
        return Periode.antara(TMT, Tanggal.sekarang());
    }
    
    public double calculateTunjangan() {
        // Akan di-override oleh subclass
        return 0;
    }
    
    public Tanggal calculateBUP() {
        // Akan di-override oleh subclass
        return null;
    }
    
    public void printInfo() {
        String formatTanggal = "d MMMM yyyy";
        Periode masaKerja = calculateMasaKerja();
        System.out.println("NIP             : " + NIP);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tanggalLahir.format(formatTanggal));
        System.out.println("TMT             : " + TMT.format(formatTanggal));
        System.out.println("Masa Kerja      : " + masaKerja.getTahun() + " tahun " + masaKerja.getBulan() + " bulan");
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
    }
}