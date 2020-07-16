package homework.day03;
/*
int numA = 2;
int numB = 3;
String str1 = “Study”
String str2 = “Hard”
Type a program to see the following outputs on the console
by using “concatenation” operation.
A) Study Hard B) 5 Study C) Hard23 D) Hard1
Note: Be careful about the spaces between the variables
 */
public class homework19 {
    public static void main(String[] args) {
        int numA = 2;
        int numB = 3;
        String str1 = "Study";
        String str2 = "Hard";
        //A
        System.out.println(str1 + " " + str2);
        //B
        System.out.println(numA + numB + " " + str1);
        //C
        System.out.println(str2 + numA + numB);
        //D
        System.out.println(str2 + (numB - numA));
    }
}
