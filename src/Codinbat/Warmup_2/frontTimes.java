package Codinbat.Warmup_2;
/*

Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
 or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public class frontTimes {
    public String frontTimes(String str, int n) {
String result = str.substring(0,3);
String print ="";
for(int i = 0 ; i<n ; i++){
    print += str;
}
return result;
    }

}
