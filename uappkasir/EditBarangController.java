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
import javafx.stage.StageStyle;

public class EditBarangController implements Initializable{
    
    String query = null;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    Barang barang = null;

    @FXML
    private TableColumn<Barang, String> barCol;

    @FXML
    private Button btnBck;

    @FXML
    private TableColumn<Barang, Double> diskonCol;

    @FXML
    private TableColumn<Barang, String> expCol;

    @FXML
    private TableColumn<Barang, Double> hargaCol;

    @FXML
    private TableColumn<Barang, Integer> jumlahCol;

    @FXML
    private TableColumn<Barang, String> namaCol;

    @FXML
    private TableView<Barang> tableBarang;
    
   ObservableList<Barang> BarangList = FXCollections.observableArrayList();
    public void initialize (URL url, ResourceBundle rb){
        
        loadDate();
    }

    @FXML
    void getAdd(MouseEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("AddBarang.fxml"));
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
                        resultSet.getString("expired")));
                tableBarang.setItems(BarangList);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EditBarangController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
     }
    
    private void loadDate() {
        
        connection = DBHelper.getConnection();
        refreshTable();
        
        namaCol.setCellValueFactory(new PropertyValueFactory<>("nama_produk"));
        jumlahCol.setCellValueFactory(new PropertyValueFactory<>("jumlah"));
        barCol.setCellValueFactory(new PropertyValueFactory<>("barcode"));
        hargaCol.setCellValueFactory(new PropertyValueFactory<>("harga"));
        diskonCol.setCellValueFactory(new PropertyValueFactory<>("diskon"));
        expCol.setCellValueFactory(new PropertyValueFactory<>("expired"));
    }

    @FXML
    void sendBck(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditProduk.fxml"));
        Parent root = loader.load();
        
      
        Stage stage = (Stage) btnBck.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Cashier Machine");
    }

}
