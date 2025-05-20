package PostTest;
/* Nama file  : Manajer.java
 * Deskripsi  : berisi atribut dan method dalam class Manajer
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 24 April 2025
 */
public class Manajer extends Pegawai {
    private final int tunjangan = 700000;
    
    public Manajer(String nama) {
        super(nama);
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}