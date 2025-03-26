package Praktikum.Responsi;

/* Nama file  : LabNonKomputer.java
 * Deskripsi  : berisi atribut dan method dalam class LabNonKomputer dengan enumerasi JenisLab
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Maret 2025
 */

class LabNonKomputer extends Laboratorium {
    /* -------------------Atribut------------------- */
    public enum JenisLab {
        BIOLOGI("Biologi"),
        FISIKA("Fisika"),
        KIMIA("Kimia");
        
        private final String nama;
        
        JenisLab(String nama) {
            this.nama = nama;
        }
        
        public String getNama() {
            return nama;
        }
    }
    
    private JenisLab jenis;
    private String[] mataKuliah;
    private static int totalLabNonKomputer = 0;

    /* -------------------Method-------------------- */
    public LabNonKomputer() {
        super();
        this.jenis = JenisLab.BIOLOGI;
        this.mataKuliah = new String[0];
        totalLabNonKomputer++;
    }
    
    public LabNonKomputer(String kode, double panjang, double lebar, int kapasitas, String namaLab, double hargaSewa, JenisLab jenis, String[] mataKuliah) {
        super(kode, panjang, lebar, kapasitas, namaLab, hargaSewa);
        this.jenis = jenis;
        this.mataKuliah = mataKuliah;
        totalLabNonKomputer++;
    }
    
    public LabNonKomputer(String kode, double panjang, double lebar, int kapasitas, String namaLab, double hargaSewa, String jenisStr, String[] mataKuliah) {
        super(kode, panjang, lebar, kapasitas, namaLab, hargaSewa);
        this.mataKuliah = mataKuliah;
        
        switch(jenisStr.toUpperCase()) {
            case "BIOLOGI":
                this.jenis = JenisLab.BIOLOGI;
                break;
            case "FISIKA":
                this.jenis = JenisLab.FISIKA;
                break;
            case "KIMIA":
                this.jenis = JenisLab.KIMIA;
                break;
        }
        
        totalLabNonKomputer++;
    }
    
    public JenisLab getJenis() {
        return jenis;
    }
    
    public String getJenisNama() {
        return jenis.getNama();
    }
    
    public String[] getMataKuliah() {
        return mataKuliah;
    }

    public void setJenis(JenisLab jenis) {
        this.jenis = jenis;
    }
    
    public void setMataKuliah(String[] mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public static int getTotalLabNonKomputer() {
        return totalLabNonKomputer;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jenis: Laboratorium " + jenis.getNama());
        System.out.println("Mata Kuliah yang Ditangani:");
        for (String mk : mataKuliah) {
            System.out.println("  - " + mk);
        }
        System.out.println("\n");
    }
}