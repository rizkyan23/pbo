/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uappkasir;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import jdbc.makananModel;


public class AddMakananController implements Initializable {
    
    @FXML
    private TextField DayaThnField;

    @FXML
    private TextField DiskonField;

    @FXML
    private TextField HargaField;

    @FXML
    private TextField IdField;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnCln;
    
    @FXML
    private TextField jumlahField;

    @FXML
     private TextField mknfld;
    
    @FXML
    private Text textAkh;
    
    @FXML
    private Button CnclBtn;
    
    
    String query = null;
    Connection connection = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement;
    Makanan mkn = null;
    private boolean update;
    int studentId;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }   
    
    @FXML
    void addMakanan(ActionEvent event) {
    makananModel mkn= new makananModel();
        double harga = Double.parseDouble(HargaField.getText());
        int jumlah=Integer.parseInt(jumlahField.getText());
        double diskon=Double.parseDouble(DiskonField.getText());
        int id=Integer.parseInt(IdField.getText());
        int daya_tahan=Integer.parseInt(DayaThnField.getText());
    
        Makanan mkn1= new Makanan(mknfld.getText(),harga, jumlah,diskon,id,daya_tahan);
        
        mkn.addmakanan(mkn1);
        
        textAkh.setText("Data Berhasil Dimasukkan");
        clear();
    }
    
    @FXML
    void deleteMakanan(ActionEvent event) {
        makananModel mkn= new makananModel();
        double harga = Double.parseDouble(HargaField.getText());
        int jumlah=Integer.parseInt(jumlahField.getText());
        double diskon=Double.parseDouble(DiskonField.getText());
        int id=Integer.parseInt(IdField.getText());
        int daya_tahan=Integer.parseInt(DayaThnField.getText());
    
        Makanan mkn1= new Makanan(mknfld.getText(),harga, jumlah,diskon,id,daya_tahan);
        
        mkn.hapusmakanan(mkn1);
        
         textAkh.setText("Data Berhasil Dihapus");
         clear();
    }
    
      @FXML
    void CnclMakanan(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("makanan.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) CnclBtn.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }
    
   
    
    void clear(){
    mknfld.clear();
    HargaField.clear();
    jumlahField.clear();
    DiskonField.clear();
    IdField.clear();
    DayaThnField.clear();
    
    } 
 
     void setUpdate(boolean b) {
        this.update = b;

    }
}
