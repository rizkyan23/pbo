/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

/**
 *
 * @author egyve
 */
public class Mahasiswa {
    private String npm;
    private String nama;
    private String Update;

    public Mahasiswa(String npm, String nama, String Update) {
        this.npm = npm;
        this.nama = nama;
        this.Update = Update;
    }

    public Mahasiswa(String npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUpdate() {
        return Update;
    }

    public void setUpdate(String Update) {
        this.Update = Update;
    }
}
