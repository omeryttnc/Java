package teamQuestions;

/*
 Write a method that takes an array of integers and returns the difference between
 the largest and smallest number. Then print the difference
 */
public class day01 {

    public static void main(String[] args) {
        int [] myArray = {2,1,5,7,9,6};
        System.out.println(difference(myArray));
    }
    public static int difference(int[] largeArray) {

        int smallest = largeArray[0];
        int largest = largeArray[0];

        for (int i = 0; i < largeArray.length; i++) {
            if (largeArray[i] < smallest) {
                smallest = largeArray[i];
            }
            if (largeArray[i] > largest) {
                largest = largeArray[i];
            }

        }
        return largest - smallest;
    }
}
