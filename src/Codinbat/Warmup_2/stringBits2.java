package Codinbat.Warmup_2;
/*
Given a string, return a new string made of every other char starting
 with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */
public class stringBits2 {
    public void main(String[] args) {
        System.out.println(stringBits("Heeloleo"));
    }

    public  String stringBits(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <str.length() ; i +=2 ) {
result.append(str.charAt(i));
        }
        return result.toString();
    }

}
