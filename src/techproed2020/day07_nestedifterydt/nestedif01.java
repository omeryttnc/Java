package techproed2020.day07_nestedifterydt;

import java.util.Scanner;

public class nestedif01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter age ");
        int age = scn.nextInt();
        System.out.println("your gender");
        String gender = scn.nextLine();

        if(gender.equals("male")){
            if(age<20){
                System.out.println("Boy");
            }else{
                System.out.println("Man");
            }
        }else if (gender.equals("female")){
            if(age<20){
                System.out.println("Girl");
            }else{
                System.out.println("Woman");
            }

        }




    }
}
