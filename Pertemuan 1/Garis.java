/* Nama file  : Garis.java
 * Deskripsi  : berisi atribut dan method dalam class garis
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 19 Februari 2025
 */

public class Garis {
    /************Atribut**********/
    Titik TAwal;
    Titik TAkhir;
    static int countgaris;

    /***********Method************/
    Garis(){
        TAwal = new Titik();
        TAkhir = new Titik(1, 1);
        countgaris++;
    }

    Garis(Titik TAwal, Titik TAkhir) {
        this.TAwal = TAwal;
        this.TAkhir = TAkhir;
        countgaris++;
    }

    Titik getTAwal() {
        return TAwal;
    }

    void setTAwal(Titik TAwal) {
        this.TAwal = TAwal;
    }

    Titik getTAkhir() {
        return TAkhir;
    }

    void setTAkhir(Titik TAkhir) {
        this.TAkhir = TAkhir;
    }

    static int getCountGaris() {
        return countgaris;
    }

    double getPanjang() {
        return TAwal.getJarak(TAkhir);
    }

    double getGradien() {
        return (TAkhir.getOrdinat() - TAwal.getOrdinat()) / (TAkhir.getAbsis() - TAwal.getAbsis());
    }

    Titik getTitikTengah() {
        double Xtengah = (TAwal.getAbsis() + TAkhir.getAbsis()) / 2;
        double Ytengah = (TAwal.getOrdinat() + TAkhir.getOrdinat()) / 2;
        return new Titik(Xtengah, Ytengah);
    }

    boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    void printGaris() {
        System.out.println("Titik Awal: (" + TAwal.getAbsis() + ", " + TAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + TAkhir.getAbsis() + ", " + TAkhir.getOrdinat() + ")");
    }

    String getPersamaanGaris() {
        double m = getGradien();
        double c = TAwal.getOrdinat() - (m * TAwal.getAbsis());
        return "y = " + m + "x + " + c;
    }
}
