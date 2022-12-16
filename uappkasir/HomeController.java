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
    private Button btnList;

    @FXML
    private Button btnPembelian;

    @FXML
    private Button btnEdit;

    

    @FXML
    void sendData(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pembelian.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnPembelian.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Pembelian");
    }

    @FXML
    void sendList(ActionEvent event) {

    }

    @FXML
    void sendEdit(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditProduk.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnEdit.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Edit Produk");
    }

}
