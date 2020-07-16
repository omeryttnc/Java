package techproed2020.day23passbyvaluedate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DayTime02 {
    public static void main(String[] args) {
        //How to update date format ===> 2020-06-30 ---> or any format
        LocalDate date = LocalDate.now();
        System.out.println(date);
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMMM/yy");
                /*
                d day
                M month MM->06 , MMM-> Jan , MMMM-> full name of Month
                y year
                h hour 12hours (AM, PM)
                H hour 24 hours system
                m minute
                 */
        System.out.println(dtf.format(date));
        System.out.println(dtf1.format(date));
        System.out.println(dtf2.format(date));
        System.out.println(dtf3.format(date));
        System.out.println();
//How to update Time format
        LocalTime time = LocalTime.now();
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:m");
        System.out.println(dtf4.format(time));
//How to get local time
        System.out.println (LocalTime.now(ZoneId.of("Turkey")));
        System.out.println (LocalTime.now(ZoneId.of("Japan")));
        System.out.println (LocalTime.now(ZoneId.of("Australia/Darwin")));
        System.out.println (dtf4.format(LocalTime.now(ZoneId.of("Asia/Karachi"))));

    }
}
