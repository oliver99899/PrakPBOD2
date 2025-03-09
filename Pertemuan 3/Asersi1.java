/* Nama file  : Asersi1.java
 * Deskripsi  : program untuk menunjukkan asersi
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 5 Maret 2025
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0){
            System.out.println("X bilangan positif");
        }else{
            assert (x < 0):"Ada kesalahan kode";
            System.out.println("X bilangan negatif");
        }
    }
}
