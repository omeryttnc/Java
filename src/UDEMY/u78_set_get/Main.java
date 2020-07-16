package UDEMY.u78_set_get;

public class Main {
    public static void main(String[] args) {
        bankAccount2 omerAccount = new bankAccount2();
        bankAccount2 ayse = new bankAccount2(1234, 250000, "mahmut","mhamut@gmail.com","2548885");
        System.out.println("account number " + ayse.getAccountNumber());
        //
//        omerAccount.withdrawal(100);
//        omerAccount.deposit(50);
//        omerAccount.withdrawal(100);
//        omerAccount.deposit(51);
//        omerAccount.withdrawal(100);


    }
}
