/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Models.Reservation;
import Service.ReservationService;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ReservationController implements Initializable {
    
    ReservationService Rs = new ReservationService();
    

    @FXML
    private TextField nb_place;
    @FXML
    private TextField price;
    @FXML
    private Text id_client;
    @FXML
    private TextField client;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void valider(ActionEvent event) {
         if (nb_place.getText().length()==0||
                 
                 price.getText().length()==0){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText("Erreur de saisie !");
            alert.setContentText("Veuillez  remplir tous les champs"+ "");
            alert.show();
            return;
    }
         
        
        
        Reservation r = new Reservation();
        
        r.setNb_place(Integer.parseInt(nb_place.getText()));
        r.setPrice(Double.parseDouble(price.getText()));
        r.setClient(Integer.parseInt(client.getText()));
        Rs.addReservation(r);
    }

    @FXML
    private void afficher(ActionEvent event) {
        try {
            FXMLLoader loader= new FXMLLoader(getClass().getResource("./View_Reservatiob.fxml"));
            Parent view_2=loader.load();
            
            Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(view_2);
            stage.setScene(scene);
            stage.show();     
        } catch (IOException ex) {
            Logger.getLogger(ReservationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
