package AppFx;

import Model.Patient;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class formulaireController {
    
    @FXML
    public TextField Nom;

    @FXML
    private TextField Prenom;

    @FXML
    private RadioButton Male;

    @FXML
    private RadioButton Female;

    @FXML
    private TextField Age;

    @FXML
    private TextField Poids;

    @FXML
    private TextField Taille;

    @FXML
    void envoyer(ActionEvent event) throws IOException {
        
        Parent Home_Parent = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene Home_Scene = new Scene(Home_Parent);
        Stage home_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        home_stage.hide();
        home_stage.setScene(Home_Scene);
        home_stage.show();
        
        
        String gender ;
        if(Female.isSelected()){
            gender = "Female";
        }else{
            gender = "Male";
        }
        //Patient patient = new Patient(Nom.getText(),Prenom.getText(),gender,int.parseInteger(Age.getText()),double.parseDouble(Poids.getText()),double.parseDouble(Taille.getText()));
        Patient patient = new Patient() ;
        patient.setName(Nom.getText());
        patient.setPrenom(Prenom.getText());
        patient.setAge(Integer.parseInt(Age.getText()));
        patient.setSexe(gender);
        patient.setPoids(Double.parseDouble(Poids.getText()));
        patient.setPoids(Double.parseDouble(Taille.getText()));
        App.P1=patient;
        
        
       
        
    }

}
