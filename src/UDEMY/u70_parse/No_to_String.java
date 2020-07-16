package UDEMY.u70_parse;

public class No_to_String {
    public static void main(String[] args) {
        String noAsString = "2019";
        int number = Integer.parseInt(noAsString);
        noAsString += 1 ;
        number += 1;
        System.out.println("noAsString = " + noAsString);
        System.out.println("number = " + number);
    }
}
