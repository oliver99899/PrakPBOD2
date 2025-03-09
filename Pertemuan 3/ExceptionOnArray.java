/* Nama file  : ExceptionOnArray.java
 * Deskripsi  : program penggunaan eksepsi menggunakan class library java
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 5 Maret 2025
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi object array of integer
        Integer [] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("Clean up code...");
        }
    }
}
