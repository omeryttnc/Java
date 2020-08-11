package Codinbat.Warmup_1;

/*
Given a string, return a new string where "not " has been added to the front.
 However, if the string already begins with "not", return the string unchanged.
  Note: use .equals() to compare 2 strings.


notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"

public class NotString {
    public static void main(String[] args) {
        System.out.println(notString("x"));
    }

    public static String notString(String str) {
        String sss = null;
        if (str.length() > 3) {
            if (!str.substring(0, 3).contains("not")) {
                sss = "not " + str;
            }
        } else if {
            return str;
        }
        return sss;
    }
}
*/