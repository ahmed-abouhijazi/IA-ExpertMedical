package AppFx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class APPFXMLController{

    @FXML
    void StartButtonAction(ActionEvent event) throws IOException{
        Parent Formulaire_Parent = FXMLLoader.load(getClass().getResource("formulaire.fxml"));
        Scene Formulaire_Scene = new Scene(Formulaire_Parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(Formulaire_Scene);
        app_stage.show();
        
    }

}
