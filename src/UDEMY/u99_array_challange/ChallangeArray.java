package UDEMY.u99_array_challange;

import java.util.Scanner;

public class ChallangeArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegeres(5);

    }

    public static int[] getIntegeres(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}