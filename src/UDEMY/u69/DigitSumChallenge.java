package UDEMY.u69;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("the sum of the digits in number 625 is = " + sumDigit(625));
        System.out.println("the sum of the digits in number 625 is = " + sumDigit(-625));
        System.out.println("the sum of the digits in number 625 is = " + sumDigit(5));
        System.out.println("the sum of the digits in number 625 is = " + sumDigit(23564845));
        System.out.println("the sum of the digits in number 625 is = " + sumDigit(62005));
        int deneme = 125;
        int kalan = deneme % 10;
        System.out.println("kalan = " + kalan);
        System.out.println("deneme = " + deneme);
    }
    public static int sumDigit(int number) {
if(number < 10){
    return -1;
}

    int sum = 0;
// 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
while (number > 0){
    //extract the last significant digit
    int digit = number % 10;
    sum += digit;
    number /= 10; // same as number = number / 10;
}
return sum;
    }
}
