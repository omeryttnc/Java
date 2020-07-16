package youtube2.C6;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] myArray = {5,4,27,11};
        System.out.println(myArray[3]);
        int[] array1 = new int[3];
        array1[0] = 5;
        array1[1] = 4;
        array1[2]=3;
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        int[] array2 ={34,343,56,557};
Arrays.sort(array2);
    }
}
/*
fixed size
sequential collection of elements
same data type
index starts from 0
data type [] arrayName = {variables};

dataType[] arrayName = new dataType[arraySize];
int [] array1 = new int[3];
 */