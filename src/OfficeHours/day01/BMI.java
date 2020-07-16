package OfficeHours.day01;

import java.util.Scanner;

/*
Write a Java program to compute body mass index (BMI)
print the situation. Is user weak, fat or obese ?
(Hint BMI = weight(kg)/ (height*height)(m)
BMI<20 weak
20<BMI<25 healthy
25<BMI<30 fat
Over 30 obese
 */
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height");
        double height = scanner.nextDouble();
        double BIM = weight / (height * height);
        if (BIM < 20) {
            System.out.println("you are week");
        } else if (BIM < 25) {
            System.out.println("you are healthy");
        } else if (BIM < 30) {
            System.out.println("you are fat");
        } else if (BIM > 30) {
            System.out.println("You are obese");
        } else {
            System.out.println("you didnt use digit");
        }
    }

}
