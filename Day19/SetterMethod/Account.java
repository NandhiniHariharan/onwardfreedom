package SetterMethod;

public class Account {
    private int accountNumber;
    private double balance;
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        if(balance<0){
            System.out.println("Error");
        }
        else{
            this.balance=balance;
        }
     
    }
    public static void main(String args[]){
       Account person=new Account();
       person.accountNumber=234566777;
       person.setBalance(-55.00);
       System.out.println(person.accountNumber);
       System.out.println(person.getBalance());
    }
}
