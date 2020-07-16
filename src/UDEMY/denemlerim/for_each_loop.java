package UDEMY.denemlerim;

public class for_each_loop {
    public static void main(String[] args) {
//        int[] numbers = {3 , 4 , 5 , -5 , 0 , 12};
//    int sum = 0;
//        for(int nummber: numbers){
//            sum += nummber;
//        }
//        System.out.println(sum);
        int[] numbers = {2, 5, -6, 9};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
