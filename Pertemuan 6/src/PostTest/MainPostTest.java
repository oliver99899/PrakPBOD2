package PostTest;
/* Nama file  : MainPostTest.java
 * Deskripsi  : implementasi konsep MainPostTest
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 24 April 2025
 */
import java.util.ArrayList;

public class MainPostTest {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        
        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);
        
        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}
