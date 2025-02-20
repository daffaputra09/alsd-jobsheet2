class MahasiswaMain06{

    String nama;
    String nim;
    String kelas;
    Double ipk;

    void tampilkanInformasi(){
        System.out.println("Nama : "+ nama);
        System.out.println("NIM : "+ nim);
        System.out.println("IPK : "+ ipk);
        System.out.println("Kelas : "+ kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIpk(Double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
            System.out.println("IPK berhasil diperbarui menjadi: " + ipk);
        } else {
            System.out.println("IPK tidak valid. Harus rentang 0.0 dan 4.0");
        }
    }

    String nilaiKinerja(){
        if (ipk >= 3.5){
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0){
            return "Kinerja baik";
        } else if (ipk >= 2.5){
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public static void main(String[] args) {  
        Mahasiswa06 mhs1 = new Mahasiswa06();  
        mhs1.nama = "Muhammad Ali Farhan";  
        mhs1.nim = "2241720117";  
        mhs1.kelas = "SI 2J";  
        mhs1.ipk = 3.55;  
 
        mhs1.tampilkanInformasi();  
        mhs1.ubahKelas("SI 2K");  
        mhs1.updateIpk(3.60);  
        mhs1.tampilkanInformasi();  

        Mahasiswa06 mhs2 = new Mahasiswa06("Annisa Nabila", "21417201610", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();


        Mahasiswa06 mhsDaffa = new Mahasiswa06("Daffa Putra Prasetya", "244107060088", 3.84, "SIB 1 C");
        mhsDaffa.tampilkanInformasi();


    }
}