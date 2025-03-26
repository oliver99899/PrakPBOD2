package Praktikum.Responsi;

/* Nama file  : Main.java
 * Deskripsi  : berisi implementasi class untuk ruang
 * Pembuat    : Oliver Gunawan Martua Sihaloho / 24060123130078
 * Tanggal    : 26 Maret 2025
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("==================== SISTEM INFORMASI RUANG FSM ====================\n");
        
        System.out.println("Membuat departemen");
        Departemen depInformatika = new Departemen("Informatika", "Dr. Siti Aminah", 45000);
        Departemen depMatematika = new Departemen("Matematika", "Prof. Budi Santoso", 40000);
        System.out.println("Departemen berhasil dibuat.\n");
        depInformatika.printInfo();
        depMatematika.printInfo();
        
        System.out.println("Membuat ruang kelas");
        RuangKelas kelas1 = new RuangKelas();
        kelas1.setKode("KL001");
        kelas1.setPanjang(8);
        kelas1.setLebar(6);
        kelas1.setKapasitas(40);
        kelas1.setJumlahKursiTersedia(38);
        kelas1.setJumlahKursiRusak(2);
        
        RuangKelas kelas2 = new RuangKelas("KL002", 10, 8, 60, 58, 2);
        System.out.println("Ruang kelas berhasil dibuat\n");
        kelas1.printInfo();
        kelas2.printInfo();

        
        System.out.println("Membuat laboratorium komputer...");
        LabKomputer labKom1 = new LabKomputer();
        labKom1.setKode("LK001");
        labKom1.setPanjang(12);
        labKom1.setLebar(8);
        labKom1.setKapasitas(30);
        labKom1.setNamaLab("Lab Komputer Dasar");
        labKom1.setHargaSewa(1000000);
        labKom1.setJumlahKomputer(30);
        
        LabKomputer labKom2 = new LabKomputer("LK002", 15, 10, 40, "Lab RPL", 150000, 40);
        System.out.println("Laboratorium komputer berhasil dibuat.\n");
        labKom1.printInfo();
        labKom2.printInfo();
        
        System.out.println("Membuat laboratorium non-komputer...");
        String[] mkBiologi = {"Biologi Dasar", "Mikrobiologi", "Genetika"};
        LabNonKomputer labBio = new LabNonKomputer();
        labBio.setKode("LB001");
        labBio.setPanjang(10);
        labBio.setLebar(8);
        labBio.setKapasitas(25);
        labBio.setNamaLab("Lab Biologi");
        labBio.setHargaSewa(1200000);
        labBio.setJenis(LabNonKomputer.JenisLab.BIOLOGI);
        labBio.setMataKuliah(mkBiologi);
        
        String[] mkFisika = {"Fisika Dasar", "Termodinamika", "Mekanika"};
        LabNonKomputer labFisika = new LabNonKomputer();
        labFisika.setKode("LF001");
        labFisika.setPanjang(12);
        labFisika.setLebar(10);
        labFisika.setKapasitas(30);
        labFisika.setNamaLab("Lab Fisika");
        labFisika.setHargaSewa(1300000);
        labFisika.setJenis(LabNonKomputer.JenisLab.FISIKA);
        labFisika.setMataKuliah(mkFisika);
        System.out.println("Laboratorium non-komputer berhasil dibuat.\n");
        labBio.printInfo();
        labFisika.printInfo();
        
        System.out.println("Membuat ruang departemen...");
        RuangDepartemen ruangInformatika = new RuangDepartemen();
        ruangInformatika.setKode("RD001");
        ruangInformatika.setPanjang(8);
        ruangInformatika.setLebar(6);
        ruangInformatika.setKapasitas(20);
        ruangInformatika.setDepartemen(depInformatika);
        ruangInformatika.setJumlahMeja(5);
        ruangInformatika.setJumlahKursi(15);
        ruangInformatika.setJumlahLemari(8);
        
        RuangDepartemen ruangMatematika = new RuangDepartemen();
        ruangMatematika.setKode("RD002");
        ruangMatematika.setPanjang(7);
        ruangMatematika.setLebar(5);
        ruangMatematika.setKapasitas(15);
        ruangMatematika.setDepartemen(depMatematika);
        ruangMatematika.setJumlahMeja(4);
        ruangMatematika.setJumlahKursi(12);
        ruangMatematika.setJumlahLemari(6);
        System.out.println("Ruang departemen berhasil dibuat.\n");
        ruangInformatika.printInfo();
        ruangMatematika.printInfo();
        
        System.out.println("Membuat ruang dosen...");
        RuangDosen ruangDosen1 = new RuangDosen();
        ruangDosen1.setKode("RD101");
        ruangDosen1.setPanjang(4);
        ruangDosen1.setLebar(3);
        ruangDosen1.setKapasitas(3);
        ruangDosen1.setDepartemen(depInformatika);
        ruangDosen1.setNamaDosen("Dr. Budi Setiawan");
        ruangDosen1.setJumlahKursi(3);
        ruangDosen1.setJumlahMeja(1);
        
        RuangDosen ruangDosen2 = new RuangDosen();
        ruangDosen2.setKode("RD102");
        ruangDosen2.setPanjang(4);
        ruangDosen2.setLebar(3);
        ruangDosen2.setKapasitas(3);
        ruangDosen2.setDepartemen(depMatematika);
        ruangDosen2.setNamaDosen("Prof. Anita Wijaya");
        ruangDosen2.setJumlahKursi(4);
        ruangDosen2.setJumlahMeja(1);
        System.out.println("Ruang dosen berhasil dibuat.\n");
        ruangDosen1.printInfo();
        ruangDosen2.printInfo();
        
        System.out.println("==================== INFORMASI JUMLAH RUANGAN ====================");
        System.out.println("Total Ruang Kelas: " + RuangKelas.getTotalRuangKelas());
        System.out.println("Total Laboratorium: " + Laboratorium.getTotalLaboratorium());
        System.out.println("  - Laboratorium Komputer: " + LabKomputer.getTotalLabKomputer());
        System.out.println("  - Laboratorium Non-Komputer: " + LabNonKomputer.getTotalLabNonKomputer());
        System.out.println("Total Ruang Departemen: " + RuangDepartemen.getTotalRuangDepartemen());
        System.out.println("Total Ruang Dosen: " + RuangDosen.getTotalRuangDosen() + "\n");
        

        System.out.println("==================== DEMONSTRASI PERUBAHAN TARIF KEBERSIHAN ====================");
        System.out.println("Biaya Kebersihan Lab Komputer sebelum perubahan tarif: Rp " + labKom1.hitungBiayaKebersihan());
        System.out.println("Mengubah tarif kebersihan fakultas dari Rp " + Fakultas.getTarifKebersihan() + " menjadi Rp 55000");
        Fakultas.setTarifKebersihan(55000);
        System.out.println("Biaya Kebersihan Lab Komputer setelah perubahan tarif: Rp " + labKom1.hitungBiayaKebersihan());
        
        System.out.println("\nBiaya Kebersihan Ruang Dosen sebelum perubahan tarif: Rp " + ruangDosen1.hitungBiayaKebersihan());
        System.out.println("Mengubah tarif kebersihan Departemen Informatika dari Rp " + depInformatika.getTarifKebersihan() + " menjadi Rp 50000");
        depInformatika.setTarifKebersihan(50000);
        System.out.println("Biaya Kebersihan Ruang Dosen setelah perubahan tarif: Rp " + ruangDosen1.hitungBiayaKebersihan() + "\n");
        
        // Demonstrasi penggunaan polimorfisme
        System.out.println("Menghitung total biaya kebersihan");
        Ruang[] daftarRuang = {kelas1,kelas2, labKom1, labKom2, labBio, labFisika, ruangInformatika, ruangMatematika, ruangDosen1, ruangDosen2};
        
        double totalBiaya = 0;
        for (int i = 0; i < daftarRuang.length; i++) {
            Ruang ruang = daftarRuang[i];
            double biaya = ruang.hitungBiayaKebersihan();
            System.out.println((i+1) + ". " + ruang.getKode() + ": Rp " + biaya);
            totalBiaya += biaya;
        }
        
        System.out.println("\nTotal biaya kebersihan seluruh ruang: Rp " + String.format("%,.0f", totalBiaya));
    }
}