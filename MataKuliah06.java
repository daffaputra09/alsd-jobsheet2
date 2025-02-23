public class MataKuliah06 {
    
    private String kodeMK;
    private String nama;
    private int sks;
    private int jumlahJam;
    
    public MataKuliah06() {
        this.kodeMK = "ALSD";
        this.nama = "Algoritma dan Struktur Data";
        this.sks = 2;
        this.jumlahJam = 4;
    }
    
    public MataKuliah06(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    
    public void tampilInformasi() {
        System.out.println("\nInformasi Mata Kuliah: " + kodeMK);
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS " + kodeMK + " berhasil diubah menjadi: " + sksBaru);
    }
    
    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam " + kodeMK + " berhasil ditambah. Jumlah jam sekarang: " + jumlahJam);
    }
    
    public void kurangiJam(int jam) {
        if (this.jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan karena jumlah jam tidak mencukupi");
            System.out.println("Jumlah jam saat ini: " + this.jumlahJam);
            System.out.println("Jam yang ingin dikurangi: " + jam);
        } else {
            this.jumlahJam -= jam;
            System.out.println("Pengurangan jam " + kodeMK + " berhasil. Jumlah jam sekarang: " + this.jumlahJam);
        }
    }
}