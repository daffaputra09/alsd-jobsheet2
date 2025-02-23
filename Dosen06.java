public class Dosen06 {
    private String idDosen;
    private String nama;
    private boolean statusAktif;
    private int tahunBergabung;
    private String bidangKeahlian;
    
    public Dosen06() {
        this.idDosen = "DOS-1809";
        this.nama = "Dr. Asep Strawberry";
        this.statusAktif = false;
        this.tahunBergabung = 2018;
        this.bidangKeahlian = "Pemrograman Java";
    }
    
    public Dosen06(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    
    public void tampilInformasi() {
        System.out.println("\nInformasi Dosen: " + nama);
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status dosen " + nama + " telah diubah menjadi: " + 
            (status ? "Aktif" : "Tidak Aktif"));
    }
    
    public int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa kerja dosen " + nama + ": " + masaKerja + " tahun");
        return masaKerja;
    }
    
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian dosen " + nama + " telah diubah menjadi: " + bidang);
    }
}
