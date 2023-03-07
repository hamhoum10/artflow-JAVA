/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author MediaStudio
 */
public class CategorieFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
        
//         try {
//            Parent root = FXMLLoader.load(getClass().getResource("./gui/FXMLAjouteCategorie.fxml"));
//            Scene scene = new Scene(root);
//            primaryStage.setTitle("workshopJavaFx");
//            primaryStage.setScene(scene);
//            primaryStage.show();
//        } catch (IOException ex) {
//            Logger.getLogger(ProjectFx.class.getName()).log(Level.SEVERE, null, ex);
//        }

 try {
            Parent root = FXMLLoader.load(getClass().getResource("./gui/FXMLAfficherCategorie.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("workshopJavaFx");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(ProjectFx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}