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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class MenuBarangController implements Initializable {

     @FXML
    private Button BtnNext;

    @FXML
    private Button btnBack;
    
    @FXML
    private Button BtnDpr;

    @FXML
    private Button BtnElk;

    @FXML
    private Button BtnInt;

    @FXML
    void Back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pembelian.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
        
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    @FXML
    void DprNext(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddBarang.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) BtnDpr.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    void ElekNext(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddBarang.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) BtnElk.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    void IntNext(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddBarang.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) BtnInt.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }
    
}
