package UDEMY.u67_while;

public class While_break {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("count value + " + count);
            count++;
        }

        count = 1;
        while (true) {
            count++;
if(count == 6){
    break;
}
            System.out.println("count value is " + count);
        }
    }
}