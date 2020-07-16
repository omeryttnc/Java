package techproed2020.day27inheritance;

public class Mammal extends Animal{
    String smell = "They smell well";
    static boolean die = true;
 //   smell  variable has default access modifier
    //because of that you cannot inherit other packages
    //in day26 packages we created Rabbit class but we
    //could not inherit smell variable
    public static void main(String[] args) {
/*
public and protected variables or methods can be
inherited without any issue
 */
        /*
        child class = sub class
        parent class = super class

        static variables and methods can not be inherited
         */
    }
    public void feed(){
        System.out.println("They feed their babies");
    }
}
