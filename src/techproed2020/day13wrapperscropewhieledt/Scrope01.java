package techproed2020.day13wrapperscropewhieledt;

public class Scrope01 {

    int num1 = 12;

    public static void main(String[] args) {
        /*
        Scrope means where to use variables
        1) If you create a variable inside the class a=body and outsode the methods
        you can use them in everwhere inside the class.

        Note: The variable created inside the class body and outside the methods are called
        "Instance Variable"
        num1 is an Instance Variable, num1 can be used from every where inside the class.
         2) if you create a variable inside a method you can use it just inside that method. Inside the other
          methods,it can not be used.
        Note: Variable creted inside the method are called "local variables"
        ch is a local variable

        Question: What is the difference between "Instance Variable" and "Local Variable" ?


        Local variable must be initialized but if you want you may not initialize instance variables.

        if it is local variable you can not use default variables from default ir teacher explains as
        if you do not assign any value for a local variable, java does not
        assign default value because of that you will get compile time error when you want to use it

        initialized means assigning value

        3) if you create a variable inside the method parenthesis it is called local variable as well and you can use it
        just inside the method body.

        i and j can be used just inside the substract method body

        4) dont try to use variable before declaration
         */
    }

    public void add() {
        num1++;
        char ch = 'a';
    }

    public void substract(int i, int j) {
        num1 = num1 - 4;

     //   ch = 'm'; ==> you cannot use ch over here because you created it inside the add method.

    }

    public void product (){
//        x = x*5;
//        int x =12;
    /*
    you tried to use x variable before declaration it gives compile time error
    to fix that problem you need to declare first.

     */


    }
}

