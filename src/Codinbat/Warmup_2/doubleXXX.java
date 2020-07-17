package Codinbat.Warmup_2;

/*
Given a string, return true if the first instance of "x" in the string
is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */
public class doubleXXX {
    public static void main(String[] args) {
        System.out.println(doubleX("aaaa"));
    }

    static boolean doubleX(String str) {

        int firstX = str.indexOf('x');
        if(firstX == -1){
            return false;
        }
        if (firstX == str.length() - 1 ) {
            return false;
        }
        return str.charAt(firstX) == str.charAt(firstX + 1);
    }

}
