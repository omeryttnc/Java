package techproed2020.day27inheritance;

public class Animal {
  public   boolean breathe = true;
    /*
    private variables or methods can NOT be inherited
    Because private things cannot be accessed from other classes
    getter setter olarak yaparsan kullanabilirsin ama getter ve setter i inheritad yapmis oluyriryz
     */
    private String type = "Animal";

    public static void main(String[] args) {

    }
    public void eat(){
        System.out.println("They eat");
    }
    public void drink(){
        System.out.println("They drink");

    }
    public void move(){
        System.out.println("They move");
    }
}
