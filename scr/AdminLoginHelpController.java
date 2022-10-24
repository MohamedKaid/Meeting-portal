/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author moham
 */
public class AdminLoginHelpController implements Initializable {

    @FXML
    private Label Help;
    @FXML
    private Label Help1;
    @FXML
    private Label Help2;
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
      Help.setText("You should have Recived");
      Help1.setText("an AdminLogin.txt file that will");
      Help2.setText("have a Username and Password.");
    }    

    @FXML
    private void BackAction(ActionEvent event) throws IOException 
    {
        Stage stage2 = new Stage();
        Parent root = 
        FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        Scene scene = new Scene(root);
        stage2.setScene(scene);
       ((Node)(event.getSource())).getScene().getWindow().hide();
        stage2.show();
    }
    
}
