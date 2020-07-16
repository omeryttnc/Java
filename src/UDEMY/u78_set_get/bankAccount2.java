package UDEMY.u78_set_get;

public class bankAccount2 {
public bankAccount2(){
    System.out.println("Empty constructor called");
}
    private int AccountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

public bankAccount2(int AccountNumber, double balance, String customerName, String customerEmail, String phoneNumber){
    this.balance = balance;
    this.AccountNumber = AccountNumber;
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.phoneNumber = phoneNumber;

}

    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal (double withdrawalAmoun){
        if(this.balance-withdrawalAmoun <0){
            System.out.println("only " + balance + " available. Withdrawal not processed");
        }else {
            balance -= withdrawalAmoun;
            System.out.println("Withdrawal of " + withdrawalAmoun + " processed. Remaining balance = " + this.balance);
        }
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return customerEmail;
    }

    public void setEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhonenumber() {
        return phoneNumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phoneNumber = phonenumber;
    }
}
