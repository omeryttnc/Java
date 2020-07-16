package UDEMY.denemlerim;

public class exercise1SwitchStatement {
    public static void main(String[] args) {
        char variable = 'F';

        switch (variable) {
            case 'A':
                System.out.println("the letter was A");
                break;
            case 'B':
                System.out.println("the letter was B");
                break;
            case 'C':
                System.out.println("the letter was C");
                break;
            case 'D':
                System.out.println("the letter was D");
                break;
            case 'E':
                System.out.println("the letter was E");
                break;
            default:
                System.out.println("the letter was not A,B,C,D or E");
                break;

        }
    }
}
