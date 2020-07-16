package UDEMY.u98_array_introduction;

public class Intriduction {
    public static void main(String[] args) {
        //   int[] myIntArray = new int[10];
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        myIntArray[0] = 45;
//        myIntArray[1]= 476;
//        myIntArray[5] = 50;
        //double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[8]);


        int[] myIntArray2 = new int[25];
        for (int i = 0; i < myIntArray2.length; i++) {
            myIntArray2[i] = i * 10;
        }
        printArray(myIntArray2);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
