package homework.day12_for_loop;
/*
2) Write a program to print even counting numbers from 100 to 43 on the console by using for-loop
 */
public class homework02 {
    public static void main(String[] args) {
        for(int i = 100 ; i > 43 ; i--){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
