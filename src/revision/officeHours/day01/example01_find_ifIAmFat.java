package revision.officeHours.day01;

import java.util.Scanner;

public class example01_find_ifIAmFat {
    public static void main(String[] args) {
        System.out.println("enter your weight");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        System.out.println("enter your weight");
        double height = scanner.nextDouble();
        double IBM = weight/(height*height);
        if (IBM <20) {
            System.out.println("weak");
        }
        else if(IBM<25){
            System.out.println("healthy");
        }else if(IBM<30){
            System.out.println("fat");
        }else {
            System.out.println("obese");
        }

    }
}
