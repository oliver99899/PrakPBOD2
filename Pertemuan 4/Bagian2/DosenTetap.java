/* Nama file  : DosenTetap.java
 * Deskripsi  : berisi atribut dan method dalam class DosenTetap
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 12 Maret 2025
 */

public class DosenTetap extends Dosen {
    /* -------------Atribut---------------- */
    private String NIDN;
    
    /* -------------Method---------------- */
    public DosenTetap(String NIP, String NIDN, String nama, Tanggal tanggalLahir, Tanggal TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }
    
    public String getNIDN() {
        return NIDN;
    }
    
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }
    
    @Override
    public double calculateTunjangan() {
        int masaKerjaTahun = calculateMasaKerja().getTahun();
        return 0.02 * masaKerjaTahun * gajiPokok;
    }
    
    @Override
    public Tanggal calculateBUP() {
        Tanggal base = tanggalLahir.tambahTahun(65);
        return new Tanggal(1, base.getBulan() + 1, base.getTahun());
    }
    
    @Override
    public void printInfo() {
        String formatTanggal = "d MMMM yyyy";
        Periode masaKerja = calculateMasaKerja();
        System.out.println("NIP             : " + NIP);
        System.out.println("NIDN            : " + NIDN);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tanggalLahir.format(formatTanggal));
        System.out.println("TMT             : " + TMT.format(formatTanggal));
        System.out.println("Masa Kerja      : " + masaKerja.getTahun() + " tahun " + masaKerja.getBulan() + " bulan");
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("BUP             : " + calculateBUP().format(formatTanggal));
        System.out.println("Tunjangan       : 2% x " + calculateMasaKerja().getTahun() + " x Rp " + 
        String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", calculateTunjangan()));
    }
}