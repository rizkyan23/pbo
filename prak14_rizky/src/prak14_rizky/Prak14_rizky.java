package prak14_rizky;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Prak14_rizky extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
//        
        Scene scene = new Scene(root);
//        
//        stage.setScene(scene);
//        stage.show();
//       Button btn = new Button("Click Me !");
//       Label txt = new Label("");
//       
//       btn.setOnAction(new EventHandler<ActionEvent>(){
//           
//        @Override
//        public void handle(ActionEvent event){
//            txt.setText("Hello Browww!");
//
//            }
//        });
//       
//       VBox root = new VBox();
//       root.setAlignment(Pos.CENTER);
//       root.getChildren().add(txt);
//       root.getChildren().add(btn);
//       
//       Scene scene = new Scene(root);
//       
//       stage.setHeight(300);
//       stage.setWidth(300);
       stage.setScene(scene);
       stage.setTitle("Rizky Abdillah - 2117051060");
       stage.show();
           
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
