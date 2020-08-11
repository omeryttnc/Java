package Codinbat.Warmup_1;
/*
Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */
public class IntMax {

    public static void main(String[] args) {
        System.out.println(intMax(5,9,8));
    }
    public static int intMax( int a , int b , int c){
        int max=0;
        if(a>b){
            max = a;
        }else {
            max = b;
        }
        if(c>max){
            max =c;
        }
        return max;
    }
}
