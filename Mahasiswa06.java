class Mahasiswa06{

    String nama;
    String nim;
    String kelas;
    Double ipk;

    Mahasiswa06(String nama, String nim, String kelas, Double ipk){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

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
}