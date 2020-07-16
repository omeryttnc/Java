package UDEMY.denemlerim;

public class DecimalComparator {
        public static boolean areEqualByThreeDecimalPlaces (double parameter1 , double parameter2){
            if ( (int) (parameter1 * 1000) == (int) (parameter2 * 1000) ){
                return true;
            } else{
                return false;
            }


        }


}
