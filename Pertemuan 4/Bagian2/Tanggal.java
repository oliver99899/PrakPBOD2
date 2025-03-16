/* Nama file  : Tanggal.java
 * Deskripsi  : berisi atribut dan method dalam class Tanggal
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 12 Maret 2025
 */

 public class Tanggal {
    /* -------------Atribut---------------- */
    private int tahun;
    private int bulan;
    private int hari;
    
    /* -------------Method---------------- */
    public Tanggal(int hari, int bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }
    
    public Tanggal(String tanggalStr) {
        String[] parts = tanggalStr.split("-");
        this.hari = Integer.parseInt(parts[0]);
        this.bulan = Integer.parseInt(parts[1]);
        this.tahun = Integer.parseInt(parts[2]);
    }
    
    public static Tanggal sekarang() {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        return new Tanggal(
            cal.get(java.util.Calendar.DAY_OF_MONTH),
            cal.get(java.util.Calendar.MONTH) + 1,
            cal.get(java.util.Calendar.YEAR)
        );
    }
    
    public String format(String pola) {
        if (pola.equals("d MMMM yyyy")) {
            return hari + " " + getNamaBulan(bulan) + " " + tahun;
        }
        return hari + "-" + bulan + "-" + tahun;
    }
    
    private String getNamaBulan(int bulan) {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        return namaBulan[bulan - 1];
    }
    
    public Tanggal tambahTahun(int jumlahTahun) {
        return new Tanggal(this.hari, this.bulan, this.tahun + jumlahTahun);
    }
    
    public int getTahun() { 
        return tahun; 
    }
    
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public int getBulan() { 
        return bulan; 
    }
    
    public void setBulan(int bulan) {
        this.bulan = bulan;
    }
    
    public int getHari() { 
        return hari; 
    }
    
    public void setHari(int hari) {
        this.hari = hari;
    }
}