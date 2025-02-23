public class DosenMain06 {
    public static void main(String[] args) {

        Dosen06 dosen1 = new Dosen06();
        Dosen06 dosen2 = new Dosen06("DOS-8907", "Dr. Yono Karbu", true, 2015, "Basis Data");
        
        System.out.println("\n===== Informasi Awal =====");
        dosen1.tampilInformasi();
        dosen2.tampilInformasi();
        
        System.out.println("\n===== Mengubah Status Aktif =====");
        dosen1.setStatusAktif(true);
        dosen2.setStatusAktif(false);
        
        System.out.println("\n===== Menghitung Masa Kerja =====");
        dosen1.hitungMasaKerja(2024);
        dosen2.hitungMasaKerja(2024);
        
        System.out.println("\n===== Mengubah Bidang Keahlian =====");
        dosen1.ubahKeahlian("Pemrograman Web");
        dosen2.ubahKeahlian("Machine Learning");
        
        System.out.println("\n===== Informasi Akhir =====");
        dosen1.tampilInformasi();
        dosen2.tampilInformasi();
    }
}