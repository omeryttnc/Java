package techproed2020.day23passbyvaluedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime01 {
    public static void main(String[] args) {
        //How to get current Date
       System.out.println( LocalDate.now());

        //How get future Date
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.plusDays(5));
        System.out.println(date1.plusMonths(4));//original will be updated
        System.out.println(date1.plusYears(3));

        //How to get past dates
        System.out.println(date1.minusDays(7));
        System.out.println(date1.minusMonths(2));
        System.out.println(date1.minusYears(5));

        System.out.println(LocalTime.now());//394 is nano seconds
        LocalTime time1 =LocalTime.now();
        System.out.println(time1);
        System.out.println(time1.plusSeconds(5));
        System.out.println(time1.plusMinutes(2));
        System.out.println(time1.plusHours(4));


        System.out.println();
        //How to get pass times
        System.out.println(time1);
        System.out.println(time1.minusSeconds(5));
        System.out.println(time1.minusMinutes(2));
        System.out.println(time1.minusHours(4));


        System.out.println(LocalDateTime.now());

    }
}
