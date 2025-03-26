package Praktikum.Responsi;

/* Nama file  : RuangDosen.java
 * Deskripsi  : berisi atribut dan method dalam class RuangDosen
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Maret 2025
 */

class RuangDosen extends Ruang {
    /* -------------------Atribut------------------- */
    private Departemen departemen;
    private String namaDosen;
    private int jumlahKursi;
    private int jumlahMeja;
    private static int totalRuangDosen = 0;
    
    /* -------------------Method-------------------- */
    public RuangDosen() {
        super();
        this.departemen = null;
        this.namaDosen = "";
        this.jumlahKursi = 0;
        this.jumlahMeja = 0;
        totalRuangDosen++;
    }
    
    public RuangDosen(String kode, double panjang, double lebar, int kapasitas, Departemen departemen, String namaDosen, int jumlahKursi, int jumlahMeja) {
        super(kode, panjang, lebar, kapasitas);
        this.departemen = departemen;
        this.namaDosen = namaDosen;
        this.jumlahKursi = jumlahKursi;
        this.jumlahMeja = jumlahMeja;
        totalRuangDosen++;
    }
    
    public Departemen getDepartemen() {
        return departemen;
    }
    
    public void setDepartemen(Departemen departemen){
        this.departemen = departemen;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen){
        this.namaDosen = namaDosen;
    }
    
    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi){
        this.jumlahKursi = jumlahKursi;
    }
    
    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public void setJumlahMeja(int jumlahMeja){
        this.jumlahMeja = jumlahMeja;
    }
    
    public static int getTotalRuangDosen() {
        return totalRuangDosen;
    }
    
    @Override
    public double hitungBiayaKebersihan() {
        return getPanjang() * getLebar() * (departemen != null ? departemen.getTarifKebersihan() : 0);
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        if (departemen != null) {
            System.out.println("Departemen: " + departemen.getNama());
            System.out.println("Ketua Departemen: " + departemen.getKetuaDepartemen());
        }
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan() + "\n");
    }
}