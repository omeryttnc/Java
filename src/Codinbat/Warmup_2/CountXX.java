package Codinbat.Warmup_2;
/*
Count the number of "xx" in the given string.
 We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */
public class CountXX {
    public static void main(String[] args) {

    }
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                if (i + 2 == str.length()) {
                    break;
                }
            }
        }
return count;
    }

}
