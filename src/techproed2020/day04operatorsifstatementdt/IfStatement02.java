package techproed2020.day04operatorsifstatementdt;
/*
Type java code by using if-else statement,
if the password is “JavaLearner”, output will be “The password is true”.
Otherwise, output will be “The password is false”.
 */
public class IfStatement02 {
    public static void main(String[] args) {
        String password = "JavaLearner";

     if (password.equals("JavaLearner")){
         System.out.println("your password is true");

     } if (!(password.equals("JavaLearner") )){

            System.out.println("your password is false");

        }

         }
}

