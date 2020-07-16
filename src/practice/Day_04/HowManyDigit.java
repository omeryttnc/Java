package practice.Day_04;

/*
! ask user to enter a sentence and check how many times they used
numbers(digits) in the sentence using loops and String manipulations
! e.g:
! I will come at 3: 30 pm
! There are 3 digits
! */
public class HowManyDigit<length> {
    public static void main(String[] args) {


        String str = "I will come at 3: 30 pm";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
            }
        }
            System.out.println(count);
    }
}
