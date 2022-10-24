package FinalProject;

import com.jfoenix.controls.JFXButton;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.FileReader;


public class AdminHomePageController implements Initializable {

   
    
    
  
    @FXML
    private TableView<tableView> AppDisplay;
    @FXML
    private TableColumn<tableView, String> Name;
    @FXML
    private TableColumn<tableView, String> Email;
    @FXML
    private TableColumn<tableView, String> BizzName;
    @FXML
    private TableColumn<tableView, String> BizzAdd;
    @FXML
    private TableColumn<tableView, String> PhoneNum;
    @FXML
    private TableColumn<tableView, String> MDetails;
    @FXML
    private TableColumn<tableView, String> Date;
    @FXML
    private TableColumn<tableView, String> Time;
    @FXML
    private TableColumn<tableView, String> MWith; 
    @FXML
    private JFXButton Decline;
    @FXML
    private JFXButton Accept;
    
     ArrayList <Appointments> AppointmentsInfo=new ArrayList<Appointments>(); 
   ArrayList <tableView> AppInfo=new ArrayList<tableView>(); 
    
   @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        Name.setCellValueFactory
        (new PropertyValueFactory<tableView,String>("Name"));

Email.setCellValueFactory
        (new PropertyValueFactory<tableView,String>("Email"));

BizzName.setCellValueFactory
        (new PropertyValueFactory<tableView,String>("BizzName"));

BizzAdd.setCellValueFactory
        (new PropertyValueFactory<tableView,String>("BizzAdd"));

PhoneNum.setCellValueFactory
        (new PropertyValueFactory<tableView,String>("PhoneNum"));

MDetails.setCellValueFactory
        (new PropertyValueFactory<tableView,String>("MDetails"));

Date.setCellValueFactory
        (new PropertyValueFactory<tableView,String>("Date"));

Time.setCellValueFactory
        (new PropertyValueFactory<tableView,String>("Time"));

MWith.setCellValueFactory
        (new PropertyValueFactory<tableView,String>("MWith"));

