package Codinbat.Warmup_1;

/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).


missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 */
public class MissingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("", 1));
    }

    /*
    substring 0-->n bize n e kadar olan kismi verir
     substring n+1 da bize n haric digerlerini verir

     if statement i da koyuyorum ki eger ici bos ise 1 eklemeden direk yazdirsin
     */
    public static String missingChar(String str, int n) {
        if (str.length()!=0) {
            return str.substring(0, n) + str.substring(n + 1);
        }else{
            return str;

        }
    }

}
