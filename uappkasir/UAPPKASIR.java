package uappkasir;

import db.DBHelper;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jdbc.ProdukModel;
import jdbc.makananModel;

public class UAPPKASIR extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Cashier Machine");
        stage.setScene(scene);
        stage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
        DBHelper.getConnection();
        
//        makananModel mkn= new makananModel();
//        Makanan mkn1= new Makanan("bo",0.5,1,0.5,1,1);
//        
//        mkn.hapusmakanan(mkn1);
        
//        ArrayList<Makanan> listMakanan = mkn.getmakanan();
//        
//        for(int i = 0;i < listMakanan.size(); i++){
//            System.out.println("nama_produk : " + listMakanan.get(i).getNama_produk());
//            System.out.println("Harga  : " + listMakanan.get(i).getHarga());
//            System.out.println("Jumlah : "+listMakanan.get(i).getJumlah());
//            System.out.println("Diskon  : " + listMakanan.get(i).getDiskon());
//            System.out.println("Id  : " + listMakanan.get(i).getId());
//            System.out.println("Daya Tahan  : " + listMakanan.get(i).getDaya_tahan());
//
//        }
        
    }
    
}
