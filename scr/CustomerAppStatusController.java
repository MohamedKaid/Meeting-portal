package FinalProject;

import com.jfoenix.controls.JFXTextField;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CustomerAppStatusController implements Initializable {

    
    @FXML
    private Label AppStatus;
    @FXML
    private JFXTextField Email;
   
    ArrayList <tableView> pending=new ArrayList<tableView>();
    ArrayList <tableView> approved=new ArrayList<tableView>();
    ArrayList <tableView> declind=new ArrayList<tableView>();
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void LogOutAction(ActionEvent event) throws IOException {
        
        Stage stage2 = new Stage();
        Parent root = 
        FXMLLoader.load(getClass().getResource("CustomerLogin.fxml"));
        Scene scene = new Scene(root);
        stage2.setScene(scene);
       ((Node)(event.getSource())).getScene().getWindow().hide();
        stage2.show();
    }

    @FXML
    private void BackAction(ActionEvent event) throws IOException 
    {
        Stage stage2 = new Stage();
        Parent root = 
        FXMLLoader.load(getClass().getResource("CustomerHomePage.fxml"));
        Scene scene = new Scene(root);
        stage2.setScene(scene);
       ((Node)(event.getSource())).getScene().getWindow().hide();
        stage2.show();
    }

    @FXML
    private void CheckAction(ActionEvent event) throws FileNotFoundException 
    {
    String customer,customerName1;
    String customerEmail1;
    String bizzName1;
    String bizzAddress1;
    String phoneNum1;
    String meetingDetails1;
    String date1;
    String time1;
    String employer1;
    
    
        java.io.File InputFile = new java.io.File("Appointments.txt");
        Scanner inputData = new Scanner(InputFile);
        while(inputData.hasNext())
            {
                customer = inputData.nextLine();
                tableView log= new tableView(customer);
                pending.add(log);
            }
             for(tableView info:pending)
                {
                    String user=info.toString();
                    String []Arr=user.split("/");
                    customerName1=Arr[0];
                    customerEmail1=Arr[1];
                    bizzName1=Arr[2];
                    bizzAddress1=Arr[3];
                    phoneNum1=Arr[4];
                    meetingDetails1=Arr[5];
                    date1=Arr[6];
                    time1=Arr[7];
                    employer1=Arr[8];
                    if(Email.getText().equals(customerEmail1))
                 {
                     AppStatus.setText("Pending");
                     break;
                 } }
        java.io.File InputAFile = new java.io.File("Accepted_Appointments.txt");
        Scanner inputAData = new Scanner(InputAFile);
        while(inputAData.hasNext())
            {
                customer = inputAData.nextLine();
                tableView log= new tableView(customer);
                approved.add(log);
            } 
             for(tableView info:approved)
                {
                    String user=info.toString();
                    String []Arr=user.split("/");
                    customerName1=Arr[0];
                    customerEmail1=Arr[1];
                    bizzName1=Arr[2];
                    bizzAddress1=Arr[3];
                    phoneNum1=Arr[4];
                    meetingDetails1=Arr[5];
                    date1=Arr[6];
                    time1=Arr[7];
                    employer1=Arr[8];
                    if(Email.getText().equals(customerEmail1))
                 {
                     AppStatus.setText("Approved");
                     break;
                 }}
        
        java.io.File InputDFile = new java.io.File("Decline_Appointments.txt");
        Scanner inputDData = new Scanner(InputDFile);
        while(inputDData.hasNext())
            {
                customer = inputDData.nextLine();
                tableView log= new tableView(customer);
                declind.add(log);
            } 
             for(tableView info:declind)
                {
                    String user=info.toString();
                    String []Arr=user.split("/");
                    customerName1=Arr[0];
                    customerEmail1=Arr[1];
                    bizzName1=Arr[2];
                    bizzAddress1=Arr[3];
                    phoneNum1=Arr[4];
                    meetingDetails1=Arr[5];
                    date1=Arr[6];
                    time1=Arr[7];
                    employer1=Arr[8];
                    if(Email.getText().equals(customerEmail1))
                 {
                     AppStatus.setText("Declined Make a new Appointment");
                     break;
                 }
                   
                   
                }
        
    }
    
}
