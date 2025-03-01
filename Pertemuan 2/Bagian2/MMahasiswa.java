package Bagian2;

public class MMahasiswa {
    public static void main(String[] args) {
        Dosen dosenAndi = new Dosen("NIP001", "Dr. Andi", "Teknik Informatika");
        Dosen dosenBudi = new Dosen("NIP002", "Dr. Budi", "Sistem Informasi");
        
        MataKuliah[] matkuls = new MataKuliah[5];
        for(int i = 0; i < 5; i++) {
            matkuls[i] = new MataKuliah("MK" + (i+1), 3);
            matkuls[i].setNamaMatkul("Matkul " + (i+1));
        }
        
        Kendaraan kendaraanMhs1 = new Kendaraan("AB 1234 CD", "Mobil");
        
        Mahasiswa mhs1 = new Mahasiswa("24060xxx", "Alice", "Informatika", dosenAndi);
        Mahasiswa mhs2 = new Mahasiswa("24060yyy", "Bob", "Informatika", dosenBudi);
        
        // Menambahkan matkul dan kendaraan
        for(MataKuliah mk : matkuls) {
            mhs1.addMatKul(mk);
            mhs2.addMatKul(mk);
        }
        mhs1.setKendaraan(kendaraanMhs1);
        
        System.out.println("========== Mahasiswa 1 ==========");
        System.out.println("Total SKS: " + mhs1.getJumlahSKS());
        System.out.println("Jumlah Matkul: " + mhs1.getJumlahMatKul());
        mhs1.printDetailMhs();
        
        System.out.println("\n========== Mahasiswa 2 ==========");
        System.out.println("Total SKS: " + mhs2.getJumlahSKS());
        System.out.println("Jumlah Matkul: " + mhs2.getJumlahMatKul());
        mhs2.printDetailMhs();
    }
}