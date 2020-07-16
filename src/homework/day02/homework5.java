package homework.day02;
/*
Type a program which calculates the area and the perimeter of a circle
whose radius is entered by user. (Use float)
Hint 1: Take pi number as 3.14159
Hint 2: Area of a circle is 3.14159 x radius x radius
Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
Hint 4: To get float, use nextFloat()
 */
import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the radius to calculate area and perimeter");
        float radius = scn.nextFloat();
     double pi = 3.14159;
        System.out.println("the area of circle : " + pi * radius * radius);
        System.out.println("the perimeter: " + 2 * pi * radius);

    }
}
