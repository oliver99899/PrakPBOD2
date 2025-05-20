package Koleksi;
import java.util.ArrayList;

/* Nama file  : Koleksi.java  
 * Deskripsi  : kelas generic Koleksi<T>
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 8 Mei 2025
 */

public class Koleksi<T> {
    private ArrayList<T> wadah = new ArrayList<>();
    private int nbelm = 0;

    public void add(T v) { wadah.add(v); nbelm = wadah.size(); }
    public T getIsi(int idx) { return wadah.get(idx); }
    public void setIsi(int idx, T v) { wadah.set(idx, v); }
    public void delete(int idx) { wadah.remove(idx); nbelm = wadah.size(); }
    public int getSize() { return nbelm; }
    public void showAll() {
        System.out.println("Isi Koleksi (size="+nbelm+"):");
        for (int i=0; i<wadah.size(); i++)
            System.out.printf(" [%d] %s\n", i, wadah.get(i));
    }
}