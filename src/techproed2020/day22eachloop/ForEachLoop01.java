package techproed2020.day22eachloop;

public class ForEachLoop01 {
    /*
    1) for each loop works with collections (Arrays,Lists)
    2) the other name of for Each Loop is "Enhanced Loop"

     */

    public static void main(String[] args) {

//how to print all elments of an array on the console
        int[] arr = {1, 2, 3, 4, 5};
        for (int w : arr) {
            System.out.print(w + " ");


        }
        System.out.println("*****************");
        int count = 0;
        for (int y : arr) {
            count += y;
        }
        System.out.println(count);

        System.out.println();
        //Print the even numbers on the console

        for (int w : arr) {
            if (w % 2 == 0) {
                System.out.println(w + " ");
            }
        }
        //Print the even numbers on the console and continue
        System.out.println("----------------------");
        for(int w : arr){
            if(w % 2 != 0){
                continue;
            }
            System.out.println(w);
        }
//find the multpication of odd element loop and continue
        System.out.println("--------------------------");
            int power = 1;
        for (int w : arr){
            if(w % 2 ==0){
                continue;
            }
            power *= w;
        }
        System.out.println(power);

        System.out.println("-----------------");
//Find the sum of all elements except 3
        int sum = 0;
        for(int w : arr){
            if(w == 3){
                continue;
            }
            sum +=w;
        }
        System.out.println(sum);
    }
}
