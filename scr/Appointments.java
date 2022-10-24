package FinalProject;

import javafx.scene.control.Button;


public class Appointments extends Person
{
     
    private Person customerInfo ; 
    private String BizzName;   
    private String BizzAddress;   
    private String PhoneNum;
    private String MeetingDetails;
    private String Time;
    private String Employer;
    private String Date;
  

  
    public Appointments(String CustomerName,String CustomerEmail, 
            String BizzName, String BizzAddress, String PhoneNum, 
            String MeetingDetails, String Time, String Employer, String Date) 
    {
       
        super(CustomerName,CustomerEmail);
        this.BizzName = BizzName;
        this.BizzAddress = BizzAddress;
        this.PhoneNum = PhoneNum;
        this.MeetingDetails = MeetingDetails;
        this.Date = Date;
        this.Time = Time;
        this.Employer = Employer;
        
       
    }

     
    public Person getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(Person customerInfo) {
        this.customerInfo = customerInfo;
    }

    public String getBizzName() {
        return BizzName;
    }

    public void setBizzName(String BizzName) {
        this.BizzName = BizzName;
    }

    public String getBizzAddress() {
        return BizzAddress;
    }

    public void setBizzAddress(String BizzAddress) {
        this.BizzAddress = BizzAddress;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getMeetingDetails() {
        return MeetingDetails;
    }

    public void setMeetingDetails(String MeetingDetails) {
        this.MeetingDetails = MeetingDetails;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getEmployer() {
        return Employer;
    }

    public void setEmployer(String Employer) {
        this.Employer = Employer;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String D) {
        this.Date = D;
    }

    @Override
    public String toString() {
        return super.toString() + BizzName + "/" + BizzAddress + "/" + PhoneNum 
                + "/" + MeetingDetails + "/" + Time + "/" + Employer + "/" 
                + Date + "\n";
    }
    
    
}
