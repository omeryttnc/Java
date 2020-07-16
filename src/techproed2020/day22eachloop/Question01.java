package techproed2020.day22eachloop;

import java.util.Arrays;

public class Question01 {
    public static void main(String[] args) {
/*
write specific program to remove an array
*/

        int[] a = {12, 11, 23, 7};

        int[] b = new int[a.length - 1];
        int idx = 1;
        int k =0;
        for (int i = 0; i < a.length; i++) {
            if (idx == i) {
                continue;//skip the element
            }

            b[k] = a[i];
       k ++;
        }
        System.out.println(Arrays.toString(b));
    }


}
