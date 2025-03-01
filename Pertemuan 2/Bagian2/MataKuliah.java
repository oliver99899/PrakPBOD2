/* Nama file  : MataKuliah.java
 * Deskripsi  : berisi atribut dan method dalam class MataKuliah
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Februari 2025
 */

package Bagian2;

public class MataKuliah {
    /********************Atribut********************/
    private String idMatkul;
    private String namaMatkul;
    private int sks;
    /********************Method*********************/
    public MataKuliah(){
        this.idMatkul = "-";
        this.sks = 0;
    }

    public MataKuliah(String idMatkul, int sks){
        this.idMatkul = idMatkul;
        this.sks = sks;
    }

    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNamaMatkul(String namaMatkul){
        this.namaMatkul = namaMatkul;
    }

    public void setSKS(int SKS){
        this.sks = SKS;
    }

    public String getIdMatkul(){
        return this.idMatkul;
    }

    public String getNamaMatkul(){
        return this.namaMatkul;
    }

    public int getSKS() {
        return this.sks;
    }
    
}


