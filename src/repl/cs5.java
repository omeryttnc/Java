package repl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cs5 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();
        int days = 0;
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");

        String wmonth = map.get(month);
        if (wmonth.equals("February")) {
            if((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ){
                days=29;
            }else {
                days=28;
            }
        }
         else if (map.containsKey(1) || map.containsKey(3) || map.containsKey(5) || map.containsKey(7) ||
        map.containsKey(8) || map.containsKey(10) || map.containsKey(12) ){
            days=31;
        } else if(map.containsKey(2)){
            days=28;
        }else {
            days = 30;
        }
        System.out.println(wmonth +" " + year + " has " + days + " days" );
    }
}