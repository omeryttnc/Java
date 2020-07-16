package UDEMY.u67_while;

public class while_do {
    public static void main(String[] args) {
//        int count = 1;
//        do{
//            System.out.println("count value was " + count);
//        count ++;
//        } while (count != 6);
//    }
        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number ++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number is " + number);
        }
    }
/*
do nun ozelligi sistemde hata olsada bile bir defa islemi gerceklestirir. ve do ile while i ornekte oldugu gibi de
yazabiliriz
 */

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}