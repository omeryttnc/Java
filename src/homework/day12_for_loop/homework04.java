package homework.day12_for_loop;
/*
4) Write a program to add counting numbers from 23 to 57 by using for-loop.
Print the sum on the console
 */
public class homework04 {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 23 ; i < 57 ; i++){
            sum += i;
        }
        System.out.println(sum);

    }
}
