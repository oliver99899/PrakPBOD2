package PostTest;
/* Nama file  : Programmer.java
 * Deskripsi  : berisi atribut dan method dalam class Programmer
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 24 April 2025
 */
public class Programmer extends Pegawai {
    private final int bonus = 450000;
    
    public Programmer(String nama) {
        super(nama);
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}