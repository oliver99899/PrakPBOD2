package Praktikum.Responsi;

/* Nama file  : RuangDepartemen.java
 * Deskripsi  : berisi atribut dan method dalam class RuangDepartemen
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Maret 2025
 */

class RuangDepartemen extends Ruang {
    /* -------------------Atribut------------------- */
    private Departemen departemen;
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;
    private static int totalRuangDepartemen = 0;

    /* -------------------Method-------------------- */    
    public RuangDepartemen() {
        super();
        this.departemen = null;
        this.jumlahMeja = 0;
        this.jumlahKursi = 0;
        this.jumlahLemari = 0;
        totalRuangDepartemen++;
    }
    
    public RuangDepartemen(String kode, double panjang, double lebar, int kapasitas, Departemen departemen, int jumlahMeja, int jumlahKursi, int jumlahLemari) {
        super(kode, panjang, lebar, kapasitas);
        this.departemen = departemen;
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        totalRuangDepartemen++;
    }
    
    public Departemen getDepartemen() {
        return departemen;
    }
    
    public int getJumlahMeja() {
        return jumlahMeja;
    }
    
    public int getJumlahKursi() {
        return jumlahKursi;
    }
    
    public int getJumlahLemari() {
        return jumlahLemari;
    }

    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }
    
    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }
    
    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
    
    public void setJumlahLemari(int jumlahLemari) {
        this.jumlahLemari = jumlahLemari;
    }
    
    public static int getTotalRuangDepartemen() {
        return totalRuangDepartemen;
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
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Lemari: " + jumlahLemari);
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan() + "\n");
    }
}