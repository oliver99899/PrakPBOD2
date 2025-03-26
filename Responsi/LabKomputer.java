package Praktikum.Responsi;

/* Nama file  : LabKomputer.java
 * Deskripsi  : berisi atribut dan method dalam class LabKomputer
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Maret 2025
 */

class LabKomputer extends Laboratorium {
    /* -------------------Atribut------------------- */
    private int jumlahKomputer;
    private static int totalLabKomputer = 0;
    
    /* -------------------Method------------------- */
    public LabKomputer() {
        super();
        this.jumlahKomputer = 0;
        totalLabKomputer++;
    }
    
    public LabKomputer(String kode, double panjang, double lebar, 
                      int kapasitas, String namaLab, double hargaSewa, int jumlahKomputer) {
        super(kode, panjang, lebar, kapasitas, namaLab, hargaSewa);
        this.jumlahKomputer = jumlahKomputer;
        totalLabKomputer++;
    }
    
    public int getJumlahKomputer() {
        return jumlahKomputer;
    }
    
    public void setJumlahKomputer(int jumlahKomputer) {
        this.jumlahKomputer = jumlahKomputer;
    }

    public static int getTotalLabKomputer() {
        return totalLabKomputer;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis: Laboratorium Komputer");
        System.out.println("Jumlah Komputer: " + jumlahKomputer + "\n");
    }
}