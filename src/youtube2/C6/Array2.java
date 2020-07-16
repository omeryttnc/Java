package youtube2.C6;

public class Array2 {
    public static void main(String[] args) {
        int[] firstSet = {1, 4, 12, 47};
        int sum = 0;
//        int[] secondSet = new int[4];
//        secondSet[0] = 27;
//        secondSet[1] = 24;
//        secondSet[2] = 25;
//        secondSet[3] = 22;
        for (int i = 0; i < firstSet.length; i++) {
            sum = sum + firstSet[i];
            System.out.print(firstSet[i] + " ");
        }
        System.out.println("sum: " + sum);
        for (int value : firstSet) {
            System.out.println(value);
        }
    }
}
