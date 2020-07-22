package OfficeHours.day05;


/*
Write a program that accepts an integer as input and prints first 10 prime numbers greater than input
Check numbers if they are even or not in a return method
 */
public class Challange {
    public static void main(String[] args) {
        System.out.println( CheckPrime(65));




    }

    public static boolean CheckPrime(int numberToCheck, int remainder) {
        int remainder;
        int count = 0;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0) {
                count++;
                if (count == 10) {
                    break;
                }
            }
        }
        return true;
    }

    }



