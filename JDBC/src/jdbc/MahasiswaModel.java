package jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import db.DBHelper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MahasiswaModel {
    private final Connection CONN;

    public MahasiswaModel() {
        this.CONN = DBHelper.getConnection();
    }
    
    public void addMahasiswa(Mahasiswa mhs){
        String insert = "INSERT INTO mahasiswa VALUES ('"
                + mhs.getNpm() + "', '" + mhs.getNama()
                + "');";
        try {
            if(CONN.createStatement().executeUpdate(insert) > 0){
                System.out.println("Berhasil Memasukkan Data");
            }else{
                System.out.println("Gagal Memasukkan Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memasukkan data");
        }
    }
    
    public void updateMahasiswa(Mahasiswa mhs){
        String update = "UPDATE mahasiswa SET npm = '"
                + mhs.getNpm() + "', nama = '" 
                + mhs.getNama() + "' WHERE npm = " + mhs.getUpdate();
        try {
            CONN.createStatement().executeUpdate(update);
            System.out.println("Berhasil Melakukan Update Data");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Melakukan Update Data");
        }
    }
    
    public void hapusMahasiswa(Mahasiswa mhs){
        String hapus = "DELETE FROM mahasiswa WHERE npm = '" + mhs.getNpm() + "'";
        try {
            CONN.createStatement().executeUpdate(hapus);
            System.out.println("Berhasil Menghapus Data");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Menghapus Data");
        }
    }
    
    public ArrayList<Mahasiswa> getMahasiswa(){
        String query = "SELECT * FROM mahasiswa";
        ArrayList<Mahasiswa> mhs = new ArrayList<>();
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
            while(rs.next()){
                Mahasiswa temp = new Mahasiswa(rs.getString("npm"), rs.getString("nama"));
                mhs.add(temp);
            }
            System.out.println("Berhasil Mengambil Data");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Mengambil Data");
        }
        return mhs;
    }
}
