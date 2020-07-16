package practice.Day_04;

/*
! Print the image below
! 1 *
! 2 * *
! 3 * * *
! 4 * * * *
! 5 * * * * *
! 6 * * * * * *
 */
public class Stairs {
    public static void main(String[] args) {
        char ch1 = '*';
        char ch2 = ' ';
        for (int i = 1; i <= 6; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("" + ch1 + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < 5; i++) {
////            for (int j = 0; j < 5 - i; j++) {
////                System.out.print(" ");
////            }
//            for (int k = 0; k <= i; k++) {
//                System.out.print(k + " ");
    }
}




