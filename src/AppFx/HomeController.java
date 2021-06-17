package AppFx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class HomeController {
    int i =0;
    String[] symptoms ={"headache","body_ache","conjunctivitis","chills","sore_throat","runny_nose","cough","sneezing","fever","swollen_glands","rash"};

    @FXML
    private Label Bonjour;
    
    
    @FXML
    private Label Symptom;

    @FXML
    private Label Name;
    @FXML
    private Button Ready;
    @FXML
    private Pane paneid;
    
    @FXML
    private Button non;

    @FXML
    private Button oui;
            @FXML
    private Pane panename;

  
    
    @FXML
    void ContinueAction(ActionEvent event) {
        Bonjour.setText("Bonjour");
        Name.setText(App.P1.getName());
        (paneid).setVisible(true);
        (paneid).setManaged(true);
        (Ready).setVisible(false);
        (Ready).setManaged(false);
         (panename).setVisible(true);
        (panename).setManaged(true);
        
        Symptom.setText(symptoms[i]);
        
    }
        @FXML
    void NonButton(ActionEvent event) {
        if(i<symptoms.length){
            i++;
            Symptom.setText(symptoms[i]);
        }
        
    }

    @FXML
    void OuiButton(ActionEvent event) {
        if(i<symptoms.length){
            i++;
            App.Psymptoms.add(Symptom.getText());
            Symptom.setText(symptoms[i]);
        }
    }

}

