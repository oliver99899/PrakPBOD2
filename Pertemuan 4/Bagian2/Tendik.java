/* Nama file  : Tendik.java
 * Deskripsi  : berisi atribut dan method dalam class Tendik
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 12 Maret 2025
 */

public class Tendik extends Pegawai {
   /* -------------Atribut---------------- */
   private String bidang;

   /* -------------Method---------------- */
   public Tendik(String NIP, String nama, Tanggal tanggalLahir, Tanggal TMT, double gajiPokok, String bidang) {
      super(NIP, nama, tanggalLahir, TMT, gajiPokok);
      this.bidang = bidang;
   }
   
   public String getBidang() {
      return bidang;
   }
   
   public void setBidang(String bidang) {
      this.bidang = bidang;
   }

   public double calculateTunjangan() {
      int tahunMasaKerja = this.calculateMasaKerja().getTahun();
      return 0.01 * tahunMasaKerja * this.gajiPokok;
   }

   public Tanggal calculateBUP() {
      Tanggal base = this.tanggalLahir.tambahTahun(55);
      return new Tanggal(1, base.getBulan() + 1, base.getTahun());
   }

   public void printInfo() {
      super.printInfo();
      String formatTanggal = "d MMMM yyyy";
      System.out.println("Bidang          : " + this.bidang);
      System.out.println("Jabatan         : Tenaga Kependidikan");
      System.out.println("BUP             : " + this.calculateBUP().format(formatTanggal));
      int tahunMasaKerja = this.calculateMasaKerja().getTahun();
      System.out.println("Tunjangan       : 1% x " + tahunMasaKerja + " x Rp " + String.format("%,.2f", this.gajiPokok) + " = Rp " + String.format("%,.2f", this.calculateTunjangan()));
   }
}