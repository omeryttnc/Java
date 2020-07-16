package techproed2020.day19staticblockarray;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int arr[] = new int[4];
        System.out.println(Arrays.toString(arr));
        arr[0] = 11;
        System.out.println(Arrays.toString(arr));
        arr[3] = 14;
        System.out.println(Arrays.toString(arr));
        arr[1] = 12;
        System.out.println(Arrays.toString(arr));
//        arr[2]=13;
//        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);
        int brr[] = {21, 22, 23, 24};
        System.out.println(Arrays.toString(brr));

        //What happens if you try to use non-existing index in an array?
        //answer: you do not get Compile Time Error
        //        you will get run time error.
//brr[4]=25;
// How to print  a specific element on the console

        System.out.println(brr[1]);
        System.out.println(brr[0]);
        System.out.println(brr[2]);
        System.out.println(brr[3]);


        for(int i = 0; i<=brr.length-1 ; i++){
            System.out.print(brr[i]+ " ");
        }

    }
}
