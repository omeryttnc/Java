package repl;

import java.util.Arrays;
import java.util.Scanner;

public class cs3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int [] myArray = {num1,num2,num3};
  Arrays.sort(myArray);
        System.out.println("The greatest: " + myArray[myArray.length-1]);
    }
}
