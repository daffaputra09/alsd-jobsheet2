public class MataKuliahMain06 {
    public static void main(String[] args) {

        MataKuliah06 mk1 = new MataKuliah06();
        MataKuliah06 mk2 = new MataKuliah06("PRAKALSD", "Praktikum Algoritma dan Struktur Data", 2, 6);
        
        System.out.println("\n===== Informasi Awal =====");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
        
        System.out.println("\n===== Mengubah SKS =====");
        mk1.ubahSKS(2);
        mk2.ubahSKS(4);
        
        System.out.println("\n===== Menambah Jam =====");
        mk1.tambahJam(4);
        mk2.tambahJam(4);
        
        System.out.println("\n===== Mengurangi Jam =====");
        mk1.kurangiJam(2);
        mk2.kurangiJam(10);
        
        System.out.println("\n===== Informasi Akhir =====");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
    }
}