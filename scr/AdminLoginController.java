/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
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


public class AdminLoginController implements Initializable {

    @FXML
    private JFXTextField adminUser;
    @FXML
    private JFXPasswordField adminPassword;
    @FXML
    private Label foundLabel;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void AdminLoginAction(ActionEvent event) throws IOException 
    {
         if(adminUser.getText().equals("admin") 
                 && adminPassword.getText().equals("admin1234"))
        {
    
        Stage stage2 = new Stage();
        Parent root = 
        FXMLLoader.load(getClass().getResource("AdminHomePage.fxml"));
        Scene scene = new Scene(root);
        stage2.setScene(scene);
       ((Node)(event.getSource())).getScene().getWindow().hide();
        stage2.show();

        }
        else
        {
                 foundLabel.setText("Login Failed try again");
        }
    }

    @FXML
    private void ReturnAction(ActionEvent event) throws IOException 
    {
        Stage stage2 = new Stage();
        Parent root = 
        FXMLLoader.load(getClass().getResource("CustomerLogin.fxml"));
        Scene scene = new Scene(root);
        stage2.setScene(scene);
       ((Node)(event.getSource())).getScene().getWindow().hide();
        stage2.show();
    }

    
    @FXML
    private void adminHelp(ActionEvent event) throws IOException 
    {
        Stage stage2 = new Stage();
        Parent root = 
        FXMLLoader.load(getClass().getResource("AdminLoginHelp.fxml"));
        Scene scene = new Scene(root);
        stage2.setScene(scene);
       ((Node)(event.getSource())).getScene().getWindow().hide();
        stage2.show();
    }
    
}
