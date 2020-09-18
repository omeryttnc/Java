package Codinbat.Warmup_1;

/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false

 */
public class MixStart {

    public static boolean mixStart(String str) {
       if(str.length()>=3){
           String araDeger = str.substring(1, 3);
           return (araDeger.contains("ix"));
       }else{
           return false;
       }


    }


}


