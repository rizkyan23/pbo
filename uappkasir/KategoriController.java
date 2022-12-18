package uappkasir;

import db.DBHelper;
import java.io.IOException;
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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class KategoriController implements Initializable{

    String query = null;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    Barang barang = null;
    
    @FXML
    private Button btnBack;

    @FXML
    private TableColumn<Barang, String> kategoriCol;

    @FXML
    private TableColumn<Barang, String> namaCol;

    @FXML
    private TableView<Barang> tableKategori;

    @FXML
    void getAdd(MouseEvent event) {

    }

    @FXML
    void getRefresh(MouseEvent event) {
        refreshTable();
    }

    @FXML
    void sendBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnBack.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }
    
    private void loadDate() {
        
        connection = DBHelper.getConnection();
        refreshTable();
        
        namaCol.setCellValueFactory(new PropertyValueFactory<>("nama_produk"));
        kategoriCol.setCellValueFactory(new PropertyValueFactory<>("kategori"));
    }
    
    ObservableList<Barang> BarangList = FXCollections.observableArrayList();
    
    @Override
    public void initialize (URL url, ResourceBundle rb){
        
        loadDate();
    }
    
    private void refreshTable(){
         try {
            BarangList.clear();
            
            query = "SELECT * FROM `brg`";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()){
                BarangList.add(new  Barang(
                        resultSet.getString("nama_produk"),
                        resultSet.getDouble("harga"),
                        resultSet.getInt("jumlah"),
                        resultSet.getDouble("diskon"),
                        resultSet.getString("barcode"),
                        resultSet.getString("expired"),
                        resultSet.getString("kategori")));
                tableKategori.setItems(BarangList);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EditBarangController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
     }

}
