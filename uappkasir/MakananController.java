/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uappkasir;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class MakananController implements Initializable {
  @FXML
    private Button cncLbl;

    @FXML
    private Button nextLbl;
    
     @FXML
    private Button BtnJf;

    @FXML
    private Button BtnJfd;

    @FXML
    private Button BtnSf;

    @FXML
    void CncelA(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pembelian.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) cncLbl.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    void NextA(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddMakanan.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) nextLbl.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }
    
    @FXML
    void JF(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddMakanan.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) BtnJf.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    void JFD(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddMakanan.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) BtnJfd.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    @FXML
    void SF(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("AddMakanan.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) BtnSf.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
