package homework.day12_for_loop;
/*
5)Write a program to multiply counting numbers from 7 to 15 by using for-loop.
Print the multiplication on the console
 */
public class homework05 {
    public static void main(String[] args) {

        int multiply = 1;
        for(int i = 7 ; i<= 15 ; i++){
            multiply *=i;
        }

        System.out.println(multiply);
    }
}
