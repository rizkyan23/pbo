package uappkasir;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EditProdukController {

    @FXML
    private Button btnBck;

    @FXML
    private Button btnEditBrg;

    @FXML
    private Button btnEditMkn;

    @FXML
    void sendBck(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnBck.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    void sendEdtBrg(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditBarang.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnEditBrg.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Edit Barang");
    }

    @FXML
    void sendEdtMkn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("editMakanan.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnEditMkn.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Edit Makanan");
    }

}
