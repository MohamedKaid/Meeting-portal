package FinalProject;

public class Person 
{
 
    private String CustomerName;
    private String CustomerEmail;

    public Person(String CustomerName, String CustomerEmail) {
        this.CustomerName = CustomerName;
        this.CustomerEmail = CustomerEmail;
    }

    public String getFullName() {
        return CustomerName;
    }

    public void setFullName(String fullName) {
        this.CustomerName = CustomerName;
    }

    public String geteMail() {
        return CustomerEmail;
    }

    public void seteMail(String eMail) {
        this.CustomerEmail = CustomerEmail;
    }

    @Override
    public String toString() {
        return CustomerName + "/" + CustomerEmail ;
    }
    
    
    
}
