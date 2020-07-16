package UDEMY.u67_while;

public class while_do_example {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        while( number <= finishNumber ){
            number++;
         if (!isEvenNumber(number)) {
             continue;
         }
            System.out.println("even number is " + number);
        }
    }
    public static boolean isEvenNumber( int number){
        if( (number % 2) == 0){
            return true;

        } else {
            return false;
        }

    }
}
