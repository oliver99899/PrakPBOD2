/* Nama file  : Periode.java
 * Deskripsi  : berisi atribut dan method dalam class Periode
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 12 Maret 2025
 */

 public class Periode {
    /* -------------Atribut---------------- */
    private int tahun;
    private int bulan;
    private int hari;
    
    /* -------------Method---------------- */
    public Periode(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }
    
    public static Periode antara(Tanggal tanggalAwal, Tanggal tanggalAkhir) {
        int tahunSelisih = tanggalAkhir.getTahun() - tanggalAwal.getTahun();
        int bulanSelisih = tanggalAkhir.getBulan() - tanggalAwal.getBulan();
        int hariSelisih = tanggalAkhir.getHari() - tanggalAwal.getHari();
        
        if (hariSelisih < 0) {
            bulanSelisih--;
            hariSelisih += 30;
        }
        
        if (bulanSelisih < 0) {
            tahunSelisih--;
            bulanSelisih += 12;
        }
        
        return new Periode(tahunSelisih, bulanSelisih, hariSelisih);
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