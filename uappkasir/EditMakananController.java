package uappkasir;

import db.DBHelper;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class EditMakananController implements Initializable{

    String query = null;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    Makanan makanan = null;
    
    @FXML
    private Button BtnBck;
    
    @FXML
    private TableColumn<Makanan, Integer> dayaCol;

    @FXML
    private TableColumn<Makanan, Double> diskonCol;

    @FXML
    private TableColumn<Makanan, Double> hargaCol;

    @FXML
    private TableColumn<Makanan, Integer> idCol;

    @FXML
    private TableColumn<Makanan, Integer> jumlahCol;

    @FXML
    private TableColumn<Makanan, String> namaCol;

    @FXML
    private TableView<Makanan> tableMakanan;

    
    ObservableList<Makanan> MakananList = FXCollections.observableArrayList();
    @Override
    public void initialize (URL url, ResourceBundle rb){
        
        loadDate();
    }
    
    @FXML
    void getADD(MouseEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("AddMakanan.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EditMakananController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void getRefresh(MouseEvent event) {
        refreshTable();
    }
     private void refreshTable(){
         try {
            MakananList.clear();
            
            query = "SELECT * FROM `mkn`";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()){
                MakananList.add(new  Makanan(
                        resultSet.getString("nama_produk"),
                        resultSet.getDouble("harga"),
                        resultSet.getInt("jumlah"),
                        resultSet.getDouble("diskon"),
                        resultSet.getInt("id"),
                        resultSet.getInt("daya_tahan")));
                tableMakanan.setItems(MakananList);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EditMakananController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
     }

    private void loadDate() {
        
        connection = DBHelper.getConnection();
        refreshTable();
        
        namaCol.setCellValueFactory(new PropertyValueFactory<>("nama_produk"));
        jumlahCol.setCellValueFactory(new PropertyValueFactory<>("jumlah"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        hargaCol.setCellValueFactory(new PropertyValueFactory<>("harga"));
        diskonCol.setCellValueFactory(new PropertyValueFactory<>("diskon"));
        dayaCol.setCellValueFactory(new PropertyValueFactory<>("daya_tahan"));
         
         
    }
    
     @FXML
    void Back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditProduk.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) BtnBck.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Edit Produk");
    }
            }
    

                