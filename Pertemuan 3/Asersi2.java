/* Nama file  : Asersi2.java
 * Deskripsi  : program untuk demo asersi, yang akan menolak input jari - jari lingkaran yang bernilai 0
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 5 Maret 2025
 */

class lingkaran {
    private double jarijari;
    public lingkaran(double jarijari){
        this.jarijari = jarijari;
    }

    public double hitungkeliling(){
        double keliling = 2*Math.PI *jarijari;
        return keliling;
    }

}

public class Asersi2 {
    public static void main(String[] args) {
        double jarijari = 0;
        assert (jarijari > 0):"Jari - jari tidak boleh nol";
        lingkaran l = new lingkaran(jarijari);
        double kelilinglingkaran = l.hitungkeliling();
        System.out.println("Keliling lingkaran = " + kelilinglingkaran);
    }
}

/* Jawaban : Secara konsep, program Asersi2.java kurang tepat karena asersi dalam Java tidak aktif secara default dan hanya berjalan 
jika program dijalankan dengan opsi -ea (enable assertions), sehingga jika dijalankan tanpa opsi ini, asersi tidak akan berfungsi dan 
nilai 0 untuk jariJari tetap diterima meskipun seharusnya tidak diperbolehkan. Selain itu, program langsung menginisialisasi jariJari 
dengan 0, yang jelas tidak memenuhi kondisi assert(jariJari > 0), menyebabkan kegagalan saat dijalankan dengan java -ea Asersi2. 
Selain itu, pembuatan objek Lingkaran dilakukan sebelum validasi yang tepat, sehingga jika assert dinonaktifkan, 
objek tetap akan dibuat dengan nilai jariJari = 0, yang bertentangan dengan tujuan validasi. */