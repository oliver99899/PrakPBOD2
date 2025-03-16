/* Nama file  : Dosen.java
 * Deskripsi  : berisi atribut dan method dalam class Dosen
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 12 Maret 2025
 */

public class Dosen extends Pegawai {
    /* -------------Atribut---------------- */
    protected String fakultas;
    
    /* -------------Method---------------- */
    public Dosen(String NIP, String nama, Tanggal tanggalLahir, Tanggal TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }
    
    public String getFakultas() {
        return fakultas;
    }
    
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas        : " + fakultas);
    }
}