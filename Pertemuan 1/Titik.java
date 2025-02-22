/* Nama file  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class titik
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 19 Februari 2025
 */

 public class Titik {
    /**************Atribut*****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /**************Method******************/
    // Konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }

    Titik(double X, double Y){
        this.absis = X;
        this.ordinat = Y;
        counterTitik++;
    }

    static int getCountTitik(){
        return counterTitik;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double X){
        absis = X;
    }

    void setOrdinat(double Y){
        ordinat = Y;
    }

    void geser(double X, double Y){
        absis = absis + X;
        ordinat = ordinat + Y;
    }

    int getKuadran(){
        if (this.getAbsis() > 0 && this.getOrdinat() > 0){
            return 1;
        }else if(this.getAbsis() < 0 && this.getOrdinat() > 0){
            return 2;
        }else if(this.getAbsis() < 0 && this.getOrdinat() < 0){
            return 3;
        }else if(this.getAbsis() == 0 && this.getOrdinat() == 0){
            return 0;
        }else{
            return 4;
        }
    }

    double getJarakPusat() {
        return Math.sqrt((this.getAbsis() * this.getAbsis()) + (this.getOrdinat() * this.getOrdinat()));
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow((T.getAbsis() - this.getAbsis()),2) + Math.pow((T.getOrdinat() - this.getOrdinat()),2));
    }

    void refleksiX(){
        this.ordinat = this.getOrdinat() * -1;
    }

    void refleksiY(){
        this.absis = this.getAbsis() * -1;
    }

    void printTitik(){
        System.out.println ("Titik (" + absis + "," + ordinat + ")");
    }

    void printCountTitik(){
        System.out.println(this.counterTitik);
    }

    Titik getRefleksiX() {
        return new Titik(this.getAbsis(), this.getOrdinat() * -1);
    }

    Titik getRefleksiY() {
        return new Titik(this.getAbsis() * -1, this.getOrdinat());
    }

 }