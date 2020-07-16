package youtube2.C6;

public class Array2D {
    public static void main(String[] args) {
        int[][] multiArray = {
                {2, 5, 1, 9},
                {10, 15, 2, 0},
                {1, 11, 31, 90},
                {2, 51, 1, 9}
        };
        int sum = 0;
        for (int r = 0; r <multiArray.length ; r++) {
            for (int c = 0; c <multiArray[r].length ; c++) {
sum += multiArray[r][c];
        System.out.print(multiArray[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
