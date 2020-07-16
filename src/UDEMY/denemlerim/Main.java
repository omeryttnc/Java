package UDEMY.denemlerim;

public class Main {

    public static void main(String[] args) {
    int value = 5;
    switch (value){
        case 1:
            System.out.println("value is 1");
            break;
        case 2:
            System.out.println("value is 2");
            break;

        case 3: case 4: case 5:
            System.out.println("the value is either 3 or 4 or 5");
            System.out.println("the value is " + value);
            break;
        default:
            System.out.println("was not 1 or 2");

    }


    }
}
