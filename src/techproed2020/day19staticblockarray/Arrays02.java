package techproed2020.day19staticblockarray;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
// how to sort element in ascending order
        String[] arr ={"Angle", "Leo", "Brad", "Adam", "Jack"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //for number we use "ascending order", for String we use
        //"Alphabetical order"
        //"ascending order" and "alphabetical order" both are called
        //"Natural order"
    }
}
