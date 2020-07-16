package techproed2020.day05operatorsifstatementdt;

import java.util.Scanner;

public class IfElseStatement03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a quantity and unit price");
        int quantityFromUser = scn.nextInt();
        int unitPriceOfProducts = scn.nextInt();
if(quantityFromUser>1000){
    System.out.println("you got 10% discount and total price is " + 0.9*unitPriceOfProducts*quantityFromUser);
}else{
    System.out.println("no discount and total price is "+ unitPriceOfProducts*quantityFromUser );
}
    }
}
