package Codinbat.Warmup_2;
/*
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */
public class stringSplosion2 {
    public static void main(String[] args) {
        System.out.println(stringSplosion("ab" ));
    }
    public static String stringSplosion(String str) {
        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            result = result + str.substring(0,i);
            if(i==str.length()-1){
                result += str;
            }
        }
        return result;

    }

}
