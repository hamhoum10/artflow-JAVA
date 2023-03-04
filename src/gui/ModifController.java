/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import interfaces.EnchereParticipantInterface;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import models.Enchere;
import services.EnchereService;

/**
 * FXML Controller class
 *
 * @author Elizabeth
 */
public class ModifController implements Initializable {

    EnchereParticipantInterface es = new EnchereService();

    Enchere e;

    private File selectedFile;

    @FXML
    private DatePicker datel;
    @FXML
    private TextField titre;
    @FXML
    private TextField desc;
    @FXML
    private TextField prixdepart;
    @FXML
    private Button img;
    @FXML
    private TextField imgfield;
    @FXML
    private ImageView imageview;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void getEnchere(Enchere e) {
        titre.setText(e.getTitre());
        desc.setText(e.getDescription());
        prixdepart.setText(String.valueOf(e.getPrixdepart()));
        datel.setValue(e.getDate_limite().toLocalDate());
        imgfield.setText((e.getImg()));

    }

    @FXML
    private void modifyEnch(ActionEvent event) throws IOException {

        LocalDate currentDate = LocalDate.now();
        LocalDate date = datel.getValue();

        if (titre.getText().length() == 0 || desc.getText().length() == 0 || datel.getValue() == null || imgfield.getText().length() == 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText("Erreur de saisie !");
            alert.setContentText(" veuillez remplir tous les champs" + "");
            alert.show();

        } else if (date.compareTo(currentDate) < 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erreur de saisie");
            alert.setHeaderText("Date sélectionnée invalide");
            alert.setContentText("La date sélectionnée doit être supérieure ou égale à la date actuelle.");
            alert.showAndWait();
        }

//        if (!prixdepart.getText().matches("\\d")) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("error");
//            alert.setHeaderText("input error !");
//            alert.setContentText("prix de depart doit contenir des chiffres" + "");
//            alert.show();
//        } 
        else {

            e.setTitre(titre.getText());
            e.setDescription(desc.getText());
            e.setPrixdepart(Double.parseDouble(prixdepart.getText()));

            e.setDate_limite(java.sql.Date.valueOf(date));
            e.setImg(imgfield.getText());

            es.updateEnchere(e);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("./AfficherEnchere.fxml"));
            Parent view_2 = loader.load();
            Scene scene = new Scene(view_2);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

    }

    @FXML
    private void takeImage(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Image File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.JPG", "*.gif"));
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        selectedFile = fileChooser.showOpenDialog(stage);
        if (selectedFile != null) {
            imgfield.setText(selectedFile.getName());
            try {
                Image images = new Image("file:" + selectedFile.getPath().toString());
                imageview.setImage(images);
                System.out.println(selectedFile.getPath().toString());
            } catch (Exception ex) {
                System.out.println(ex);
            }

        }

    }

}