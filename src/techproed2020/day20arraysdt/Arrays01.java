package techproed2020.day20arraysdt;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //how to create an Array (long way)
        int abr[] = new int[4];
        // how to print an Array
        System.out.println(Arrays.toString(abr));
//how to assign value
        abr[0] = 11;
        System.out.println(Arrays.toString(abr));

        abr[3] = 14;
        System.out.println(Arrays.toString(abr));
        abr[1] = 12;
        abr[2] = 13;
        System.out.println(Arrays.toString(abr));
//how to get the number of elements in an Array
        System.out.println( abr.length);
//in String when we use length we need parenthesis in array there is no need
String str = "kazim";
int n = str.length();
        System.out.println(n);


//sort way to create Array

       int arr[] = {3,2,4,3,5};
        System.out.println(Arrays.toString(arr));

        //what happens if you try to use non-existing index in array?
        //You will not get Compile Time Error
//        abr [4]=14;
//        System.out.println(Arrays.toString(abr));
        System.out.println("******************");
        //how to print a specific element on the console
        System.out.println(abr[0]);
        System.out.println(abr[1]);
        System.out.println(abr[2]);
        System.out.println(abr[3]);
        System.out.println("******************");

        //how to print all elements by using loop on the console
        for(int i=0; i< abr.length ;i++){
            System.out.println(abr[i]+ " ");
        }


//        Arrays.sort(arr);//2,3,3,4,5
//
        //How to check if a specific element is in the array
//        Arrays.binarySearch(arr,4);
//        System.out.println(Arrays.binarySearch(arr,3));
//        System.out.println(Arrays.binarySearch(arr,7));

    }

}
