/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.util.Calendar;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author Moe Kaid
 */
public class CustomerHomePageController implements Initializable {

    @FXML
    private JFXTextField CustomerName;
    @FXML
    private JFXTextField CustomerEmail;
    @FXML
    private JFXTextField BizzName;
    @FXML
    private JFXTextField BizzAddress;
    @FXML
    private JFXTextField PhoneNum;
    @FXML
    private JFXTextArea MeetingDetails;
    private JFXDatePicker Date;
    @FXML
    private ComboBox<String> Time;
    @FXML
    private ComboBox<String> Employer;
    @FXML
    private Label LabelStatus;
    @FXML
    private JFXDatePicker day;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
    ObservableList<String> times = 
            FXCollections.observableArrayList("10am-11pm","12pm-1pm","2pm-3pm");
            Time.setItems(times);
    ObservableList<String> people = 
      FXCollections.observableArrayList("CEO","CFO","HR","safety","Operations");
            Employer.setItems(people);
    }    

    @FXML
    private void ReserveAction(ActionEvent event) throws IOException 
    {
        Date date=java.util.Calendar.getInstance().getTime();
    if(CustomerName.getText().isEmpty() || CustomerEmail.getText().isEmpty() || 
            BizzName.getText().isEmpty()|| BizzAddress.getText().isEmpty() || 
            PhoneNum.getText().isEmpty() || MeetingDetails.getText().isEmpty()||
            day.getValue().toString().isEmpty() || 
            Time.getSelectionModel().getSelectedItem().isEmpty() || 
            Employer.getSelectionModel().getSelectedItem().isEmpty())
    {
        LabelStatus.setText("Some Boxes are Empty");
    }
    
       String user=day.toString();
       String [] Arr = user.split("/");
       int month=Integer.parseInt(Arr[0]);
       int currentday=Integer.parseInt(Arr[1]);
       int year=Integer.parseInt(Arr[2]);
       
     if(month<date.getMonth() || currentday<date.getDay() || year<date.getYear())
     {
         LabelStatus.setText("Invalid Date Entry. Please Try Again, Thank You.");
     }
    else 
    {
        
        
        String customerName=CustomerName.getText() ;
        String customerEmail=CustomerEmail.getText();
        String bizzName=BizzName.getText();
        String bizzAddress=BizzAddress.getText();
        String phoneNum=PhoneNum.getText();
        String meetingDetails=MeetingDetails.getText();
        String Day=day.getValue().toString();
        String time=Time.getSelectionModel().getSelectedItem();
        String employer=Employer.getSelectionModel().getSelectedItem();
        
        
        BufferedWriter MyWriter = 
                new BufferedWriter(new FileWriter("Appointments.txt",true));
        MyWriter.append(customerName+"/"+customerEmail+"/"+bizzName+
                "/"+bizzAddress+"/"+phoneNum+"/"+meetingDetails+"/"+date+
                "/"+time+"/"+employer+"\n");
        MyWriter.close();
        
        
        LabelStatus.setText("Reservation Successful");
    }
    }
   
    
    
    @FXML
    private void LogOutAction(ActionEvent event) throws IOException 
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
private void CustomerCheckStatus(ActionEvent event) throws IOException  
    {
        Stage stage2 = new Stage();
        Parent root = 
        FXMLLoader.load(getClass().getResource("CustomerAppStatus.fxml"));
        Scene scene = new Scene(root);
        stage2.setScene(scene);
       ((Node)(event.getSource())).getScene().getWindow().hide();
        stage2.show();    
    }

    @FXML
    private void CheckDate(ActionEvent event) 
    {
        
    }
}
