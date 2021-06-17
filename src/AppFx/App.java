/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppFx;

import Model.Patient;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author ahmed
 */
public class App  extends Application{
    public static Patient P1;
    public static ArrayList<String> Psymptoms =new ArrayList<String>();
    @Override
    public void start (Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("APPFXML.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Expert");
        stage.setScene(scene);
        stage.show();
    }
     public static void main(String[] args){
     launch(args);
 }
    
}
