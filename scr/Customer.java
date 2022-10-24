package FinalProject;

public class Customer
{
     
     
    private String businessName;
    private String address;
    private String userName;
    private String passWord;
    private String phoneNum;
    private String eMail;
    
    public Customer(String userName, String passWord) 
	{
		this.userName=userName;
                this.passWord=passWord;

	}
    public Customer(String businessName,String address,String userName,
            String passWord,String phoneNum,String eMail)
    {
        this.businessName=businessName;
        this.address=address;
        this.userName=userName;
        this.passWord=passWord;
        this.phoneNum=phoneNum;
        this.eMail=eMail;
    }

        public String getUserName() { return userName;}
	public String getPassWord() {return passWord;}
	
	public void setUserName(String un) {userName = un;}
	public void setPassWord(String pw) {passWord=pw;}
        
        public String toStirng()
    {
        String data= userName+"/"+passWord;
            return data;
    } 
    
}
