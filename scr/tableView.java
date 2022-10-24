package FinalProject;

public class tableView 
{
    private String Name;
    private String Email;
    private String BizzName;
    private String BizzAdd;
    private String PhoneNum;
    private String MDetails;
    private String Date;
    private String Time;
    private String MWith;

    public tableView(String Name) {
        this.Name = Name;
    }
    
    public tableView(String Name, String Email, String BizzName, String BizzAdd,
            String PhoneNum, String MDetails, String Date, 
            String Time, String MWith) 
    {
        this.Name = Name;
        this.Email = Email;
        this.BizzName = BizzName;
        this.BizzAdd = BizzAdd;
        this.PhoneNum = PhoneNum;
        this.MDetails = MDetails;
        this.Date = Date;
        this.Time = Time;
        this.MWith = MWith;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getBizzName() {
        return BizzName;
    }

    public void setBizzName(String BizzName) {
        this.BizzName = BizzName;
    }

    public String getBizzAdd() {
        return BizzAdd;
    }

    public void setBizzAdd(String BizzAdd) {
        this.BizzAdd = BizzAdd;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getMDetails() {
        return MDetails;
    }

    public void setMDetails(String MDetails) {
        this.MDetails = MDetails;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getMWith() {
        return MWith;
    }

    public void setMWith(String MWith) {
        this.MWith = MWith;
    }

    @Override
    public String toString() {
        return Name + "/" + Email + "/" + BizzName + "/" + BizzAdd + "/" 
                + PhoneNum + "/" + MDetails + "/" + Date + "/" + Time + "/" 
                + MWith + "\n";
    }
    
    
    
}
