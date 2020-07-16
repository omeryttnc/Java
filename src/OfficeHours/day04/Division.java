package OfficeHours.day04;
/*
Interview Question :
write a return method that can divide two numbers without division operator and prints quotient and remainder
Input : number= 44 and divisor=5
Output : Quotient=8 Remainder=4
 */
public class Division {
    public static void main(String[] args) {
        int no = 44;
int divisor = 5;
division(no,divisor);
    }
    public static void division (int input, int divisor){
        int quotient = 0;
        int reminder = input;
        while (reminder>divisor){
            reminder-=divisor;
            quotient++;
        }
        System.out.println("Quotient = " + quotient + " and remainder = " +reminder );
    }
}
