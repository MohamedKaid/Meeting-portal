package FinalProject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class CustomerLoginController implements Initializable {

    @FXML
    private TextField userId1;
    @FXML
    private PasswordField password;
    @FXML
    private Label LabelStatus;
    
    ArrayList <Customer> loginInfo=new ArrayList<Customer>();
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    

//    private void signUpAction(ActionEvent event) throws IOException 
//    {
//        Stage stage2 = new Stage();
//        Parent root = 
//        FXMLLoader.load(getClass().getResource("CustomerSignUp.fxml"));
//        Scene scene = new Scene(root);
//        stage2.setScene(scene);
//       ((Node)(event.getSource())).getScene().getWindow().hide();
//        stage2.show();
//    }
//
    @FXML
    private void LoginAction(ActionEvent event) throws IOException 
    {
        if(userId1.getText().equals("admin") && password.getText().equals("admin123")){
            Stage stage2 = new Stage();
            Parent root = 
            FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
            Scene scene = new Scene(root);
            stage2.setScene(scene);
           ((Node)(event.getSource())).getScene().getWindow().hide();
            stage2.show();
        }else if(!userId1.getText().equals("admin")){
            LabelStatus.setText("Username is Incorrect");
        }else if(!password.getText().equals("admin123")){
            LabelStatus.setText("Password is Incorrect");
        }
//        Customer customer = null;
//        Customer temp = null;;
//        String userName=null,passWord=null,id=null,pass=null;
//        String fileName = "Customer.txt";
//        try(
//               Scanner scan = new Scanner(fileName);
//                ){
//            while(scan.hasNext()){
//            id=scan.next();
//            pass=scan.next();
//            customer = new Customer(id,pass);
//            loginInfo.add(customer);
//            }
//                for(int x=0;x<loginInfo.size();x++){
//                    temp = loginInfo.get(x);
//                    userName = temp.getUserName().toString();
//                    passWord = temp.getPassWord().toString();
//                        if(userId1.getText().equals(userName) &&
//                                password.getText().equals(passWord)){
//                            Stage stage = new Stage();
//                            Parent node = 
//                            FXMLLoader.load(getClass().getResource("CustomerHomePage.fxml"));
//                            Scene scene = new Scene(node);
//                            stage.setScene(scene);
//                           ((Node)(event.getSource())).getScene().getWindow().hide();
//                            stage.show();
//                        }else
//                        {
//                      LabelStatus.setText("UserName or Password Was NOT Found");
//                        }
//                }
//        } catch (IOException ex) {
//            Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//                    java.io.File myUserFile = new java.io.File("Customer.txt");
//            Scanner inputData = new Scanner(myUserFile);
//            while(inputData.hasNext())
//            {
//                customerLogin1 = inputData.nextLine();
//                customerPassword1 = inputData.nextLine();
//                Customer log= new Customer(customerLogin1,customerPassword1);
//                loginInfo.add(log);
//            }
//                for(Customer info:loginInfo)
//                {
//                    
//                    String user=info.toStirng();
//                    String [] Arr=user.split("\n");
//                    Arr[0]=Arr[0];
//                    Arr[1]=Arr[1];
//                    id=Arr[0];
//                    pass=Arr[1];
//                        if(userId1.getText().equals(id) 
//                                && password.getText().equals(pass) )
//                        {
//        Stage stage2 = new Stage();
//        Parent root = 
//        FXMLLoader.load(getClass().getResource("CustomerHomePage.fxml"));
//        Scene scene = new Scene(root);
//        stage2.setScene(scene);
//       ((Node)(event.getSource())).getScene().getWindow().hide();
//        stage2.show();
//                        break;
//        
//                        }
//                
//                        
//    }
    }
    
}
