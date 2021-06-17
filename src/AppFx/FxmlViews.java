/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppFx;

import java.util.ResourceBundle;

/**
 *
 * @author ahmed
 */
public enum FxmlViews {
    HOME{
        @Override
        public String getTitle(){
            return getStringFromResourceBundle("dfd");
        }
        @Override
        public String getFxmlFile(){
            return "APPFXML.fxml";
        }

        
    };
    public abstract String getTitle();
    public abstract String getFxmlFile();
    
    
    String getStringFromResourceBundle(String key) {
            return ResourceBundle.getBundle("bundle").getString(key) ;//To change body of generated methods, choose Tools | Templates.
        }
}
