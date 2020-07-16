package UDEMY.leapYearp;



public class leapYear {

        public static boolean isLapeYear(int year) {
        if ((year >= 1 && year <= 9999) && ((year % 4 == 0) || ((year % 100 == 0) && (year % 400 == 0)))) {
            return true;
        } else {
            return false;
        }
    }

}

