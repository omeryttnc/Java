package techproed2020.day17constructorMethodCreation;

public class Animal {

    int age = 7;
    String name = "Dog";
    boolean mammal;
    Animal (){
        System.out.println("No parameter is called");
    }
Animal(boolean mammal){
        this(3,"cat");
    System.out.println("boolean is called");
}

Animal(int age,String name){
    System.out.println("int and string is called");

}
    public static void main(String[] args) {
Animal a1= new Animal(true);
    }
}
