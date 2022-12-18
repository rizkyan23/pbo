package uappkasir;

import static com.jfoenix.svg.SVGGlyphLoader.clear;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import jdbc.PenjualanModel;
import jdbc.PenjualanModel;

public class PenjualanController {

    @FXML
    private Button BtnAdd;

    @FXML
    private Button BtnClr;

    @FXML
    private Button Btncncl;

    @FXML
    private TextField HargaFld;

    @FXML
    private TextField StokFld;

    @FXML
    private TextField jumlahFld;
    
    @FXML
    private Text txt;
    
    String query = null;
    Connection connection = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement;
    Penjualan pjl = null;
    private boolean update;
    int studentId;

    @FXML
    void Add(ActionEvent event) {
        PenjualanModel pjl= new PenjualanModel();
        int jumlahProduk=Integer.parseInt(jumlahFld.getText());
        int harga=Integer.parseInt(HargaFld.getText());
        int stok=Integer.parseInt(StokFld.getText());
    
        Penjualan pjl1= new Penjualan(jumlahProduk,harga,stok);
        
        pjl.addPenjualan(pjl1);
        
        txt.setText("Data Berhasil Dimasukkan");
        clear();
    }

    @FXML
    void Cancel(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) Btncncl.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    void Clear(ActionEvent event) {
        PenjualanModel pjl= new PenjualanModel();
        int jumlahProduk=Integer.parseInt(jumlahFld.getText());
        int harga=Integer.parseInt(HargaFld.getText());
        int stok=Integer.parseInt(StokFld.getText());
    
        Penjualan pjl1= new Penjualan(jumlahProduk,harga,stok);
        
        pjl.hapusPenjualan(pjl1);
        
         txt.setText("Data Berhasil Dihapus");
         clear();

    }
    
     void clear(){
    jumlahFld.clear();
    HargaFld.clear();
    StokFld.clear();
    
    
    } 

}