        try {
            AppDisplay.setItems(getAppointments());
        } catch (IOException ex) {
            Logger.getLogger(AdminHomePageController.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
      
    } 
    @FXML
    private void AcceptAction(ActionEvent event) {
        

           
            System.out.println
        ( AppDisplay.getSelectionModel().getSelectedItem().getBizzName());
    String selectedBusiness = 
            AppDisplay.getSelectionModel().getSelectedItem().getEmail();
            for(int x=0 ; x< AppointmentsInfo.size(); x++)
            {
   if(AppointmentsInfo.get(x).geteMail().equals(selectedBusiness))
        {
     try {
            BufferedWriter WriterAccepted_Appointments=null;
                try {
     WriterAccepted_Appointments = 
            new BufferedWriter(new FileWriter("Accepted_Appointments.txt",true));
                        } 
                
                catch (IOException ex) 
                {
    Logger.getLogger(AdminHomePageController.class.getName())
            .log(Level.SEVERE, null, ex);
                }
                        
    WriterAccepted_Appointments.append(AppointmentsInfo.get(x).getFullName()+"/"
  +AppointmentsInfo.get(x).geteMail()+"/"+ AppointmentsInfo.get(x).getBizzName()
  +"/"+ AppointmentsInfo.get(x).getBizzAddress()+"/"
  +AppointmentsInfo.get(x).getPhoneNum()+"/"
  + AppointmentsInfo.get(x).getMeetingDetails() +"/"
  +AppointmentsInfo.get(x).getDate()+"/"+AppointmentsInfo.get(x).getTime()+"/"
  +AppointmentsInfo.get(x).getEmployer() +"\n");
        WriterAccepted_Appointments.close();
        AppointmentsInfo.removeIf(t -> t.geteMail().equals(selectedBusiness));
        } 
     catch (IOException ex) 
     {
     Logger.getLogger(AdminHomePageController.class.getName())
             .log(Level.SEVERE, null, ex);
     }
        }
                
            }
            for(int x=0 ; x< AppointmentsInfo.size(); x++)
            {
                BufferedWriter MyWriter=null;
    try {
        MyWriter = new BufferedWriter(new FileWriter("Appointments.txt"));
                } 
    
    catch (IOException ex) 
    {
         Logger.getLogger(AdminHomePageController.class.getName())
                 .log(Level.SEVERE, null, ex);
    
    }
    
    try {
        
        MyWriter.write(AppointmentsInfo.get(x).getFullName()+"/"
            +AppointmentsInfo.get(x).geteMail()+"/"
            + AppointmentsInfo.get(x).getBizzName()+"/"
            + AppointmentsInfo.get(x).getBizzAddress()+"/"
            +AppointmentsInfo.get(x).getPhoneNum()+"/"
            + AppointmentsInfo.get(x).getMeetingDetails() +"/"
            +AppointmentsInfo.get(x).getDate() +"/"
            +AppointmentsInfo.get(x).getTime()+"/"
            +AppointmentsInfo.get(x).getEmployer() +"\n");
                    
                } catch (IOException ex) {
        Logger.getLogger(AdminHomePageController.class.getName())
                .log(Level.SEVERE, null, ex);
                }
                try 
                {
                    MyWriter.close();
                } 
                catch (IOException ex) {
        Logger.getLogger(AdminHomePageController.class.getName())
                .log(Level.SEVERE, null, ex);
                }
            }
        Stage Homestage = new Stage();
            Parent root=null;
            try 
            {
        root = FXMLLoader.load(getClass().getResource("AdminHomePage.fxml"));
            }
            
            catch (IOException ex) 
            {
        Logger.getLogger(AdminHomePageController.class.getName())
                .log(Level.SEVERE, null, ex);
            }
            Scene scene = new Scene(root);
            Homestage.setScene(scene);
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Homestage.show();
    
   
   
        
    }

    @FXML
    private void DeclineAction(ActionEvent event) 
    {
    System.out.println
        ( AppDisplay.getSelectionModel().getSelectedItem().getBizzName());
    String selectedBusiness = 
            AppDisplay.getSelectionModel().getSelectedItem().getEmail();
            for(int x=0 ; x< AppointmentsInfo.size(); x++)
            {
   if(AppointmentsInfo.get(x).geteMail().equals(selectedBusiness))
        {
     try {
            BufferedWriter WriterAccepted_Appointments=null;
                try {
     WriterAccepted_Appointments = 
            new BufferedWriter(new FileWriter("Decline_Appointments.txt",true));
                        } 
                
                catch (IOException ex) 
                {
    Logger.getLogger(AdminHomePageController.class.getName())
            .log(Level.SEVERE, null, ex);
                }
                        
    WriterAccepted_Appointments.append(AppointmentsInfo.get(x).getFullName()+"/"
  +AppointmentsInfo.get(x).geteMail()+"/"+ AppointmentsInfo.get(x).getBizzName()
  +"/"+ AppointmentsInfo.get(x).getBizzAddress()+"/"
  +AppointmentsInfo.get(x).getPhoneNum()+"/"
  + AppointmentsInfo.get(x).getMeetingDetails() +"/"
  +AppointmentsInfo.get(x).getDate()+"/"+AppointmentsInfo.get(x).getTime()+"/"
  +AppointmentsInfo.get(x).getEmployer() +"\n");
        WriterAccepted_Appointments.close();
        AppointmentsInfo.removeIf(t -> t.geteMail().equals(selectedBusiness));
        } 
     catch (IOException ex) 
     {
     Logger.getLogger(AdminHomePageController.class.getName())
             .log(Level.SEVERE, null, ex);
     }
        }
                
            }
            for(int x=0 ; x< AppointmentsInfo.size(); x++)
            {
                BufferedWriter MyWriter=null;
    try {
        MyWriter = new BufferedWriter(new FileWriter("Appointments.txt"));
                } 
    
    catch (IOException ex) 
    {
         Logger.getLogger(AdminHomePageController.class.getName())
                 .log(Level.SEVERE, null, ex);
    
    }
    
    try {
        
        MyWriter.write(AppointmentsInfo.get(x).getFullName()+"/"
            +AppointmentsInfo.get(x).geteMail()+"/"
            + AppointmentsInfo.get(x).getBizzName()+"/"
            + AppointmentsInfo.get(x).getBizzAddress()+"/"
            +AppointmentsInfo.get(x).getPhoneNum()+"/"
            + AppointmentsInfo.get(x).getMeetingDetails() +"/"
            +AppointmentsInfo.get(x).getDate() +"/"
            +AppointmentsInfo.get(x).getTime()+"/"
            +AppointmentsInfo.get(x).getEmployer() +"\n");
                    
                } catch (IOException ex) {
        Logger.getLogger(AdminHomePageController.class.getName())
                .log(Level.SEVERE, null, ex);
                }
                try 
                {
                    MyWriter.close();
                } 
                catch (IOException ex) {
        Logger.getLogger(AdminHomePageController.class.getName())
                .log(Level.SEVERE, null, ex);
                }
            }
        Stage Homestage = new Stage();
            Parent root=null;
            try 
            {
        root = FXMLLoader.load(getClass().getResource("AdminHomePage.fxml"));
            }
            
            catch (IOException ex) 
            {
        Logger.getLogger(AdminHomePageController.class.getName())
                .log(Level.SEVERE, null, ex);
            }
            Scene scene = new Scene(root);
            Homestage.setScene(scene);
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Homestage.show();
    }
    
    
 public ObservableList<tableView> getAppointments() 
         throws FileNotFoundException, IOException
    {
        ObservableList<tableView> MyAppointments = 
            FXCollections.observableArrayList();
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
                AppInfo.add(log);
                }
        int counter =0;
             for(tableView info:AppInfo)
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
            MyAppointments.add(new tableView(customerName1,customerEmail1,
            bizzName1,bizzAddress1,phoneNum1,meetingDetails1,
                   date1,time1,employer1)); 
                 
                 
           AppointmentsInfo.add(new Appointments( customerName1, customerEmail1, 
            bizzName1, bizzAddress1, phoneNum1, 
            meetingDetails1, time1, employer1,  date1));

                 counter++;
                        
                }
            
     return MyAppointments;
    }    

    @FXML
    private void LogOutAction(ActionEvent event) throws IOException 
    {
            Stage Homestage = new Stage();
            Parent root = 
            FXMLLoader.load(getClass().getResource("CustomerLogin.fxml"));
            Scene scene = new Scene(root);
            Homestage.setScene(scene);
            ((Node)(event.getSource())).getScene().getWindow().hide();
            Homestage.show();
            
    }

   
}
