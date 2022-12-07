package prak15_rizky;

public class Mahasiswa {
    private String npm;
    private String nama;
    private String alamat;

    public Mahasiswa(String npm, String nama, String alamat) {
        this.npm = npm;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
    
    
    
}
