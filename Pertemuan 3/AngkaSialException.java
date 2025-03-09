/* Nama file  : AngkaSialException.java
 * Deskripsi  : eksepsi buatan sendiri yang menolak angka 13
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 5 Maret 2025
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("Jangan memasukan angka 13 karena angka ini sial!!");
    }
}
