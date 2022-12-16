/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uappkasir;

import java.io.IOException;
import java.net.URL;
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
import jdbc.BarangModel;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class AddBarangController implements Initializable {

   @FXML
    private Button AddBtn;

    @FXML
    private TextField BrcdBrg;

    @FXML
    private Button ClnBtn;
    
    @FXML
    private Button CncelBtn;
     
    @FXML
    private TextField DiscBrg;

    @FXML
    private TextField ExpBrg;

    @FXML
    private TextField JmlBrg;

    @FXML
    private TextField NaBrg;

    @FXML
    private TextField hrgBrg;
    
    @FXML
    private Text TXT;

    @FXML
    void AddBarang(ActionEvent event) {
        BarangModel mkn= new BarangModel();
        double harga = Double.parseDouble(hrgBrg.getText());
        int jumlah=Integer.parseInt(JmlBrg.getText());
        double diskon=Double.parseDouble(DiscBrg.getText());
    
    
        Barang brg1= new Barang(NaBrg.getText(),harga, jumlah,diskon,BrcdBrg.getText(),ExpBrg.getText());
        
        mkn.addBarang(brg1);
        
        TXT.setText("Data Berhasil Dimasukkan");
        clear();
    }

    @FXML
    void CleanBarang(ActionEvent event) {
        BarangModel mkn= new BarangModel();
        double harga = Double.parseDouble(hrgBrg.getText());
        int jumlah=Integer.parseInt(JmlBrg.getText());
        double diskon=Double.parseDouble(DiscBrg.getText());
    
    
        Barang brg1= new Barang(NaBrg.getText(),harga, jumlah,diskon,BrcdBrg.getText(),ExpBrg.getText());
        
        mkn.hapusBarang(brg1);
        
        TXT.setText("Data Berhasil Dihapus");
        clear();
    }
    
    
        @FXML
    void CancelBarang(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuBarang.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) CncelBtn.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    void clear(){
    NaBrg.clear();
    hrgBrg.clear();
    JmlBrg.clear();
    DiscBrg.clear();
    BrcdBrg.clear();
    ExpBrg.clear();
    }
    
}
