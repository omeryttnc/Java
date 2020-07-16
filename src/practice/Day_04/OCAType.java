package practice.Day_04;

public class OCAType {
    public static void main(String[] args) {
        //DEBUG
        int num = 10;
        do{ // post=print 10 first then decrease
            //                  10    10-1   9
            System.out.println(num-- + " " + num);
        }while (num>5);
    }
    /*
    What is the result?
    A) 9876543210
    B) 9
    C) 421
    D) 9 10
    E) nothing will be print
    F) 10 9
     */

}
