package Day26.Leetcode.Encapsulation;

public class BankAccountClass {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccountClass(String accountNumber,String holdername, double initialBalnace ){
        this.accountNumber=accountNumber;
        this.holderName=holdername;
        this.balance=initialBalnace;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }else{
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdrawal(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }else if(amount>balance){
            System.out.println("Withdrawal amount exceeds balance.");
        }else{
            System.out.println("Deposit amount must be positive.");
        }
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        BankAccountClass bank=new BankAccountClass("ABC12437", "Johny", 1000.0);
        System.out.println("Account Number: " + bank.getAccountNumber());
        System.out.println("Holder Name: " + bank.getHolderName());
        System.out.println("Initial Balance: $" + bank.getBalance());
        bank.deposit(500.0);
        System.out.println("Balance after deposit: "+bank.getBalance());
        bank.withdrawal(200.0);
        System.out.println("Balance after Withdrawal: "+bank.getBalance());
        bank.withdrawal(2000.0);
    }
}
