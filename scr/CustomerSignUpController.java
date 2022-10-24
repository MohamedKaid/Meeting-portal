package FinalProject;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.BufferedWriter;
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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;



public class CustomerSignUpController implements Initializable {

    
    @FXML
    private JFXTextField customerUserName;
    @FXML
    private Label signUpLabel;
    @FXML
    private JFXPasswordField customerPassword;
    @FXML
    private JFXPasswordField reTypePassword;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void signUpAction(ActionEvent event) throws IOException 
    {
     
      
       String fileName="Customer.txt";
        
        
        if(customerUserName.getText().isEmpty())
                {
                   signUpLabel.setText("Username was not filled out correctly");
                }
        else if (customerPassword.getText().isEmpty())
                {
                    signUpLabel.setText("Password was not filled out");
                }
        else if (reTypePassword.getText().isEmpty())
                {
                    signUpLabel.setText("ReType Password was not filled out");
                }
        
        else if (reTypePassword.getText().matches(customerPassword.getText()) )
                {
                    
                    String userName=customerUserName.getText();
                    String userPassword=customerPassword.getText();
           
            Scanner inputData = new Scanner(fileName);
            while(inputData.hasNext())
            {
                String customerLogin1 = inputData.nextLine();
                String customerPassword1 = inputData.nextLine();
                    if (customerUserName.getText().equals(customerLogin1))
                    {
                        signUpLabel.setText("Username already taken");
                    }
                    
            }
              try(
                    PrintWriter pw = new PrintWriter(fileName);
                    ){
                pw.append(userName+"\n"+userPassword+"\n");
                    }
            
            
           
            
            Stage Homestage = new Stage();
            Parent root = 
            FXMLLoader.load(getClass().getResource("CustomerLogin.fxml"));
            Scene scene = new Scene(root);
            Homestage.setScene(scene);
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Homestage.show();
            
                }
        else
        {
            signUpLabel.setText("Passwords Don't Match");
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
    
}
