package techproed2020.day09nestedTernary;
/*
If the user pressed 1, 2, 3 the program will print the number that is pressed;
otherwise, program will print "Not allowed".
 */
public class Switch03 {
    public static void main(String[] args) {
        int num = 1;
        switch (num){
            case 1:
                System.out.println("allowed" + num);
                break;
            case 2:
                System.out.println("allowed" + num);
                break;
            case 3:
                System.out.println("allowed" + num);
                break;
            default:
                System.out.println("it is not allowed " + num);
        }



    }
}
