package Codinbat.Warmup_2;

/*

Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
public class stringTimes {
    public String stringTimes(String str, int n) {
        StringBuilder str2 = new StringBuilder();

        for (int i = 0; i < n; i++) {
            str2.append(str);
        }
        return str2.toString();
    }
}
