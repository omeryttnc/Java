package homework.day12_for_loop;
/*
6)Write a program to print counting numbers which are less than 200 and divisible by 5
On the console by using for-loop.
 */
public class homework06 {

    public static void main(String[] args) {
        for(int i = 200 ; i > 0 ; i-- ){
            if(i % 5 == 0){
                System.out.println(i);
            }

        }
    }
}
