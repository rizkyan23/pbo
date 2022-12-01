/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import db.DBHelper;
import java.util.ArrayList;

/**
 *
 * @author egyve
 */
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBHelper.getConnection();
        MahasiswaModel mhs = new MahasiswaModel();
        
       Mahasiswa mhs1 = new Mahasiswa("2117051060", "Rizky", "2117051000");
        mhs.updateMahasiswa(mhs1);

        Mahasiswa mhs2 = new Mahasiswa("2117051001", "King Arthur");
        //mhs.addMahasiswa(mhs2);
        
        
        ArrayList<Mahasiswa> listMahasiswa = mhs.getMahasiswa();
        
        for(int i = 0;i < listMahasiswa.size(); i++){
            System.out.println("Nama : " + listMahasiswa.get(i).getNama());
            System.out.println("NPM  : " + listMahasiswa.get(i).getNpm());
            System.out.println("");

        }
        
       mhs.hapusMahasiswa(mhs2);
//        mhs.hapusMahasiswa(mhs1);
    }
    
}
