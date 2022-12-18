package uappkasir;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PembelianController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnBrg;

    @FXML
    private Button btnMkn;

    @FXML
    void sendBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    void sendBrg(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuBarang.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnMkn.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Menu Barang");
    }

    @FXML
    void sendMkn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("makanan.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnMkn.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Menu Makanan");
    }

}
