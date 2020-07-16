package UDEMY.u66_loop_challenge;

public class u66_loop_challenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;


        for (int x = 1; x < 1000; x++) {
            if ((x % 5 == 0) && (x % 3 == 0)) {
                count++;
                sum += x;
                System.out.println(x);

            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("sum is = " + sum);
    }
}
