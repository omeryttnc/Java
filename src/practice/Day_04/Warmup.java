package practice.Day_04;

public class Warmup {
    public static void main(String[] args) {
        //print even number
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //print odd numbers
        for (int j = 1; j <= 20; j += 2) {
            System.out.print(j + " ");
        }
        System.out.println();
        // print divisible by 5
        for (int i = 20; i >= 0; i -= 5) {
            System.out.print(i + " ");
            //sum even numbers 1-20
        }
        System.out.println();
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.print(sum + " ");
            }

        }
        System.out.println();
        System.out.print(sum);
        System.out.println();
//print all 1-20 except 11 and 15
        for (int i = 1; i <= 20; i++) {

            if (i == 11 || i == 15) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
