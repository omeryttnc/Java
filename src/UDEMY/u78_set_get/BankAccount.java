package UDEMY.u78_set_get;

public class BankAccount {
private String Account;
private double balance;
private String customerName;
private String customerEmailAddress;
private String customerPhoneNumber;

public void deposit(double  depositAmount){
    this.balance += depositAmount;

}


    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
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

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

