package uappkasir;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeController {

 

    @FXML
    private Button btnKtgr;

    @FXML
    private Button btnProduk;

    @FXML
    private Button btnEdit;
    
    @FXML
    private Button btnPenjualan;


    

    @FXML
    void sendData(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pembelian.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnProduk.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Pembelian");
    }

    @FXML
    void sendKategori(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("kategori.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnKtgr.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Kategori");
    }

    @FXML
    void sendEdit(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditProduk.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnEdit.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Edit Produk");
    }
    
    @FXML
    void sendPembelian(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Penjualan.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnPenjualan.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Penjualan");
    }

}
