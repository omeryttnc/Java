package techproed2020.day29overriding;

public class Cat extends Animal{
    public static void main(String[] args) {
    }
    public void sound(){
        System.out.println("Cats meaw ");
    }

    @Override //<== Override annotation
    public void eat() {
        System.out.println("Eat cheese");
    }

//    @Override
//    public Animal drink() {
//        return new Animal();
//    }


    @Override
    public Cat drink() {
        return new Cat();
    }

    @Override
    public int add() {
        return 5;
    }

}
