package homework.day13_while_loop;
/*
2)Type java code by using while loop.
Write a program that types first 30 consecutive odd integers.


 */
public class homework02 {
    public static void main(String[] args) {
        int i = 1;
        while(i<30){
            if(i % 2 != 0){
                System.out.println(i);

            }
            i++;
        }

    }
}
