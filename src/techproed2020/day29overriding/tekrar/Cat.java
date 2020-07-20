package techproed2020.day29overriding.tekrar;

public class Cat extends Animal{
    public static void main(String[] args) {

    }
    public void sound(){
        System.out.println("Cat meow");
    }
    public void eat(){
        System.out.println("Eat cheese");
    }

    @Override
    public Animal drink() {
        return new Animal();
    }

    @Override
    public int add() {
        return 5;
    }

}
